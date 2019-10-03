package com.itheima.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3 {
	
	/**
	 * 原始的方式
	 */
	@Test
	public void run1(){
		CustomerServiceImpl cs = new CustomerServiceImpl();
		cs.save();
	}

	/**
	 * Spring方式
	 */
	@Test
	public void run2(){
		// 创建工厂，加载配置文件，CustomerDaoImpl创建了，CustomerServiceImpl被创建了，
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerServiceImpl cs = (CustomerServiceImpl) ac.getBean("customerService");
		cs.save();
	}
}
