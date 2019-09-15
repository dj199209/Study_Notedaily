package com.itheima.b_datasourc.e_dbcp;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import com.dj.jdbc.hello.JdbcUtils;

public class DbcpDemo {
	@Test
	//硬编码
	public void f1() throws Exception {
		//创建连接池
		BasicDataSource ds =new BasicDataSource();
		//配置信息
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///day07");
		ds.setUsername("root");
		ds.setPassword("root");
		
		Connection connection =ds.getConnection();
		String sql = "insert into category values(?,?);";
		PreparedStatement pst = connection.prepareStatement(sql);
		
		pst.setString(1, "c009");
		pst.setString(2, "饮料2");
		
		int i= pst.executeUpdate();
		System.out.println(i);
		JdbcUtils.closeResources(connection, pst,null);
	}
	@Test
	public void f2() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/dbcp.properties"));
		DataSource ds = new BasicDataSourceFactory().createDataSource(prop);
		Connection conn=ds.getConnection();
		String sql="insert into category values(?,?);";
		PreparedStatement st=conn.prepareStatement(sql);
		
		//设置参数
		st.setString(1, "c012");
		st.setString(2, "饮料1");
		
		int i = st.executeUpdate();
		System.out.println(i);
		JdbcUtils.closeResources(conn, st, null);
	}
}
