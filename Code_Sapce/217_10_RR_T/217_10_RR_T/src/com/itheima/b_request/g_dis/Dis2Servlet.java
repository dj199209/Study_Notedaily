package com.itheima.b_request.g_dis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 侯老师
 */
public class Dis2Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("侯老师曰:需要多少? 我答:"+request.getParameter("money"));
		System.out.println("侯老师又曰:干嘛用啊? 我答:借给"+request.getAttribute("username"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
