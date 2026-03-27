package com.webservice.be_tailflash.modules.flashcard.dto;

public record FlashcardResponse(Long id, Long deckId, String frontText, String backText, String hint) {
}
