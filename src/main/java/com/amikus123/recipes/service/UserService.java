package com.amikus123.recipes.service;

import com.amikus123.recipes.dto.user.CreateUserDto;
import com.amikus123.recipes.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    User saveUser(CreateUserDto createUserDto);
    void deleteUser(Long id);

    // Add other service methods as needed
}