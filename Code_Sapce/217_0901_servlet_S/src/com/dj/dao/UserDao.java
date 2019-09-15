package com.dj.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.dj.domian.User;
import com.dj.utils.DataSourceUtils;

public class UserDao {
	/**
	 * 登录
	 * @param username用户名
	 * @param password密码
	 * @return 用户
	 * @throws SQLException 
	 */
	public User getByUsernameAndPwd(String username, String password) throws SQLException {
		//创建一个queryrunner
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		//编写sql
		String sql ="select * from user where username = ? and password = ?";
		
		//执行sql
		User user = qr.query(sql, new BeanHandler<>(User.class), username, password);
		return user;
	}

}
