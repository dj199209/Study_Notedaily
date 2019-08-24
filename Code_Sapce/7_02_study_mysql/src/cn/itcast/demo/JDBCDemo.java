package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*

1.	注册驱动. 
2.	获得连接.
3.	获得语句执行平台
4.	执行sql语句
5.	处理结果
6.	释放资源.

 * */
public class JDBCDemo {
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
//		1.注册驱动
//		使用java.sql.drivermanger
//		DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		
//		2.获取数据库连接
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
//		System.out.println(con);
		//3.获取语句的执行平台,通过数据库连接对象,获取到SQL语句的执行着者象
		//con 对象调用的方法  Statement createStatement()
		//返回值是Statement借口的实现类对象,在mysql驱动程序
		Statement stat = con.createStatement();
		
//		System.out.println(stat);
//		4.执行sql语句
		
		int row = stat.executeUpdate
				("INSERT INTO sort(sname,sprice,sdesc) VALUES('汽车用品',50000,'疯狂涨价')");
		System.out.println(row);
//		6.释放资源
		stat.close();
		con.close();
		
 	}
}
 