package com.lcp.dao;

import java.util.List;

import com.lcp.model.Role;

public interface TestDAO {

	public List<Role> getRoles();
	
	public void insertRoles(Role role);
}
