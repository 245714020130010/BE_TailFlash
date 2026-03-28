package com.webservice.be_tailflash.modules.admin.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateRoleRequest(
    @NotBlank @Size(max = 50) String name,
    @Size(max = 255) String description
) {
}
