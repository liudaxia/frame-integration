package com.lcp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lcp.model.Role;
import com.lcp.service.TestService;

@Controller
@RequestMapping(value="/test")
public class TestController {
	@Autowired
	private TestService testService;
	//日志
	private static Logger log=Logger.getLogger(TestController.class);
	
	@RequestMapping(value="/testName.do")
	public void testName(HttpServletRequest req,HttpServletResponse resp,String name){
		log.info("TestController testName start...");
		log.info("TestController testName params:"+name);
		String word=testService.TestName(name);
	};
	
	@RequestMapping(value="/roles.do")
	public void roles(HttpServletRequest req,HttpServletResponse resp,String name){
		List<Role> roleList=testService.getRoles(name);
		for (Role r:roleList) {
			System.out.println(r.getRoleName());
		}
	};
	
	
	@RequestMapping(value="/insert.do")
	public void insert(HttpServletRequest req,HttpServletResponse resp,String name){
		Role r=new Role();
		r.setRoleName("name1");
		r.setRoleStatus(true);
		r.setRemark("remark1");
		testService.insertRoles(r);
		
	};
	
	
	@RequestMapping(value="/testCache.do")
	public void testCache(HttpServletRequest req,HttpServletResponse resp,String name){
		List<Role> roleList=testService.testCache(name);
		for (Role r:roleList) {
			System.out.println("testCache results"+r.getRoleName());
		}
	};
	
	
}
