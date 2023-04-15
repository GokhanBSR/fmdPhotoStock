package com.bilgeadam.photo.repository;


import com.bilgeadam.photo.common.repository.BaseRepository;
import com.bilgeadam.photo.model.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TagRepository extends BaseRepository<Tag, UUID> {

    /**
     * Spring Data JPA drived Query
     * @param photoId
     * @return TagTitle
     */
   List<Tag> findByPhotoIdOrderByTagTitle (UUID photoId);
}
