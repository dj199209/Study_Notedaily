package cn.itcast.JDBCutils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class JDBCUtilsConfig {
	private static Connection con;
	private static String driverClass;
	private static String url;
	private static String passwd;
	private static String uername;
	static { 
		try {
		readConfig();
		Class.forName(driverClass);
		con = DriverManager.getConnection(url, uername, passwd);
		}catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("数据库连接失败");
		}
	}
	public static void readConfig() throws IOException {
		InputStream in = JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("datebase.properties");
		Properties pro = new Properties();
		pro.load(in);
		driverClass = pro.getProperty("dirverClass");
		url = pro.getProperty("url");
		passwd = pro.getProperty("passwd");
		uername = pro.getProperty("username");
	}
	public static Connection getConnection() {
		return con;
	}
}
