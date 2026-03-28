package com.webservice.be_tailflash.modules.admin.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.be_tailflash.common.dto.ApiResponse;
import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminTeacherRequestResponse;
import com.webservice.be_tailflash.modules.admin.dto.RejectTeacherRequest;
import com.webservice.be_tailflash.modules.admin.service.AdminTeacherService;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.SecurityUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
@Validated
public class AdminTeacherController {

    private final AdminTeacherService adminTeacherService;

    @GetMapping("/teacher-requests")
    public ResponseEntity<ApiResponse<List<AdminTeacherRequestResponse>>> getTeacherRequests(
        @RequestParam(required = false) String status
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(adminTeacherService.getTeacherRequests(principal.role(), status))
        );
    }

    @PutMapping("/teacher-requests/{teacherProfileId}/approve")
    public ResponseEntity<ApiResponse<MessageResponse>> approveTeacherRequest(@PathVariable Long teacherProfileId) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(
                adminTeacherService.approveTeacherRequest(
                    principal.role(),
                    principal.userId(),
                    teacherProfileId
                )
            )
        );
    }

    @PutMapping("/teacher-requests/{teacherProfileId}/reject")
    public ResponseEntity<ApiResponse<MessageResponse>> rejectTeacherRequest(
        @PathVariable Long teacherProfileId,
        @Valid @RequestBody RejectTeacherRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(
                adminTeacherService.rejectTeacherRequest(
                    principal.role(),
                    principal.userId(),
                    teacherProfileId,
                    request
                )
            )
        );
    }
}
