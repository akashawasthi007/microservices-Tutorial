package com.userService.userService.services;

import java.util.List;

import com.userService.userService.entities.User;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUser();

    User getUser(Long userId);
}
