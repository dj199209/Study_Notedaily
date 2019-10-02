package com.itheima.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itheima.dao.CustomerDao;
import com.itheima.dao.LinkmanDao;
import com.itheima.domain.Customer;
import com.itheima.domain.Linkman;
import com.itheima.utils.HibernateUtils;

public class LinkmanService {

	/**
	 * 编写业务，保存联系人
	 * 先把客户查询出来，设置到联系人中，再保存联系人
	 * @param man
	 * @param cust_id
	 */
	public void save(Linkman man, Long cust_id) {
		// 先获取session
		Session session = HibernateUtils.getCurrentSession();
		// 开启事务
		Transaction tr = session.beginTransaction();
		try {
			// 编写代码
			// 先查客户
			Customer c = new CustomerDao().findById(cust_id);
			// 设置
			man.setCustomer(c);
			// 保存联系人
			new LinkmanDao().save(man);
			
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
	}

}
