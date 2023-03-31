package com.bilgeadam.photo.service;


import com.bilgeadam.photo.dto.PhotoDto;

import java.util.List;

public interface PhotoService extends BaseService<PhotoDto, Long> {

    List<PhotoDto> findByUserId(Long userId);

    List<PhotoDto> findByTitleContaining(String keyword);

    List<PhotoDto> findByTagId(Long tagId);
}
