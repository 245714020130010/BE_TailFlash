package com.webservice.be_tailflash.modules.deck;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.webservice.be_tailflash.modules.deck.dto.CreateDeckRequest;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.modules.deck.entity.Deck;

@ExtendWith(MockitoExtension.class)
class DeckServiceImplTest {

    @Mock
    private DeckRepository deckRepository;

    @Mock
    private DeckMapper deckMapper;

    @InjectMocks
    private DeckServiceImpl deckService;

    @Test
    void createShouldPersistDeckWithOwner() {
        CreateDeckRequest request = new CreateDeckRequest("English A1", "Basic words", "PRIVATE");

        Deck entity = new Deck();
        entity.setTitle("English A1");
        entity.setDescription("Basic words");
        entity.setVisibility("PRIVATE");

        Deck saved = new Deck();
        saved.setId(10L);
        saved.setTitle("English A1");
        saved.setDescription("Basic words");
        saved.setVisibility("PRIVATE");
        saved.setOwnerId(99L);

        given(deckMapper.toEntity(request)).willReturn(entity);
        given(deckRepository.save(any(Deck.class))).willReturn(saved);
        given(deckMapper.toResponse(saved)).willReturn(new DeckResponse(10L, "English A1", "Basic words", "PRIVATE", 99L));

        DeckResponse response = deckService.create(99L, request);

        assertThat(response.id()).isEqualTo(10L);
        assertThat(response.ownerId()).isEqualTo(99L);
    }
}
