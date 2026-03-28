package com.webservice.be_tailflash.modules.admin.service;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.common.enums.TeacherProfileStatus;
import com.webservice.be_tailflash.common.exception.BadRequestException;
import com.webservice.be_tailflash.common.exception.ConflictException;
import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.modules.admin.dto.AdminTeacherRequestResponse;
import com.webservice.be_tailflash.modules.admin.dto.RejectTeacherRequest;
import com.webservice.be_tailflash.modules.auth.TeacherProfileRepository;
import com.webservice.be_tailflash.modules.auth.UserRoleRepository;
import com.webservice.be_tailflash.modules.auth.entity.TeacherProfile;
import com.webservice.be_tailflash.modules.auth.entity.UserRole;
import com.webservice.be_tailflash.modules.user.UserRepository;
import com.webservice.be_tailflash.modules.user.entity.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminTeacherServiceImpl implements AdminTeacherService {

    private final TeacherProfileRepository teacherProfileRepository;
    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    @Override
    @Transactional(readOnly = true)
    public List<AdminTeacherRequestResponse> getTeacherRequests(String requesterRole, String status) {
        requireAdminRole(requesterRole);

        List<TeacherProfile> teacherProfiles;
        if (status == null || status.isBlank()) {
            teacherProfiles = teacherProfileRepository.findAllByOrderByCreatedAtDesc();
        } else {
            TeacherProfileStatus targetStatus = parseTeacherStatus(status);
            teacherProfiles = teacherProfileRepository.findAllByStatusOrderByCreatedAtDesc(targetStatus);
        }

        return teacherProfiles.stream().map(this::toResponse).toList();
    }

    @Override
    @Transactional
    public MessageResponse approveTeacherRequest(String requesterRole, Long adminUserId, Long teacherProfileId) {
        requireAdminRole(requesterRole);

        TeacherProfile teacherProfile = teacherProfileRepository.findById(teacherProfileId)
            .orElseThrow(() -> new ResourceNotFoundException("TEACHER_REQUEST_NOT_FOUND", "Teacher request not found"));

        ensurePendingStatus(teacherProfile);

        User user = userRepository.findById(teacherProfile.getUserId())
            .orElseThrow(() -> new ResourceNotFoundException("USER_NOT_FOUND", "User not found"));

        UserRole teacherRole = userRoleRepository.findByName("TEACHER")
            .orElseThrow(() -> new BadRequestException("AUTH_ROLE_NOT_SUPPORTED", "Role is not supported"));

        Instant now = Instant.now();
        teacherProfile.setStatus(TeacherProfileStatus.APPROVED);
        teacherProfile.setReviewedBy(adminUserId);
        teacherProfile.setReviewedAt(now);
        teacherProfile.setRejectReason(null);

        user.setRole(teacherRole);
        user.setUpdatedAt(now);

        teacherProfileRepository.save(teacherProfile);
        userRepository.save(user);
        return new MessageResponse("Teacher request approved");
    }

    @Override
    @Transactional
    public MessageResponse rejectTeacherRequest(
        String requesterRole,
        Long adminUserId,
        Long teacherProfileId,
        RejectTeacherRequest request
    ) {
        requireAdminRole(requesterRole);

        TeacherProfile teacherProfile = teacherProfileRepository.findById(teacherProfileId)
            .orElseThrow(() -> new ResourceNotFoundException("TEACHER_REQUEST_NOT_FOUND", "Teacher request not found"));

        ensurePendingStatus(teacherProfile);

        User user = userRepository.findById(teacherProfile.getUserId())
            .orElseThrow(() -> new ResourceNotFoundException("USER_NOT_FOUND", "User not found"));

        UserRole learnerRole = userRoleRepository.findByName("LEARNER")
            .orElseThrow(() -> new BadRequestException("AUTH_ROLE_NOT_SUPPORTED", "Role is not supported"));

        Instant now = Instant.now();
        teacherProfile.setStatus(TeacherProfileStatus.REJECTED);
        teacherProfile.setReviewedBy(adminUserId);
        teacherProfile.setReviewedAt(now);
        teacherProfile.setRejectReason(request.rejectReason().trim());

        user.setRole(learnerRole);
        user.setUpdatedAt(now);

        teacherProfileRepository.save(teacherProfile);
        userRepository.save(user);
        return new MessageResponse("Teacher request rejected");
    }

    private AdminTeacherRequestResponse toResponse(TeacherProfile teacherProfile) {
        User user = userRepository.findById(teacherProfile.getUserId())
            .orElseThrow(() -> new ResourceNotFoundException("USER_NOT_FOUND", "User not found"));

        return new AdminTeacherRequestResponse(
            teacherProfile.getId(),
            teacherProfile.getUserId(),
            user.getEmail(),
            user.getDisplayName(),
            teacherProfile.getStatus().name(),
            teacherProfile.getCreatedAt(),
            teacherProfile.getReviewedAt(),
            teacherProfile.getRejectReason()
        );
    }

    private void requireAdminRole(String requesterRole) {
        if (!"ADMIN".equals(requesterRole)) {
            throw new ForbiddenException("AUTH_FORBIDDEN", "Admin role required");
        }
    }

    private void ensurePendingStatus(TeacherProfile teacherProfile) {
        if (!TeacherProfileStatus.PENDING.equals(teacherProfile.getStatus())) {
            throw new ConflictException(
                "TEACHER_REQUEST_ALREADY_REVIEWED",
                "Teacher request has already been reviewed"
            );
        }
    }

    private TeacherProfileStatus parseTeacherStatus(String status) {
        try {
            return TeacherProfileStatus.valueOf(status.trim().toUpperCase());
        } catch (IllegalArgumentException exception) {
            throw new BadRequestException("TEACHER_REQUEST_STATUS_INVALID", "Teacher request status is invalid");
        }
    }
}
