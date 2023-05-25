package com.bilgeadam.photo.service;

import com.bilgeadam.photo.dto.PhotoDto;

import java.util.List;
import java.util.UUID;

public interface PhotoService {

    PhotoDto save(PhotoDto photoDto);

    PhotoDto getPhoto(PhotoDto photoDto);
//    List <PhotoDto> findAll (PhotoDto photoDto);
//
//    List <PhotoDto> findByCategory (String category);

//    List<PhotoDto> findByTag (String tag);

//    List <PhotoDto> findByUsername (String username);
//
//    List <PhotoDto> findByPrice (int price);

    void delete(PhotoDto photoDto);

    void deleteById(UUID uuid);

    Void deleteAll(List<PhotoDto> photoDtos);


}
