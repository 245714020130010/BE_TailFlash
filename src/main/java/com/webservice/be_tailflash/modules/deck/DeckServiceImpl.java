package com.webservice.be_tailflash.modules.deck;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.modules.deck.dto.CreateDeckRequest;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.modules.deck.dto.UpdateDeckRequest;
import com.webservice.be_tailflash.modules.deck.entity.Deck;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeckServiceImpl implements DeckService {

    private final DeckRepository deckRepository;
    private final DeckMapper deckMapper;

    @Override
    @Transactional
    public DeckResponse create(Long requesterId, CreateDeckRequest request) {
        Deck deck = deckMapper.toEntity(request);
        deck.setOwnerId(requesterId);
        Deck saved = deckRepository.save(deck);
        return deckMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DeckResponse> getAll(Long requesterId, String role) {
        List<Deck> decks = "ADMIN".equals(role)
            ? deckRepository.findAll()
            : deckRepository.findByOwnerId(requesterId);

        return decks.stream()
            .map(deckMapper::toResponse)
            .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public DeckResponse getById(Long requesterId, String role, Long id) {
        Deck deck = deckRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        assertCanAccess(deck, requesterId, role);
        return deckMapper.toResponse(deck);
    }

    @Override
    @Transactional
    public DeckResponse update(Long requesterId, String role, Long id, UpdateDeckRequest request) {
        Deck deck = deckRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        assertCanAccess(deck, requesterId, role);

        deckMapper.updateEntity(request, deck);
        Deck saved = deckRepository.save(deck);
        return deckMapper.toResponse(saved);
    }

    @Override
    @Transactional
    public void delete(Long requesterId, String role, Long id) {
        Deck deck = deckRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));
        assertCanAccess(deck, requesterId, role);
        deckRepository.delete(deck);
    }

    private void assertCanAccess(Deck deck, Long requesterId, String role) {
        if ("ADMIN".equals(role)) {
            return;
        }
        if (!deck.getOwnerId().equals(requesterId)) {
            throw new ForbiddenException("DECK_FORBIDDEN", "You do not have permission to access this deck");
        }
    }
}
