package com.webservice.be_tailflash.modules.flashcard.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.PositiveOrZero;
import java.util.List;

public record CreateFlashcardRequest(
    @NotBlank @Size(max = 1000) String frontText,
    @NotBlank @Size(max = 1000) String backText,
    @Size(max = 255) String hint,
    @Size(max = 500) String frontImageUrl,
    @Size(max = 500) String frontAudioUrl,
    @Size(max = 120) String phonetic,
    @Size(max = 1000) String backDetail,
    @Size(max = 1000) String example,
    @Size(max = 500) String synonyms,
    @Size(max = 1000) String note,
    @PositiveOrZero Integer sortOrder,
    @Size(max = 120) String categoryKey,
    List<@Size(max = 120) String> tags
) {
}
