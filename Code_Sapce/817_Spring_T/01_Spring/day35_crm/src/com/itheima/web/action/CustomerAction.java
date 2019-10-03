package com.itheima.web.action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.itheima.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 客户的Action
 * @author Administrator
 */
public class CustomerAction extends ActionSupport{
	
	private static final long serialVersionUID = 113695314694166436L;
	
	/**
	 * 保存客户
	 * @return
	 */
	public String save(){
		System.out.println("WEB层：保存客户...");
		// 使用工厂
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService cs = (CustomerService) ac.getBean("customerService");
		cs.save();*/
		
		ServletContext servletContext = ServletActionContext.getServletContext();
		// 需要使用WEB的工厂的方式
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		CustomerService cs = (CustomerService) context.getBean("customerService");
		cs.save();
		
		return NONE;
	}
}



























