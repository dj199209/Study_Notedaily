package com.dj.a_response.b_boby;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 操作响应体
 */
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置对象的中文编码
		response.setContentType("text/html;charset=utf-8");
		//打印表格
		
		//获取流
		PrintWriter w = response.getWriter();
		w.print("<table border='1'><tr>");
		w.print("<td >用户名</td>");
		w.print("<td>tom</td></tr>");
		w.print("<td>密码名</td>");
		w.print("<td >123</td>");
		w.print("</tr></table>");
		
		//ServletOutputStream os = response.getOutputStream();两个流互斥
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
