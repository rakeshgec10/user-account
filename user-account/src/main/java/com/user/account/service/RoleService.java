package com.user.account.service;

import java.util.List;

import com.user.account.entity.Role;

public interface RoleService {
	
	
	List<Role> allRole();
	
	Role getRole(Integer id);
	
	Role getRoleName(String rolename);

}
