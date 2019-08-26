package cn.itcast.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.domain.Sort;
import cn.itcast.jdbcutil.JDBCUtilsConfig;

public class QueryRunnerDemo1 {
	private static final List<Object> Object = null;
	private static Connection con = JDBCUtilsConfig.getConnection();
	public static void main(String[] args) throws SQLException {
//		arrayHandler();
//		arrayListHandler();
//		beenHandler();
//		beanListHandler();
//		columnListHandler();
//		scalarHandler();
//		mapHandler();
		mapListHandler();
	}
	//���������ĵ�һ�ַ���,ArrayHandler
	public static void arrayHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort";
		//���ض�������
		Object[] result = qr.query(con, sql, new ArrayHandler());
		for (Object obj : result) {
			System.out.print(obj+" ");
		}
	}
	//���������ĵڶ��ַ���,ArrayListHandler
	//�������ÿһ��,��װ������������,,���ֺܶ��������
	//��������洢��list���
	public static void arrayListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//��������ֵ,ÿ����һ������
		
		List<Object[]>  result=  qr.query(con, sql, new ArrayListHandler());  
		System.out.println(result.getClass());
		//���ϵı���
		for (Object[] objects : result) {
			//������������
			System.out.println();
			for (Object objects2 : objects) {
				System.out.print(objects2+"  ");
			}
		}
	} 
	/*
����������ִ�����,BeanHandler
��������ĵ�һ������,��װ��javaBeen����
ע��:�����ӵ�bean�������Ҫ�пղζ���
*/
	public static void beenHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//���÷��� 
		Sort s =qr.query(con, sql,new BeanHandler<Sort>(Sort.class)); 
		System.out.println(s);
	}
//���������ĵ����ַ���	BeanListHandler
	public static void beanListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//���÷���,��Ҫ���ݽ������ʵ����BeanListHandler
		List<Sort> list = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
		for (Sort s : list) {
			System.out.println(s);
		}
	}
	//����������ִ�����ColumnListHandler
	//�����,���е�����,�洢����List����
	//List<Object> ÿ���������಻ͣ
	public static void columnListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//���÷���
		List<Object> list=  qr.query(con, sql, new ColumnListHandler<Object>("sname"));
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	//�������6�д�����	ScalarHandler<T>
//��ѯ��ֻ��һ�����
	public static void scalarHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select count(*) from sort ";
//		���÷���query,���ݽ������ʱ�޼�ScalarHandler
		long count = qr.query(con, sql, new ScalarHandler<Long>());
		System.out.println(count);
	}
	//������ĵ�7�ִ�����MapHandler
	//��������ϵ�һ������,��װ��Map������
	//Map<k,v>��:���� ֵ:���е�����
	public static void mapHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//���÷�����query
		//����ֵΪmap����.Map�ӿ�ʵ����,����
		
		Map<String, Object> map =qr.query(con, sql, new MapHandler());
		//����map����
		for (String key: map.keySet()) {
			System.out.println(key+".."+map.get(key));
		}
		
	}
	//������ڰ��ִ�����MapListHandler
	//����Ľ����ÿһ�д洢��map������
	//map���Ϲ���,�浽list��
	public static void mapListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		List<Map<String,Object>> list=qr.query(con, sql, new MapListHandler());
//		����list
		for (Map<String, Object> map : list) {
			for (String key : map.keySet()) {
				System.out.print(key+".."+map.get(key));
			}
			System.out.println();
		}
	}
}
