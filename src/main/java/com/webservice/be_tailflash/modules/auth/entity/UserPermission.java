package com.webservice.be_tailflash.modules.auth.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_permissions")
@IdClass(UserPermissionId.class)
@Getter
@Setter
@NoArgsConstructor
public class UserPermission {

    @Id
    @Column(nullable = false)
    private Long userId;

    @Id
    @Column(nullable = false)
    private Long permissionId;

    @Column(nullable = false)
    private Long grantedBy;

    @Column(nullable = false)
    private Instant grantedAt;
}
