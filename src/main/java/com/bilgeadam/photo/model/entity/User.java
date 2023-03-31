package com.bilgeadam.photo.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    // getter and setter methods
}



//import com.bilgeadam.photo.model.entity.BaseEntity;
//import com.bilgeadam.photo.model.entity.Roles;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
//import lombok.*;
//import org.hibernate.annotations.SQLDelete;
//import org.hibernate.annotations.Where;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "users")
//@RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor
//@SQLDelete(sql = "UPDATE users set durum=0 where id=? and version= ")
//
//@Where(clause = "durum <> 0")
//
//public class User extends BaseEntity {
//
//    @NotBlank
//    @Size (min = 5, max = 20)
//    @Column(name = "user_name")
//    private String userNameSurname;
//
//    private String user;
//
//    private String password;
//
//    private String email;
//
//
//    @Email
//    @NotBlank
//    @Size (min = 10, max = 100)
//    @Column (name = "email")
//    private String email;
//
//    @Transient
//    @Size (min = 8 , max = 50)
//    private String password;
//
//    //    @Digits()
//    @Size (min=11, max = 14)
//    @Column (name = "phone_number")
//    private String phoneNumber;
//
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private List<Roles> roles;
//
//}
