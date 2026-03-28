package com.webservice.be_tailflash.modules.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.common.enums.TeacherProfileStatus;
import com.webservice.be_tailflash.modules.auth.entity.TeacherProfile;

import java.util.List;
import java.util.Optional;

public interface TeacherProfileRepository extends JpaRepository<TeacherProfile, Long> {

	Optional<TeacherProfile> findByUserId(Long userId);

	List<TeacherProfile> findAllByOrderByCreatedAtDesc();

	List<TeacherProfile> findAllByStatusOrderByCreatedAtDesc(TeacherProfileStatus status);
}
