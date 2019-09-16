package com.dj.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dj.domian.User;
import com.dj.service.UserService;

public class loginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//0.设置编码
		resp.setContentType("text/html;charset=utf-8");
		//1.接收用户名密码
		String username =req.getParameter("username");
		String password = req.getParameter("password");
		
		//2.调用userservice 里的login(username,password) 返回值:User user
		User user = null;
		try {
			user = new UserService().login(username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("数据库连接异常");
		}
		//3.判断user是否为空
		if(user==null) {
			//3.1若为空 写"用户名和密码不匹配"
			resp.getWriter().print("密码输入不正确");
		}else {
			//3.2若不为空 写"xxx:欢迎回来"
			resp.getWriter().print(user.getUsername()+"欢迎回来");
		}
		
		
	}
}
