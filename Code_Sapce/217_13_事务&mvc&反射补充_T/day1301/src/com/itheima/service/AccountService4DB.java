package com.itheima.service;

import com.itheima.dao.AccountDao4DB;
import com.itheima.utils.DataSourceUtils;

public class AccountService4DB {

	/**
	 * 转账
	 * @param fromUser 转出方
	 * @param toUser 转入方
	 * @param money 金额
	 * @throws Exception 
	 */
	public void account(String fromUser, String toUser, String money) throws Exception {
		AccountDao4DB dao = new AccountDao4DB();
		
		try {
			//0.开启事务
			DataSourceUtils.startTransaction();
			
			//1.转出
			dao.accountOut(fromUser,money);
			
			int i=1/0;
			
			//2.转入
			dao.accountIn(toUser,money);
			
			//3.事务提交
			DataSourceUtils.commitAndClose();
		} catch (Exception e) {
			e.printStackTrace();
			DataSourceUtils.rollbackAndClose();
			throw e;
		}
		
	}

}
