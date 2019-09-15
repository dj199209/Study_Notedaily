package com.dj.life;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeSelvect implements Servlet {
	/**
	 * 初始化化方法
	 * 执行者谁执行的:服务器
	 * 执行次数:一次
	 * 执行时机:默认第一次访问的时候
	 */ 
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("555555555555555");
	}
	/**
	 * 服务方法
	 * 执行者谁执行的:服务器
	 * 执行次数:请求一次执行一次
	 * 执行时机:请求来的时候
	 */ 
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("6666666666");

	}
	/**
	 * 服务方法
	 * 执行者谁执行的:服务器
	 * 执行次数:执行一次
	 * 执行时机:当servlet被移除的时候或者服务器正常关闭的时候
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("44444444444");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}





}
