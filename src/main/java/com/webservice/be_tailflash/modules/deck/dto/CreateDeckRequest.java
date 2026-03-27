package com.webservice.be_tailflash.modules.deck.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateDeckRequest(
	@NotBlank @Size(max = 255) String title,
	@Size(max = 1000) String description,
	@NotBlank String visibility
) {
}
