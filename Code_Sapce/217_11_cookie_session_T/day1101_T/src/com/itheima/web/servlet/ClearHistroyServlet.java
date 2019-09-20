package com.itheima.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *清空浏览记录
 */
public class ClearHistroyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建一个cookie
		Cookie c=new Cookie("ids", "");
		c.setPath(request.getContextPath()+"/");//   /day1101/
		
		//设置时间
		c.setMaxAge(0);
		
		//写会浏览器
		response.addCookie(c);
		
		//页面跳转
		response.sendRedirect(request.getContextPath()+"/product_list.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
