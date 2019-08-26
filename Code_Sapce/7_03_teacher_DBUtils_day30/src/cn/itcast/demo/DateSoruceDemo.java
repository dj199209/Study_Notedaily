package cn.itcast.demo;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DateSoruceDemo {

	public static void main(String[] args) {
		// ����һ��DateSoruceʵ�������
		//ʵ������,org.apache.commons.dbcp
		BasicDataSource dateSource = new BasicDataSource();
		dateSource.setDriverClassName("com.mysql.jdbc.Driver");
		dateSource.setUrl("jdbc:mysql://localhost:3306/mydata");
		dateSource.setUsername("root");
		dateSource.setPassword("root");
		
		Connection con;
		try {
			con = dateSource.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("���ݿ�����ʧ��");
			// TODO Auto-generated catch block
		}

	}

}
