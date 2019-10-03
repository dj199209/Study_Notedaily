package com.itheima.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK的方式生成代理对象
 * 
 * @author Administrator
 */
public class MyProxyUtils {

	public static UserDao getProxy(final UserDao dao) {
		// 使用Proxy类生成代理对象
		UserDao proxy = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(),
				dao.getClass().getInterfaces(), new InvocationHandler() {
					
					// 代理对象方法一直线，invoke方法就会执行一次
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						if("save".equals(method.getName())){
							System.out.println("记录日志...");
							// 开启事务
						}
						// 提交事务
						// 让dao类的save或者update方法正常的执行下去
						return method.invoke(dao, args);
					}
				});
		
		// 返回代理对象
		return proxy;
	}
}
