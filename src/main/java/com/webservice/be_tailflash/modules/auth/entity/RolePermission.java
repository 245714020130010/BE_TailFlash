package com.webservice.be_tailflash.modules.auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role_permissions")
@IdClass(RolePermissionId.class)
@Getter
@Setter
@NoArgsConstructor
public class RolePermission {

    @Id
    @Column(nullable = false)
    private Long roleId;

    @Id
    @Column(nullable = false)
    private Long permissionId;
}
