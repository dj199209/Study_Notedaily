package com.itheima.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试AOP功能
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class Demo3 {
	
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	@Test
	public void run1(){
		customerDao.save();
		// customerDao.update();
	}
}














