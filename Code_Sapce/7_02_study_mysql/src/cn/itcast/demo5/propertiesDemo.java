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
		//类的加载器
		String driverClass = pro.getProperty("dirverClass");
		String url = pro.getProperty("url");
		String passwd = pro.getProperty("passwd");
		String uername = pro.getProperty("username");
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, uername, passwd);
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
