package com.webservice.be_tailflash.modules.user.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.webservice.be_tailflash.common.enums.UserStatus;
import com.webservice.be_tailflash.modules.auth.entity.UserRole;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String passwordHash;

    @Column(nullable = false, length = 120)
    private String displayName;

    @Column(length = 500)
    private String avatarUrl;

    @Column(length = 1000)
    private String bio;

    @Column(length = 30)
    private String phone;

    @Column(nullable = false)
    private boolean emailVerified;

    @Column(nullable = false)
    private boolean isVerified;

    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private UserRole role;

    @Column(nullable = false, length = 10)
    private String uiLanguage;

    @Column(nullable = false, length = 10)
    private String learnLang;

    @Column(nullable = false, length = 60)
    private String timezone;

    @Column(nullable = false)
    private long xpPoints;

    @Column(nullable = false)
    private int level;

    @Column(nullable = false)
    private int streakCount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private UserStatus status;

    @Column(length = 255)
    private String passwordResetTokenHash;

    private Instant passwordResetTokenExpiresAt;

    @Column(nullable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private Instant updatedAt;
}
