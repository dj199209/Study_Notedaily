package com.itheima.demo1;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 演示日志用法
 * @author Administrator
 */
public class Demo1 {
	
	// 创建日志对象
	private Logger log = Logger.getLogger(Demo1.class);
	
	@Test
	public void run1(){
		System.out.println("执行了...");
		log.info("执行了...");
	}

}
