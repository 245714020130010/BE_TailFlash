package com.webservice.be_tailflash.modules.auth.mail;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.springframework.http.HttpStatus;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import com.webservice.be_tailflash.common.exception.ApiException;
import com.webservice.be_tailflash.modules.user.entity.User;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SmtpPasswordResetMailService implements PasswordResetMailService {

    private final JavaMailSender mailSender;
    private final SpringTemplateEngine templateEngine;
    private final PasswordResetMailProperties properties;

    @Override
    public void sendPasswordResetMail(User user, String rawResetToken) {
        String resetLink = UriComponentsBuilder.fromUriString(properties.resetUrl())
            .queryParam("token", rawResetToken)
            .build()
            .toUriString();

        Context context = new Context();
        context.setVariable("displayName", user.getDisplayName());
        context.setVariable("email", user.getEmail());
        context.setVariable("resetLink", resetLink);
        context.setVariable("tokenTtlMinutes", properties.tokenTtlMinutes());

        String htmlBody = templateEngine.process("mail/reset-password", context);
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, StandardCharsets.UTF_8.name());
            helper.setTo(user.getEmail());
            helper.setFrom(properties.fromEmail(), properties.fromName());
            helper.setSubject("TailFlash - Password reset request");
            helper.setText(htmlBody, true);
            mailSender.send(message);
        } catch (MailException | MessagingException | UnsupportedEncodingException ex) {
            throw new ApiException(
                "AUTH_RESET_EMAIL_SEND_FAILED",
                "Unable to send password reset email",
                HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}
