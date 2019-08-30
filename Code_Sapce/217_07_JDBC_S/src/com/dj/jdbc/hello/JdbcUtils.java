package com.dj.jdbc.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JdbcUtils {
	// 获取连接
	//获取
	static String driverClass;
	static String ulr;
	static String user;
	static String passwd;
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		   bundle.getString("dirverClass");
		   bundle.getString("ulr");
		   bundle.getString("user");
		   bundle.getString("passwd");
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// 注册
		 
		Class.forName(driverClass);
		// 获取连接
		Connection con = DriverManager.getConnection(ulr, user, passwd);
		return con;
	}

	// 释放连接
	/**
	 * 释放资源
	 * @param con 连接
	 * @param st 语句执行
	 * @param rs 结果集
	 */
	public static void closeResources(Connection con, Statement st, ResultSet rs) {
		closeConn(con);
		closeStatement(st);
		closeResultSet(rs);
		
	}
	
	/**
	 * 释放连接
	 * @param con
	 */
	public static void closeConn(Connection con) {
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		con = null;
		}
	}
	public static void closeStatement(Statement st) {
		if (st!=null) {
			try { 
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			st = null;
		}
	}
	public static void closeResultSet(ResultSet rs) {
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rs = null;
		}
	}
	
}
