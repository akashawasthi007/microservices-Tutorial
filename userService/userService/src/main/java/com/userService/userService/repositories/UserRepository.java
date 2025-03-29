package com.userService.userService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userService.userService.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

    
} 
