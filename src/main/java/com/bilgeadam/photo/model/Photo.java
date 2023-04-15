package com.bilgeadam.photo.model;

import com.bilgeadam.photo.common.entity.BaseEntity;
import com.bilgeadam.photo.consts.EntityConstants;
import com.bilgeadam.photo.consts.MessageConstants;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(name = "photos")
@Getter
@Setter
@RequiredArgsConstructor
//@SQLDelete(sql = " UPDATE fmd_stock_photo.photo set state =0 where id =? and version=? ")
@Where(clause = EntityConstants.WHERE_CLAUSE)
public class Photo extends BaseEntity {

    /**
     * category table added
     */
    @NotBlank
    @Column (name = "Category")
    private String category;

    /**
     * title table added and min max values added
     */
    @NotBlank
    @Size (min = 0, max = 500)
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
    @JoinColumn (name = "user")
    private Set<User> user;

    /**
     *tag column setted to photo column
     */
    @ManyToMany ( mappedBy = "photo", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn (name = "photo_id", referencedColumnName = "id")
    private Set<Tag>tag;

}
