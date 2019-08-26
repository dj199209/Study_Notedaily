package cn.itcast.demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import cn.itcast.jdbcutil.JDBCUtils;

public class QueryRunnerTextDemo {
	public static void main(String[] args) throws SQLException {
//	inset();
		select();
	}
	private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		
	public static void inset() {
		String sql =" insert into sort (sname,sprice,sdesc)values(?,?,?)";
		Object[] params = {"水果",1100.23,"水果大涨价"};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			throw new RuntimeException();
		}
	}
	public static void select()  { 
		String sql = "select * from sort";
		List<Object[]> list;
		try {
			list = qr.query(sql, new ArrayListHandler());
		for (Object[] objects : list) {
			for (Object objects2 : objects) {
				System.out.print(objects2+"\t");
			}
			System.out.println();
		}
		} catch (SQLException e) {
			
		}
	}

}
