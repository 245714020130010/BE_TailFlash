package com.webservice.be_tailflash.modules.admin.controller;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.webservice.be_tailflash.modules.deck.DeckService;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.JwtTokenProvider;

@WebMvcTest(AdminDeckController.class)
@AutoConfigureMockMvc(addFilters = false)
class AdminDeckControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private DeckService deckService;

    @MockitoBean
    private JwtTokenProvider jwtTokenProvider;

    @Test
    void updateDeckApprovalShouldReturnSuccessEnvelope() throws Exception {
        DeckResponse response = new DeckResponse(
            10L,
            "TOEIC Core",
            "desc",
            "PUBLIC",
            12L,
            "english-core",
            List.of("toeic"),
            null,
            10,
            2,
            BigDecimal.valueOf(4.5),
            true,
            null,
            Instant.now(),
            Instant.now()
        );

        given(deckService.updateApproval(eq("ADMIN"), eq(10L), eq(true))).willReturn(response);

        SecurityContextHolder.getContext().setAuthentication(adminAuthentication());
        try {
            mockMvc.perform(put("/api/v1/admin/decks/10/approval")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                {
                  "approved": true
                }
                """))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.success").value(true))
            .andExpect(jsonPath("$.data.id").value(10))
            .andExpect(jsonPath("$.data.isApproved").value(true));
        } finally {
            SecurityContextHolder.clearContext();
        }
    }

    @Test
    void updateDeckApprovalShouldReturnValidationErrorWhenApprovedMissing() throws Exception {
        SecurityContextHolder.getContext().setAuthentication(adminAuthentication());
        try {
            mockMvc.perform(put("/api/v1/admin/decks/10/approval")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.success").value(false))
                .andExpect(jsonPath("$.error.code").value("VALIDATION_ERROR"));
        } finally {
            SecurityContextHolder.clearContext();
        }
    }

    private UsernamePasswordAuthenticationToken adminAuthentication() {
        AuthPrincipal principal = new AuthPrincipal(1L, "admin@tailflash.local", "ADMIN");
        return new UsernamePasswordAuthenticationToken(
            principal,
            null,
            List.of(new SimpleGrantedAuthority("ROLE_ADMIN"))
        );
    }
}
