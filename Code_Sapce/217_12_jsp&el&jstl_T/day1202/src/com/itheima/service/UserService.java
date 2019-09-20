package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {

	public User getUserByUsernameAndPwd(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return new UserDao().getUserByUsernameAndPwd(username,password);
	}

}
