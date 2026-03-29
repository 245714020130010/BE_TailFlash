package com.webservice.be_tailflash.modules.learning;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.be_tailflash.modules.learning.entity.StudyResult;

public interface StudyResultRepository extends JpaRepository<StudyResult, Long> {
}
