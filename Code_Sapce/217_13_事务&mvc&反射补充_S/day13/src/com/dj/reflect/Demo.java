package com.dj.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.dj.domain.Person;

public class Demo {
	@Test
	public void f1() throws ClassNotFoundException, Exception {
		Class clazz =    Class.forName("com.dj.domain.Person" );
		//获取构造器
//		Constructor con = clazz.getConstructor();
		Constructor con = clazz.getConstructor(String.class,String.class);
//		Person p = (Person) con.newInstance( );
		Person p = (Person) con.newInstance( "tom","123");
		
	}
}
