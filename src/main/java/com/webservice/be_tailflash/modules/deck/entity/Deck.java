package com.webservice.be_tailflash.modules.deck.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
    name = "decks",
    indexes = {
        @Index(name = "idx_decks__owner_id", columnList = "ownerId")
    }
)
@Getter
@Setter
@NoArgsConstructor
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private Long ownerId;

    @Column(nullable = false, length = 20)
    private String visibility;

    @Column
    private Long categoryId;

    @Column(length = 500)
    private String coverImageUrl;

    @Column(nullable = false)
    private Integer totalCards = 0;

    @Column(nullable = false)
    private Integer learnCount = 0;

    @Column(precision = 4, scale = 2)
    private BigDecimal avgRating;

    @Column(nullable = false)
    private Boolean isApproved = false;

    @Column
    private Long clonedFrom;

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
