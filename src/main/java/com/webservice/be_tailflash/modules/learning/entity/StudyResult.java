package com.webservice.be_tailflash.modules.learning.entity;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
    name = "study_results",
    indexes = {
        @Index(name = "idx_study_results__user_id", columnList = "userId"),
        @Index(name = "idx_study_results__deck_id", columnList = "deckId"),
        @Index(name = "idx_study_results__completed_at", columnList = "completedAt")
    }
)
@Getter
@Setter
@NoArgsConstructor
public class StudyResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long deckId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Integer totalCards;

    @Column(nullable = false)
    private Integer correctCount;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal accuracyRate;

    @Column(nullable = false)
    private Integer durationSeconds;

    @Column(nullable = false, length = 20)
    private String mode;

    @Column(length = 1000)
    private String note;

    @Column(nullable = false)
    private Instant completedAt;

    @Column(nullable = false, updatable = false)
    private Instant createdAt;
}
