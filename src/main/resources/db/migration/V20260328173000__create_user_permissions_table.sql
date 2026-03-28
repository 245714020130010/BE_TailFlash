CREATE TABLE IF NOT EXISTS user_permissions (
    user_id BIGINT NOT NULL,
    permission_id BIGINT NOT NULL,
    granted_by BIGINT NOT NULL,
    granted_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_user_permissions PRIMARY KEY (user_id, permission_id),
    CONSTRAINT fk_user_permissions__users FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_user_permissions__permissions FOREIGN KEY (permission_id) REFERENCES permissions(id),
    CONSTRAINT fk_user_permissions__granted_by_users FOREIGN KEY (granted_by) REFERENCES users(id)
);

CREATE INDEX idx_user_permissions__permission_id ON user_permissions(permission_id);
