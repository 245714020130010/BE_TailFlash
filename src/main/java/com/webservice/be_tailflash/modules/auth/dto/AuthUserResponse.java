package com.webservice.be_tailflash.modules.auth.dto;

public record AuthUserResponse(
    Long id,
    String email,
    String displayName,
    String role,
    boolean emailVerified,
    String status,
    RoleInfoResponse roleInfo,
    TeacherProfileSummaryResponse teacherProfile
) {
}
