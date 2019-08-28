package cn.itcast.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.JDBCutils.JDBCuUtils;
import cn.itcast.domain.Sort;

public class JDBCDemo4 {

	public static void main(String[] args) throws Exception {
		//��ȡJDBC������,ֱ�ӻ�ȡ���ݿ����Ӷ���
		Connection con = JDBCuUtils.getConnection();
		System.out.println(con);
		//���ӻ�ȡ���ݿ�SQL����ִ�ж���
		PreparedStatement pst = con.prepareStatement("SELECT *FROM sort");
		//���ò�ѯ����,��ȡ�����
		ResultSet rs =pst.executeQuery();
		List<Sort> list = new ArrayList<Sort>();
		while(rs.next()) {
			Sort s =new Sort(rs.getInt("sid"),rs.getString("sname"),rs.getDouble("sprice"),rs.getString("sdesc"));
			list.add(s);
		}
		for (Sort s : list) {
			System.out.println(s);
		}
		//����list����
		JDBCuUtils.close(con, pst, rs);
		
	}

}
