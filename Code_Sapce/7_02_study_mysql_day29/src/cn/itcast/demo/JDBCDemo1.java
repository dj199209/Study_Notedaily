package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws Exception{
//		1.ע������
		Class.forName("com.mysql.jdbc.Driver");
//		2.��ȡ���Ӷ���
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
		//3.��ȡִ��sql���Ķ���
		Statement stat = con.createStatement();
		String sql = "SELECT * FROM sort;";
//		4. ����ִ���߶��󷽷�,ִ��SQL����ȡ�����
		 ResultSet rs =  stat.executeQuery(sql);
//		 System.out.println(rs);
//		 5.��������
		 while(rs.next()) {
			 System.out.println(rs.getInt("sid") 
					 + rs.getString("sname")
					 +rs.getInt("sprice")
					 +rs.getString("sdesc"));
		 }
		 
		 
		 
	}

} 
