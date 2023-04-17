package com.bilgeadam.photo.model;

import com.bilgeadam.photo.common.entity.BaseEntity;
import com.bilgeadam.photo.consts.EntityConstants;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Set;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
@SQLDelete(sql = " UPDATE fmd_stock_photo.photo set state =0 where id =? and version=? ")
@Where(clause = EntityConstants.WHERE_CLAUSE)
@Table(name = "photos")
public class Photo extends BaseEntity {

    /**
     * category table added
     */
    @NotBlank
    @Column(name = "Category")
    private String category;

    /**
     * title table added and min max values added
     */
    @NotBlank
    @Size(min = 0, max = 500)
    @Column(name = "title")
    private String title;

    /**
     * description table added
     */
    @Size (min = 0,max = 1000)
    @Column(name = "description")
    private String description;

    @NotNull
    @Min(0)
    @Max(value = 1000)
    @Column(name = "price")
    private BigDecimal price;

    /**
     * between user and photo relation
     */
    @ManyToOne
    @JoinColumn(name = "user")
    private Set<User> user;

    /**
     *tag column setted to photo column
     */
    @ManyToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn (name = "photo_id")
    private Set<Tag> tags;

}
