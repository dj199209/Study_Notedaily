package com.itheima.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.domain.User;
import com.itheima.service.UserService;

/**
 * 用户注册
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		0设置编码
		request.setCharacterEncoding("utf-8");
//		1.封装数据
		//创建一个user.setxx方法一个一个封装(不推荐)
		//使用beanutils
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
//		2.调用 userservice.regist 返回值int
			int i=new UserService().regist(user);
			
//		3.判断int将信息请求发送个msgsservlet
			if (i==1) {
				request.setAttribute("msg", "添加成功"); 
				request.getRequestDispatcher("/msg").forward(request, response);
			} else {
				request.setAttribute("msg", "添加失败");
				request.getRequestDispatcher("/msg").forward(request, response);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
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
