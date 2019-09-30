package com.dj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dj.utils.JdbcUtils;


public class AccountDao4tl {
	/**
	 * 转出钱 
	 * @param con 
	 * @param fromUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountOut(Connection con, String fromUser, String money) throws SQLException {
		PreparedStatement pst =null;
		ResultSet rs =null;
		
		try {
			//编写sql
			String sql = "update account set money =money - ? where name = ?";
			//创建参数
			pst =con.prepareStatement(sql);
			 pst.setString(1, money);
			 pst.setString(2, fromUser);
			 //执行sql
			 int i = pst.executeUpdate();
			 
			//处理
			 System.out.println("出"+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}finally {
			JdbcUtils.closeStatement(pst);
		}
	}
	/**
	 * 转入
	 * @param con 
	 * @param toUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountIn(Connection con, String toUser, String money) throws SQLException {
		PreparedStatement pst =null;
		ResultSet rs =null;
		
		try {
			//编写sql
			String sql = "update account set money =money + ? where name = ?";
			//创建参数
			pst =con.prepareStatement(sql);
			 pst.setString(1, money);
			 pst.setString(2, toUser);
			 //执行sql
			 int i = pst.executeUpdate();
			 
			//处理
			 System.out.println("入"+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}finally {
			JdbcUtils.closeStatement(pst);
		}
		
	}

}
