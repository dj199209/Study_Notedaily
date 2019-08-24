package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDCBCDemo {
	public static void main(String[] args) throws Exception {
//		1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
		//3.拼写修改的SQL语句,参数采用?占位
		String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setObject(1, "汽车美容");
		pst.setObject(2, 49988);
		pst.setObject(3, 7);
		//调用pst的方法执行sql
		pst.executeUpdate();
		pst.close();
		con.close();
		
	} 
}
