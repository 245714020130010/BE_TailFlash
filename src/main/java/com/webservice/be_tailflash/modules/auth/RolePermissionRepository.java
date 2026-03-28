package com.webservice.be_tailflash.modules.auth;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.auth.entity.RolePermission;
import com.webservice.be_tailflash.modules.auth.entity.RolePermissionId;

public interface RolePermissionRepository extends JpaRepository<RolePermission, RolePermissionId> {

    List<RolePermission> findAllByRoleId(Long roleId);

    void deleteByRoleId(Long roleId);
}
