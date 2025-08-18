package com.userService.userService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userService.userService.entities.User;
import com.userService.userService.entities.UserCredentials;

public interface UserRepository extends JpaRepository<User,Long>{

	User findByName(String username);
	
	User findByUserCredentialsUsername(String username);

    
} 
