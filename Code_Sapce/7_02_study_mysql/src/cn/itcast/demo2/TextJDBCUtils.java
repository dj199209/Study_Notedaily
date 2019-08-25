package cn.itcast.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import cn.itcast.JDBCutils.JDBCuUtils;

public class TextJDBCUtils {
	public static void main(String[] args) throws SQLException {
		Connection con = JDBCuUtils.getConnection();
		PreparedStatement pst = con.prepareStatement("selct sname from sort");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("sname"));
		}
		JDBCuUtils.close(con, pst, rs);
	}
} 
