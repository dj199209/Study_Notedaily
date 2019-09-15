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
	static final String DRIVERCLASS;
	static final String ULR;
	static final String USER;
	static final String PASSWD;
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		DRIVERCLASS =  bundle.getString("dirverClass");
		ULR = bundle.getString("ulr");
		USER= bundle.getString("user");
		PASSWD =  bundle.getString("passwd");
	}
	static {
		// 注册驱动
		try {
			Class.forName(DRIVERCLASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVERCLASS);
		// 获取连接
		Connection con = DriverManager.getConnection(ULR, USER, PASSWD);
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
