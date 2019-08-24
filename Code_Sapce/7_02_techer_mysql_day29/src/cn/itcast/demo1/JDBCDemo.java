package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 *  ʹ��PrepareStatement�ӿ�,ʵ�����ݱ�ĸ��²���
 */
public class JDBCDemo {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="123";
		Connection con = DriverManager.getConnection(url, username, password);	
		
		//ƴд�޸ĵ�SQL���,��������?ռλ
		String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";
		//�������ݿ����Ӷ���con�ķ���prepareStatement��ȡSQL����Ԥ�������
		PreparedStatement pst = con.prepareStatement(sql);
		//����pst�ķ���setXXX����?ռλ
		pst.setObject(1, "��������");
		pst.setObject(2, 49988);
		pst.setObject(3, 7);
		//����pst����ִ��SQL���
		pst.executeUpdate();
		
		pst.close();
		con.close();
	}
}
