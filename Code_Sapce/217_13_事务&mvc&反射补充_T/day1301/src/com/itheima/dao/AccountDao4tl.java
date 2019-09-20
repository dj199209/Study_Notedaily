package com.itheima.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.utils.DataSourceUtils;
import com.itheima.utils.JdbcUtils;

public class AccountDao4tl {

	/**
	 * 转出钱
	 * @param fromUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountOut(String fromUser, String money) throws SQLException {
		PreparedStatement st=null;
		ResultSet rs=null;
		Connection conn=null;
		try {
			conn=DataSourceUtils.getConnection();
			
			//编写sql
			String sql="update account set money = money - ? where name =?";
			
			//创建语句执行者
			st=conn.prepareStatement(sql);
			
			//设置参数
			st.setString(1, money);
			st.setString(2, fromUser);
			
			//执行sql
			int i = st.executeUpdate();
			//处理
			System.out.println("出:"+i);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			DataSourceUtils.closeResource(st, rs);
		}
	}

	/**
	 * 转入
	 * @param toUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountIn(String toUser, String money) throws SQLException {
		PreparedStatement st=null;
		ResultSet rs=null;
		Connection conn=null;
		
		try {
			conn=DataSourceUtils.getConnection();
			//编写sql
			String sql="update account set money = money + ? where name =?";
			
			//创建语句执行者
			st=conn.prepareStatement(sql);
			
			//设置参数
			st.setString(1, money);
			st.setString(2, toUser);
			
			//执行sql
			int i = st.executeUpdate();
			//处理
			System.out.println("入:"+i);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			DataSourceUtils.closeResource(st, rs);
		}
	}



}
