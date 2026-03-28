package com.webservice.be_tailflash.modules.admin.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.webservice.be_tailflash.common.enums.UserStatus;
import com.webservice.be_tailflash.common.exception.ConflictException;
import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.modules.admin.dto.AdminUserResponse;
import com.webservice.be_tailflash.modules.admin.dto.ChangeUserRoleRequest;
import com.webservice.be_tailflash.modules.admin.dto.UpdateRoleRequest;
import com.webservice.be_tailflash.modules.auth.PermissionRepository;
import com.webservice.be_tailflash.modules.auth.RolePermissionRepository;
import com.webservice.be_tailflash.modules.auth.UserPermissionRepository;
import com.webservice.be_tailflash.modules.auth.UserRoleRepository;
import com.webservice.be_tailflash.modules.auth.entity.UserRole;
import com.webservice.be_tailflash.modules.user.UserRepository;
import com.webservice.be_tailflash.modules.user.entity.User;

@ExtendWith(MockitoExtension.class)
class AdminAccessServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserRoleRepository userRoleRepository;

    @Mock
    private PermissionRepository permissionRepository;

    @Mock
    private RolePermissionRepository rolePermissionRepository;

    @Mock
    private UserPermissionRepository userPermissionRepository;

    @InjectMocks
    private AdminAccessServiceImpl adminAccessService;

    @Test
    void getUsersShouldFilterByRole() {
        UserRole learnerRole = new UserRole();
        learnerRole.setId(1L);
        learnerRole.setName("LEARNER");

        User learner = new User();
        learner.setId(10L);
        learner.setEmail("learner@tailflash.app");
        learner.setDisplayName("Learner One");
        learner.setRole(learnerRole);
        learner.setStatus(UserStatus.ACTIVE);
        learner.setCreatedAt(Instant.parse("2026-03-28T10:00:00Z"));
        learner.setUpdatedAt(Instant.parse("2026-03-28T10:00:00Z"));

        given(userRepository.findAllByRole_NameOrderByCreatedAtDesc("LEARNER")).willReturn(List.of(learner));

        List<AdminUserResponse> users = adminAccessService.getUsers("ADMIN", "LEARNER", null, null);

        assertThat(users).hasSize(1);
        assertThat(users.get(0).role()).isEqualTo("LEARNER");
    }

    @Test
    void banUserShouldRejectSelfBan() {
        assertThatThrownBy(() -> adminAccessService.banUser("ADMIN", 7L, 7L))
            .isInstanceOf(ConflictException.class)
            .hasMessage("Admin cannot ban itself");
    }

    @Test
    void changeUserRoleShouldUpdateRole() {
        UserRole teacherRole = new UserRole();
        teacherRole.setId(2L);
        teacherRole.setName("TEACHER");

        User user = new User();
        user.setId(15L);
        user.setRole(teacherRole);
        user.setStatus(UserStatus.ACTIVE);

        UserRole adminRole = new UserRole();
        adminRole.setId(3L);
        adminRole.setName("ADMIN");

        given(userRepository.findById(15L)).willReturn(Optional.of(user));
        given(userRoleRepository.findByNameIgnoreCase("ADMIN")).willReturn(Optional.of(adminRole));

        adminAccessService.changeUserRole("ADMIN", 1L, 15L, new ChangeUserRoleRequest("ADMIN"));

        assertThat(user.getRole().getName()).isEqualTo("ADMIN");
        verify(userRepository).save(user);
    }

    @Test
    void changeUserRoleShouldRejectSelfRoleChange() {
        assertThatThrownBy(() ->
            adminAccessService.changeUserRole("ADMIN", 7L, 7L, new ChangeUserRoleRequest("ADMIN"))
        )
            .isInstanceOf(ConflictException.class)
            .hasMessage("Admin cannot change its own role");

        verify(userRepository, never()).findById(7L);
        verify(userRepository, never()).save(org.mockito.ArgumentMatchers.any(User.class));
    }

    @Test
    void updateRoleShouldAllowSystemRoleDescriptionOnly() {
        UserRole learnerRole = new UserRole();
        learnerRole.setId(1L);
        learnerRole.setName("LEARNER");
        learnerRole.setDescription("Original description");

        given(userRoleRepository.findById(1L)).willReturn(Optional.of(learnerRole));

        adminAccessService.updateRole("ADMIN", 1L, new UpdateRoleRequest(null, "Updated description"));

        assertThat(learnerRole.getName()).isEqualTo("LEARNER");
        assertThat(learnerRole.getDescription()).isEqualTo("Updated description");
        verify(userRoleRepository).save(learnerRole);
    }

    @Test
    void updateRoleShouldRejectSystemRoleRename() {
        UserRole adminRole = new UserRole();
        adminRole.setId(3L);
        adminRole.setName("ADMIN");

        given(userRoleRepository.findById(3L)).willReturn(Optional.of(adminRole));

        assertThatThrownBy(() ->
            adminAccessService.updateRole("ADMIN", 3L, new UpdateRoleRequest("SUPER_ADMIN", "desc"))
        )
            .isInstanceOf(ForbiddenException.class)
            .hasMessage("System role name cannot be changed");
    }
}
