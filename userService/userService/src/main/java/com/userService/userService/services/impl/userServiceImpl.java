package com.userService.userService.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userService.userService.entities.User;
import com.userService.userService.exception.ResourceNotFoundException;
import com.userService.userService.repositories.UserRepository;
import com.userService.userService.services.UserService;

@Service
public class userServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
        //throw new UnsupportedOperationException("Unimplemented method 'saveUser'");
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        return userRepository.findAll();
        //throw new UnsupportedOperationException("Unimplemented method 'getAllUser'");
    }

    @SuppressWarnings("deprecation")
    @Override
    public User getUser(Long userId) {
        // TODO Auto-generated method stub
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Resource not found Exception caught"));
        //throw new UnsupportedOperationException("Unimplemented method 'getUser'");
    }

}
