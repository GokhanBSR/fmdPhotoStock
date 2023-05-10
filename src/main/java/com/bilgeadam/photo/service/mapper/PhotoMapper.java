package com.bilgeadam.photo.service.mapper;

import com.bilgeadam.photo.common.mapper.BaseMapper;
import com.bilgeadam.photo.dto.PhotoDto;
import com.bilgeadam.photo.model.Photo;
import org.mapstruct.*;
import org.springframework.util.CollectionUtils;

import java.util.UUID;

@Mapper(componentModel = "Spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface PhotoMapper extends BaseMapper<PhotoDto, Photo> {

    Photo toEntity(UUID id);

    @AfterMapping
    default void setParentToChild(@MappingTarget Photo photo) {
        if (!CollectionUtils.isEmpty(photo.getTags())) {
            photo.getTag().forEach(tag -> {
                tag.setPhoto(photo);
            });
        }
    }


}
