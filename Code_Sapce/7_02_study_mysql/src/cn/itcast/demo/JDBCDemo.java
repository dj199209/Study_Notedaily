package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*

1.	ע������. 
2.	�������.
3.	������ִ��ƽ̨
4.	ִ��sql���
5.	������
6.	�ͷ���Դ.

 * */
public class JDBCDemo {
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
//		1.ע������
//		ʹ��java.sql.drivermanger
//		DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		
//		2.��ȡ���ݿ�����
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
//		System.out.println(con);
		//3.��ȡ����ִ��ƽ̨,ͨ�����ݿ����Ӷ���,��ȡ��SQL����ִ��������
		//con ������õķ���  Statement createStatement()
		//����ֵ��Statement��ڵ�ʵ�������,��mysql��������
		Statement stat = con.createStatement();
		
//		System.out.println(stat);
//		4.ִ��sql���
		
		int row = stat.executeUpdate
				("INSERT INTO sort(sname,sprice,sdesc) VALUES('������Ʒ',50000,'����Ǽ�')");
		System.out.println(row);
//		6.�ͷ���Դ
		stat.close();
		con.close();
		
 	}
}
 