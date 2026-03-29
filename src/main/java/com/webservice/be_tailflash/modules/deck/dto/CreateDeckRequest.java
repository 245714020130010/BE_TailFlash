package com.webservice.be_tailflash.modules.deck.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

public record CreateDeckRequest(
	@NotBlank @Size(max = 255) String title,
	@Size(max = 1000) String description,
	@NotBlank @Size(max = 20) String visibility,
	@Size(max = 120) String categoryKey,
	List<@Size(max = 120) String> tags,
	@Size(max = 500) String coverImageUrl
) {
}
