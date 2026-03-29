package com.webservice.be_tailflash.modules.flashcard;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.exception.BadRequestException;
import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.modules.category.CategoryRepository;
import com.webservice.be_tailflash.modules.category.entity.Category;
import com.webservice.be_tailflash.modules.deck.DeckRepository;
import com.webservice.be_tailflash.modules.deck.entity.Deck;
import com.webservice.be_tailflash.modules.flashcard.dto.CreateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.dto.FlashcardResponse;
import com.webservice.be_tailflash.modules.flashcard.dto.UpdateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.entity.Flashcard;
import com.webservice.be_tailflash.modules.flashcard.entity.FlashcardTag;
import com.webservice.be_tailflash.modules.tag.TagRepository;
import com.webservice.be_tailflash.modules.tag.entity.Tag;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FlashcardServiceImpl implements FlashcardService {

    private final FlashcardRepository flashcardRepository;
    private final FlashcardMapper flashcardMapper;
    private final DeckRepository deckRepository;
    private final CategoryRepository categoryRepository;
    private final TagRepository tagRepository;
    private final FlashcardTagRepository flashcardTagRepository;

    @Value("${app.taxonomy.dev-auto-create-tags:false}")
    private boolean devAutoCreateTags;

    @Override
    @Transactional
    public FlashcardResponse create(Long requesterId, String role, Long deckId, CreateFlashcardRequest request) {
        Deck deck = getAccessibleDeck(deckId, requesterId, role);

        Flashcard flashcard = flashcardMapper.toEntity(request);
        flashcard.setDeckId(deck.getId());
        flashcard.setCategoryId(resolveCategoryId(request.categoryKey()));
        Flashcard saved = flashcardRepository.save(flashcard);
        syncFlashcardTags(saved.getId(), request.tags());
        refreshDeckTotalCards(deck.getId());
        return toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FlashcardResponse> getByDeck(Long requesterId, String role, Long deckId) {
        getAccessibleDeck(deckId, requesterId, role);
        return flashcardRepository.findByDeckId(deckId).stream()
            .map(this::toResponse)
            .toList();
    }

    @Override
    @Transactional
    public FlashcardResponse update(Long requesterId, String role, Long deckId, Long flashcardId, UpdateFlashcardRequest request) {
        getAccessibleDeck(deckId, requesterId, role);

        Flashcard flashcard = flashcardRepository.findByIdAndDeckId(flashcardId, deckId)
            .orElseThrow(() -> new ResourceNotFoundException("FLASHCARD_NOT_FOUND", "Flashcard not found"));

        flashcardMapper.updateEntity(request, flashcard);
        flashcard.setCategoryId(resolveCategoryId(request.categoryKey()));
        Flashcard saved = flashcardRepository.save(flashcard);
        syncFlashcardTags(saved.getId(), request.tags());
        return toResponse(saved);
    }

    @Override
    @Transactional
    public void delete(Long requesterId, String role, Long deckId, Long flashcardId) {
        getAccessibleDeck(deckId, requesterId, role);

        Flashcard flashcard = flashcardRepository.findByIdAndDeckId(flashcardId, deckId)
            .orElseThrow(() -> new ResourceNotFoundException("FLASHCARD_NOT_FOUND", "Flashcard not found"));
        flashcardTagRepository.deleteByFlashcardId(flashcard.getId());
        flashcardRepository.delete(flashcard);
        refreshDeckTotalCards(deckId);
    }

    private Deck getAccessibleDeck(Long deckId, Long requesterId, String role) {
        Deck deck = deckRepository.findById(deckId)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));

        if (!"ADMIN".equals(role) && !deck.getOwnerId().equals(requesterId)) {
            throw new ForbiddenException("DECK_FORBIDDEN", "You do not have permission to access this deck");
        }
        return deck;
    }

    private FlashcardResponse toResponse(Flashcard flashcard) {
        List<String> tags = findFlashcardTags(flashcard.getId());
        String categoryKey = findCategoryKey(flashcard.getCategoryId());

        return new FlashcardResponse(
            flashcard.getId(),
            flashcard.getDeckId(),
            flashcard.getFrontText(),
            flashcard.getBackText(),
            flashcard.getHint(),
            flashcard.getFrontImageUrl(),
            flashcard.getFrontAudioUrl(),
            flashcard.getPhonetic(),
            flashcard.getBackDetail(),
            flashcard.getExample(),
            flashcard.getSynonyms(),
            flashcard.getNote(),
            flashcard.getSortOrder(),
            categoryKey,
            tags,
            flashcard.getCreatedAt(),
            flashcard.getUpdatedAt()
        );
    }

    private Long resolveCategoryId(String categoryKey) {
        if (categoryKey == null || categoryKey.isBlank()) {
            return null;
        }

        String normalized = categoryKey.trim().toLowerCase(Locale.ROOT);
        return categoryRepository.findByNameKey(normalized)
            .orElseThrow(() -> new BadRequestException("CATEGORY_NOT_FOUND", "Category not found"))
            .getId();
    }

    private String findCategoryKey(Long categoryId) {
        if (categoryId == null) {
            return null;
        }

        return categoryRepository.findById(categoryId)
            .map(Category::getNameKey)
            .orElse(null);
    }

    private List<String> findFlashcardTags(Long flashcardId) {
        List<FlashcardTag> links = flashcardTagRepository.findByFlashcardId(flashcardId);
        if (links.isEmpty()) {
            return List.of();
        }

        Set<Long> tagIds = links.stream()
            .map(FlashcardTag::getTagId)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        Map<Long, Tag> tagById = tagRepository.findAllById(tagIds).stream()
            .collect(Collectors.toMap(Tag::getId, Function.identity()));

        return links.stream()
            .map(link -> tagById.get(link.getTagId()))
            .filter(Objects::nonNull)
            .map(Tag::getName)
            .distinct()
            .toList();
    }

    private void syncFlashcardTags(Long flashcardId, List<String> tags) {
        flashcardTagRepository.deleteByFlashcardId(flashcardId);

        if (tags == null || tags.isEmpty()) {
            return;
        }

        Set<String> normalizedTags = tags.stream()
            .filter(Objects::nonNull)
            .map(String::trim)
            .filter(value -> !value.isBlank())
            .map(value -> value.length() > 120 ? value.substring(0, 120) : value)
            .collect(Collectors.toCollection(LinkedHashSet::new));

        if (normalizedTags.isEmpty()) {
            return;
        }

        List<FlashcardTag> links = normalizedTags.stream()
            .map(this::resolveTag)
            .map(tag -> new FlashcardTag(flashcardId, tag.getId()))
            .toList();

        flashcardTagRepository.saveAll(links);
    }

    private Tag resolveTag(String rawName) {
        String slug = slugify(rawName);
        return tagRepository.findBySlug(slug)
            .orElseGet(() -> {
                if (!devAutoCreateTags) {
                    throw new BadRequestException("TAG_NOT_FOUND", "Tag not found");
                }
                Tag tag = new Tag();
                tag.setName(rawName);
                tag.setSlug(slug);
                return tagRepository.save(tag);
            });
    }

    private String slugify(String value) {
        String normalized = value.trim().toLowerCase(Locale.ROOT)
            .replaceAll("[^a-z0-9]+", "-")
            .replaceAll("(^-|-$)", "");
        return normalized.isBlank() ? "tag" : normalized;
    }

    private void refreshDeckTotalCards(Long deckId) {
        Deck deck = deckRepository.findById(deckId)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        long totalCards = flashcardRepository.countByDeckId(deckId);
        deck.setTotalCards((int) totalCards);
        deckRepository.save(deck);
    }
}
