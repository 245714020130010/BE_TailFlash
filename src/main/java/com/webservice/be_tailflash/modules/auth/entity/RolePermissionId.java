package com.webservice.be_tailflash.modules.auth.entity;

import java.io.Serial;
import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class RolePermissionId implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long roleId;
    private Long permissionId;
}
