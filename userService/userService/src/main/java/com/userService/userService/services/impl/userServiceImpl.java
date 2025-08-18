package com.userService.userService.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userService.userService.entities.Rating;
import com.userService.userService.entities.User;
import com.userService.userService.exception.ResourceNotFoundException;
import com.userService.userService.repositories.UserRepository;
import com.userService.userService.services.UserService;

@Service
public class userServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private RestTemplate restTemplate;

   @Override
    public User saveUser(User user) {
    	if (user.userCredentials != null) {
    		user.userCredentials.password = passwordEncoder.encode(user.userCredentials.password);
            user.userCredentials.user=user;
        }
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @SuppressWarnings("deprecation")
    @Override
    public User getUser(Long userId) {
        //ArrayList l1= restTemplate.getForObject("http://localhost:8081/rating/users/"+String.valueOf(userId), ArrayList.class);
    	//System.out.println(l1);
    	System.out.println("user find");
    	User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Resource not found Exception caught"));
    	//user.ratings = l1;
        return user;
    }

	@Override
	public User deleteUser(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).map(user -> {
			userRepository.delete(user);
			return user;
		}).orElseThrow(() -> new ResourceNotFoundException("Resource not found Exception caught"));
	}

}
