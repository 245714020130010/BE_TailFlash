package com.webservice.be_tailflash.modules.auth;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.common.enums.Role;
import com.webservice.be_tailflash.common.enums.UserStatus;
import com.webservice.be_tailflash.modules.auth.dto.ForgotPasswordRequest;
import com.webservice.be_tailflash.modules.auth.dto.LoginResponse;
import com.webservice.be_tailflash.modules.auth.dto.RegisterRequest;
import com.webservice.be_tailflash.modules.auth.dto.AuthSessionResponse;
import com.webservice.be_tailflash.modules.auth.entity.UserRole;
import com.webservice.be_tailflash.modules.auth.entity.UserSession;
import com.webservice.be_tailflash.modules.auth.mail.PasswordResetMailProperties;
import com.webservice.be_tailflash.modules.auth.mail.PasswordResetMailService;
import com.webservice.be_tailflash.modules.user.UserRepository;
import com.webservice.be_tailflash.modules.user.entity.User;
import com.webservice.be_tailflash.security.JwtProperties;
import com.webservice.be_tailflash.security.JwtTokenProvider;

@ExtendWith(MockitoExtension.class)
class AuthServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserSessionRepository userSessionRepository;

    @Mock
    private UserRoleRepository userRoleRepository;

    @Mock
    private TeacherProfileRepository teacherProfileRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    private JwtTokenProvider jwtTokenProvider;

    @Mock
    private PasswordResetMailService passwordResetMailService;

    @Mock
    private JwtProperties jwtProperties;

    @Mock
    private PasswordResetMailProperties passwordResetMailProperties;

    @InjectMocks
    private AuthServiceImpl authService;

    @Test
    void registerTeacherShouldCreateTeacherProfileAndIssueTokens() {
        UserRole teacherRole = new UserRole();
        teacherRole.setId(2L);
        teacherRole.setName("TEACHER");

        User savedUser = new User();
        savedUser.setId(99L);
        savedUser.setEmail("teacher@tailflash.app");
        savedUser.setDisplayName("Teacher TailFlash");
        savedUser.setRole(teacherRole);
        savedUser.setStatus(UserStatus.ACTIVE);

        given(userRepository.existsByEmail("teacher@tailflash.app")).willReturn(false);
        given(userRoleRepository.findByName("TEACHER")).willReturn(Optional.of(teacherRole));
        given(passwordEncoder.encode("Secret123")).willReturn("encoded-secret");
        given(userRepository.save(any(User.class))).willReturn(savedUser);
        given(jwtTokenProvider.createAccessToken(99L, "teacher@tailflash.app", "TEACHER")).willReturn("access");
        given(jwtTokenProvider.createRefreshToken(99L)).willReturn("refresh");
        given(jwtTokenProvider.hashToken("refresh")).willReturn("hashed-refresh");
        given(jwtProperties.accessTokenTtlSeconds()).willReturn(900L);
        given(jwtProperties.refreshTokenTtlSeconds()).willReturn(604800L);

        LoginResponse response = authService.register(
            new RegisterRequest("teacher@tailflash.app", "Secret123", "Teacher TailFlash", Role.TEACHER)
        );

        assertThat(response.accessToken()).isEqualTo("access");
        assertThat(response.user().role()).isEqualTo("TEACHER");
        verify(teacherProfileRepository).save(any());
        verify(userSessionRepository).save(any(UserSession.class));
    }

    @Test
    void forgotPasswordShouldSaveTokenAndSendEmailWhenUserExists() {
        User user = new User();
        user.setId(1L);
        user.setEmail("learner@tailflash.app");
        user.setDisplayName("Learner");

        given(userRepository.findByEmail("learner@tailflash.app")).willReturn(Optional.of(user));
        given(jwtTokenProvider.hashToken(any(String.class))).willReturn("hashed-reset-token");
        given(passwordResetMailProperties.tokenTtlMinutes()).willReturn(15L);

        MessageResponse response = authService.forgotPassword(new ForgotPasswordRequest("learner@tailflash.app"));

        assertThat(response.message()).isEqualTo("If your email exists, reset instructions have been sent");
        assertThat(user.getPasswordResetTokenHash()).isEqualTo("hashed-reset-token");
        assertThat(user.getPasswordResetTokenExpiresAt()).isNotNull();

        verify(userRepository).save(user);
        verify(passwordResetMailService).sendPasswordResetMail(eq(user), any(String.class));
    }

    @Test
    void forgotPasswordShouldNotSendEmailWhenUserDoesNotExist() {
        given(userRepository.findByEmail("missing@tailflash.app")).willReturn(Optional.empty());

        MessageResponse response = authService.forgotPassword(new ForgotPasswordRequest("missing@tailflash.app"));

        assertThat(response.message()).isEqualTo("If your email exists, reset instructions have been sent");
        verify(userRepository, never()).save(any(User.class));
        verify(passwordResetMailService, never()).sendPasswordResetMail(any(User.class), any(String.class));
    }

    @Test
    void getSessionsShouldReturnCurrentUserSessions() {
        UserSession session = new UserSession();
        session.setId(7L);
        session.setUserId(1L);
        session.setDeviceInfo("Mozilla/5.0");
        session.setIpAddress("127.0.0.1");
        session.setCreatedAt(Instant.parse("2026-03-28T10:00:00Z"));
        session.setExpiresAt(Instant.parse("2026-03-29T10:00:00Z"));
        session.setRevoked(false);

        given(userSessionRepository.findAllByUserIdOrderByCreatedAtDesc(1L)).willReturn(List.of(session));

        List<AuthSessionResponse> sessions = authService.getSessions(1L);

        assertThat(sessions).hasSize(1);
        assertThat(sessions.get(0).id()).isEqualTo(7L);
        assertThat(sessions.get(0).revoked()).isFalse();
    }

    @Test
    void revokeSessionShouldMarkSessionAsRevoked() {
        UserSession session = new UserSession();
        session.setId(7L);
        session.setUserId(1L);
        session.setRevoked(false);

        given(userSessionRepository.findByIdAndUserId(7L, 1L)).willReturn(Optional.of(session));

        MessageResponse response = authService.revokeSession(1L, 7L);

        assertThat(response.message()).isEqualTo("Session revoked");
        assertThat(session.isRevoked()).isTrue();
        verify(userSessionRepository).save(session);
    }
}
