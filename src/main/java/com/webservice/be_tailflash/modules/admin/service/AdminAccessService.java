package com.webservice.be_tailflash.modules.admin.service;

import java.util.List;

import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminPermissionResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminRoleResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminUserPermissionsResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminUserResponse;
import com.webservice.be_tailflash.modules.admin.dto.AssignPermissionsRequest;
import com.webservice.be_tailflash.modules.admin.dto.ChangeUserRoleRequest;
import com.webservice.be_tailflash.modules.admin.dto.CreateRoleRequest;
import com.webservice.be_tailflash.modules.admin.dto.UpdateRoleRequest;

public interface AdminAccessService {

    List<AdminUserResponse> getUsers(String requesterRole, String role, String status, String keyword);

    AdminUserResponse getUserById(String requesterRole, Long userId);

    MessageResponse banUser(String requesterRole, Long adminUserId, Long targetUserId);

    MessageResponse unbanUser(String requesterRole, Long adminUserId, Long targetUserId);

    MessageResponse changeUserRole(String requesterRole, Long adminUserId, Long targetUserId, ChangeUserRoleRequest request);

    List<AdminRoleResponse> getRoles(String requesterRole);

    MessageResponse createRole(String requesterRole, CreateRoleRequest request);

    MessageResponse updateRole(String requesterRole, Long roleId, UpdateRoleRequest request);

    List<AdminPermissionResponse> getPermissions(String requesterRole);

    MessageResponse assignRolePermissions(String requesterRole, Long roleId, AssignPermissionsRequest request);

    AdminUserPermissionsResponse getUserPermissions(String requesterRole, Long userId);

    MessageResponse assignUserPermissions(
        String requesterRole,
        Long adminUserId,
        Long userId,
        AssignPermissionsRequest request
    );
}
