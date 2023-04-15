package com.bilgeadam.photo.model;
import com.bilgeadam.photo.common.entity.BaseEntity;
import com.bilgeadam.photo.consts.EntityConstants;
import com.bilgeadam.photo.consts.MessageConstants;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.Set;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
@SQLDelete(sql = "UPDATE fmd_stock_photo.user set state =0 where id =? and version=?")
@Where(clause = EntityConstants.WHERE_CLAUSE)
public class User extends BaseEntity {

    /**
     * username info
     */
    @NotBlank
    @Column(name = "user_name")
    private String username;

    /**
     * users password info
     */
    @NotBlank
    @Size (min = 8)
    @Column(name = "password", nullable = false)
    private double password;

    @Transient
    @Size (min = 8)
    private double cpassword;

    @Email
    @NotBlank
    @Column(name = "e-mail")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Set<Roles> roles;

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn (name="user_id")
    private Set<Photo> photo;

    @Column (name = "status")
    private boolean isEnable = true;

//    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn (name = "user_id")
//    private Set<Tag> tag;

}

