package com.webservice.be_tailflash.modules.taxonomy.dto;

public record TaxonomyCategoryData(
    Long id,
    String nameKey,
    Integer sortOrder,
    Boolean isActive
) {
}
