package com.webservice.be_tailflash.modules.admin.dto;

import java.util.List;

public record AdminRoleResponse(
    Long id,
    String name,
    String description,
    List<Long> permissionIds
) {
}
