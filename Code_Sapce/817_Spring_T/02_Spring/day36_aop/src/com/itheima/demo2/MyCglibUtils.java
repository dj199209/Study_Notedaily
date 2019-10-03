package com.itheima.demo2;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyCglibUtils {

	/**
	 * 使用CGLIB方式生成代理的对象
	 * 
	 * @return
	 */
	public static BookDaoImpl getProxy() {
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(BookDaoImpl.class);
		// 设置回调函数
		enhancer.setCallback(new MethodInterceptor() {
			// 代理对象的方法执行，回调函数就会执行
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				if(method.getName().equals("save")){
					System.out.println("记录日志...");
				}
				// 正常执行
				return methodProxy.invokeSuper(obj, args);
			}
		});
		// 生成代理对象
		BookDaoImpl proxy = (BookDaoImpl) enhancer.create();
		return proxy;
	}

}
