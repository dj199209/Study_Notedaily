package com.dj.jdbc.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class Hello {
	@Test
	public void hello() {
		System.out.println("hello");
	}
	@Test
	public void jdbc() throws Exception {
		//注册
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/day07", "root", "root");
		//编写sql
		String sql = "select * from category";
		//创建执行
		PreparedStatement pst =  conn.prepareStatement(sql);
		//执行sql
		ResultSet rs = pst.executeQuery();
		//处理结果
		while (rs.next()) {
			System.out.println(rs.getString("cid")+"::"+rs.getString("cname"));
		 
		}
		//释放资源
		rs.close();
		conn.close();
		pst.close();
	}
	@Test
	public void f3() {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement st =null;
		try {
			//获取连接
			con = JdbcUtils.getConnection();
			//编写sql
			String sql = " insert into category values(?,?)";
			//获取语句执行者 
			st = con.prepareStatement(sql);
			//设置参数
			st.setString(1, "c005");
			st.setString(2, "户外");
			//执行sql
			int i = st.executeUpdate();
			//处理结果
			if (i==1) {
				System.out.println("sucsee");
			}else {
				System.out.println("失败");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			//释放资源
			JdbcUtils.closeResources(con, st, rs);
		}
		
	}
}
