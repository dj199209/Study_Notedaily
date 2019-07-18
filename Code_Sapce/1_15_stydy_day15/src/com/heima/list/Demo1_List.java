package com.heima.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.set(1, "z");
		System.out.println(list);
		
		
		
	}

	public static void demo4() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void demo3() {
		List list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		list.remove(111);
		System.out.println(list);
	}

	public static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Object obj = list.remove(1);
		System.out.println(obj);
		System.out.println(list);
	}

	public static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(3,"f");
		System.out.println(list);
	}

}
