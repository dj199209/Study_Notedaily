package cn.itcast.demo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 * 
 * */
public class propertiesDemo {
	public static void main(String[] args) throws Exception {
		InputStream in = propertiesDemo.class.getClassLoader().getResourceAsStream("datebase.properties");
//		System.out.println(in);
		Properties pro = new Properties();
		pro.load(in);
		System.out.println(pro);
		/*FileInputStream fis = new FileInputStream("datebase.properties");
		System.out.println(fis);*/
		//ÀàµÄ¼ÓÔØÆ÷
		String driverClass = pro.getProperty("dirverClass");
		String url = pro.getProperty("url");
		String passwd = pro.getProperty("passwd");
		String uername = pro.getProperty("username");
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, uername, passwd);
		System.out.println(con);
		
		
	}
	 
}
