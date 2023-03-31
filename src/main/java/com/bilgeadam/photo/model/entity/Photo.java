package com.bilgeadam.photo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "photos")
public class Photo extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne
    private User user;

    // getter and setter methods
}
//package com.bilgeadam.photo.model.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.apache.catalina.User;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "photos")
//
//public class Photo extends BaseEntity {
//
//    private String title;
//
//    private String description;
//
//    private Double price;
//
//    private String imagePath;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "photo_tags",
//            joinColumns = {@JoinColumn(name = "photo_id")},
//            inverseJoinColumns = {@JoinColumn(name = "tag_id")})
//    private Set<Tag> tags = new HashSet<>();
//
//    // constructors, getters and setters
//}