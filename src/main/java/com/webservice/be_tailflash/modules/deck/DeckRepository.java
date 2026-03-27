package com.webservice.be_tailflash.modules.deck;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.deck.entity.Deck;

public interface DeckRepository extends JpaRepository<Deck, Long> {

	List<Deck> findByOwnerId(Long ownerId);
}
