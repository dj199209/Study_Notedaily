package com.dj.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.dj.domain.User;
import com.dj.utils.DataSourceUtils;

public class UserDao {

	public User getUserByUsernameAndPwd(String username, String password) throws SQLException {
		QueryRunner qr =new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select *from user where username=? and password=?";
		
		return qr.query(sql, new BeanHandler<>(User.class), username,password);
	}
	
}
