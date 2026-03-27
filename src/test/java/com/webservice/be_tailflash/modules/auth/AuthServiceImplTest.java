package com.webservice.be_tailflash.modules.auth;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.modules.auth.dto.ForgotPasswordRequest;
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
}
