package cn.itcast.demo2;

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

/*
 * QueryRunner���ݲ�ѯ����:
 *   ����QueryRunner�෽��query(Connection con,String sql,ResultSetHandler r, Object..params)
 *   ResultSetHandler r ������Ĵ���ʽ,����ResultSetHandler�ӿ�ʵ����
 *   Object..params SQL����е�?ռλ��
 *   
 *   ע��: query��������ֵ,���ص���T ����, ���巵��ֵ����,������������ʽ�仯
 */
public class QueryRunnerDemo1 {
	private static Connection con = JDBCUtilsConfig.getConnection();
	public static void main(String[] args) throws SQLException{
//		arrayHandler();
//		arrayListHandler();
//		beanHandler();
//		beanListHander();
//		columnListHandler();
//		scalarHandler();
//		mapHandler();
//		mapListHandler();
	}
	/*
	 *  ������ڰ��ִ�����,MapListHandler
	 *  �������ÿһ�д洢��Map����,��:����,ֵ:����
	 *  Map���Ϲ���,�洢��List����
	 */
	public static void mapListHandler()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT  * FROM sort";
		//���÷���query,���ݽ����ʵ����MapListHandler
		//����ֵList����, �洢����Map����
		List<Map<String,Object>> list = qr.query(con, sql, new MapListHandler());
		//��������list
		for( Map<String,Object> map : list ){
			for(String key : map.keySet()){
				System.out.print(key+"..."+map.get(key));
			}
			System.out.println();
		}
		
	}
	
	/*
	 *  ����������ִ�����,MapHandler
	 *  ���������һ������,��װ��Map������
	 *  Map<��,ֵ> ��:����  ֵ:���е�����
	 */
	public static void mapHandler()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT  * FROM sort";
		//���÷���query,���ݽ����ʵ����MapHandler
		//����ֵ: Map����,Map�ӿ�ʵ����, ����
		Map<String,Object> map = qr.query(con, sql, new MapHandler());
		//����Map����
		for(String key : map.keySet()){
			System.out.println(key+".."+map.get(key));
		}
	}
	
	
	/*
	 *  ����������ִ�����,ScalarHandler
	 *  ���ڲ�ѯ��,ֻ��1�����
	 */
	public static void scalarHandler()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT COUNT(*) FROM sort";
		//���÷���query,���ݽ��������ʵ����ScalarHandler
		long count = qr.query(con, sql, new ScalarHandler<Long>());
		System.out.println(count);
	}
	
	/*
	 *  ����������ִ�����,ColumnListHandler
	 *  �����,ָ���е�����,�洢��List����
	 *  List<Object> ÿ�����������Ͳ�ͬ
	 */
	public static void columnListHandler()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort ";		
		//���÷��� query,���ݽ����ʵ����ColumnListHandler
		//ʵ���๹�췽����,ʹ���ַ���������
		List<Object> list = qr.query(con, sql, new ColumnListHandler<Object>("sname"));
		for(Object obj : list){
			System.out.println(obj);
		}
	}
	
	/*
	 *  ����������ִ�����, BeanListHandler
	 *  �����ÿһ������,��װJavaBean����
	 *  ���JavaBean����,�洢��List����
	 */
	public static void beanListHander()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort ";
		//���÷���query,���ݽ��������ʵ����BeanListHandler
		List<Sort> list = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
		for(Sort s : list){
			System.out.println(s);
		}
	}
	
	/*
	 *  ����������ִ�����,BeanHandler
	 *  ��������ĵ�һ������,��װ��JavaBean����
	 *  ע��: ����װ�����ݵ�JavaBean����, Sort������пղ�������
	 */
	public static void beanHandler()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort ";
		//���÷���,���ݽ����ʵ����BeanHandler
		//BeanHandler(Class<T> type) 
		Sort s = qr.query(con, sql, new BeanHandler<Sort>(Sort.class));
		System.out.println(s);
	}
	
	/*
	 *  ������ڶ��ִ�����,ArrayListHandler
	 *  ���������ÿһ��,��װ������������, ���ֺܶ��������
	 *  ��������洢��List����
	 */
	public static void arrayListHandler()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";		
		//����query����,���������Ĳ�����,����ʵ����ArrayListHandler
		//��������ֵ ÿ����һ����������,�洢��List
		List<Object[]> result=  qr.query(con, sql, new ArrayListHandler());
		
		//���ϵı���
		for( Object[] objs  : result){
			//������������
			for(Object obj : objs){
				System.out.print(obj+"  ");
			}
			System.out.println();
		}
	}
	
	/*
	 *  �������һ�ִ�����, ArrayHandler
	 *  ��������ĵ�һ�д洢������������  Object[]
	 */
	public static void arrayHandler()throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";
		//���÷���queryִ�в�ѯ,�������Ӷ���,SQL���,���������ʽ��ʵ����
		//���ض�������
		Object[] result = qr.query(con, sql, new ArrayHandler());
		for(Object obj : result){
			System.out.print(obj);
		}
	}
	
	
	
	
}
