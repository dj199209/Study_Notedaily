package com.dj.b_requset.f.param;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取请求仓鼠
 */
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//获取username
		String username = request.getParameter("username");
		System.out.println("username"+username);
	//获取爱好
		String[] hobby = request.getParameterValues("hobby");
		System.out.println("hobby"+Arrays.toString(hobby));
		
	//获取所有
		System.out.println("===============");
		Map<String, String[]> map = request.getParameterMap();
		Set<String> keySet1 = map.keySet();
		System.out.println("打出来看看"+keySet1);
		for (String key : map.keySet()) {
			System.out.println(key);
			System.out.println(key+"::"+Arrays.toString(map.get(key)));
			
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
