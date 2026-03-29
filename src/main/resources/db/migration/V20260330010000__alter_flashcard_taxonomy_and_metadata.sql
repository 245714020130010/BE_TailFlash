CREATE TABLE IF NOT EXISTS categories (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name_key VARCHAR(120) NOT NULL,
    parent_id BIGINT,
    icon VARCHAR(120),
    sort_order INT NOT NULL DEFAULT 0,
    is_active BIT(1) NOT NULL DEFAULT b'1',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT pk_categories PRIMARY KEY (id),
    CONSTRAINT uq_categories__name_key UNIQUE (name_key),
    CONSTRAINT fk_categories__categories FOREIGN KEY (parent_id) REFERENCES categories(id)
);

CREATE INDEX idx_categories__parent_id ON categories(parent_id);

CREATE TABLE IF NOT EXISTS tags (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(120) NOT NULL,
    slug VARCHAR(120) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_tags PRIMARY KEY (id),
    CONSTRAINT uq_tags__slug UNIQUE (slug)
);

ALTER TABLE decks
    ADD COLUMN category_id BIGINT NULL,
    ADD COLUMN cover_image_url VARCHAR(500) NULL,
    ADD COLUMN total_cards INT NOT NULL DEFAULT 0,
    ADD COLUMN learn_count INT NOT NULL DEFAULT 0,
    ADD COLUMN avg_rating DECIMAL(4, 2) NULL,
    ADD COLUMN is_approved BIT(1) NOT NULL DEFAULT b'0',
    ADD COLUMN cloned_from BIGINT NULL,
    ADD COLUMN created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ADD COLUMN updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ADD CONSTRAINT fk_decks__categories FOREIGN KEY (category_id) REFERENCES categories(id),
    ADD CONSTRAINT fk_decks__decks FOREIGN KEY (cloned_from) REFERENCES decks(id);

CREATE INDEX idx_decks__category_id ON decks(category_id);

ALTER TABLE flashcards
    ADD COLUMN category_id BIGINT NULL,
    ADD COLUMN front_image_url VARCHAR(500) NULL,
    ADD COLUMN front_audio_url VARCHAR(500) NULL,
    ADD COLUMN phonetic VARCHAR(120) NULL,
    ADD COLUMN back_detail VARCHAR(1000) NULL,
    ADD COLUMN example VARCHAR(1000) NULL,
    ADD COLUMN synonyms VARCHAR(500) NULL,
    ADD COLUMN note VARCHAR(1000) NULL,
    ADD COLUMN sort_order INT NOT NULL DEFAULT 0,
    ADD COLUMN created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ADD COLUMN updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    ADD CONSTRAINT fk_flashcards__categories FOREIGN KEY (category_id) REFERENCES categories(id);

CREATE INDEX idx_flashcards__category_id ON flashcards(category_id);

CREATE TABLE IF NOT EXISTS deck_tags (
    deck_id BIGINT NOT NULL,
    tag_id BIGINT NOT NULL,
    CONSTRAINT pk_deck_tags PRIMARY KEY (deck_id, tag_id),
    CONSTRAINT fk_deck_tags__decks FOREIGN KEY (deck_id) REFERENCES decks(id) ON DELETE CASCADE,
    CONSTRAINT fk_deck_tags__tags FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
);

CREATE INDEX idx_deck_tags__tag_id ON deck_tags(tag_id);

CREATE TABLE IF NOT EXISTS flashcard_tags (
    flashcard_id BIGINT NOT NULL,
    tag_id BIGINT NOT NULL,
    CONSTRAINT pk_flashcard_tags PRIMARY KEY (flashcard_id, tag_id),
    CONSTRAINT fk_flashcard_tags__flashcards FOREIGN KEY (flashcard_id) REFERENCES flashcards(id) ON DELETE CASCADE,
    CONSTRAINT fk_flashcard_tags__tags FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
);

CREATE INDEX idx_flashcard_tags__tag_id ON flashcard_tags(tag_id);

INSERT INTO categories (name_key, icon, sort_order, is_active)
SELECT 'general', 'book', 0, b'1'
WHERE NOT EXISTS (SELECT 1 FROM categories WHERE name_key = 'general');