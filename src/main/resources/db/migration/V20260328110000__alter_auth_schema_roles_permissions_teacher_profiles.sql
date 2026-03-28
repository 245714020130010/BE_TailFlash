CREATE TABLE IF NOT EXISTS roles (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(255),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_roles PRIMARY KEY (id),
    CONSTRAINT uq_roles__name UNIQUE (name)
);

CREATE TABLE IF NOT EXISTS permissions (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    group_name VARCHAR(100) NOT NULL,
    description VARCHAR(255),
    CONSTRAINT pk_permissions PRIMARY KEY (id),
    CONSTRAINT uq_permissions__name UNIQUE (name)
);

CREATE TABLE IF NOT EXISTS role_permissions (
    role_id BIGINT NOT NULL,
    permission_id BIGINT NOT NULL,
    CONSTRAINT pk_role_permissions PRIMARY KEY (role_id, permission_id),
    CONSTRAINT fk_role_permissions__roles FOREIGN KEY (role_id) REFERENCES roles(id),
    CONSTRAINT fk_role_permissions__permissions FOREIGN KEY (permission_id) REFERENCES permissions(id)
);

INSERT INTO roles (name, description)
VALUES
    ('LEARNER', 'Default learner role'),
    ('TEACHER', 'Teacher role'),
    ('ADMIN', 'Administrator role')
ON DUPLICATE KEY UPDATE description = VALUES(description);

INSERT INTO permissions (name, group_name, description)
VALUES
    ('AUTH_SELF_MANAGE', 'AUTH', 'Manage own authentication and account security'),
    ('DECK_SELF_MANAGE', 'DECK', 'Manage own decks and cards'),
    ('TEACHER_APPLICATION_SUBMIT', 'TEACHER', 'Submit teacher application'),
    ('TEACHER_APPLICATION_REVIEW', 'ADMIN', 'Review teacher applications'),
    ('ADMIN_USER_MANAGE', 'ADMIN', 'Manage users and roles')
ON DUPLICATE KEY UPDATE description = VALUES(description);

INSERT INTO role_permissions (role_id, permission_id)
SELECT r.id, p.id
FROM roles r
JOIN permissions p ON (
    (r.name = 'LEARNER' AND p.name IN ('AUTH_SELF_MANAGE', 'DECK_SELF_MANAGE'))
    OR (r.name = 'TEACHER' AND p.name IN ('AUTH_SELF_MANAGE', 'DECK_SELF_MANAGE', 'TEACHER_APPLICATION_SUBMIT'))
    OR (r.name = 'ADMIN' AND p.name IN ('AUTH_SELF_MANAGE', 'DECK_SELF_MANAGE', 'TEACHER_APPLICATION_REVIEW', 'ADMIN_USER_MANAGE'))
)
ON DUPLICATE KEY UPDATE role_id = role_permissions.role_id;

ALTER TABLE users
    ADD COLUMN avatar_url VARCHAR(500) NULL,
    ADD COLUMN bio VARCHAR(1000) NULL,
    ADD COLUMN phone VARCHAR(30) NULL,
    ADD COLUMN ui_language VARCHAR(10) NOT NULL DEFAULT 'vi',
    ADD COLUMN learn_lang VARCHAR(10) NOT NULL DEFAULT 'en',
    ADD COLUMN timezone VARCHAR(60) NOT NULL DEFAULT 'Asia/Ho_Chi_Minh',
    ADD COLUMN xp_points BIGINT NOT NULL DEFAULT 0,
    ADD COLUMN level INT NOT NULL DEFAULT 1,
    ADD COLUMN streak_count INT NOT NULL DEFAULT 0,
    ADD COLUMN status VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
    ADD COLUMN is_verified BIT(1) NOT NULL DEFAULT b'0',
    ADD COLUMN role_id BIGINT NULL,
    ADD COLUMN created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ADD COLUMN updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;

UPDATE users
SET is_verified = email_verified
WHERE is_verified = b'0' AND email_verified = b'1';

UPDATE users u
JOIN roles r ON r.name = u.role
SET u.role_id = r.id
WHERE u.role_id IS NULL;

UPDATE users u
JOIN roles r ON r.name = 'LEARNER'
SET u.role_id = r.id
WHERE u.role_id IS NULL;

ALTER TABLE users
    MODIFY COLUMN role_id BIGINT NOT NULL,
    ADD CONSTRAINT fk_users__roles FOREIGN KEY (role_id) REFERENCES roles(id);

CREATE INDEX idx_users__role_id ON users(role_id);
CREATE INDEX idx_users__status ON users(status);

ALTER TABLE user_sessions
    ADD COLUMN token VARCHAR(255) NULL,
    ADD COLUMN device_info VARCHAR(255) NULL,
    ADD COLUMN ip_address VARCHAR(64) NULL;

CREATE INDEX idx_user_sessions__expires_at ON user_sessions(expires_at);

CREATE TABLE IF NOT EXISTS teacher_profiles (
    id BIGINT NOT NULL AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    certificate_url VARCHAR(500) NULL,
    qualifications VARCHAR(1000) NULL,
    experience_years INT NULL,
    specialization VARCHAR(255) NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'PENDING',
    reviewed_by BIGINT NULL,
    reviewed_at TIMESTAMP NULL,
    reject_reason VARCHAR(1000) NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_teacher_profiles PRIMARY KEY (id),
    CONSTRAINT uq_teacher_profiles__user_id UNIQUE (user_id),
    CONSTRAINT fk_teacher_profiles__users FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_teacher_profiles__reviewer_users FOREIGN KEY (reviewed_by) REFERENCES users(id)
);

CREATE INDEX idx_teacher_profiles__status ON teacher_profiles(status);
