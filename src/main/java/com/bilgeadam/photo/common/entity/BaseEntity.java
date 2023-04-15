package com.bilgeadam.photo.common.entity;

import com.bilgeadam.photo.consts.EntityConstants;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Where(clause = EntityConstants.DELETED +"<>"+ EntityConstants.STATE)

public abstract class BaseEntity {

    /**
     * Primary Key UUID for entities
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private UUID id;

    /**
     * Created date of entities
     */
    @NotBlank
    @CreatedDate
    @Column(name = "create_date", nullable = false, updatable = false)
    private LocalDateTime createDate;

    /**
     * entites update date
     */
    @LastModifiedBy
    @Column(name = "updated_by")
    private String updatedUser;

    /**
     * soft delete process.
     * State of entity
     * deleted = 0, undeleted=1
     */
    @Column(name = "state", nullable = false)
    private short state=1;

    @Version
    @Column (name = "version", nullable = false)
    private long version;
}