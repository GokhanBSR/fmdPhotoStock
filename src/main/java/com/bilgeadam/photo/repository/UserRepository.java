package com.bilgeadam.photo.repository;

import com.bilgeadam.photo.common.repository.BaseRepository;
import com.bilgeadam.photo.model.Photo;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends BaseRepository<User, UUID> {

    /**
     * search by "like"
     *
     * @param username
     * @return
     */
    List<User> findByUserNameContainingIgnorCase(String username);

    /**
     * @param username
     * @return
     */
    //    @Query("SELECT c FROM User c JOIN c.roles r WHERE c.username =:username")
    Optional<User> findByUsernameIgnoreCase(String username);

    /**
     * @param photoId
     * @return
     */
    List<User> findByUserIdOrderByCreateDateDesc(UUID photoId);

    /**
     * finding user as category
     */
    List<User> findByUserIdOrderByCategoryOrPhotoId(String username, UUID photoId);

    /**
     * @param email
     * @return
     */
    List<User> findByEmailIgnoreCase(String email);

    /**
     * listing photos as date new to old
     */
    List<Photo> findByPhotoOrderByCreateDateDesc(UUID userId);
}