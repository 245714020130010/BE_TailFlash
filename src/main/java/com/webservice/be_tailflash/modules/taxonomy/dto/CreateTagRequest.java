package com.webservice.be_tailflash.modules.taxonomy.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateTagRequest(
    @NotBlank @Size(max = 120) String name
) {
}
