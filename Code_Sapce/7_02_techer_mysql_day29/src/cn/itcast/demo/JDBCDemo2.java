package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 *  Java����ʵ���û���¼,�û���������,���ݿ���
 *  ��ʾ������ע�빥��
 */
public class JDBCDemo2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stat = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		
		//ִ��SQL���,���ݱ�,��ѯ�û���������,�������,��¼�ɹ�,�����ڵ�¼ʧ��
		String sql = "SELECT * FROM users WHERE username='"+user+"' AND PASSWORD='"+pass+"'";
		System.out.println(sql);
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getString("username")+"   "+rs.getString("password"));
		}
		
		rs.close();
		stat.close();
		con.close();
	}
}
