package com.user.account.service;

import java.util.List;

import com.user.account.entity.User;

public interface UserService {
	
	
	User newUser(User user);
	
	User userById(Long userid);
	
	List<User> getAllUser();
	
	

}