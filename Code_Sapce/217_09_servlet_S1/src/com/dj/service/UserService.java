package com.dj.service;

import java.sql.SQLException;

import com.dj.dao.UserDao;
import com.dj.domian.User;

public class UserService {
	/**
	 * 用户登录
	 * @param username 用户名
	 * @param password密码
	 * @return 用户
	 * @throws SQLException 
	 */
	public User login(String username, String password) throws SQLException {
		UserDao dao = new UserDao(); 
		return dao.getByUsernameAndPwd(username,password);
	}

}
