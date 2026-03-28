package com.webservice.be_tailflash.modules.auth;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.auth.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

    List<Permission> findAllByOrderByGroupAscNameAsc();
}
