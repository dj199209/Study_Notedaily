package cn.itcast.jdbcutil;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
//创建出BasicDataSource类对象
	private static BasicDataSource dateSource =new BasicDataSource();
	
	static {
		//数据库连接信息,必须的
		dateSource.setDriverClassName("com.mysql.jdbc.Driver");
		dateSource.setUrl("jdbc:mysql://localhost:3306/mydata");
		dateSource.setUsername("root");
		dateSource.setPassword("root");
		//对连接池中的数量进行配置,可选的
		dateSource.setInitialSize(10);//初始化连接数量
		dateSource.setMaxActive(8);//最大连接数
		dateSource.setMaxIdle(5);//最大空闲
		dateSource.setMinIdle(1);//最小空闲
	}
	
	//静态方法,返回BasicDataSourcel类的对象
	public static DataSource getDataSource() {
		return dateSource;
	}
	 
}
