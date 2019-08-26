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
		//ռλ��д������
		Object[] params = {"������Ʒ",289.23,"����������Ʒ"};
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	} 
	public static void update() throws SQLException {
		QueryRunner qr =new QueryRunner();
		// TODO Auto-generated method stub
		//�޸�����sql
		String sql = "UPDATE sort SET sname=?,sprice=?,sdesc=? WHERE sid =?";
		//����Object ����,�洢?�еĲ���
		Object[] params = {"����",100.88,"���˽�õ��",4};
		int row = qr.update(con, sql, params); 
		System.out.println(row);
		DbUtils.closeQuietly(con);
		
		

	}
	public static void delete() throws SQLException {
		//����һ��qr����
		QueryRunner qr = new QueryRunner();
		//дsql���
		String sql = "Delete from sort where sid=?";
		int row = qr.update(con, sql, 9);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
}
