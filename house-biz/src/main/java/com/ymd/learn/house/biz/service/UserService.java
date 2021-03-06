package com.ymd.learn.house.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymd.learn.house.biz.mapper.UserMapper;
import com.ymd.learn.house.common.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
		
	public List<User> getUsers() {
		return userMapper.selectUsers();
	}
	
}
