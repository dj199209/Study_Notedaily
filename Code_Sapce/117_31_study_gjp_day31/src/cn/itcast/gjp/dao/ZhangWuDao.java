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
	public List<ZhangWu> select(String startDate,String endDate){
		try {
			String sql = "SELECT * FROM gjp_zhangwu WHERE createtime	BETWEEN ? AND ?";
			Object[] params = {startDate,endDate}; 
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class), params);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			throw new RuntimeException("查询数据异常");
			
		}
	}
/*	public List<ZhangWu> select(String startDate,String endDate){
		try{
			//拼写条件查询的SQL语句
			String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
			//定义对象数组,存储?占位符
			Object[] params = {startDate,endDate};
			//调用qr对象的方法query查询数据表,获取结果集
			return qr.query(sql, new BeanListHandler<>(ZhangWu.class),params); 
		}catch(SQLException ex){
			System.out.println(ex);
			throw new RuntimeException("条件查询失败");
		}
	}*/
	public void addZhangHu(ZhangWu zw) {
				try {
					String sql = "INSERT INTO gjp_zhangwu (flname,money,zhangHu,createtime,description) VALUES (?,?,?,?,?)";
					Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription()};
					qr.update(sql,params);
				} catch (SQLException e) {
					System.out.println(e);
					throw new RuntimeException("数据添加异常");
				}
	}
	public void editZhangWu(ZhangWu zw) {
		String sql = " UPDATE gjp_zhangwu SET flname=?,money=?,zhangHu=?,createtime=?,description=? WHERE zwid=?";
		Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("数据修改异常");
		}
		
	}
	public void deleteZhangWu(int zwid) {
		String sql ="delete from gjp_zhangwu where zwid =?";
		try {
			qr.update(sql,zwid);
		} catch (SQLException e) {
			System.out.println("删除账户失败");
			e.printStackTrace();
		}
		
	}
}
 