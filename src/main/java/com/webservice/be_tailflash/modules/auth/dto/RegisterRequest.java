package com.webservice.be_tailflash.modules.auth.dto;

import com.webservice.be_tailflash.common.enums.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
    @NotBlank @Email String email,
    @NotBlank @Size(min = 8, max = 120) String password,
    @NotBlank @Size(min = 2, max = 120) String displayName,
    Role role
) {
}
