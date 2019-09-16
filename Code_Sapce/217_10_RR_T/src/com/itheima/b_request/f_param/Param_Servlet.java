package com.itheima.b_request.f_param;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
	获取请求参数
 */
public class Param_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		
		//获取用户名和密码:
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//username=new String(username.getBytes("iso8859-1"),"utf-8");
		
		
		System.out.println(username+"::"+password);
	}

}
