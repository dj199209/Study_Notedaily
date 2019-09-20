package com.itheima.a_cookie.a_hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloCookieServlet
 */
public class HelloCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		PrintWriter w = response.getWriter();
		
		//创建一个cookie
		Cookie a=new Cookie("akey", "avalue");
		Cookie b=new Cookie("bkey", "bvalue");
		Cookie c=new Cookie("ckey", "cvalue");
		
		//写回浏览器
		response.addCookie(a);
		response.addCookie(b);
		response.addCookie(c);
		
		//提示信息
		w.print("cookie 已写回");;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
