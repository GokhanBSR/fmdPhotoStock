package com.bilgeadam.photo.repository;


import com.bilgeadam.photo.common.repository.BaseRepository;
import com.bilgeadam.photo.model.Photo;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
public interface PhotoRepository extends BaseRepository<Photo, Long> {

    List<Photo> findByCategory(String category);

    Photo findByTitle(String title);

    Photo findByDescription(String description);

    Photo findByPrice(BigDecimal price);

    Photo findByUser(String user);

    Photo findByUuid(UUID uuid);

//    /**
//     * this query gets photos in Photo table as created date.
//     * @return photo list
//     */
////    @Query("SELECT p FROM Photo p ORDER BY p.uploadDate DESC")
//    List <Photo> findLatestPhotos();
//
//    /**
//     *
//     * @param username
//     * @return photo
//     */
//    List<Photo> findByUsername(String username);
//
//    /**
//     *
//     * @param title
//     * @return title
//     */
//    List<Photo> findByTitleContainingIgnoreCase(String title);
//
//    /**
//     *
//     * @param price
//     * @return price
//     */
//    List<Photo> findByPriceGreaterThan(int price);
//    List<Photo> findByPriceLessThan(int price);
//    List<Photo> findByPriceBetweenHighAndLow (int Price);
//
//
//    List<Photo> findByTitleContainingIgnoreCaseAndDeletedFalse(String keyword);
//
//
//    /**
//     *
//     * @param photoId
//     * @return newest photos
//     */
//    List<Photo> findByPhotoOrderByNewAndOld(UUID photoId);
}
