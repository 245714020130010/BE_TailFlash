package com.webservice.be_tailflash.modules.flashcard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
    name = "flashcards",
    indexes = {
        @Index(name = "idx_flashcards__deck_id", columnList = "deckId")
    }
)
@Getter
@Setter
@NoArgsConstructor
public class Flashcard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long deckId;

    @Column(nullable = false, length = 1000)
    private String frontText;

    @Column(nullable = false, length = 1000)
    private String backText;

    @Column(nullable = false, length = 255)
    private String hint;

    @Column
    private Long categoryId;

    @Column(length = 500)
    private String frontImageUrl;

    @Column(length = 500)
    private String frontAudioUrl;

    @Column(length = 120)
    private String phonetic;

    @Column(length = 1000)
    private String backDetail;

    @Column(length = 1000)
    private String example;

    @Column(length = 500)
    private String synonyms;

    @Column(length = 1000)
    private String note;

    @Column(nullable = false)
    private Integer sortOrder = 0;

    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private Instant updatedAt;

    @PrePersist
    void onCreate() {
        Instant now = Instant.now();
        if (createdAt == null) {
            createdAt = now;
        }
        updatedAt = now;
    }

    @PreUpdate
    void onUpdate() {
        updatedAt = Instant.now();
    }
}
