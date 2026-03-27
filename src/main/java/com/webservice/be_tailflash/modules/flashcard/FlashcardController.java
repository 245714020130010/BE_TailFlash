package com.webservice.be_tailflash.modules.flashcard;

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
import com.webservice.be_tailflash.modules.flashcard.dto.CreateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.dto.FlashcardResponse;
import com.webservice.be_tailflash.modules.flashcard.dto.UpdateFlashcardRequest;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.SecurityUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/decks/{deckId}/cards")
@RequiredArgsConstructor
public class FlashcardController {

    private final FlashcardService flashcardService;

    @PostMapping
    public ResponseEntity<ApiResponse<FlashcardResponse>> create(
        @PathVariable Long deckId,
        @Valid @RequestBody CreateFlashcardRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        FlashcardResponse response = flashcardService.create(principal.userId(), principal.role().name(), deckId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(response));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<FlashcardResponse>>> getByDeck(@PathVariable Long deckId) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(flashcardService.getByDeck(principal.userId(), principal.role().name(), deckId))
        );
    }

    @PutMapping("/{cardId}")
    public ResponseEntity<ApiResponse<FlashcardResponse>> update(
        @PathVariable Long deckId,
        @PathVariable("cardId") Long cardId,
        @Valid @RequestBody UpdateFlashcardRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        FlashcardResponse response = flashcardService.update(
            principal.userId(),
            principal.role().name(),
            deckId,
            cardId,
            request
        );
        return ResponseEntity.ok(ApiResponse.success(response));
    }

    @DeleteMapping("/{cardId}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long deckId, @PathVariable("cardId") Long cardId) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        flashcardService.delete(principal.userId(), principal.role().name(), deckId, cardId);
        return ResponseEntity.ok(ApiResponse.success(null));
    }
}
