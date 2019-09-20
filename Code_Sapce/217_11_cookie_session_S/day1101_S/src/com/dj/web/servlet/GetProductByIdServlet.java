package com.dj.web.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dj.web.utils.CookieUtils;

/**
 * Servlet implementation class GetProductByIdServlet
 */
public class GetProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.设置编码
		//0.1获取当前访问的商品id
		String id = request.getParameter("id");
		//1.获取指定的cookie ids
		Cookie c = CookieUtils.getCookieByName("ids", request.getCookies());
		System.out.println(c);
		//2.判断cookie是否为空 
		String ids = "";
		if (c==null) {
			//	若为空需要帮当前商品放入ids中
			ids=id;
			
		} else {
			//若cookie不为空,判断
			 ids = c.getValue();
			 String[] arr = ids.split("-");
			 List<String> asList = Arrays.asList(arr);
			 LinkedList<String> list = new LinkedList<>(asList);
			 if (list.contains(id)) {
				//若ids中包含id 将id移除放在最前
				 list.remove(id);
				 list.addFirst(id);
				 
			} else {
				//若ids中包含id 继续判读是都大于2
				if (list.size()>2) {
					//长度>=3
//					移除最后一个将添加的放在最前
					list.removeLast();
					list.addFirst(id);
					
				} else {
					list.addFirst(id);
				}
			}
			 ids="";
				//将list转为字符串
				for (String s : list) {
					ids+=(s+"-");
				}
				ids= ids.substring(0, ids.length()-1);
				System.out.println(ids);
		}
		//将ids写回去
		c= new Cookie("ids", ids);
		//设置访问路径
		c.setPath(request.getContextPath()+"/");
		//设置存活时间
		c.setMaxAge(3600);
		//写回浏览器 
		response.addCookie(c);
		//若不为空
		//3.跳转到指定的商品也页面上
		response.sendRedirect(request.getContextPath()+"/product_info"+id+".html");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
