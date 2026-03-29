package com.webservice.be_tailflash.modules.deck;

import java.util.List;

import com.webservice.be_tailflash.modules.deck.dto.CreateDeckRequest;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.modules.deck.dto.UpdateDeckRequest;

public interface DeckService {

    DeckResponse create(Long requesterId, String requesterRole, CreateDeckRequest request);

    List<DeckResponse> getAll(Long requesterId, String role);

    DeckResponse getById(Long requesterId, String role, Long id);

    DeckResponse update(Long requesterId, String role, Long id, UpdateDeckRequest request);

    DeckResponse updateApproval(String requesterRole, Long id, boolean approved);

    void delete(Long requesterId, String role, Long id);
}
