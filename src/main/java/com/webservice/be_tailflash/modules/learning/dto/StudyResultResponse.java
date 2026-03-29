package com.webservice.be_tailflash.modules.learning.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record StudyResultResponse(
    Long id,
    Long deckId,
    Long userId,
    Integer totalCards,
    Integer correctCount,
    BigDecimal accuracyRate,
    Integer durationSeconds,
    String mode,
    String note,
    Instant completedAt,
    Instant createdAt
) {
}
