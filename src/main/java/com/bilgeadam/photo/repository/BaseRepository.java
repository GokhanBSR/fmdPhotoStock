package com.bilgeadam.photo.repository;


import com.bilgeadam.photo.model.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, ID> extends JpaRepository<T, ID> {

    Optional<T> findByIdAndDeletedFalse(ID id);

    List<T> findAllByDeletedFalse();
}