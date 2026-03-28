package com.webservice.be_tailflash.modules.auth;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.webservice.be_tailflash.modules.auth.dto.LoginRequest;
import com.webservice.be_tailflash.modules.auth.dto.LoginResponse;
import com.webservice.be_tailflash.modules.auth.dto.AuthUserResponse;
import com.webservice.be_tailflash.security.JwtTokenProvider;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@WebMvcTest(AuthController.class)
@AutoConfigureMockMvc(addFilters = false)
class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private AuthService authService;

    @MockitoBean
    private JwtTokenProvider jwtTokenProvider;

    @Test
    void loginShouldReturnSuccessEnvelope() throws Exception {
        given(authService.login(any(LoginRequest.class)))
            .willReturn(
                new LoginResponse(
                    "access",
                    "refresh",
                    "Bearer",
                    3600L,
                    new AuthUserResponse(1L, "user@mail.com", "User", "LEARNER", true, "ACTIVE", null, null)
                )
            );

        mockMvc.perform(post("/api/v1/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                      "email": "user@mail.com",
                      "password": "Secret123"
                    }
                    """))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.success").value(true))
            .andExpect(jsonPath("$.data.accessToken").value("access"));
    }
}
