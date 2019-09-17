package com.dj.b_requset.e_header;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 操作请头
 */
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取浏览器内核
		String agent = request.getHeader("user-agent");
		System.out.println(agent);
		
		//获取
		String referer = request.getHeader("referer");
		if (referer==null) {
			System.out.println("直接在地址栏输入");
		} else if(referer.contains("localhost")){
			System.out.println("我自己点的..");
		} else if(referer.contains("192.168.")){
			System.out.println("别人点的");
		}
		else {
			System.out.println("盗连接可耻");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
