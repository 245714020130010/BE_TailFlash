CREATE TABLE IF NOT EXISTS study_results (
    id BIGINT NOT NULL AUTO_INCREMENT,
    deck_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    total_cards INT NOT NULL,
    correct_count INT NOT NULL,
    accuracy_rate DECIMAL(5, 2) NOT NULL,
    duration_seconds INT NOT NULL,
    mode VARCHAR(20) NOT NULL,
    note VARCHAR(1000),
    completed_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_study_results PRIMARY KEY (id),
    CONSTRAINT fk_study_results__decks FOREIGN KEY (deck_id) REFERENCES decks(id) ON DELETE CASCADE,
    CONSTRAINT fk_study_results__users FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE INDEX idx_study_results__user_id ON study_results(user_id);
CREATE INDEX idx_study_results__deck_id ON study_results(deck_id);
CREATE INDEX idx_study_results__completed_at ON study_results(completed_at);
