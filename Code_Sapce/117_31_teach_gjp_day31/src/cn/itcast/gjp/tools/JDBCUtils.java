package cn.itcast.gjp.tools;
/*
 *  ��ȡ���ݿ����ӵĹ�����
 *  ʵ�����ӳ�,dbcp���ӳ�
 */
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
public class JDBCUtils{
    //����BasicDataSource����
	private static BasicDataSource datasource = new BasicDataSource();
	//��̬�����,ʵ�ֱ�Ҫ��������
	static{
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/gjp");
		datasource.setUsername("root");
		datasource.setPassword("root");
		datasource.setMaxActive(10);
		datasource.setMaxIdle(5);
		datasource.setMinIdle(2);
		datasource.setInitialSize(10);
	}
	public static DataSource getDataSource(){
		return datasource;
	}
}
/*
 * private static DataSource datasource1 ;
 * datasource1= BasicDataSourceFactory.createDataSource(Properties��ֵ��)
 * createDataSource����ֵ,���ص���DataSource�ӿ�ʵ����
 */ 
