package com.itheima.demo2;

import org.junit.Test;

public class Demo2 {
	
	@Test
	public void run1(){
		// 目标对象
		BookDaoImpl dao = new BookDaoImpl();
		dao.save();
		dao.update();
		
		System.out.println("============================");
		
		// 使用CGLIB方式生成代理对象
		BookDaoImpl proxy = MyCglibUtils.getProxy();
		proxy.save();
		proxy.update();
	}

}
