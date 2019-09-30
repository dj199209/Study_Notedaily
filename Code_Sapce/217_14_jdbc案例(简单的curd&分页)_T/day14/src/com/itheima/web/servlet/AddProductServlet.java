package com.itheima.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.SliderUI;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import com.itheima.utils.UUIDUtils;

/**
 * 添加商品
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.设置编码
		request.setCharacterEncoding("utf-8");
		
		
		//扩展 令牌机制
		//0.1 获取session中令牌和提交过来的令牌
		String r_lingpai = request.getParameter("r_lingpai");
		String s_lingpai = (String) request.getSession().getAttribute("s_lingpai");
		
		//0.2 移除session中的令牌
		request.getSession().removeAttribute("s_lingpai");
		
		//0.3 比较两个令牌
		if(s_lingpai==null || !s_lingpai.equals(r_lingpai)){
			//已经提交过了 生成错误提示信息 放入request域中, 到msg.jsp
			request.setAttribute("msg", "商品已经保存!");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
			return;
		}
		
		//1.封装数据
		Product p=new Product();
		try {
			BeanUtils.populate(p, request.getParameterMap());
			
			//1.1设置pid
			p.setPid(UUIDUtils.getId());
			
			//1.2设置时间
			p.setPdate(new Date());
			
			//2.调用service完成添加操作
			new ProductService().addProuct(p);
			
			//3.页面跳转 findAll
			//先用请求转发
			request.getRequestDispatcher("/findAll").forward(request, response);
			
		}  catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "添加商品失败");
			request.getRequestDispatcher("/msg.jsp").forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
