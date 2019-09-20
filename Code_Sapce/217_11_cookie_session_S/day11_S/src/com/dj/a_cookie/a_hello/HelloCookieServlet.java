package com.dj.a_cookie.a_hello;

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
		PrintWriter writer = response.getWriter();
		//创建一个cookie
		Cookie a = new Cookie("akey1","avalue");
		Cookie b = new Cookie("bkey1","avalue");
		Cookie c = new Cookie("ckey1","avalue");
		Cookie d = new Cookie("dkey1","avalue");
		//写回浏览
		response.addCookie(a);
		response.addCookie(b);
		response.addCookie(c);
		response.addCookie(d);
		//提示信息
		writer.print("cookie已经写回浏览器");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
