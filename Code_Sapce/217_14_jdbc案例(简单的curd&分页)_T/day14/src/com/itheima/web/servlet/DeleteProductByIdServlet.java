package com.itheima.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.ProductService;

/**
 * 通过商品id删除商品
 */
public class DeleteProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取商品id
		String pid=request.getParameter("pid");
		
		//2.调用servcie完成删除操作
		try {
			new ProductService().deleteProductById(pid);
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msg", "商品删除失败");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
			return;
		}
		
		//3.重定向 FindAllServlet
		response.sendRedirect(request.getContextPath()+"/findAll");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
