package com.webservice.be_tailflash.modules.user;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.common.enums.UserStatus;
import com.webservice.be_tailflash.modules.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByPasswordResetTokenHash(String passwordResetTokenHash);

    boolean existsByEmail(String email);

    List<User> findAllByOrderByCreatedAtDesc();

    List<User> findAllByRole_NameOrderByCreatedAtDesc(String roleName);

    List<User> findAllByStatusOrderByCreatedAtDesc(UserStatus status);

    List<User> findAllByRole_NameAndStatusOrderByCreatedAtDesc(String roleName, UserStatus status);
}
