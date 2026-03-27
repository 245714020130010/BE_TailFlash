package com.webservice.be_tailflash.security;

import com.webservice.be_tailflash.common.enums.Role;

public record AuthPrincipal(Long userId, String email, Role role) {
}
