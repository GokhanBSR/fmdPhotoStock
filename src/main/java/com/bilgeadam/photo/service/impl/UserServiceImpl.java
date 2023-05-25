package com.bilgeadam.photo.service.impl;

import com.bilgeadam.photo.common.service.impl.BaseService;
import com.bilgeadam.photo.dto.UserDto;
import com.bilgeadam.photo.model.User;
import com.bilgeadam.photo.repository.RolesRepository;
import com.bilgeadam.photo.repository.UserRepository;
import com.bilgeadam.photo.service.UserService;
import com.bilgeadam.photo.service.mapper.UserMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl extends BaseService<UserRepository, UserMapper, User, UserDto> implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RolesRepository rolesRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper mapper, UserRepository repository, UserRepository userRepository, PasswordEncoder passwordEncoder, RolesRepository rolesRepository, UserMapper userMapper) {
        super(mapper, repository);
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.rolesRepository = rolesRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto save(UserDto userDto) {
        return super.save(userDto);
    }

    @Override
    public List<UserDto> saveAll(List<UserDto> dtoList) {
        return super.saveAll(dtoList);
    }


    @Override
    public UserDto findById(UUID uuid) {
        return super.findById(uuid);
    }

    @Override
    public void delete(UserDto dto) {
        super.delete(dto);
    }

    @Override
    public void deleteById(UUID uuid) {
        super.deleteById(uuid);
    }

    @Override
    public void deleteAll(List<UserDto> userDtos) {
        super.deleteAll(userDtos);
    }
}
