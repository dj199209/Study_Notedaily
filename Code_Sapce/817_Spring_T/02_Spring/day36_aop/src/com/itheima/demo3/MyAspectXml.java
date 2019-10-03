package com.itheima.demo3;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类：切入点 + 通知
 * @author Administrator
 */
public class MyAspectXml {
	
	/**
	 * 通知（具体的增强）
	 */
	public void log(){
		System.out.println("记录日志...");
	}
	
	/**
	 * 最终通知：方法执行成功或者出现异常，都会执行
	 */
	public void after(){
		System.out.println("最终通知...");
	}
	
	/**
	 * 方法执行之后，执行后置通知。程序出现了异常，后置通知不会执行的。
	 */
	public void afterReturn(){
		System.out.println("后置通知...");
	}
	
	/**
	 * 环绕通知：方法执行之前和方法执行之后进行通知，默认的情况下，目标对象的方法不能执行的。需要手动让目标对象的方法执行
	 */
	public void around(ProceedingJoinPoint joinPoint){
		System.out.println("环绕通知1...");
		try {
			// 手动让目标对象的方法去执行
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕通知2...");
	}

}










