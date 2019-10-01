package com.itheima.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.domain.User;
import com.itheima.utils.HibernateUtils;

public class Demo2 {
	
	/**
	 * 快照机制
	 */
	@Test
	public void run7(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 获取到持久态的对象
		User user = session.get(User.class,1);
		// 重新设置新的名称
		user.setName("隔离老王");
		
		// 自动刷新缓存
		session.flush();
		
		tr.commit();
		session.close();
	}
	
	/**
	 * Session.evict()	-- 清除的指定的对象
	 */
	@Test
	public void run6(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		// 最简单的证明，查询两次
		User user1 = session.get(User.class, 1);
		System.out.println(user1.getName());
		
		// 清除user1对象
		session.evict(user1);
		
		User user2 = session.get(User.class, 1);
		System.out.println(user2.getName());
		
		tr.commit();
		session.close();
	}
	
	/**
	 * Session.clear()	-- 清空缓存。
	 */
	@Test
	public void run5(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		// 最简单的证明，查询两次
		User user1 = session.get(User.class, 1);
		System.out.println(user1.getName());
		
		// 清空缓存
		session.clear();
		
		User user2 = session.get(User.class, 1);
		System.out.println(user2.getName());
		
		tr.commit();
		session.close();
	}
	
	/**
	 * 快照机制
	 */
	@Test
	public void run4(){
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
	public void run3(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		// 最简单的证明，查询两次
		User user1 = session.get(User.class, 1);
		System.out.println(user1.getName());
		
		User user2 = session.get(User.class, 1);
		System.out.println(user2.getName());
		
		tr.commit();
		session.close();
	}
	
	/**
	 * 证明：一级缓存是存在的
	 */
	@Test
	public void run2(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		// 创建对象
		User user = new User();
		user.setName("哈哈");
		user.setAge(20);
		
		// 保存用户，user一级存入到session的缓存中
		Serializable id = session.save(user);
		System.out.println(id);
		
		// 获取对象，不会看到SQL语句
		User user2 = session.get(User.class, id);
		System.out.println(user2.getName());
		
		tr.commit();
		session.close();
	}
	
	/**
	 * 持久态的对象有自动更新数据库的能力
	 * session的一级缓存！！
	 */
	@Test
	public void run1(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		// 获取到持久态的对象
		User user = session.get(User.class,1);
		// user是持久态，有自动更新数据库的能力
		System.out.println(user.getName());
		
		// 重新设置新的名称
		user.setName("隔离老王");
		
		// 正常编写代码
		// session.update(user);
		
		tr.commit();
		session.close();
	}

}






