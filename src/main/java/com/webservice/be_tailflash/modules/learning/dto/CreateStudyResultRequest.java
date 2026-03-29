package com.webservice.be_tailflash.modules.learning.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record CreateStudyResultRequest(
    @NotNull @Positive Long deckId,
    @NotNull @PositiveOrZero Integer totalCards,
    @NotNull @PositiveOrZero Integer correctCount,
    @NotNull @PositiveOrZero Integer durationSeconds,
    @NotBlank @Pattern(regexp = "NEW|REVIEW|MIXED|CRAM|CUSTOM") String mode,
    @Size(max = 1000) String note
) {
}
