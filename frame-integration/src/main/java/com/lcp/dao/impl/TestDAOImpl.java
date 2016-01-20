package com.lcp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lcp.dao.TestDAO;
import com.lcp.model.Role;
@Repository
public class TestDAOImpl implements TestDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String mapper="com.lcp.role.";
	
	
	public List<Role> getRoles() {
		return this.sqlSession.selectList(mapper+"getRole");
	}
	
	public void insertRoles(Role role){
		this.sqlSession.insert(mapper+"addRole",role);
		
	};

}
