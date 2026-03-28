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

INSERT INTO users (
    email,
    password_hash,
    display_name,
    email_verified,
    is_verified,
    role,
    role_id,
    ui_language,
    learn_lang,
    timezone,
    xp_points,
    level,
    streak_count,
    status,
    created_at,
    updated_at
)
SELECT
    seed.email,
    '$2a$10$RSQvTRW2srNS9z3CuCtbJ.WCLRt02a3cYbedYF32TxSW87oKKWNdW',
    seed.display_name,
    b'1',
    b'1',
    seed.role_name,
    role_ref.id,
    'vi',
    'en',
    'Asia/Ho_Chi_Minh',
    seed.xp_points,
    seed.level,
    seed.streak_count,
    'ACTIVE',
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
FROM (
    SELECT 'admin@tailflash.local' AS email, 'TailFlash Admin' AS display_name, 'ADMIN' AS role_name, 250 AS xp_points, 5 AS level, 12 AS streak_count
    UNION ALL
    SELECT 'teacher@tailflash.local', 'TailFlash Teacher', 'TEACHER', 120, 3, 6
    UNION ALL
    SELECT 'learner@tailflash.local', 'TailFlash Learner', 'LEARNER', 40, 2, 2
) AS seed
JOIN roles role_ref ON role_ref.name = seed.role_name
LEFT JOIN users existing ON existing.email = seed.email
WHERE existing.id IS NULL;

INSERT INTO teacher_profiles (
    user_id,
    specialization,
    status,
    created_at
)
SELECT
    teacher_user.id,
    'English communication',
    'PENDING',
    CURRENT_TIMESTAMP
FROM users teacher_user
LEFT JOIN teacher_profiles existing_profile ON existing_profile.user_id = teacher_user.id
WHERE teacher_user.email = 'teacher@tailflash.local'
  AND existing_profile.id IS NULL;
