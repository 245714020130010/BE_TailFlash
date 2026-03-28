package com.webservice.be_tailflash.modules.auth.dto;

import java.time.Instant;

public record TeacherProfileSummaryResponse(
    Long id,
    String status,
    Instant reviewedAt,
    String rejectReason
) {
}
