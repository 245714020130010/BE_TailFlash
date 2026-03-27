package com.webservice.be_tailflash.modules.auth;

import java.time.Instant;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.common.enums.Role;
import com.webservice.be_tailflash.common.exception.BadRequestException;
import com.webservice.be_tailflash.common.exception.ConflictException;
import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.common.exception.UnauthorizedException;
import com.webservice.be_tailflash.modules.auth.dto.AuthUserResponse;
import com.webservice.be_tailflash.modules.auth.dto.ChangePasswordRequest;
import com.webservice.be_tailflash.modules.auth.dto.ForgotPasswordRequest;
import com.webservice.be_tailflash.modules.auth.dto.LoginRequest;
import com.webservice.be_tailflash.modules.auth.dto.LoginResponse;
import com.webservice.be_tailflash.modules.auth.dto.LogoutRequest;
import com.webservice.be_tailflash.modules.auth.dto.RefreshTokenRequest;
import com.webservice.be_tailflash.modules.auth.dto.RegisterRequest;
import com.webservice.be_tailflash.modules.auth.dto.ResetPasswordRequest;
import com.webservice.be_tailflash.modules.auth.entity.UserSession;
import com.webservice.be_tailflash.modules.auth.mail.PasswordResetMailProperties;
import com.webservice.be_tailflash.modules.auth.mail.PasswordResetMailService;
import com.webservice.be_tailflash.modules.user.UserRepository;
import com.webservice.be_tailflash.modules.user.entity.User;
import com.webservice.be_tailflash.security.JwtProperties;
import com.webservice.be_tailflash.security.JwtTokenProvider;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final UserSessionRepository userSessionRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final JwtProperties jwtProperties;
    private final PasswordResetMailService passwordResetMailService;
    private final PasswordResetMailProperties passwordResetMailProperties;

    @Override
    @Transactional
    public LoginResponse register(RegisterRequest request) {
        if (userRepository.existsByEmail(request.email())) {
            throw new ConflictException("AUTH_EMAIL_ALREADY_EXISTS", "Email already registered");
        }

        User user = new User();
        user.setEmail(request.email());
        user.setPasswordHash(passwordEncoder.encode(request.password()));
        user.setDisplayName(request.displayName());
        user.setEmailVerified(false);
        user.setRole(request.role() == null ? Role.LEARNER : request.role());
        User savedUser = userRepository.save(user);

        return issueTokens(savedUser);
    }

    @Override
    @Transactional(readOnly = true)
    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.email())
            .orElseThrow(() -> new UnauthorizedException("AUTH_INVALID_CREDENTIALS", "Invalid email or password"));

        if (!passwordEncoder.matches(request.password(), user.getPasswordHash())) {
            throw new UnauthorizedException("AUTH_INVALID_CREDENTIALS", "Invalid email or password");
        }

        return issueTokens(user);
    }

    @Override
    @Transactional
    public LoginResponse refreshToken(RefreshTokenRequest request) {
        String token = request.refreshToken();
        String tokenHash = jwtTokenProvider.hashToken(token);
        UserSession session = userSessionRepository.findByRefreshTokenHash(tokenHash)
            .orElseThrow(() -> new UnauthorizedException("AUTH_INVALID_REFRESH_TOKEN", "Invalid refresh token"));

        if (session.isRevoked() || session.getExpiresAt().isBefore(Instant.now())) {
            throw new UnauthorizedException("AUTH_INVALID_REFRESH_TOKEN", "Invalid refresh token");
        }

        String tokenType = jwtTokenProvider.parseClaims(token).get("tokenType", String.class);
        if (!"REFRESH".equals(tokenType)) {
            throw new UnauthorizedException("AUTH_INVALID_REFRESH_TOKEN", "Invalid refresh token");
        }

        User user = userRepository.findById(session.getUserId())
            .orElseThrow(() -> new UnauthorizedException("AUTH_INVALID_REFRESH_TOKEN", "Invalid refresh token"));

        session.setRevoked(true);
        userSessionRepository.save(session);

        return issueTokens(user);
    }

    @Override
    @Transactional
    public MessageResponse logout(LogoutRequest request) {
        String tokenHash = jwtTokenProvider.hashToken(request.refreshToken());
        userSessionRepository.findByRefreshTokenHash(tokenHash).ifPresent(session -> {
            session.setRevoked(true);
            userSessionRepository.save(session);
        });
        return new MessageResponse("Logged out");
    }

    @Override
    @Transactional
    public MessageResponse forgotPassword(ForgotPasswordRequest request) {
        User user = userRepository.findByEmail(request.email())
            .orElse(null);

        if (user == null) {
            return new MessageResponse("If your email exists, reset instructions have been sent");
        }

        String rawResetToken = UUID.randomUUID().toString().replace("-", "");
        user.setPasswordResetTokenHash(jwtTokenProvider.hashToken(rawResetToken));
        user.setPasswordResetTokenExpiresAt(
            Instant.now().plusSeconds(passwordResetMailProperties.tokenTtlMinutes() * 60)
        );
        userRepository.save(user);
        passwordResetMailService.sendPasswordResetMail(user, rawResetToken);

        return new MessageResponse("If your email exists, reset instructions have been sent");
    }

    @Override
    @Transactional
    public MessageResponse resetPassword(ResetPasswordRequest request) {
        String hash = jwtTokenProvider.hashToken(request.token());

        User user = userRepository.findByPasswordResetTokenHash(hash)
            .orElseThrow(() -> new UnauthorizedException("AUTH_INVALID_RESET_TOKEN", "Invalid reset token"));

        if (user.getPasswordResetTokenExpiresAt() == null || user.getPasswordResetTokenExpiresAt().isBefore(Instant.now())) {
            throw new UnauthorizedException("AUTH_INVALID_RESET_TOKEN", "Invalid reset token");
        }

        user.setPasswordHash(passwordEncoder.encode(request.newPassword()));
        user.setPasswordResetTokenHash(null);
        user.setPasswordResetTokenExpiresAt(null);
        userRepository.save(user);

        return new MessageResponse("Password reset successful");
    }

    @Override
    @Transactional
    public MessageResponse changePassword(Long userId, ChangePasswordRequest request) {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("USER_NOT_FOUND", "User not found"));

        if (!passwordEncoder.matches(request.currentPassword(), user.getPasswordHash())) {
            throw new UnauthorizedException("AUTH_INVALID_CREDENTIALS", "Current password is incorrect");
        }

        if (request.currentPassword().equals(request.newPassword())) {
            throw new BadRequestException("AUTH_PASSWORD_REUSE", "New password must be different");
        }

        user.setPasswordHash(passwordEncoder.encode(request.newPassword()));
        userRepository.save(user);
        return new MessageResponse("Password changed");
    }

    @Override
    @Transactional(readOnly = true)
    public AuthUserResponse me(Long userId) {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("USER_NOT_FOUND", "User not found"));
        return toAuthUser(user);
    }

    private LoginResponse issueTokens(User user) {
        String accessToken = jwtTokenProvider.createAccessToken(user.getId(), user.getEmail(), user.getRole());
        String refreshToken = jwtTokenProvider.createRefreshToken(user.getId());

        UserSession session = new UserSession();
        session.setUserId(user.getId());
        session.setRefreshTokenHash(jwtTokenProvider.hashToken(refreshToken));
        session.setExpiresAt(Instant.now().plusSeconds(jwtProperties.refreshTokenTtlSeconds()));
        session.setRevoked(false);
        session.setCreatedAt(Instant.now());
        userSessionRepository.save(session);

        return new LoginResponse(
            accessToken,
            refreshToken,
            "Bearer",
            jwtProperties.accessTokenTtlSeconds(),
            toAuthUser(user)
        );
    }

    private AuthUserResponse toAuthUser(User user) {
        return new AuthUserResponse(
            user.getId(),
            user.getEmail(),
            user.getDisplayName(),
            user.getRole().name(),
            user.isEmailVerified()
        );
    }
}
