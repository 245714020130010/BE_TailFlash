package com.webservice.be_tailflash.modules.admin.dto;

import java.time.Instant;

public record AdminUserResponse(
    Long id,
    String email,
    String displayName,
    String role,
    String status,
    boolean emailVerified,
    Instant createdAt,
    Instant updatedAt
) {
}
