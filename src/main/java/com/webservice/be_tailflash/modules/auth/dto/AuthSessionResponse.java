package com.webservice.be_tailflash.modules.auth.dto;

import java.time.Instant;

public record AuthSessionResponse(
    Long id,
    String deviceInfo,
    String ipAddress,
    Instant createdAt,
    Instant expiresAt,
    boolean revoked
) {
}
