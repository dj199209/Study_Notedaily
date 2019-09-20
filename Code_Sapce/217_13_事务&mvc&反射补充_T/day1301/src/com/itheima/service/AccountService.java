package com.itheima.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.itheima.dao.AccountDao;
import com.itheima.utils.JdbcUtils;

public class AccountService {

	/**
	 * 转账
	 * @param fromUser 转出方
	 * @param toUser 转入方
	 * @param money 金额
	 * @throws Exception 
	 */
	public void account(String fromUser, String toUser, String money) throws Exception {
		AccountDao dao = new AccountDao();
		
		Connection conn=null;
		try {
			//0.开启事务
			conn = JdbcUtils.getConnection();
			conn.setAutoCommit(false);
			
			//1.转出
			dao.accountOut(conn,fromUser,money);
			
			int i=1/0;
			
			//2.转入
			dao.accountIn(conn,toUser,money);
			
			//3.事务提交
			conn.commit();
			JdbcUtils.closeConn(conn);
		} catch (Exception e) {
			e.printStackTrace();
			
			//事务回滚
			conn.rollback();
			JdbcUtils.closeConn(conn);
			
			throw e;
		}
		
	}

}
