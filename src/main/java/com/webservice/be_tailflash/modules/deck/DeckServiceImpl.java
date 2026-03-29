package com.webservice.be_tailflash.modules.deck;

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
import com.webservice.be_tailflash.modules.deck.dto.CreateDeckRequest;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.modules.deck.dto.UpdateDeckRequest;
import com.webservice.be_tailflash.modules.deck.entity.Deck;
import com.webservice.be_tailflash.modules.deck.entity.DeckTag;
import com.webservice.be_tailflash.modules.tag.TagRepository;
import com.webservice.be_tailflash.modules.tag.entity.Tag;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeckServiceImpl implements DeckService {

    private static final String VISIBILITY_CLASS = "CLASS";

    private final DeckRepository deckRepository;
    private final DeckMapper deckMapper;
    private final CategoryRepository categoryRepository;
    private final TagRepository tagRepository;
    private final DeckTagRepository deckTagRepository;

    @Value("${app.taxonomy.dev-auto-create-tags:false}")
    private boolean devAutoCreateTags;

    @Override
    @Transactional
    public DeckResponse create(Long requesterId, String requesterRole, CreateDeckRequest request) {
        Deck deck = deckMapper.toEntity(request);
        deck.setOwnerId(requesterId);
        validateClassVisibility(requesterRole, deck.getVisibility());
        deck.setIsApproved(false);
        deck.setCategoryId(resolveCategoryId(request.categoryKey()));
        if (deck.getTotalCards() == null) {
            deck.setTotalCards(0);
        }
        Deck saved = deckRepository.save(deck);
        syncDeckTags(saved.getId(), request.tags());
        return toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DeckResponse> getAll(Long requesterId, String role) {
        List<Deck> decks = "ADMIN".equals(role)
            ? deckRepository.findAll()
            : deckRepository.findByOwnerId(requesterId);

        return decks.stream()
            .map(this::toResponse)
            .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public DeckResponse getById(Long requesterId, String role, Long id) {
        Deck deck = deckRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        assertCanAccess(deck, requesterId, role);
        return toResponse(deck);
    }

    @Override
    @Transactional
    public DeckResponse update(Long requesterId, String role, Long id, UpdateDeckRequest request) {
        Deck deck = deckRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        assertCanAccess(deck, requesterId, role);

        String previousVisibility = deck.getVisibility();
        deckMapper.updateEntity(request, deck);
        validateClassVisibility(role, deck.getVisibility());

        if (!Objects.equals(previousVisibility, deck.getVisibility()) && !"ADMIN".equals(role)) {
            deck.setIsApproved(false);
        }

        deck.setCategoryId(resolveCategoryId(request.categoryKey()));
        Deck saved = deckRepository.save(deck);
        syncDeckTags(saved.getId(), request.tags());
        return toResponse(saved);
    }

    @Override
    @Transactional
    public DeckResponse updateApproval(String requesterRole, Long id, boolean approved) {
        requireAdminRole(requesterRole);

        Deck deck = deckRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        deck.setIsApproved(approved);
        Deck saved = deckRepository.save(deck);
        return toResponse(saved);
    }

    @Override
    @Transactional
    public void delete(Long requesterId, String role, Long id) {
        Deck deck = deckRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        assertCanAccess(deck, requesterId, role);
        deckRepository.delete(deck);
    }

    private void assertCanAccess(Deck deck, Long requesterId, String role) {
        if ("ADMIN".equals(role)) {
            return;
        }
        if (!deck.getOwnerId().equals(requesterId)) {
            throw new ForbiddenException("DECK_FORBIDDEN", "You do not have permission to access this deck");
        }
    }

    private void validateClassVisibility(String requesterRole, String visibility) {
        if (!VISIBILITY_CLASS.equalsIgnoreCase(visibility)) {
            return;
        }

        if (!"TEACHER".equals(requesterRole) && !"ADMIN".equals(requesterRole)) {
            throw new ForbiddenException(
                "DECK_CLASS_VISIBILITY_FORBIDDEN",
                "Only teacher or admin can create/update CLASS decks"
            );
        }
    }

    private void requireAdminRole(String requesterRole) {
        if (!"ADMIN".equals(requesterRole)) {
            throw new ForbiddenException("AUTH_FORBIDDEN", "Admin role required");
        }
    }

    private DeckResponse toResponse(Deck deck) {
        List<String> tags = findDeckTags(deck.getId());
        String categoryKey = findCategoryKey(deck.getCategoryId());

        return new DeckResponse(
            deck.getId(),
            deck.getTitle(),
            deck.getDescription(),
            deck.getVisibility(),
            deck.getOwnerId(),
            categoryKey,
            tags,
            deck.getCoverImageUrl(),
            deck.getTotalCards(),
            deck.getLearnCount(),
            deck.getAvgRating(),
            deck.getIsApproved(),
            deck.getClonedFrom(),
            deck.getCreatedAt(),
            deck.getUpdatedAt()
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

    private List<String> findDeckTags(Long deckId) {
        List<DeckTag> links = deckTagRepository.findByDeckId(deckId);
        if (links.isEmpty()) {
            return List.of();
        }

        Set<Long> tagIds = links.stream()
            .map(DeckTag::getTagId)
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

    private void syncDeckTags(Long deckId, List<String> tags) {
        deckTagRepository.deleteByDeckId(deckId);

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

        List<DeckTag> links = normalizedTags.stream()
            .map(this::resolveOrCreateTag)
            .map(tag -> new DeckTag(deckId, tag.getId()))
            .toList();

        deckTagRepository.saveAll(links);
    }

    private Tag resolveOrCreateTag(String rawName) {
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
}
