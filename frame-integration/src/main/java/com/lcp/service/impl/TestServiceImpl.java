package com.lcp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lcp.dao.TestDAO;
import com.lcp.model.Role;
import com.lcp.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDAO testDao;

	public String TestName(String name) {
		String word=name+":I'm coming";
		return word;
	}
	
	public List<Role> getRoles(String dataSourceKey) {
		return testDao.getRoles();
	}

	public void insertRoles(Role role) {
		testDao.insertRoles(role);
	}
	
	
	@Cacheable(key="#dataSourceKey",value="myehcache")
	public List<Role> testCache(String dataSourceKey) {
		return testDao.getRoles();
	}
	

}
