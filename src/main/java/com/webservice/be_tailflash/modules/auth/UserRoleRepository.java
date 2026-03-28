package com.webservice.be_tailflash.modules.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.auth.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    Optional<UserRole> findByName(String name);

    Optional<UserRole> findByNameIgnoreCase(String name);

    boolean existsByNameIgnoreCase(String name);
}
