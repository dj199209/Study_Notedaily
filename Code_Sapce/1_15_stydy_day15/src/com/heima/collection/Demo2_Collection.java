package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.heima.bean.Student;

public class Demo2_Collection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("b");
		c.add("d");
		System.out.println(c.size());
		System.out.println(c);
		demo1();
		
	}

	public static void demo1() {
		Collection c1 = new ArrayList();
		boolean b1 = c1.add("abc");
		boolean b2 = c1.add(true);
		boolean b3 = c1.add(100);
		boolean b4 = c1.add(new Student("ÕÅÈý", 23));
		boolean b5 = c1.add("abc");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(c1);
	}

}
