package com.bilgeadam.photo.model;


import com.bilgeadam.photo.common.entity.BaseEntity;
import com.bilgeadam.photo.consts.EntityConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tags")
@SQLDelete(sql = "UPDATE fmd_stock_photo.tag set state =0 where id =? and version=?")
@Where(clause = EntityConstants.WHERE_CLAUSE)
public class Tag extends BaseEntity {

    /**
     * tag name table added
     */
    @Column(name = "tag")
    private String tag;

    /**
     * tag column setted to photo column
     */
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name= "photo_id")
    private Set<Photo>photo;

}
