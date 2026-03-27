package com.webservice.be_tailflash.modules.flashcard.entity;

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
}
