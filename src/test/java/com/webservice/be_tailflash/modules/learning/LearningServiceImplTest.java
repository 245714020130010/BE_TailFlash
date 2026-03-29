package com.webservice.be_tailflash.modules.learning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.webservice.be_tailflash.common.exception.BadRequestException;
import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.modules.deck.DeckRepository;
import com.webservice.be_tailflash.modules.deck.entity.Deck;
import com.webservice.be_tailflash.modules.learning.dto.CreateStudyResultRequest;
import com.webservice.be_tailflash.modules.learning.dto.StudyResultResponse;
import com.webservice.be_tailflash.modules.learning.entity.StudyResult;

@ExtendWith(MockitoExtension.class)
class LearningServiceImplTest {

    @Mock
    private StudyResultRepository studyResultRepository;

    @Mock
    private DeckRepository deckRepository;

    @InjectMocks
    private LearningServiceImpl learningService;

    @Test
    void createStudyResultShouldPersistForDeckOwner() {
        Deck deck = new Deck();
        deck.setId(15L);
        deck.setOwnerId(99L);
        deck.setLearnCount(2);

        CreateStudyResultRequest request = new CreateStudyResultRequest(15L, 20, 15, 300, "MIXED", "session note");

        StudyResult saved = new StudyResult();
        saved.setId(77L);
        saved.setDeckId(15L);
        saved.setUserId(99L);
        saved.setTotalCards(20);
        saved.setCorrectCount(15);
        saved.setAccuracyRate(new java.math.BigDecimal("75.00"));
        saved.setDurationSeconds(300);
        saved.setMode("MIXED");
        saved.setNote("session note");
        saved.setCompletedAt(java.time.Instant.now());
        saved.setCreatedAt(java.time.Instant.now());

        given(deckRepository.findById(15L)).willReturn(Optional.of(deck));
        given(studyResultRepository.save(any(StudyResult.class))).willReturn(saved);

        StudyResultResponse response = learningService.createStudyResult(99L, "LEARNER", request);

        assertThat(response.id()).isEqualTo(77L);
        assertThat(response.deckId()).isEqualTo(15L);
        assertThat(response.accuracyRate()).isEqualByComparingTo("75.00");
    }

    @Test
    void createStudyResultShouldThrowWhenCorrectCountExceedsTotalCards() {
        Deck deck = new Deck();
        deck.setId(15L);
        deck.setOwnerId(99L);

        CreateStudyResultRequest request = new CreateStudyResultRequest(15L, 10, 11, 120, "REVIEW", null);

        given(deckRepository.findById(15L)).willReturn(Optional.of(deck));

        assertThatThrownBy(() -> learningService.createStudyResult(99L, "LEARNER", request))
            .isInstanceOf(BadRequestException.class)
            .hasMessageContaining("correctCount cannot be greater than totalCards");
    }

    @Test
    void createStudyResultShouldThrowWhenRequesterCannotAccessDeck() {
        Deck deck = new Deck();
        deck.setId(15L);
        deck.setOwnerId(100L);

        CreateStudyResultRequest request = new CreateStudyResultRequest(15L, 10, 7, 120, "REVIEW", null);

        given(deckRepository.findById(15L)).willReturn(Optional.of(deck));

        assertThatThrownBy(() -> learningService.createStudyResult(99L, "LEARNER", request))
            .isInstanceOf(ForbiddenException.class)
            .hasMessageContaining("do not have permission");
    }
}
