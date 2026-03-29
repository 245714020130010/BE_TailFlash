package com.webservice.be_tailflash.modules.admin.dto;

import jakarta.validation.constraints.NotNull;

public record AdminDeckApprovalRequest(
    @NotNull Boolean approved
) {
}
