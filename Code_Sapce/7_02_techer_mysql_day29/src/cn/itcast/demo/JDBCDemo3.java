package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 *  Java����ʵ���û���¼,�û���������,���ݿ���
 *  ��ֹע�빥��
 *  Statement�ӿ�ʵ����,����ִ��SQL���,���ؽ����
 *  ��һ���ӽӿ�PreparedStatement  (SQLԤ����洢,��θ�Ч��ִ��SQL) 
 *  PreparedStatement��ʵ�������ݿ��������,��λ�ȡ�ӿڵ�ʵ����
 *  
 *  ��Connection���ݿ����Ӷ���ķ���
 *  PreparedStatement prepareStatement(String sql) 
          
 */
public class JDBCDemo3 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		
		//ִ��SQL���,���ݱ�,��ѯ�û���������,�������,��¼�ɹ�,�����ڵ�¼ʧ��
		String sql = "SELECT * FROM users WHERE username=? AND PASSWORD=?";
		//����Connection�ӿڵķ���prepareStatement,��ȡPrepareStatement�ӿڵ�ʵ����
		//�����в���,SQL����еĲ���ȫ�������ʺ�ռλ��
		PreparedStatement pst =  con.prepareStatement(sql);
		System.out.println(pst);
		//����pst����set����,�����ʺ�ռλ���ϵĲ���
		pst.setObject(1, user);
		pst.setObject(2, pass);
		
		//���÷���,ִ��SQL,��ȡ�����
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("username")+"   "+rs.getString("password"));
		}
		
		rs.close();
		pst.close();
		con.close();
	}
}
