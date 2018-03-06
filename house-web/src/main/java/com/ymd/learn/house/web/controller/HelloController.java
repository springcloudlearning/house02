package com.ymd.learn.house.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymd.learn.house.biz.service.UserService;
import com.ymd.learn.house.common.model.User;

@Controller
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	public String hello(ModelMap modelMap) {
		List<User> users = userService.getUsers();
		User user = users.get(0);
		if(user != null) {
			throw new IllegalArgumentException();
		}
		modelMap.put("user", user);
		return "hello";
	}
	
	@RequestMapping("index")
	public String index() {
		return "homepage/index";
	}
}
