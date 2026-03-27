CREATE TABLE IF NOT EXISTS users (
    id BIGINT NOT NULL AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    display_name VARCHAR(120) NOT NULL,
    email_verified BIT(1) NOT NULL DEFAULT b'0',
    role VARCHAR(20) NOT NULL,
    password_reset_token_hash VARCHAR(255),
    password_reset_token_expires_at TIMESTAMP NULL,
    CONSTRAINT pk_users PRIMARY KEY (id),
    CONSTRAINT uq_users__email UNIQUE (email)
);

CREATE TABLE IF NOT EXISTS user_sessions (
    id BIGINT NOT NULL AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    refresh_token_hash VARCHAR(255) NOT NULL,
    expires_at TIMESTAMP NOT NULL,
    revoked BIT(1) NOT NULL DEFAULT b'0',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_user_sessions PRIMARY KEY (id),
    CONSTRAINT uq_user_sessions__refresh_token_hash UNIQUE (refresh_token_hash),
    CONSTRAINT fk_user_sessions__users FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE INDEX idx_user_sessions__user_id ON user_sessions(user_id);

CREATE TABLE IF NOT EXISTS decks (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(1000),
    visibility VARCHAR(20) NOT NULL,
    owner_id BIGINT NOT NULL,
    CONSTRAINT pk_decks PRIMARY KEY (id),
    CONSTRAINT fk_decks__users FOREIGN KEY (owner_id) REFERENCES users(id)
);

CREATE INDEX idx_decks__owner_id ON decks(owner_id);

CREATE TABLE IF NOT EXISTS flashcards (
    id BIGINT NOT NULL AUTO_INCREMENT,
    deck_id BIGINT NOT NULL,
    front_text VARCHAR(1000) NOT NULL,
    back_text VARCHAR(1000) NOT NULL,
    hint VARCHAR(255) NOT NULL DEFAULT '',
    CONSTRAINT pk_flashcards PRIMARY KEY (id),
    CONSTRAINT fk_flashcards__decks FOREIGN KEY (deck_id) REFERENCES decks(id) ON DELETE CASCADE
);

CREATE INDEX idx_flashcards__deck_id ON flashcards(deck_id);
