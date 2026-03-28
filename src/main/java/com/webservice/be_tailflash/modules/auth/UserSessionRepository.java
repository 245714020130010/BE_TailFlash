package com.webservice.be_tailflash.modules.auth;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.auth.entity.UserSession;

public interface UserSessionRepository extends JpaRepository<UserSession, Long> {

    Optional<UserSession> findByRefreshTokenHash(String refreshTokenHash);

    List<UserSession> findAllByUserIdOrderByCreatedAtDesc(Long userId);

    Optional<UserSession> findByIdAndUserId(Long id, Long userId);
}
