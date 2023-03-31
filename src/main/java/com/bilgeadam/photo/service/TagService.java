package com.bilgeadam.photo.service;


import com.bilgeadam.photo.dto.TagDto;

import java.util.List;

public interface TagService extends BaseService<TagDto, Long> {

    List<TagDto> findByPhotoId(Long photoId);

    TagDto findByName(String name);
}