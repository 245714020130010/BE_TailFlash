package com.webservice.be_tailflash.modules.admin.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.webservice.be_tailflash.common.enums.TeacherProfileStatus;
import com.webservice.be_tailflash.common.exception.ConflictException;
import com.webservice.be_tailflash.modules.admin.dto.AdminTeacherRequestResponse;
import com.webservice.be_tailflash.modules.admin.dto.RejectTeacherRequest;
import com.webservice.be_tailflash.modules.auth.TeacherProfileRepository;
import com.webservice.be_tailflash.modules.auth.UserRoleRepository;
import com.webservice.be_tailflash.modules.auth.entity.TeacherProfile;
import com.webservice.be_tailflash.modules.auth.entity.UserRole;
import com.webservice.be_tailflash.modules.user.UserRepository;
import com.webservice.be_tailflash.modules.user.entity.User;

@ExtendWith(MockitoExtension.class)
class AdminTeacherServiceImplTest {

    @Mock
    private TeacherProfileRepository teacherProfileRepository;

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserRoleRepository userRoleRepository;

    @InjectMocks
    private AdminTeacherServiceImpl adminTeacherService;

    @Test
    void getTeacherRequestsShouldReturnPendingRequests() {
        TeacherProfile profile = new TeacherProfile();
        profile.setId(11L);
        profile.setUserId(7L);
        profile.setStatus(TeacherProfileStatus.PENDING);
        profile.setCreatedAt(Instant.parse("2026-03-28T11:00:00Z"));

        User user = new User();
        user.setId(7L);
        user.setEmail("teacher@tailflash.app");
        user.setDisplayName("Teacher One");

        given(teacherProfileRepository.findAllByStatusOrderByCreatedAtDesc(TeacherProfileStatus.PENDING))
            .willReturn(List.of(profile));
        given(userRepository.findById(7L)).willReturn(Optional.of(user));

        List<AdminTeacherRequestResponse> responses = adminTeacherService.getTeacherRequests("ADMIN", "PENDING");

        assertThat(responses).hasSize(1);
        assertThat(responses.get(0).teacherProfileId()).isEqualTo(11L);
        assertThat(responses.get(0).email()).isEqualTo("teacher@tailflash.app");
    }

    @Test
    void approveTeacherRequestShouldPromoteTeacherRole() {
        TeacherProfile profile = new TeacherProfile();
        profile.setId(11L);
        profile.setUserId(7L);
        profile.setStatus(TeacherProfileStatus.PENDING);

        User user = new User();
        user.setId(7L);

        UserRole teacherRole = new UserRole();
        teacherRole.setId(2L);
        teacherRole.setName("TEACHER");

        given(teacherProfileRepository.findById(11L)).willReturn(Optional.of(profile));
        given(userRepository.findById(7L)).willReturn(Optional.of(user));
        given(userRoleRepository.findByName("TEACHER")).willReturn(Optional.of(teacherRole));

        adminTeacherService.approveTeacherRequest("ADMIN", 1L, 11L);

        assertThat(profile.getStatus()).isEqualTo(TeacherProfileStatus.APPROVED);
        assertThat(profile.getReviewedBy()).isEqualTo(1L);
        assertThat(user.getRole()).isEqualTo(teacherRole);
        verify(teacherProfileRepository).save(profile);
        verify(userRepository).save(user);
    }

    @Test
    void rejectTeacherRequestShouldDemoteToLearnerAndSaveReason() {
        TeacherProfile profile = new TeacherProfile();
        profile.setId(11L);
        profile.setUserId(7L);
        profile.setStatus(TeacherProfileStatus.PENDING);

        User user = new User();
        user.setId(7L);

        UserRole learnerRole = new UserRole();
        learnerRole.setId(1L);
        learnerRole.setName("LEARNER");

        given(teacherProfileRepository.findById(11L)).willReturn(Optional.of(profile));
        given(userRepository.findById(7L)).willReturn(Optional.of(user));
        given(userRoleRepository.findByName("LEARNER")).willReturn(Optional.of(learnerRole));

        adminTeacherService.rejectTeacherRequest("ADMIN", 2L, 11L, new RejectTeacherRequest("Không đủ hồ sơ"));

        assertThat(profile.getStatus()).isEqualTo(TeacherProfileStatus.REJECTED);
        assertThat(profile.getRejectReason()).isEqualTo("Không đủ hồ sơ");
        assertThat(user.getRole()).isEqualTo(learnerRole);
        verify(teacherProfileRepository).save(profile);
        verify(userRepository).save(user);
    }

    @Test
    void approveTeacherRequestShouldFailWhenAlreadyReviewed() {
        TeacherProfile profile = new TeacherProfile();
        profile.setId(11L);
        profile.setUserId(7L);
        profile.setStatus(TeacherProfileStatus.APPROVED);

        given(teacherProfileRepository.findById(11L)).willReturn(Optional.of(profile));

        assertThatThrownBy(() -> adminTeacherService.approveTeacherRequest("ADMIN", 1L, 11L))
            .isInstanceOf(ConflictException.class)
            .hasMessage("Teacher request has already been reviewed");
    }
}
