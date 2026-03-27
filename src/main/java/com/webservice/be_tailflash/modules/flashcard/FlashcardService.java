package com.webservice.be_tailflash.modules.flashcard;

import java.util.List;

import com.webservice.be_tailflash.modules.flashcard.dto.CreateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.dto.FlashcardResponse;
import com.webservice.be_tailflash.modules.flashcard.dto.UpdateFlashcardRequest;

public interface FlashcardService {

    FlashcardResponse create(Long requesterId, String role, Long deckId, CreateFlashcardRequest request);

    List<FlashcardResponse> getByDeck(Long requesterId, String role, Long deckId);

    FlashcardResponse update(Long requesterId, String role, Long deckId, Long flashcardId, UpdateFlashcardRequest request);

    void delete(Long requesterId, String role, Long deckId, Long flashcardId);
}
