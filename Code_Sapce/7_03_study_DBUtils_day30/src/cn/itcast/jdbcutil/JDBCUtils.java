package cn.itcast.jdbcutil;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
//������BasicDataSource�����
	private static BasicDataSource dateSource =new BasicDataSource();
	
	static {
		//���ݿ�������Ϣ,�����
		dateSource.setDriverClassName("com.mysql.jdbc.Driver");
		dateSource.setUrl("jdbc:mysql://localhost:3306/mydata");
		dateSource.setUsername("root");
		dateSource.setPassword("root");
		//�����ӳ��е�������������,��ѡ��
		dateSource.setInitialSize(10);//��ʼ����������
		dateSource.setMaxActive(8);//���������
		dateSource.setMaxIdle(5);//������
		dateSource.setMinIdle(1);//��С����
	}
	
	//��̬����,����BasicDataSourcel��Ķ���
	public static DataSource getDataSource() {
		return dateSource;
	}
	 
}
