package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
	JDBC�������ݿ�Ĳ���
	1.ע������
	    ��֪JVMʹ�õ�����һ�����ݿ������
	2.�������
	   ʹ��JDBC�е���,��ɶ�MySQL���ݿ������
	3.������ִ��ƽ̨
	  ͨ�����Ӷ����ȡ��SQL����ִ���߶���
	4.ִ��sql���
	  ʹ��ִ���߶���,�����ݿ�ִ��SQL���
	  ��ȡ�����ݿ��ִ�к�Ľ��
	5.������
	6.�ͷ���Դ  һ��close()
 */
public class JDBCDemo {
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		//1.ע������ ���似��,����������뵽����
		// ʹ��java.sql.DriverManager�ྲ̬���� registerDriver(Driver driver)
		// Diver��һ���ӿ�,��������,MySQL���������е�ʵ����
		//DriverManager.registerDriver(new Driver());
		//������Դ����,ע��2����������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.������ݿ�����  DriverManager���о�̬����
		//static Connection getConnection(String url, String user, String password)  
		//����ֵ��Connection�ӿڵ�ʵ����,��mysql��������
		//url: ���ݿ��ַ  jdbc:mysql://��������IP:�˿ں�//���ݿ�����
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="123";
		Connection con = DriverManager.getConnection(url, username, password);
		
		//3.������ִ��ƽ̨, ͨ�����ݿ����Ӷ���,��ȡ��SQL����ִ���߶���
		// con������÷���   Statement createStatement() ��ȡStatement����,��SQL��䷢�͵����ݿ�
		// ����ֵ�� Statement�ӿڵ�ʵ�������,,��mysql��������
		Statement stat = con.createStatement();
		//	4.ִ��sql���
		// ͨ��ִ���߶�����÷���ִ��SQL���,��ȡ���
		// int executeUpdate(String sql)  ִ�����ݿ��е�SQL���, insert delete update
		// ����ֵint,�����ɹ����ݱ������
		int row = stat.executeUpdate
				("INSERT INTO sort(sname,sprice,sdesc) VALUES('������Ʒ',50000,'����Ǽ�')");
		System.out.println(row);
		
		//6.�ͷ���Դ  һ��close()
		stat.close();
		con.close();
	}
}
