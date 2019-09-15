package com.dj.b_request;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收参数
		String value = req.getParameter("username");
		System.out.println(value);
		//回写数据
		resp.setContentType("text/html;charset=utf-8");//建议放在第一行
		resp.getWriter().print("date:"+value);
		resp.getWriter().print("数据:"+value);
	}
}
