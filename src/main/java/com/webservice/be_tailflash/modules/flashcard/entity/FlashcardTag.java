package com.webservice.be_tailflash.modules.flashcard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "flashcard_tags")
@IdClass(FlashcardTagId.class)
@Getter
@Setter
@NoArgsConstructor
public class FlashcardTag {

    @Id
    private Long flashcardId;

    @Id
    private Long tagId;

    public FlashcardTag(Long flashcardId, Long tagId) {
        this.flashcardId = flashcardId;
        this.tagId = tagId;
    }
}
