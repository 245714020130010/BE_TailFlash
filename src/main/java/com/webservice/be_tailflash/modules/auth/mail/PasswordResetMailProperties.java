package com.webservice.be_tailflash.modules.auth.mail;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Validated
@ConfigurationProperties(prefix = "app.mail.password-reset")
public record PasswordResetMailProperties(
    @NotBlank String fromEmail,
    @NotBlank String fromName,
    @NotBlank String resetUrl,
    @Min(1) long tokenTtlMinutes
) {
}
