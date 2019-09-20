package com.dj.a_cookie.b_rem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 记录上一次访问时间
 */
public class RemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//0.设置编码
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		
	//1.1.获取指定的cookie
		Cookie c = getCookieByName("lasttime",request.getCookies());
		
//		2.判断cookie是否为空
		if (c==null) {
			//cookie为空,提示提一次访问
			writer.print("您是第一次访问");
		} else {
			String value = c.getValue();
			long time = Long.parseLong(value);
			Date date = new Date(time);
			writer.print("您上次访问时间为:"+date.toLocaleString());
		}
//		3.将当前访问时间记录
//		3.1创建cookie
		c= new Cookie("lasttime", new Date().getTime()+"");
		//3.2回写浏览器
		response.addCookie(c);
	}

	private Cookie getCookieByName(String name, Cookie[] cookies) {
		if (cookies!=null) {
			//通过名称获取

			for (Cookie c : cookies) {
				if (name.equals(c.getName())) {
					return c;
				}
			}
			
		}
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
