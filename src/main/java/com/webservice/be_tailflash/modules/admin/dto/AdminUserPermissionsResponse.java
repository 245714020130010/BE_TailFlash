package com.webservice.be_tailflash.modules.admin.dto;

import java.util.List;

public record AdminUserPermissionsResponse(
    Long userId,
    List<Long> rolePermissionIds,
    List<Long> userPermissionIds,
    List<Long> effectivePermissionIds
) {
}
