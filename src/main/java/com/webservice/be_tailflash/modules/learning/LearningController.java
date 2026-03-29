package com.webservice.be_tailflash.modules.learning;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.be_tailflash.common.dto.ApiResponse;
import com.webservice.be_tailflash.modules.learning.dto.CreateStudyResultRequest;
import com.webservice.be_tailflash.modules.learning.dto.StudyResultResponse;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.SecurityUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/learning")
@RequiredArgsConstructor
public class LearningController {

    private final LearningService learningService;

    @GetMapping("/health")
    public ResponseEntity<ApiResponse<String>> health() {
        return ResponseEntity.ok(ApiResponse.success("Learning module ready"));
    }

    @PostMapping("/study-results")
    public ResponseEntity<ApiResponse<StudyResultResponse>> createStudyResult(
        @Valid @RequestBody CreateStudyResultRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        StudyResultResponse response = learningService.createStudyResult(principal.userId(), principal.role(), request);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(response));
    }
}
