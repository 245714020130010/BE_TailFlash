package com.webservice.be_tailflash.modules.flashcard;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.modules.deck.DeckRepository;
import com.webservice.be_tailflash.modules.deck.entity.Deck;
import com.webservice.be_tailflash.modules.flashcard.dto.CreateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.dto.FlashcardResponse;
import com.webservice.be_tailflash.modules.flashcard.dto.UpdateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.entity.Flashcard;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FlashcardServiceImpl implements FlashcardService {

    private final FlashcardRepository flashcardRepository;
    private final FlashcardMapper flashcardMapper;
    private final DeckRepository deckRepository;

    @Override
    @Transactional
    public FlashcardResponse create(Long requesterId, String role, Long deckId, CreateFlashcardRequest request) {
        Deck deck = getAccessibleDeck(deckId, requesterId, role);

        Flashcard flashcard = flashcardMapper.toEntity(request);
        flashcard.setDeckId(deck.getId());
        Flashcard saved = flashcardRepository.save(flashcard);
        return flashcardMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FlashcardResponse> getByDeck(Long requesterId, String role, Long deckId) {
        getAccessibleDeck(deckId, requesterId, role);
        return flashcardRepository.findByDeckId(deckId).stream()
            .map(flashcardMapper::toResponse)
            .toList();
    }

    @Override
    @Transactional
    public FlashcardResponse update(Long requesterId, String role, Long deckId, Long flashcardId, UpdateFlashcardRequest request) {
        getAccessibleDeck(deckId, requesterId, role);

        Flashcard flashcard = flashcardRepository.findByIdAndDeckId(flashcardId, deckId)
            .orElseThrow(() -> new ResourceNotFoundException("FLASHCARD_NOT_FOUND", "Flashcard not found"));

        flashcardMapper.updateEntity(request, flashcard);
        Flashcard saved = flashcardRepository.save(flashcard);
        return flashcardMapper.toResponse(saved);
    }

    @Override
    @Transactional
    public void delete(Long requesterId, String role, Long deckId, Long flashcardId) {
        getAccessibleDeck(deckId, requesterId, role);

        Flashcard flashcard = flashcardRepository.findByIdAndDeckId(flashcardId, deckId)
            .orElseThrow(() -> new ResourceNotFoundException("FLASHCARD_NOT_FOUND", "Flashcard not found"));
        flashcardRepository.delete(flashcard);
    }

    private Deck getAccessibleDeck(Long deckId, Long requesterId, String role) {
        Deck deck = deckRepository.findById(deckId)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));

        if (!"ADMIN".equals(role) && !deck.getOwnerId().equals(requesterId)) {
            throw new ForbiddenException("DECK_FORBIDDEN", "You do not have permission to access this deck");
        }
        return deck;
    }
}
