package com.webservice.be_tailflash.modules.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.be_tailflash.common.dto.ApiResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminDeckApprovalRequest;
import com.webservice.be_tailflash.modules.deck.DeckService;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.SecurityUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
@Validated
public class AdminDeckController {

    private final DeckService deckService;

    @PutMapping("/decks/{deckId}/approval")
    public ResponseEntity<ApiResponse<DeckResponse>> updateDeckApproval(
        @PathVariable Long deckId,
        @Valid @RequestBody AdminDeckApprovalRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(deckService.updateApproval(principal.role(), deckId, request.approved()))
        );
    }
}
