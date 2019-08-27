package cn.itcast.gjp.dao;
/*
 * 实现对账
 */

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.tools.JDBCUtils;

public class ZhangWuDao {
	private QueryRunner qr =new QueryRunner(JDBCUtils.getDataSource());
	public List<ZhangWu> seletAll() {
		String sql = "SELECT * FROM gjp_zhangwu;";
		try {
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("数据库查询异常");
		}
		 
		
	}
	
}
 