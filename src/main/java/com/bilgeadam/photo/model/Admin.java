package com.bilgeadam.photo.model;


import com.bilgeadam.photo.common.entity.BaseEntity;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "admins")
@SQLDelete(sql = " UPDATE user fmd_stock_photo.admin durum =0 where id =? and version=? ")
public class Admin extends BaseEntity {

    /**
     * username info table
     */
    @NotBlank
    @Column(name = "user_name")
    private String username;

    /**
     * password info added
     */
    @NotBlank
    @Column(name = "password")
    private double password;

    /**
     * email info added
     */
    @NotBlank
    @Email()
    @Column(name = "e-mail")
    private double email;

    @ManyToOne
    private Roles roles;

}

