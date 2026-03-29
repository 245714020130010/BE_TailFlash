package com.webservice.be_tailflash.modules.learning;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.exception.BadRequestException;
import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.modules.deck.DeckRepository;
import com.webservice.be_tailflash.modules.deck.entity.Deck;
import com.webservice.be_tailflash.modules.learning.dto.CreateStudyResultRequest;
import com.webservice.be_tailflash.modules.learning.dto.StudyResultResponse;
import com.webservice.be_tailflash.modules.learning.entity.StudyResult;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LearningServiceImpl implements LearningService {

    private final StudyResultRepository studyResultRepository;
    private final DeckRepository deckRepository;

    @Override
    @Transactional
    public StudyResultResponse createStudyResult(Long requesterId, String role, CreateStudyResultRequest request) {
        Deck deck = deckRepository.findById(request.deckId())
            .orElseThrow(() -> new ResourceNotFoundException("DECK_NOT_FOUND", "Deck not found"));

        if (!"ADMIN".equals(role) && !deck.getOwnerId().equals(requesterId)) {
            throw new ForbiddenException("DECK_FORBIDDEN", "You do not have permission to submit result for this deck");
        }

        if (request.correctCount() > request.totalCards()) {
            throw new BadRequestException("STUDY_RESULT_INVALID_SCORE", "correctCount cannot be greater than totalCards");
        }

        StudyResult entity = new StudyResult();
        entity.setDeckId(deck.getId());
        entity.setUserId(requesterId);
        entity.setTotalCards(request.totalCards());
        entity.setCorrectCount(request.correctCount());
        entity.setAccuracyRate(calculateAccuracy(request.correctCount(), request.totalCards()));
        entity.setDurationSeconds(request.durationSeconds());
        entity.setMode(request.mode().toUpperCase(Locale.ROOT));
        entity.setNote(request.note());
        entity.setCompletedAt(Instant.now());
        entity.setCreatedAt(Instant.now());

        StudyResult saved = studyResultRepository.save(entity);

        Integer currentLearnCount = deck.getLearnCount() == null ? 0 : deck.getLearnCount();
        deck.setLearnCount(currentLearnCount + 1);
        deckRepository.save(deck);

        return toResponse(saved);
    }

    private BigDecimal calculateAccuracy(int correctCount, int totalCards) {
        if (totalCards <= 0) {
            return BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        }

        return BigDecimal.valueOf(correctCount)
            .multiply(BigDecimal.valueOf(100))
            .divide(BigDecimal.valueOf(totalCards), 2, RoundingMode.HALF_UP);
    }

    private StudyResultResponse toResponse(StudyResult entity) {
        return new StudyResultResponse(
            entity.getId(),
            entity.getDeckId(),
            entity.getUserId(),
            entity.getTotalCards(),
            entity.getCorrectCount(),
            entity.getAccuracyRate(),
            entity.getDurationSeconds(),
            entity.getMode(),
            entity.getNote(),
            entity.getCompletedAt(),
            entity.getCreatedAt()
        );
    }
}
