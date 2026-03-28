package com.webservice.be_tailflash.modules.admin.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RejectTeacherRequest(
    @NotBlank @Size(min = 3, max = 1000) String rejectReason
) {
}
