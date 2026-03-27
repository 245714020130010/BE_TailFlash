package com.webservice.be_tailflash.modules.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.be_tailflash.common.dto.ApiResponse;
import com.webservice.be_tailflash.modules.user.dto.UserProfileResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/me")
    public ResponseEntity<ApiResponse<UserProfileResponse>> getMe(
        @RequestHeader(value = "X-User-Email", required = false) String userEmail
    ) {
        String resolvedEmail = userEmail == null ? "unknown@tailflash.local" : userEmail;
        return ResponseEntity.ok(ApiResponse.success(userService.getByEmail(resolvedEmail)));
    }
}
