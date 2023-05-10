package com.bilgeadam.photo.service.mapper;


import com.bilgeadam.photo.common.mapper.BaseMapper;
import com.bilgeadam.photo.dto.TagDto;
import com.bilgeadam.photo.model.Tag;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {PhotoMapper.class}, unmappedSourcePolicy = ReportingPolicy.IGNORE, injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface TagMapper extends BaseMapper<TagDto, Tag> {

    @Mapping(target = "photo", source = "photoId")
    Tag dtoToEntity(TagDto tagDto);


}
