package com.webservice.be_tailflash.modules.taxonomy.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateCategoryRequest(
    @NotBlank @Size(max = 120) String nameKey,
    @Size(max = 120) String icon,
    Long parentId,
    Integer sortOrder
) {
}
