package cn.itcast.gjp.dao;
/*
 * ʵ�ֶ���
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
			throw new RuntimeException("���ݿ��ѯ�쳣");
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
			throw new RuntimeException("��ѯ�����쳣");
			
		}
	}
/*	public List<ZhangWu> select(String startDate,String endDate){
		try{
			//ƴд������ѯ��SQL���
			String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
			//�����������,�洢?ռλ��
			Object[] params = {startDate,endDate};
			//����qr����ķ���query��ѯ���ݱ�,��ȡ�����
			return qr.query(sql, new BeanListHandler<>(ZhangWu.class),params); 
		}catch(SQLException ex){
			System.out.println(ex);
			throw new RuntimeException("������ѯʧ��");
		}
	}*/
	public void addZhangHu(ZhangWu zw) {
				try {
					String sql = "INSERT INTO gjp_zhangwu (flname,money,zhangHu,createtime,description) VALUES (?,?,?,?,?)";
					Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription()};
					qr.update(sql,params);
				} catch (SQLException e) {
					System.out.println(e);
					throw new RuntimeException("��������쳣");
				}
	}
	public void editZhangWu(ZhangWu zw) {
		String sql = " UPDATE gjp_zhangwu SET flname=?,money=?,zhangHu=?,createtime=?,description=? WHERE zwid=?";
		Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("�����޸��쳣");
		}
		
	}
	public void deleteZhangWu(int zwid) {
		String sql ="delete from gjp_zhangwu where zwid =?";
		try {
			qr.update(sql,zwid);
		} catch (SQLException e) {
			System.out.println("ɾ���˻�ʧ��");
			e.printStackTrace();
		}
		
	}
}
 