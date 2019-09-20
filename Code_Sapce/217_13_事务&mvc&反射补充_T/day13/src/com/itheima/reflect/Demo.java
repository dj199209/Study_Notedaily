package com.itheima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

import com.itheima.domain.Person;

public class Demo {
	@Test
	public void f1() throws Exception{
		//1.获取class对象
		Class clazz=Class.forName("com.itheima.domain.Person");
		
		//2.获取构造器(了解)
		//Constructor con = clazz.getConstructor();
		//Person p = (Person) con.newInstance();
		
		//2.1获取带参的构造器(了解)
		Constructor con = clazz.getConstructor(String.class,String.class);
		Person p = (Person) con.newInstance("tom","123");//相当于  new Person("tom","123")
		
		System.out.println(p.getPassword());
	}
	
	@Test
	public void f2() throws Exception{
		//1.获取class对象
		Class clazz=Class.forName("com.itheima.domain.Person");
		
		//2.获取构造器(了解)
		Person p = (Person) clazz.newInstance();
	}
	
	@Test
	//获取私有方法
	public void f3() throws Exception{
		//1.获取class对象
		Class clazz=Class.forName("com.itheima.domain.Person");
		
		Person p = (Person) clazz.newInstance();
		//2.获取方法
		//Method m = clazz.getMethod("sleep");//获取公共的方法
		Method m = clazz.getDeclaredMethod("sleep");//获取任意的方法
		
		//2.1若是私有的方法 必须让该方法可以访问
		m.setAccessible(true);
		
		//执行方法
		m.invoke(p);
	}
	
	@Test
	public void f11() throws Exception{
		//1.获取class对象
		Class clazz=Class.forName("com.itheima.domain.Person");
		
		//2.获取私有的方法
		Method m = clazz.getDeclaredMethod("sleep", String.class);
		//让方法可以访问
		m.setAccessible(true);
		
		//3.让方法执行
		String res=(String) m.invoke(clazz.newInstance(),"侯振");
		
		System.out.println(res);
	}
	
}
