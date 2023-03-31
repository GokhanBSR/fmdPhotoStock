package com.bilgeadam.photo.repository;


import com.bilgeadam.photo.model.entity.Tag;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends BaseRepository<Tag, Long> {

    Tag findByNameIgnoreCaseAndDeletedFalse (String name);
}
