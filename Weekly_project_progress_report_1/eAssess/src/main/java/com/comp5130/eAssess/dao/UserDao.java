package com.comp5130.eAssess.dao;

import com.comp5130.eAssess.controller.bean.User;

public interface UserDao {
	User getUserByUsername(String username);
}
