package com.user.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.account.entity.Role;
import com.user.account.repository.RoleRepository;
import com.user.account.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository rolerope;
	
	@Override
	public List<Role> allRole() {
		
		return rolerope.findAll();
	}

	@Override
	public Role getRole(Integer id) {
		
		return rolerope.getReferenceById(id);
	}

	@Override
	public Role getRoleName(String rolename) {
		
		return rolerope.findByRole(rolename);
	}

}
