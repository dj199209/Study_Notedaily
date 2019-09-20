package com.itheima.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.DataSourceUtils;

public class AccountDao4DB {

	public void accountOut(String fromUser, String money) throws SQLException {
		//创建queryrunner
		QueryRunner qr = new QueryRunner();
		
		//编写sql
		String sql="update account set money =money - ? where name =?";
		
		//执行sql
		qr.update(DataSourceUtils.getConnection(), sql, money,fromUser);
	}

	public void accountIn(String toUser, String money) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr=new QueryRunner();
		String sql="update account set money =money + ? where name =?";
		qr.update(DataSourceUtils.getConnection(), sql, money,toUser);
	}

}
