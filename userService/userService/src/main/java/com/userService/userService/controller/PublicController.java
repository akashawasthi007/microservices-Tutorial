package com.userService.userService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userService.userService.entities.User;
import com.userService.userService.services.UserService;


@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/create/")
    public ResponseEntity<User> createUser(@RequestBody User user){
        // String userId = UUID.randomUUID().toString();
        // user.setUserId(userId);
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }       

}
