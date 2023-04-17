package com.bilgeadam.photo.common.service;

import com.bilgeadam.photo.common.dto.BaseDto;

import java.util.List;
import java.util.UUID;

public interface BaseServiceInterface<DtoType extends BaseDto> {
    DtoType save (DtoType dtoType);
    List<DtoType> saveAll(List<DtoType> dtoType);

    List<DtoType> saveAll (List<DtoType>dtoType);

    List<DtoType> findAll();

    DtoType findById(UUID uuid);

    void deleteById(UUID uuid);

    void delete (DtoType dtoType);

    void deleteAll (List<DtoType>dtoTypes);

}
