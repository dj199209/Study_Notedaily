package com.dj.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.dj.dao.AccountDao;
import com.dj.utils.JdbcUtils;

public class AccountService4tl {

	public void account(String formuser, String toUser, String money) throws SQLException  {
		AccountDao dao = new AccountDao();
		//开启事物
		Connection con = null;
		try {
			con = JdbcUtils.getConnection();
			//将con和当前线程绑定
			con.setAutoCommit(false);
//			1.转出
			dao.accountOut(con,formuser,money);
			int i=1/0;
//			2.转入
			dao.accountIn(con,toUser,money);
			//3.事物提交
			con.commit();
			JdbcUtils.closeConn(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//事物回滚
			con.rollback();
			JdbcUtils.closeConn(con);
			
			throw e;
		}

		
	}

}
