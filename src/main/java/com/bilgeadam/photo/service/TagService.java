package com.bilgeadam.photo.service;


import com.bilgeadam.photo.dto.TagDto;

import java.util.List;
import java.util.UUID;

public interface TagService {

    TagDto addTag(TagDto tagDto);

    TagDto getTag(TagDto tagDto);

    TagDto updateTag(TagDto tagDto);

    TagDto deleteTag(TagDto tagDto);

    List<TagDto> saveAllTags(List<TagDto> tagDtoList);

    List<TagDto> findAll();

    TagDto findById(UUID uuid);

    List<TagDto> findByPhotoId(UUID photoId);

    void delete(TagDto tagDto);

    void deleteId (UUID uuid);

    void deleteAll (List<TagDto> tagDtos);
//
//    String loadTags (UUID photoId);
//    List<TagDto> findByPhotoId(Long photoId);
//
//    TagDto findByName(String name);
}