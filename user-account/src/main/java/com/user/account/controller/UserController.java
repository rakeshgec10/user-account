package com.user.account.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.account.dto.UserDto;
import com.user.account.entity.Role;
import com.user.account.entity.User;
import com.user.account.service.RoleService;
import com.user.account.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private  RoleService roleService;
	
	@Autowired
	private  UserService userService;
	
	@Autowired
	private  com.user.account.mapper.UserMapper maper;


	@PostMapping("/addUser")
	public UserDto newUser(@RequestBody UserDto userdto) {
		Set<Role> setRolle=new HashSet<Role>();
		Role role=roleService.getRoleName(userdto.getRole());
		User user=maper.userDTOtoUser(userdto);
		setRolle.add(role);
		user.setRoles(setRolle);
		user=userService.newUser(user);
		userdto=maper.userDtoToEntity(user);
		return userdto;
	}

	@GetMapping("getuser/{userid}")
	public UserDto getUser(@PathVariable Long userid) {
		User user=userService.userById(userid);
		UserDto userdto=maper.userDtoToEntity(user);
		for(Role  userRoles : user.getRoles()) {
			userdto.setRole(userRoles.getRole());
		}	
		return userdto; 
	}
}
