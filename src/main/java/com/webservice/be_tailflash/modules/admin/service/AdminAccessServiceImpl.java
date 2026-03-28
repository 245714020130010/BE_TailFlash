package com.webservice.be_tailflash.modules.admin.service;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.common.enums.UserStatus;
import com.webservice.be_tailflash.common.exception.BadRequestException;
import com.webservice.be_tailflash.common.exception.ConflictException;
import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.modules.admin.dto.AdminPermissionResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminRoleResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminUserPermissionsResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminUserResponse;
import com.webservice.be_tailflash.modules.admin.dto.AssignPermissionsRequest;
import com.webservice.be_tailflash.modules.admin.dto.ChangeUserRoleRequest;
import com.webservice.be_tailflash.modules.admin.dto.CreateRoleRequest;
import com.webservice.be_tailflash.modules.admin.dto.UpdateRoleRequest;
import com.webservice.be_tailflash.modules.auth.PermissionRepository;
import com.webservice.be_tailflash.modules.auth.RolePermissionRepository;
import com.webservice.be_tailflash.modules.auth.UserPermissionRepository;
import com.webservice.be_tailflash.modules.auth.UserRoleRepository;
import com.webservice.be_tailflash.modules.auth.entity.Permission;
import com.webservice.be_tailflash.modules.auth.entity.RolePermission;
import com.webservice.be_tailflash.modules.auth.entity.UserPermission;
import com.webservice.be_tailflash.modules.auth.entity.UserRole;
import com.webservice.be_tailflash.modules.user.UserRepository;
import com.webservice.be_tailflash.modules.user.entity.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminAccessServiceImpl implements AdminAccessService {

    private static final Set<String> SYSTEM_ROLES = Set.of("LEARNER", "TEACHER", "ADMIN");

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final PermissionRepository permissionRepository;
    private final RolePermissionRepository rolePermissionRepository;
    private final UserPermissionRepository userPermissionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<AdminUserResponse> getUsers(String requesterRole, String role, String status, String keyword) {
        requireAdminRole(requesterRole);

        UserStatus parsedStatus = parseUserStatus(status);
        String normalizedRole = normalizeBlank(role);

        List<User> users;
        if (normalizedRole != null && parsedStatus != null) {
            users = userRepository.findAllByRole_NameAndStatusOrderByCreatedAtDesc(normalizedRole.toUpperCase(Locale.ROOT), parsedStatus);
        } else if (normalizedRole != null) {
            users = userRepository.findAllByRole_NameOrderByCreatedAtDesc(normalizedRole.toUpperCase(Locale.ROOT));
        } else if (parsedStatus != null) {
            users = userRepository.findAllByStatusOrderByCreatedAtDesc(parsedStatus);
        } else {
            users = userRepository.findAllByOrderByCreatedAtDesc();
        }

        String normalizedKeyword = normalizeBlank(keyword);
        if (normalizedKeyword == null) {
            return users.stream().map(this::toAdminUserResponse).toList();
        }

        String lowerKeyword = normalizedKeyword.toLowerCase(Locale.ROOT);
        return users.stream()
            .filter(user ->
                user.getEmail().toLowerCase(Locale.ROOT).contains(lowerKeyword)
                    || user.getDisplayName().toLowerCase(Locale.ROOT).contains(lowerKeyword)
            )
            .map(this::toAdminUserResponse)
            .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public AdminUserResponse getUserById(String requesterRole, Long userId) {
        requireAdminRole(requesterRole);
        User user = findUser(userId);
        return toAdminUserResponse(user);
    }

    @Override
    @Transactional
    public MessageResponse banUser(String requesterRole, Long adminUserId, Long targetUserId) {
        requireAdminRole(requesterRole);
        if (adminUserId.equals(targetUserId)) {
            throw new ConflictException("ADMIN_SELF_BAN_NOT_ALLOWED", "Admin cannot ban itself");
        }

        User user = findUser(targetUserId);
        if (UserStatus.SUSPENDED.equals(user.getStatus())) {
            return new MessageResponse("User already banned");
        }

        user.setStatus(UserStatus.SUSPENDED);
        user.setUpdatedAt(Instant.now());
        userRepository.save(user);
        return new MessageResponse("User banned");
    }

    @Override
    @Transactional
    public MessageResponse unbanUser(String requesterRole, Long adminUserId, Long targetUserId) {
        requireAdminRole(requesterRole);

        User user = findUser(targetUserId);
        if (UserStatus.ACTIVE.equals(user.getStatus())) {
            return new MessageResponse("User already active");
        }

        user.setStatus(UserStatus.ACTIVE);
        user.setUpdatedAt(Instant.now());
        userRepository.save(user);
        return new MessageResponse("User unbanned");
    }

    @Override
    @Transactional
    public MessageResponse changeUserRole(String requesterRole, Long adminUserId, Long targetUserId, ChangeUserRoleRequest request) {
        requireAdminRole(requesterRole);

        if (adminUserId.equals(targetUserId)) {
            throw new ConflictException("ADMIN_SELF_ROLE_CHANGE_NOT_ALLOWED", "Admin cannot change its own role");
        }

        User user = findUser(targetUserId);
        String normalizedRole = request.roleName().trim().toUpperCase(Locale.ROOT);
        UserRole targetRole = userRoleRepository.findByNameIgnoreCase(normalizedRole)
            .orElseThrow(() -> new ResourceNotFoundException("ADMIN_ROLE_NOT_FOUND", "Role not found"));

        user.setRole(targetRole);
        user.setUpdatedAt(Instant.now());
        userRepository.save(user);
        return new MessageResponse("User role changed");
    }

    @Override
    @Transactional(readOnly = true)
    public List<AdminRoleResponse> getRoles(String requesterRole) {
        requireAdminRole(requesterRole);
        return userRoleRepository.findAll().stream().map(this::toRoleResponse).toList();
    }

    @Override
    @Transactional
    public MessageResponse createRole(String requesterRole, CreateRoleRequest request) {
        requireAdminRole(requesterRole);

        String normalizedName = request.name().trim().toUpperCase(Locale.ROOT);
        if (userRoleRepository.existsByNameIgnoreCase(normalizedName)) {
            throw new ConflictException("ADMIN_ROLE_ALREADY_EXISTS", "Role already exists");
        }

        UserRole role = new UserRole();
        role.setName(normalizedName);
        role.setDescription(normalizeBlank(request.description()));
        role.setCreatedAt(Instant.now());
        userRoleRepository.save(role);

        return new MessageResponse("Role created");
    }

    @Override
    @Transactional
    public MessageResponse updateRole(String requesterRole, Long roleId, UpdateRoleRequest request) {
        requireAdminRole(requesterRole);

        UserRole role = userRoleRepository.findById(roleId)
            .orElseThrow(() -> new ResourceNotFoundException("ADMIN_ROLE_NOT_FOUND", "Role not found"));

        String normalizedName = normalizeBlank(request.name());
        if (normalizedName == null) {
            normalizedName = role.getName();
        } else {
            normalizedName = normalizedName.toUpperCase(Locale.ROOT);
        }

        if (SYSTEM_ROLES.contains(role.getName()) && !role.getName().equals(normalizedName)) {
            throw new ForbiddenException("ADMIN_SYSTEM_ROLE_RENAME_FORBIDDEN", "System role name cannot be changed");
        }

        if (!role.getName().equalsIgnoreCase(normalizedName) && userRoleRepository.existsByNameIgnoreCase(normalizedName)) {
            throw new ConflictException("ADMIN_ROLE_ALREADY_EXISTS", "Role already exists");
        }

        role.setName(normalizedName);
        role.setDescription(normalizeBlank(request.description()));
        userRoleRepository.save(role);
        return new MessageResponse("Role updated");
    }

    @Override
    @Transactional(readOnly = true)
    public List<AdminPermissionResponse> getPermissions(String requesterRole) {
        requireAdminRole(requesterRole);
        return permissionRepository.findAllByOrderByGroupAscNameAsc().stream()
            .map(permission -> new AdminPermissionResponse(
                permission.getId(),
                permission.getName(),
                permission.getGroup(),
                permission.getDescription()
            ))
            .toList();
    }

    @Override
    @Transactional
    public MessageResponse assignRolePermissions(String requesterRole, Long roleId, AssignPermissionsRequest request) {
        requireAdminRole(requesterRole);

        UserRole role = userRoleRepository.findById(roleId)
            .orElseThrow(() -> new ResourceNotFoundException("ADMIN_ROLE_NOT_FOUND", "Role not found"));

        List<Long> permissionIds = sanitizePermissionIds(request.permissionIds());
        validatePermissionIds(permissionIds);

        rolePermissionRepository.deleteByRoleId(role.getId());
        List<RolePermission> rolePermissions = permissionIds.stream().map(permissionId -> {
            RolePermission rolePermission = new RolePermission();
            rolePermission.setRoleId(role.getId());
            rolePermission.setPermissionId(permissionId);
            return rolePermission;
        }).toList();
        rolePermissionRepository.saveAll(rolePermissions);

        return new MessageResponse("Role permissions updated");
    }

    @Override
    @Transactional(readOnly = true)
    public AdminUserPermissionsResponse getUserPermissions(String requesterRole, Long userId) {
        requireAdminRole(requesterRole);

        User user = findUser(userId);
        List<Long> rolePermissionIds = rolePermissionRepository.findAllByRoleId(user.getRole().getId())
            .stream()
            .map(RolePermission::getPermissionId)
            .distinct()
            .toList();

        List<Long> userPermissionIds = userPermissionRepository.findAllByUserId(userId)
            .stream()
            .map(UserPermission::getPermissionId)
            .distinct()
            .toList();

        Set<Long> effectiveSet = new HashSet<>(rolePermissionIds);
        effectiveSet.addAll(userPermissionIds);

        return new AdminUserPermissionsResponse(
            userId,
            rolePermissionIds,
            userPermissionIds,
            effectiveSet.stream().sorted().toList()
        );
    }

    @Override
    @Transactional
    public MessageResponse assignUserPermissions(
        String requesterRole,
        Long adminUserId,
        Long userId,
        AssignPermissionsRequest request
    ) {
        requireAdminRole(requesterRole);
        findUser(userId);

        List<Long> permissionIds = sanitizePermissionIds(request.permissionIds());
        validatePermissionIds(permissionIds);

        userPermissionRepository.deleteByUserId(userId);
        Instant now = Instant.now();
        List<UserPermission> userPermissions = permissionIds.stream().map(permissionId -> {
            UserPermission userPermission = new UserPermission();
            userPermission.setUserId(userId);
            userPermission.setPermissionId(permissionId);
            userPermission.setGrantedBy(adminUserId);
            userPermission.setGrantedAt(now);
            return userPermission;
        }).toList();
        userPermissionRepository.saveAll(userPermissions);

        return new MessageResponse("User permissions updated");
    }

    private AdminRoleResponse toRoleResponse(UserRole role) {
        List<Long> permissionIds = rolePermissionRepository.findAllByRoleId(role.getId()).stream()
            .map(RolePermission::getPermissionId)
            .sorted()
            .toList();

        return new AdminRoleResponse(
            role.getId(),
            role.getName(),
            role.getDescription(),
            permissionIds
        );
    }

    private AdminUserResponse toAdminUserResponse(User user) {
        return new AdminUserResponse(
            user.getId(),
            user.getEmail(),
            user.getDisplayName(),
            user.getRole().getName(),
            user.getStatus().name(),
            user.isEmailVerified(),
            user.getCreatedAt(),
            user.getUpdatedAt()
        );
    }

    private void requireAdminRole(String requesterRole) {
        if (!"ADMIN".equals(requesterRole)) {
            throw new ForbiddenException("AUTH_FORBIDDEN", "Admin role required");
        }
    }

    private User findUser(Long userId) {
        return userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("USER_NOT_FOUND", "User not found"));
    }

    private List<Long> sanitizePermissionIds(List<Long> permissionIds) {
        if (permissionIds == null) {
            throw new BadRequestException("ADMIN_PERMISSION_IDS_REQUIRED", "Permission IDs are required");
        }
        return permissionIds.stream().distinct().sorted().toList();
    }

    private void validatePermissionIds(List<Long> permissionIds) {
        if (permissionIds.isEmpty()) {
            return;
        }

        List<Permission> foundPermissions = permissionRepository.findAllById(permissionIds);
        if (foundPermissions.size() != permissionIds.size()) {
            throw new ResourceNotFoundException("ADMIN_PERMISSION_NOT_FOUND", "One or more permissions not found");
        }
    }

    private UserStatus parseUserStatus(String status) {
        String normalized = normalizeBlank(status);
        if (normalized == null) {
            return null;
        }

        try {
            return UserStatus.valueOf(normalized.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException exception) {
            throw new BadRequestException("ADMIN_USER_STATUS_INVALID", "User status is invalid");
        }
    }

    private String normalizeBlank(String input) {
        if (input == null) {
            return null;
        }

        String trimmed = input.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }
}
