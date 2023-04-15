package com.bilgeadam.photo.service;


import com.bilgeadam.photo.common.service.BaseServiceInterface;
import com.bilgeadam.photo.dto.PhotoDto;

import java.util.List;

public interface PhotoServiceInterface extends BaseServiceInterface<PhotoDto, Long> {

    List<PhotoDto> findByUserId(Long userId);

    List<PhotoDto> findByTitleContaining(String keyword);

    List<PhotoDto> findByTagId(Long tagId);
}
