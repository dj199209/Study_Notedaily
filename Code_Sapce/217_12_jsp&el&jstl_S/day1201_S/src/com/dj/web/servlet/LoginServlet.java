package com.dj.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dj.domain.User;
import com.dj.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.设置编码
		request.setCharacterEncoding("utf-8");
		//1.接收两个验证码
		String rCode = request.getParameter("checkCode");
		String sCode = (String) request.getSession().getAttribute("sessionCode");
		//一次性验证码,用完从session中移除
		request.getSession().removeAttribute("sessionCode");
		
		//判断2个验证码是否一致
		if (rCode==null||rCode.trim().length()==0||sCode==null) {
			request.setAttribute("msg", "请重新输入验证码");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		if (!rCode.equalsIgnoreCase(sCode)) {
			//验证码输入不一致
			request.setAttribute("msg", "验证码输入错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		//2.接收用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+password);
		//3.调用userservice getUserByUsernameAndPwd() 返回值user
		User user=null;
		try {
			user = new UserService().getUserByUsernameAndPwd(username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4.判断user
		 if (user==null) {
			 //4.1若user为空
				request.setAttribute("msg", "用不名密码不匹配哦");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
		} else {
			//4.2若user不为空判断是否勾选了记住用户名将user放入session中
			if ("ok".equals(request.getParameter("savename"))) {
				//创建cookieusername不能是中文
				Cookie c = new Cookie("savename", username);
				c.setPath(request.getContextPath()+"/");
				//写回浏览器
				response.addCookie(c);
			}
			request.getSession().setAttribute("user", user);
		}
		
		
		//5.页面重定向index.jsp
		 response.sendRedirect(request.getContextPath()+"/index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
