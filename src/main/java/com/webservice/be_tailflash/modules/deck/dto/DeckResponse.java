package com.webservice.be_tailflash.modules.deck.dto;

public record DeckResponse(Long id, String title, String description, String visibility, Long ownerId) {
}
