package com.bilgeadam.photo.repository;


import com.bilgeadam.photo.common.repository.BaseRepository;
import com.bilgeadam.photo.model.Roles;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RolesRepository extends BaseRepository<Roles, UUID> {
}
