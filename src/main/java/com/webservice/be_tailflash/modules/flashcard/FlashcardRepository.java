package com.webservice.be_tailflash.modules.flashcard;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.flashcard.entity.Flashcard;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {

    List<Flashcard> findByDeckId(Long deckId);

    Optional<Flashcard> findByIdAndDeckId(Long id, Long deckId);

    long countByDeckId(Long deckId);
}
