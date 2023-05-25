package com.bilgeadam.photo.service.impl;

import com.bilgeadam.photo.common.service.impl.BaseService;
import com.bilgeadam.photo.dto.TagDto;
import com.bilgeadam.photo.repository.TagRepository;
import com.bilgeadam.photo.service.mapper.TagMapper;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl extends BaseService<TagRepository, TagMapper, TagDto, Tag> {

}
