package com.webservice.be_tailflash.modules.auth.dto;

public record LoginResponse(
    String accessToken,
    String refreshToken,
    String tokenType,
    long expiresInSeconds,
    AuthUserResponse user
) {
}
