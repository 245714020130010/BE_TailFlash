package com.webservice.be_tailflash.modules.admin.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.be_tailflash.common.dto.ApiResponse;
import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminPermissionResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminRoleResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminUserPermissionsResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminUserResponse;
import com.webservice.be_tailflash.modules.admin.dto.AssignPermissionsRequest;
import com.webservice.be_tailflash.modules.admin.dto.ChangeUserRoleRequest;
import com.webservice.be_tailflash.modules.admin.dto.CreateRoleRequest;
import com.webservice.be_tailflash.modules.admin.dto.UpdateRoleRequest;
import com.webservice.be_tailflash.modules.admin.service.AdminAccessService;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.SecurityUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
@Validated
public class AdminAccessController {

    private final AdminAccessService adminAccessService;

    @GetMapping("/users")
    public ResponseEntity<ApiResponse<List<AdminUserResponse>>> getUsers(
        @RequestParam(required = false) String role,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) String keyword
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(adminAccessService.getUsers(principal.role(), role, status, keyword))
        );
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<ApiResponse<AdminUserResponse>> getUserById(@PathVariable Long userId) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(adminAccessService.getUserById(principal.role(), userId)));
    }

    @PutMapping("/users/{userId}/ban")
    public ResponseEntity<ApiResponse<MessageResponse>> banUser(@PathVariable Long userId) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(adminAccessService.banUser(principal.role(), principal.userId(), userId))
        );
    }

    @PutMapping("/users/{userId}/unban")
    public ResponseEntity<ApiResponse<MessageResponse>> unbanUser(@PathVariable Long userId) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(adminAccessService.unbanUser(principal.role(), principal.userId(), userId))
        );
    }

    @PutMapping("/users/{userId}/role")
    public ResponseEntity<ApiResponse<MessageResponse>> changeUserRole(
        @PathVariable Long userId,
        @Valid @RequestBody ChangeUserRoleRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(
                adminAccessService.changeUserRole(
                    principal.role(),
                    principal.userId(),
                    userId,
                    request
                )
            )
        );
    }

    @GetMapping("/users/{userId}/permissions")
    public ResponseEntity<ApiResponse<AdminUserPermissionsResponse>> getUserPermissions(@PathVariable Long userId) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(adminAccessService.getUserPermissions(principal.role(), userId)));
    }

    @PutMapping("/users/{userId}/permissions")
    public ResponseEntity<ApiResponse<MessageResponse>> assignUserPermissions(
        @PathVariable Long userId,
        @Valid @RequestBody AssignPermissionsRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(
                adminAccessService.assignUserPermissions(
                    principal.role(),
                    principal.userId(),
                    userId,
                    request
                )
            )
        );
    }

    @GetMapping("/roles")
    public ResponseEntity<ApiResponse<List<AdminRoleResponse>>> getRoles() {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(adminAccessService.getRoles(principal.role())));
    }

    @PostMapping("/roles")
    public ResponseEntity<ApiResponse<MessageResponse>> createRole(@Valid @RequestBody CreateRoleRequest request) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(adminAccessService.createRole(principal.role(), request)));
    }

    @PutMapping("/roles/{roleId}")
    public ResponseEntity<ApiResponse<MessageResponse>> updateRole(
        @PathVariable Long roleId,
        @Valid @RequestBody UpdateRoleRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(adminAccessService.updateRole(principal.role(), roleId, request)));
    }

    @GetMapping("/permissions")
    public ResponseEntity<ApiResponse<List<AdminPermissionResponse>>> getPermissions() {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(ApiResponse.success(adminAccessService.getPermissions(principal.role())));
    }

    @PutMapping("/roles/{roleId}/permissions")
    public ResponseEntity<ApiResponse<MessageResponse>> assignRolePermissions(
        @PathVariable Long roleId,
        @Valid @RequestBody AssignPermissionsRequest request
    ) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.ok(
            ApiResponse.success(adminAccessService.assignRolePermissions(principal.role(), roleId, request))
        );
    }
}
