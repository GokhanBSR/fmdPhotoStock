package com.bilgeadam.photo.model.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.SuperBuilder;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//@Getter
//@Setter
//@MappedSuperclass
//@EntityListeners({AuditingEntityListener.class})
//@SuperBuilder(toBuilder = true)
//
//public abstract class BaseEntity implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column (name = "id", nullable = false)
//    private UUID id;
//
////    private Long id;
////    @CreatedDate
////    @Column (name = "created_date", nullable = false, updatable = false)
////    private LocalDate createDate;
//
//    @CreatedDate
//    @Column(name = "create_date", nullable = false, updatable = false)
//    private LocalDateTime createDate;
//
//    @Column(name = "update_date", nullable = false)
//    private LocalDateTime updateDate;
//
//    @CreatedBy
//    @Column (name = "created_by", nullable = false, updatable = false)
//    private String created_Photographer;
//
//    @LastModifiedBy
//    @Column (name = "updated_by", nullable = false, updatable = false)
//    private String createdPhotographer;
//
//    @LastModifiedDate
//    @Column (name = "update_date")
//    private LocalDateTime update_Time;
//
//    @Column (name = "state", nullable = false, updatable = false)
//    private short state;
//
//    @Version
//    @Column (name = "version", nullable = false)
//    private Long version;
//
//
////    @PrePersist
////    public void prePersist() {
////        LocalDate now = LocalDate;
////        this.create = now;
////        this.updatedAt = now;
////    }
//
////    @PreUpdate
////    public void preUpdate() {
////        this.updatedAt = LocalDateTime.now();
////    }
//
//}