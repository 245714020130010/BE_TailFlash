package com.webservice.be_tailflash.modules.admin.dto;

import jakarta.validation.constraints.Size;

public record UpdateRoleRequest(
    @Size(max = 50) String name,
    @Size(max = 255) String description
) {
}
