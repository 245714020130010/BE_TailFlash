package com.webservice.be_tailflash.modules.auth;

import com.webservice.be_tailflash.modules.auth.dto.LoginRequest;
import com.webservice.be_tailflash.modules.auth.dto.LoginResponse;
import com.webservice.be_tailflash.modules.auth.dto.LogoutRequest;
import com.webservice.be_tailflash.modules.auth.dto.ForgotPasswordRequest;
import com.webservice.be_tailflash.modules.auth.dto.ResetPasswordRequest;
import com.webservice.be_tailflash.modules.auth.dto.ChangePasswordRequest;
import com.webservice.be_tailflash.modules.auth.dto.RefreshTokenRequest;
import com.webservice.be_tailflash.modules.auth.dto.RegisterRequest;
import com.webservice.be_tailflash.modules.auth.dto.AuthUserResponse;
import com.webservice.be_tailflash.modules.auth.dto.AuthSessionResponse;
import com.webservice.be_tailflash.common.dto.MessageResponse;

import java.util.List;

public interface AuthService {

    LoginResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    LoginResponse refreshToken(RefreshTokenRequest request);

    MessageResponse logout(LogoutRequest request);

    MessageResponse forgotPassword(ForgotPasswordRequest request);

    MessageResponse resetPassword(ResetPasswordRequest request);

    MessageResponse changePassword(Long userId, ChangePasswordRequest request);

    AuthUserResponse me(Long userId);

    List<AuthSessionResponse> getSessions(Long userId);

    MessageResponse revokeSession(Long userId, Long sessionId);
}
