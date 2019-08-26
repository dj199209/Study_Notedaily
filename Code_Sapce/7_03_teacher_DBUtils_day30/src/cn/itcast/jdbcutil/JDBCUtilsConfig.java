package cn.itcast.jdbcutil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 *  ��д���ݿ����ӵĹ�����,JDBC������
 *  ��ȡ���Ӷ�����ö�ȡ�����ļ���ʽ
 *  ��ȡ�ļ���ȡ����,ִ��һ��,static{}
 */
public class JDBCUtilsConfig {
	private static Connection con ;
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	
	static{
		try{
			readConfig();
			Class.forName(driverClass);
			con = DriverManager.getConnection(url, username, password);
		}catch(Exception ex){
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}
	
	private static void readConfig()throws Exception{
		InputStream in = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		 Properties pro = new Properties();
		 pro.load(in);
		 driverClass=pro.getProperty("driverClass");
		 url = pro.getProperty("url");
		 username = pro.getProperty("username");
		 password = pro.getProperty("password");
	}
	
	
	public static Connection getConnection(){
		return con;
	}
	
}
