package com.webservice.be_tailflash.modules.admin.dto;

import java.time.Instant;

public record AdminTeacherRequestResponse(
    Long teacherProfileId,
    Long userId,
    String email,
    String displayName,
    String status,
    Instant submittedAt,
    Instant reviewedAt,
    String rejectReason
) {
}
