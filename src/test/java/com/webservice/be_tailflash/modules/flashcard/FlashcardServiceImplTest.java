package com.webservice.be_tailflash.modules.flashcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.webservice.be_tailflash.modules.deck.DeckRepository;
import com.webservice.be_tailflash.modules.deck.entity.Deck;
import com.webservice.be_tailflash.modules.flashcard.dto.CreateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.dto.FlashcardResponse;
import com.webservice.be_tailflash.modules.flashcard.entity.Flashcard;

@ExtendWith(MockitoExtension.class)
class FlashcardServiceImplTest {

    @Mock
    private FlashcardRepository flashcardRepository;

    @Mock
    private FlashcardMapper flashcardMapper;

    @Mock
    private DeckRepository deckRepository;

    @InjectMocks
    private FlashcardServiceImpl flashcardService;

    @Test
    void createShouldAttachDeckId() {
        Deck deck = new Deck();
        deck.setId(5L);
        deck.setOwnerId(99L);

        CreateFlashcardRequest request = new CreateFlashcardRequest("hello", "xin chao", "greeting");

        Flashcard entity = new Flashcard();
        entity.setFrontText("hello");
        entity.setBackText("xin chao");
        entity.setHint("greeting");

        Flashcard saved = new Flashcard();
        saved.setId(88L);
        saved.setDeckId(5L);
        saved.setFrontText("hello");
        saved.setBackText("xin chao");
        saved.setHint("greeting");

        given(deckRepository.findById(5L)).willReturn(Optional.of(deck));
        given(flashcardMapper.toEntity(request)).willReturn(entity);
        given(flashcardRepository.save(any(Flashcard.class))).willReturn(saved);
        given(flashcardMapper.toResponse(saved)).willReturn(new FlashcardResponse(88L, 5L, "hello", "xin chao", "greeting"));

        FlashcardResponse response = flashcardService.create(99L, "LEARNER", 5L, request);

        assertThat(response.deckId()).isEqualTo(5L);
        assertThat(response.id()).isEqualTo(88L);
    }
}
