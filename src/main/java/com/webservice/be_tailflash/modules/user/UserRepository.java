package com.webservice.be_tailflash.modules.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByPasswordResetTokenHash(String passwordResetTokenHash);

    boolean existsByEmail(String email);
}
