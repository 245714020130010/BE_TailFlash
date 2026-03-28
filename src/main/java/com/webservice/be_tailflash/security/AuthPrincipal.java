package com.webservice.be_tailflash.security;

public record AuthPrincipal(Long userId, String email, String role) {
}
