package com.dj.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 添加到购物车
 */
public class Add2CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.设置编码
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		//1.获取商品名称
		String name = request.getParameter("name");
		name =new String(name.getBytes("iso8859-1"),"utf-8");
		//2.将商品添加到购物车
		//2.1从session获取购物车
		Map<String, Integer> map = (Map<String, Integer>) request.getSession().getAttribute("cart");
		//2.2判断购物车是否为空
		 Integer count =null;
		if (map==null) {
			map = new HashMap<>();
			//将购物车放入session中
			request.getSession().setAttribute("cart", map);
		} else {
			//购物车不为空,继续判断购物车是否有该商品
			count=map.get(name);
			if (count
					==null) {
				count=1;
			} else {
				count++;  
			}
		}
		//将商品放入购物车 
		map.put(name, count);
		//3.提示信息
		writer.print("已經將<b>"+name+"</b>添加到购物车中<hr>");
		writer.print("<a href='"+request.getContextPath()+"/product_list.jsp'>继续购物</a>&nbsp;&nbsp;&nbsp;&nbsp;");
		writer.print("<a href='"+request.getContextPath()+"/cart.jsp'>查看购物</a>&nbsp;&nbsp;&nbsp;&nbsp;");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
