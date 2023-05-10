package com.bilgeadam.photo.service.mapper;

import com.bilgeadam.photo.common.mapper.BaseMapper;
import com.bilgeadam.photo.dto.UserDto;
import org.mapstruct.Builder;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.security.core.userdetails.User;


@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface UserMapper extends BaseMapper<UserDto, User> {

}