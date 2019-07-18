package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;import com.heima.bean.Student;

public class Demo4_collection {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("e");
		c2.add("f");
		//取交集,如果调用的集合改变就放回true,如果调用的集合不变就放回false
		boolean b = c1.retainAll(c2);//取交集
		System.out.println(b);
		System.out.println(c1);
		
		
		
	}

	public static void demo3() {
		Collection c1  =new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("z");
		boolean b = c1.containsAll(c2);
		System.out.println(b);
	}

	public static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
		boolean b = c1.removeAll(c2);
		System.out.println(b);
		System.out.println(c1);
	}

	public static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c1.addAll(c2);
//		c1.add(c2);
		System.out.println(c1);
	}

	public static void demo() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Object[] arr =c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
