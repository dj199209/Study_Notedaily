package com.dj.b_request_row;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RowServlet
 */
public class RowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求方式
		String m = request.getMethod();
		System.out.println("方法:"+m);
		//请求的资源
		String uri = request.getRequestURI();
		String url = request.getRequestURI().toString();
		System.out.println("uri"+uri);
		System.out.println("url"+url);
		//获取的参数的字符串
		String s = request.getQueryString();
		System.out.println("get的请求参数"+s);
		//获取请求的版本协议
		String protocol = request.getProtocol();
		System.out.println("协议版本"+protocol);
		
		System.out.println("--------重要**--------");
		//获取请求的ip
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		//获取项目名称
	String path = request.getContextPath();
	System.out.println("项目路径"+path);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
