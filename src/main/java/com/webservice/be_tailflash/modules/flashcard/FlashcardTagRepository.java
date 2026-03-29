package com.webservice.be_tailflash.modules.flashcard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.flashcard.entity.FlashcardTag;
import com.webservice.be_tailflash.modules.flashcard.entity.FlashcardTagId;

public interface FlashcardTagRepository extends JpaRepository<FlashcardTag, FlashcardTagId> {

    List<FlashcardTag> findByFlashcardId(Long flashcardId);

    void deleteByFlashcardId(Long flashcardId);
}
