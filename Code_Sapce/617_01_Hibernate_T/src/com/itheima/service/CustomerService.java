package com.itheima.service;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;

public class CustomerService {
	
	/**
	 * 保存客户
	 * @param c
	 */
	public void saveCustomer(Customer c){
		new CustomerDao().save(c);
	}

}
