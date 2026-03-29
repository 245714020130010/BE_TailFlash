package com.webservice.be_tailflash.modules.deck.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record DeckResponse(
	Long id,
	String title,
	String description,
	String visibility,
	Long ownerId,
	String categoryKey,
	List<String> tags,
	String coverImageUrl,
	Integer totalCards,
	Integer learnCount,
	BigDecimal avgRating,
	Boolean isApproved,
	Long clonedFrom,
	Instant createdAt,
	Instant updatedAt
) {
}
