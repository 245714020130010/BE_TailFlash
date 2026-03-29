package com.webservice.be_tailflash.modules.flashcard.dto;

import java.time.Instant;
import java.util.List;

public record FlashcardResponse(
	Long id,
	Long deckId,
	String frontText,
	String backText,
	String hint,
	String frontImageUrl,
	String frontAudioUrl,
	String phonetic,
	String backDetail,
	String example,
	String synonyms,
	String note,
	Integer sortOrder,
	String categoryKey,
	List<String> tags,
	Instant createdAt,
	Instant updatedAt
) {
}
