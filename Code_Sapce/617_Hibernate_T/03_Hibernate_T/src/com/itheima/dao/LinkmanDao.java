package com.itheima.dao;

import org.hibernate.Session;

import com.itheima.domain.Linkman;
import com.itheima.utils.HibernateUtils;

public class LinkmanDao {

	/**
	 * 保存联系人
	 * @param man
	 */
	public void save(Linkman man){
		Session session = HibernateUtils.getCurrentSession();
		session.save(man);
	}

}
