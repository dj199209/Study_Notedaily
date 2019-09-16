package com.itheima.b_request.g_dis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dis
 */
public class Dis1Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我说:稍等");
		
		//将借钱人的姓名放入reuqest中
		request.setAttribute("username", "++");
		
		//请求转发
		request.getRequestDispatcher("/dis2").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
