package com.user.account.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.account.entity.User;
import com.user.account.repository.RoleRepository;
import com.user.account.repository.UserRepository;
import com.user.account.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;
	
	RoleRepository rolerope;

	@Override
	public User newUser(User user) {
		
		return userRepo.saveAndFlush(user);
	}

	@Override
	public User userById(Long userid) {
		
		return userRepo.getReferenceById(userid);
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepo.findAll();
	}
	
	
	

}
