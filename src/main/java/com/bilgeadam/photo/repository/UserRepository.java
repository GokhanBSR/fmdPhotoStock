package com.bilgeadam.photo.repository;

import com.bilgeadam.photo.common.repository.BaseRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

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
    User findByUserName(String username);

    /**
     * @param username
     * @return
     */
    //    @Query("SELECT c FROM User c JOIN c.roles r WHERE c.username =:username")
    Optional<User> findByUsernameIgnoreCase(String username);

    /**
     * @param userId
     * @return user
     */
    User findByUserId(UUID uuid);

    /**
     * @param email
     * @return
     */
    User findByEmailIgnoreCase(String email);

//    /**
//     * listing photos as date new to old
//     */
//    List<Photo> findByPhotoOrderByCreateDateDesc(UUID userId);
}