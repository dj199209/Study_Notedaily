package cn.itcast.demo;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import cn.itcast.jdbcutil.JDBCUtilsConfig;

public class QueryRunnerDemo {
	private static Connection con = JDBCUtilsConfig.getConnection();
	public static void main(String[] args) throws SQLException {
//		insert();
//		update();
		delete();
	}
	public static void insert() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "insert into sort (sname,sprice,sdesc)value(?,?,?)";
		//占位符写入数组
		Object[] params = {"体育用品",289.23,"购买体育用品"};
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	} 
	public static void update() throws SQLException {
		QueryRunner qr =new QueryRunner();
		// TODO Auto-generated method stub
		//修改数据sql
		String sql = "UPDATE sort SET sname=?,sprice=?,sdesc=? WHERE sid =?";
		//定义Object 数组,存储?中的参数
		Object[] params = {"花卉",100.88,"情人节玫瑰",4};
		int row = qr.update(con, sql, params); 
		System.out.println(row);
		DbUtils.closeQuietly(con);
		
		

	}
	public static void delete() throws SQLException {
		//创建一个qr对象
		QueryRunner qr = new QueryRunner();
		//写sql语句
		String sql = "Delete from sort where sid=?";
		int row = qr.update(con, sql, 9);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
}
