package com.webservice.be_tailflash.modules.flashcard.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdateFlashcardRequest(
    @NotBlank @Size(max = 1000) String frontText,
    @NotBlank @Size(max = 1000) String backText,
    @Size(max = 255) String hint
) {
}
