package com.bilgeadam.photo.repository;


import com.bilgeadam.photo.model.entity.Photo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends BaseRepository<Photo, Long> {

    List<Photo> findByUserIdAndDeletedFalse(Long userId);

    List<Photo> findByTitleContainingIgnoreCaseAndDeletedFalse(String keyword);
}
