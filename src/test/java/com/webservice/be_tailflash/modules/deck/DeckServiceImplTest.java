package com.webservice.be_tailflash.modules.deck;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.webservice.be_tailflash.modules.category.CategoryRepository;
import com.webservice.be_tailflash.modules.deck.dto.CreateDeckRequest;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.modules.deck.entity.Deck;
import com.webservice.be_tailflash.modules.tag.TagRepository;

@ExtendWith(MockitoExtension.class)
class DeckServiceImplTest {

    @Mock
    private DeckRepository deckRepository;

    @Mock
    private DeckMapper deckMapper;

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private TagRepository tagRepository;

    @Mock
    private DeckTagRepository deckTagRepository;

    @InjectMocks
    private DeckServiceImpl deckService;

    @Test
    void createShouldPersistDeckWithOwner() {
        CreateDeckRequest request = new CreateDeckRequest("English A1", "Basic words", "PRIVATE", null, null, null);

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
        given(deckTagRepository.findByDeckId(10L)).willReturn(java.util.List.of());

        DeckResponse response = deckService.create(99L, "LEARNER", request);

        assertThat(response.id()).isEqualTo(10L);
        assertThat(response.ownerId()).isEqualTo(99L);
    }
}
