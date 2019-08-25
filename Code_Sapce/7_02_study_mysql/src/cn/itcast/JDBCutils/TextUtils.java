package cn.itcast.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.domain.Sort;

public class TextUtils {

	public static void main(String[] args) throws Exception {
		Connection con = JDBCUtilsConfig.getConnection();
		System.out.println(con);
		//连接获取数据库SQL语句的执行对象
			PreparedStatement pst = con.prepareStatement("SELECT *FROM sort");
			//调用查询方法,获取结果集
			ResultSet rs =pst.executeQuery();
			List<Sort> list = new ArrayList<Sort>();
			while(rs.next()) {
				Sort s =new Sort(rs.getInt("sid"),rs.getString("sname"),rs.getDouble("sprice"),rs.getString("sdesc"));
				list.add(s);
			}
			for (Sort s : list) {
				System.out.println(s);
			}
			//遍历list集合
			JDBCuUtils.close(con, pst, rs);
	}

}
 