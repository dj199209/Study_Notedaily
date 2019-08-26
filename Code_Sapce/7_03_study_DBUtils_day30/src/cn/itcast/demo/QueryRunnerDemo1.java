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
	//结果集处理的第一种方法,ArrayHandler
	public static void arrayHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort";
		//返回对象数组
		Object[] result = qr.query(con, sql, new ArrayHandler());
		for (Object obj : result) {
			System.out.print(obj+" ");
		}
	}
	//结果集处理的第二种方法,ArrayListHandler
	//结果集的每一行,封装到对象数组中,,出现很多对象数组
	//对象数组存储到list结婚
	public static void arrayListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//方法返回值,每行是一个对象
		
		List<Object[]>  result=  qr.query(con, sql, new ArrayListHandler());  
		System.out.println(result.getClass());
		//集合的变量
		for (Object[] objects : result) {
			//变量对象数组
			System.out.println();
			for (Object objects2 : objects) {
				System.out.print(objects2+"  ");
			}
		}
	} 
	/*
结果集第三种处理方法,BeanHandler
将结果集的第一行数据,封装成javaBeen对象
注意:被分钟的bean对象必须要有空参对象
*/
	public static void beenHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//调用方法 
		Sort s =qr.query(con, sql,new BeanHandler<Sort>(Sort.class)); 
		System.out.println(s);
	}
//结果集处理的第四种方法	BeanListHandler
	public static void beanListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//调用方法,需要传递结果集的实现类BeanListHandler
		List<Sort> list = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
		for (Sort s : list) {
			System.out.println(s);
		}
	}
	//结果集第五种处理方法ColumnListHandler
	//结果集,列中的数据,存储的是List集合
	//List<Object> 每个列数据类不停
	public static void columnListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//调用方法
		List<Object> list=  qr.query(con, sql, new ColumnListHandler<Object>("sname"));
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	//结果集第6中处理方法	ScalarHandler<T>
//查询后只有一个结果
	public static void scalarHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select count(*) from sort ";
//		调用方法query,传递结果处理时限集ScalarHandler
		long count = qr.query(con, sql, new ScalarHandler<Long>());
		System.out.println(count);
	}
	//结果集的第7种处理方法MapHandler
	//将结果集合第一行数据,封装到Map集合中
	//Map<k,v>键:列名 值:这列的数据
	public static void mapHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		//调用方法的query
		//返回值为map集合.Map接口实现类,泛型
		
		Map<String, Object> map =qr.query(con, sql, new MapHandler());
		//变量map集合
		for (String key: map.keySet()) {
			System.out.println(key+".."+map.get(key));
		}
		
	}
	//结果集第八种处理方法MapListHandler
	//将你的结果集每一行存储在map集合中
	//map集合过多,存到list中
	public static void mapListHandler() throws SQLException {
		QueryRunner qr =new QueryRunner();
		String sql = "select * from sort ";
		List<Map<String,Object>> list=qr.query(con, sql, new MapListHandler());
//		遍历list
		for (Map<String, Object> map : list) {
			for (String key : map.keySet()) {
				System.out.print(key+".."+map.get(key));
			}
			System.out.println();
		}
	}
}
