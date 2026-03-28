package com.webservice.be_tailflash.modules.auth.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.webservice.be_tailflash.common.enums.TeacherProfileStatus;

@Entity
@Table(name = "teacher_profiles")
@Getter
@Setter
@NoArgsConstructor
public class TeacherProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long userId;

    @Column(length = 500)
    private String certificateUrl;

    @Column(length = 1000)
    private String qualifications;

    private Integer experienceYears;

    @Column(length = 255)
    private String specialization;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TeacherProfileStatus status;

    private Long reviewedBy;

    private Instant reviewedAt;

    @Column(length = 1000)
    private String rejectReason;

    @Column(nullable = false)
    private Instant createdAt;
}
