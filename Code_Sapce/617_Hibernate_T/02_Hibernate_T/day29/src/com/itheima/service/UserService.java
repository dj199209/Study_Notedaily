package com.itheima.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.utils.HibernateUtils;

public class UserService {
	
	public void save(User u1,User u2){
		UserDao dao = new UserDao();
		// 获取session
		Session session = HibernateUtils.getCurrentSession();
		// 开启事务
		Transaction tr = session.beginTransaction();
		try {
			dao.save1(u1);
			int a = 10/0;
			dao.save2(u2);
			// 提交事务
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			// 出现问题：回滚事务
			tr.rollback();
		}finally{
			// 自己释放资源，现在，session不用关闭，线程结束了，自动关闭的！！
		}
	}

}
