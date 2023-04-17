package com.bilgeadam.photo.repository;


import com.bilgeadam.photo.common.repository.BaseRepository;
import com.bilgeadam.photo.model.Photo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PhotoRepository extends BaseRepository<Photo, Long> {

    /**
     * this query gets photos in Photo table as created date.
     * @return photo list
     */
//    @Query("SELECT p FROM Photo p ORDER BY p.uploadDate DESC")
    List <Photo> findLatestPhotos();

    /**
     *
     * @param username
     * @return photo
     */
    List<Photo> findByUsername(String username);
    /**
     *
     * @param category
     * @return category
     */
    List<Photo> findByCategory(String category);

    /**
     *
     * @param title
     * @return title
     */
    List<Photo> findByTitleContainingIgnoreCase(String title);

    /**
     *
     * @param price
     * @return price
     */
    List<Photo> findByPriceGreaterThan(int price);
    List<Photo> findByPriceLessThan(int price);
    List<Photo> findByPriceBetweenHighAndLow (int Price);


    List<Photo> findByTitleContainingIgnoreCaseAndDeletedFalse(String keyword);


    /**
     *
     * @param photoId
     * @return newest photos
     */
    List<Photo> findByPhotoOrderByNewAndOld(UUID photoId);
}
