package com.bilgeadam.photo.service;


import com.bilgeadam.photo.common.service.BaseServiceInterface;
import com.bilgeadam.photo.dto.TagDto;

import java.util.List;

public interface TagServiceInterface extends BaseServiceInterface<TagDto, Long> {

    List<TagDto> findByPhotoId(Long photoId);

    TagDto findByName(String name);
}