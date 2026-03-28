package com.webservice.be_tailflash.modules.auth;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.auth.entity.UserPermission;
import com.webservice.be_tailflash.modules.auth.entity.UserPermissionId;

public interface UserPermissionRepository extends JpaRepository<UserPermission, UserPermissionId> {

    List<UserPermission> findAllByUserId(Long userId);

    void deleteByUserId(Long userId);
}
