package com.webservice.be_tailflash.modules.flashcard.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FlashcardTagId implements Serializable {

    private Long flashcardId;
    private Long tagId;
}
