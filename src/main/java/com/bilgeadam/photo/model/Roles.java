package com.bilgeadam.photo.model;

import com.bilgeadam.photo.common.entity.BaseEntity;
import com.bilgeadam.photo.consts.EntityConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.UUID;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
@SQLDelete(sql = " UPDATE fmd_stock_photo.roles set state=0 where id =? and version=? ")
@Where(clause = EntityConstants.WHERE_CLAUSE)
public class Roles extends BaseEntity {

    /**
     *relation between user entity and role entity
     */
    @Column (name = "user_id")
    private UUID userId;

    @Column(name = "name", nullable = false)
    private String name;

}
