package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  PrepareStatement�ӿ�ʵ�����ݱ�Ĳ�ѯ����
 */
public class JDBCDemo1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="123";
		Connection con = DriverManager.getConnection(url, username, password);	
		
		String sql = "SELECT * FROM sort";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		//����pst����ķ���,ִ�в�ѯ���,Select
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("sid")+"  "+rs.getString("sname")+"  "+rs.getString("sprice")+"  "+rs.getString("sdesc"));
		}
		rs.close();
		pst.close();
		con.close();
	}
}
