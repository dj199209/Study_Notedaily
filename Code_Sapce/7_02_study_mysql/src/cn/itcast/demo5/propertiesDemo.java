package cn.itcast.demo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import cn.itcast.JDBCutils.JDBCuUtils;
import cn.itcast.domain.Sort;

/*
 * 
 * */
public class propertiesDemo {
	public static void main(String[] args) throws Exception {
		InputStream in = propertiesDemo.class.getClassLoader().getResourceAsStream("datebase.properties");
//		System.out.println(in);
		Properties pro = new Properties();
		pro.load(in);
		System.out.println(pro);
		/*FileInputStream fis = new FileInputStream("datebase.properties");
		System.out.println(fis);*/
		//��ļ�����
		String driverClass = pro.getProperty("dirverClass");
		String url = pro.getProperty("url");
		String passwd = pro.getProperty("passwd");
		String uername = pro.getProperty("username");
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, uername, passwd);
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
