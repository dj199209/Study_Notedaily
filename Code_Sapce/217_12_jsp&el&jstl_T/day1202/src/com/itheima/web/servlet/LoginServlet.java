package com.itheima.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.service.UserService;

/**
 * 登录
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.设置编码
		request.setCharacterEncoding("utf-8");
		
		//1.接受两个验证码
		String rCode=request.getParameter("checkCode");
		String sCode=(String) request.getSession().getAttribute("sessionCode");
		
		//一次性验证码 用完之后从session中移除
		request.getSession().removeAttribute("sessionCode");
		
		//判断两个验证码是否一致.
		if(rCode==null || rCode.trim().length()==0||sCode==null){
			//验证码有问题 提示信息 页面跳转到login.jsp
			request.setAttribute("msg", "请重新输入验证码");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		if(!rCode.equalsIgnoreCase(sCode)){
			//验证码输入不一致 提示信息 页面跳转到login.jsp
			request.setAttribute("msg", "验证码输入错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		
		//2.接受用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//3.调用userservice getUserByUsernameAndPwd()  返回值 user
		User user=null;
		try {
			user = new UserService().getUserByUsernameAndPwd(username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//4.判断user
		if(user==null){
			//4.1若user为空 提示信息,请求转发到login.jsp
			request.setAttribute("msg", "用户名和密码不匹配");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
			
		}else{
			//4.2若user 不为空 判断是否勾选了记住用户名 将user放入session
			if("ok".equals(request.getParameter("savename"))){
				//创建cookie username不能是中文
				Cookie  c= new Cookie("saveName", username);
				c.setPath(request.getContextPath()+"/");
				c.setMaxAge(3600);
				
				//写回浏览器
				response.addCookie(c);
			}
			
			request.getSession().setAttribute("user", user);
			
		}
		
		
		//5.页面重定向 index.jsp
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
