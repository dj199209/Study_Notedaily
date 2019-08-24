package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDome1 {

	public static void main(String[] args) throws Exception {
//		1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
		String sql = "select * from sort";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs =  pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("sid")+"  "+rs.getString("sname")+"  "+
							rs.getString("sprice")+"  "+rs.getString("sdesc"));
			
		}
		rs.close();
		con.close();
		pst.close();
	}

}
