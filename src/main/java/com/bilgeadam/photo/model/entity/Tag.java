package com.bilgeadam.photo.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tags")
public class Tag extends BaseEntity {

    @Column(nullable = false)
    private String name;

    // getter and setter methods
}






//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Getter
//@Setter
//@Entity
//public class Tag extends BaseEntity{
//
//    private int id;
//    private String tag;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @ManyToMany(mappedBy = "tags")
//    private Set<Photo> photos = new HashSet<>();
//
//    // constructors, getters and setters
//
//
//
//}
