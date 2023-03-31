package com.bilgeadam.photo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles extends BaseEntity {

    @Column(nullable = false)
    private String name;

    // getter and setter methods
}
