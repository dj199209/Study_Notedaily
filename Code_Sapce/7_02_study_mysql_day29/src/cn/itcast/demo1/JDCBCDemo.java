package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDCBCDemo {
	public static void main(String[] args) throws Exception {
//		1.ע������
		Class.forName("com.mysql.jdbc.Driver");
//		2.��ȡ���Ӷ���
		String url ="jdbc:mysql://127.0.0.1:3306/mydata";
		String username = "root";
		String passwd = "root";
		Connection con = DriverManager.getConnection(url, username, passwd);
		//3.ƴд�޸ĵ�SQL���,��������?ռλ
		String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setObject(1, "��������");
		pst.setObject(2, 49988);
		pst.setObject(3, 7);
		//����pst�ķ���ִ��sql
		pst.executeUpdate();
		pst.close();
		con.close();
		
	} 
}
