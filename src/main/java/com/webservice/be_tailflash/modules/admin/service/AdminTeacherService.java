package com.webservice.be_tailflash.modules.admin.service;

import java.util.List;

import com.webservice.be_tailflash.common.dto.MessageResponse;
import com.webservice.be_tailflash.modules.admin.dto.AdminTeacherRequestResponse;
import com.webservice.be_tailflash.modules.admin.dto.RejectTeacherRequest;

public interface AdminTeacherService {

    List<AdminTeacherRequestResponse> getTeacherRequests(String requesterRole, String status);

    MessageResponse approveTeacherRequest(String requesterRole, Long adminUserId, Long teacherProfileId);

    MessageResponse rejectTeacherRequest(
        String requesterRole,
        Long adminUserId,
        Long teacherProfileId,
        RejectTeacherRequest request
    );
}
