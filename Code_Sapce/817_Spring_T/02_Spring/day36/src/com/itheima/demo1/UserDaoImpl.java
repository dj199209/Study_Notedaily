package com.itheima.demo1;

import org.springframework.stereotype.Repository;

/**
 * UserDaoImpl交给IOC的容器
 * @author Administrator
 */
@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
	
	public void save() {
		System.out.println("保存客户...");
	}

}
