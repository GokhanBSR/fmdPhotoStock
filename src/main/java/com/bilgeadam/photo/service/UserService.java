package com.bilgeadam.photo.service;

import com.bilgeadam.photo.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.UUID;

public interface UserService extends UserDetailsService {

    UserDto addUser(UserDto userDto);

    UserDto getUser(UserDto userDto);

    void deleteUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);

    UserDto save(UserDto UserDto);

    List<UserDto> saveAll(List<UserDto> UserDtoList);

    List<UserDto> findAll();

    UserDto findById(UUID uuid);

    UserDto findByUsername(String userName);

    void delete(UserDto UserDto);

    void deleteAll(List<UserDto> UserDtos);

    void makePayment(int spent);

    void registerUser(UserDto userDto);

    void makeAdmin(UUID id);

    void removeAdmin(UUID id);

    void enableUser(UUID id);

    void disableUser(UUID id);


}
