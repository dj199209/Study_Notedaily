package com.itheima.b_request.e_header;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 操作请求头
 */
public class HeaderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取浏览器内核
		String agent = request.getHeader("user-agent");
		System.out.println(agent);
		
		//获取referer
		String referer = request.getHeader("referer");
		if(referer==null){
			System.out.println("直接在地址栏上输入的");
		}else if(referer.contains("localhost")){
			System.out.println("我自己点的..");
		}else if(referer.contains("192.168.")){
			System.out.println("哥们儿姐们儿点的");
		}else{
			System.out.println("盗链者可耻");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
