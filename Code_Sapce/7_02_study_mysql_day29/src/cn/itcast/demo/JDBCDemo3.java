package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo3 {

	public static void main(String[] args) throws Exception {
//		1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
		//3.获取执行sql语句的对象
		Statement stat =  con.createStatement();
		//
		Scanner sc = new Scanner(System.in);
		String usernames = sc.nextLine();
		String passwds = sc.nextLine();
		String sql = "SELECT * FROM users where username= '"+usernames+"' AND passwd= '"+passwds+"'";
		System.out.println(sql);
		ResultSet rs =  stat.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("username")+
					"    "+rs.getString("passwd"));
		}
		rs.close();
		con.close();
		stat.close();
//		if(rs.next()) {
//			
//		}
		
		
	}

}
