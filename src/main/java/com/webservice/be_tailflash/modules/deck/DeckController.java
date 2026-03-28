package com.webservice.be_tailflash.modules.deck;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.be_tailflash.common.dto.ApiResponse;
import com.webservice.be_tailflash.modules.deck.dto.CreateDeckRequest;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.modules.deck.dto.UpdateDeckRequest;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.SecurityUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/decks")
@RequiredArgsConstructor
public class DeckController {

    private final DeckService deckService;

    @PostMapping
    public ResponseEntity<ApiResponse<DeckResponse>> create(@Valid @RequestBody CreateDeckRequest request) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(deckService.create(principal.userId(), request)));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<DeckResponse>>> getAll() {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(deckService.getAll(principal.userId(), principal.role())));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<DeckResponse>> getById(@PathVariable Long id) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(deckService.getById(principal.userId(), principal.role(), id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<DeckResponse>> update(@PathVariable Long id, @Valid @RequestBody UpdateDeckRequest request) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(deckService.update(principal.userId(), principal.role(), id, request)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        deckService.delete(principal.userId(), principal.role(), id);
        return ResponseEntity.ok(ApiResponse.success(null));
    }
}
