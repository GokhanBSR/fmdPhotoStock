package com.bilgeadam.photo.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "admins")
public class Admin extends BaseEntity {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    private Roles roles;

    // getter and setter methods
}






//import jakarta.persistence.Entity;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.userdetails.User;
//
//import javax.persistence.Entity;
//
//@Getter
//@Setter
//@Entity
//public class Admin extends BaseEntity {
//
//    private String firstName;
//
//    private String lastName;
//
//    private String adminName;

//}
