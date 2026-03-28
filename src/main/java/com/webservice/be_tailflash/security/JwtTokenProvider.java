package com.webservice.be_tailflash.security;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.webservice.be_tailflash.common.exception.UnauthorizedException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtTokenProvider {

    private final JwtProperties jwtProperties;

    public String createAccessToken(Long userId, String email, String roleName) {
        Instant now = Instant.now();
        Instant expiresAt = now.plusSeconds(jwtProperties.accessTokenTtlSeconds());

        return Jwts.builder()
            .issuer(jwtProperties.issuer())
            .subject(String.valueOf(userId))
            .claim("email", email)
            .claim("role", roleName)
            .claim("tokenType", "ACCESS")
            .issuedAt(Date.from(now))
            .expiration(Date.from(expiresAt))
            .signWith(Keys.hmacShaKeyFor(jwtProperties.secret().getBytes(StandardCharsets.UTF_8)))
            .compact();
    }

    public String createRefreshToken(Long userId) {
        Instant now = Instant.now();
        Instant expiresAt = now.plusSeconds(jwtProperties.refreshTokenTtlSeconds());

        return Jwts.builder()
            .issuer(jwtProperties.issuer())
            .subject(String.valueOf(userId))
            .claim("tokenType", "REFRESH")
            .issuedAt(Date.from(now))
            .expiration(Date.from(expiresAt))
            .signWith(Keys.hmacShaKeyFor(jwtProperties.secret().getBytes(StandardCharsets.UTF_8)))
            .compact();
    }

    public Claims parseClaims(String token) {
        try {
            return Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(jwtProperties.secret().getBytes(StandardCharsets.UTF_8)))
                .build()
                .parseSignedClaims(token)
                .getPayload();
        } catch (Exception ex) {
            throw new UnauthorizedException("Invalid or expired token");
        }
    }

    public String hashToken(String token) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashed = digest.digest(token.getBytes(StandardCharsets.UTF_8));
            StringBuilder builder = new StringBuilder();
            for (byte b : hashed) {
                builder.append(String.format("%02x", b));
            }
            return builder.toString();
        } catch (Exception ex) {
            throw new IllegalStateException("Unable to hash token", ex);
        }
    }
}
