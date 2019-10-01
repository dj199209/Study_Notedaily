package com.itheima.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.domain.User;
import com.itheima.utils.HibernateUtils;

public class Demo3 {
	
	@Test
	public void run1(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 获取到持久态的对象
		User user = session.get(User.class,1);
		// 重新设置新的名称
		user.setName("隔离老王");
		tr.commit();
		session.close();
	}
	
	@Test
	public void run2(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 获取到持久态的对象
		User user = session.get(User.class,1);
		user.setAge(88);
		tr.commit();
		session.close();
	}
}
