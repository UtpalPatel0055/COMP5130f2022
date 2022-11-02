package com.comp5130.eAssess.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp5130.eAssess.controller.bean.User;
import com.comp5130.eAssess.dao.UserDao;
import com.comp5130.eAssess.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public User getUserByUsername(String username) {
		User user = userDao.getUserByUsername(username);
		return user;
	}

}
