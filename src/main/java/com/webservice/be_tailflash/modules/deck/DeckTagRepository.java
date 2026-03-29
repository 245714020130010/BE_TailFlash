package com.webservice.be_tailflash.modules.deck;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.deck.entity.DeckTag;
import com.webservice.be_tailflash.modules.deck.entity.DeckTagId;

public interface DeckTagRepository extends JpaRepository<DeckTag, DeckTagId> {

    List<DeckTag> findByDeckId(Long deckId);

    void deleteByDeckId(Long deckId);
}
