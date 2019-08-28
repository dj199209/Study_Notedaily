package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws Exception{
//		1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
		//3.获取执行sql语句的对象
		Statement stat = con.createStatement();
		String sql = "SELECT * FROM sort;";
//		4. 调用执行者对象方法,执行SQL语句获取结果集
		 ResultSet rs =  stat.executeQuery(sql);
//		 System.out.println(rs);
//		 5.处理结果集
		 while(rs.next()) {
			 System.out.println(rs.getInt("sid") 
					 + rs.getString("sname")
					 +rs.getInt("sprice")
					 +rs.getString("sdesc"));
		 }
		 
		 
		 
	}

} 
