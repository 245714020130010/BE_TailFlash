package com.webservice.be_tailflash.modules.admin.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public record AssignPermissionsRequest(
    @NotNull List<Long> permissionIds
) {
}
