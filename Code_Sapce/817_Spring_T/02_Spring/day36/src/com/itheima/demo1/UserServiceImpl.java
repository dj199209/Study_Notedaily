package com.itheima.demo1;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 组件注解，标记类
 * <bean id="userService" class="com.itheima.demo1.UserServiceImpl"> == @Component(value="userService")
 * @author Administrator
 */
@Component(value="userService")
// @Scope(value="prototype")
public class UserServiceImpl implements UserService {
	
	// 给name属性注入美美的字符串，setName方法还可以省略不写
	@Value(value="美美")
	private String name;
	/*public void setName(String name) {
		this.name = name;
	}*/
	
	// @Autowired 按类型自动装配
	// @Autowired
	// @Qualifier(value="userDao")		// 按名称注入
	
	// 是Java的注解，Spring框架支持该注解
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void sayHell() {
		System.out.println("hello Spring!!"+name);
		userDao.save();
	}
	
	@PostConstruct
	public void init(){
		System.out.println("初始化...");
	}
	
}















