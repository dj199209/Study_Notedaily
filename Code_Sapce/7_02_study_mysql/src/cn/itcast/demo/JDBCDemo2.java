package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo2 {

	public static void main(String[] args) throws Exception {
//		1.ע������
		Class.forName("com.mysql.jdbc.Driver");
//		2.��ȡ���Ӷ���
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
		//3.��ȡִ��sql���Ķ���
		
		//
		Scanner sc = new Scanner(System.in);
		String usernames = sc.nextLine();
		String passwds = sc.nextLine();
		String sql = "SELECT * FROM users where username= ? AND passwd= ?";
		PreparedStatement pst =  con.prepareStatement(sql);
		//System.out.println(sql);
		pst.setObject(1, usernames);
		pst.setObject(2, passwds);
		ResultSet rs =  pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("username")+
					"    "+rs.getString("passwd"));
		}
		rs.close();
		con.close();
		pst.close();
//		if(rs.next()) {
//			 
//		}
		
		
	}

}
