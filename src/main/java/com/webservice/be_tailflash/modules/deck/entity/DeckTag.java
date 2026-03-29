package com.webservice.be_tailflash.modules.deck.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "deck_tags")
@IdClass(DeckTagId.class)
@Getter
@Setter
@NoArgsConstructor
public class DeckTag {

    @Id
    private Long deckId;

    @Id
    private Long tagId;

    public DeckTag(Long deckId, Long tagId) {
        this.deckId = deckId;
        this.tagId = tagId;
    }
}
