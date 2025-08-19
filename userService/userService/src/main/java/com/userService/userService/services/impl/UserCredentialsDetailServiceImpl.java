package com.userService.userService.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.userService.userService.entities.User;
import com.userService.userService.entities.UserCredentials;
import com.userService.userService.repositories.UserRepository;
import com.userService.userService.services.UserCredentialDetailService;

@Service
public class UserCredentialsDetailServiceImpl implements UserCredentialDetailService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User usr = userRepo.findByUserCredentialsUsername(username);
		System.out.println(usr);
		UserCredentials usrCred = usr.userCredentials;
		System.out.println("testinggg : "+usrCred);
		
		System.out.println("Raw username: " + username);
		System.out.println("DB password (hash): " + usrCred.password);
		
		if(usrCred != null) {
			UserDetails usrDetails = org.springframework.security.core.userdetails.User.builder().username(usrCred.username).password(usrCred.password).roles("USER").build();
			return usrDetails;
		}
		throw new UsernameNotFoundException(username);
	}

}
