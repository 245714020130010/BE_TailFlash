package com.webservice.be_tailflash.modules.admin.dto;

public record AdminPermissionResponse(
    Long id,
    String name,
    String group,
    String description
) {
}
