package com.heima.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_Lsit {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("e");
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			String str = (String)lit.next();
			if("world".equals(str)) {
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

}
