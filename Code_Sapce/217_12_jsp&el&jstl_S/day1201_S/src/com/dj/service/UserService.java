package com.dj.service;

import java.sql.SQLException;

import com.dj.dao.UserDao;
import com.dj.domain.User;

public class UserService {

	public User getUserByUsernameAndPwd(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return new UserDao().getUserByUsernameAndPwd(username,password);
	}

}
