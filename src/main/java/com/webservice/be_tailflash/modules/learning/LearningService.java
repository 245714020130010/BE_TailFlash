package com.webservice.be_tailflash.modules.learning;

import com.webservice.be_tailflash.modules.learning.dto.CreateStudyResultRequest;
import com.webservice.be_tailflash.modules.learning.dto.StudyResultResponse;

public interface LearningService {

    StudyResultResponse createStudyResult(Long requesterId, String role, CreateStudyResultRequest request);
}
