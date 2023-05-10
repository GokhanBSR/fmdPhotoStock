package com.bilgeadam.photo.service.impl;

import com.bilgeadam.photo.common.service.impl.BaseService;
import com.bilgeadam.photo.dto.UserDto;
import com.bilgeadam.photo.repository.RolesRepository;
import com.bilgeadam.photo.repository.UserRepository;
import com.bilgeadam.photo.service.UserService;
import com.bilgeadam.photo.service.mapper.UserMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.transaction.Transactional;

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

    /**
     *
     */
    @Transactional
}
