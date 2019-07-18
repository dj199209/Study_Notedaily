package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.heima.bean.Student;

public class demo5_Iterator {

	public static void main(String[] args) {
//		demo1();
		Collection c = new ArrayList();
		c.add(new Student("����", 23));
		c.add(new Student("����", 24));
		c.add(new Student("����", 25));
		c.add(new Student("����", 26));
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s.getName()+"===="+s.getAge());
		}
		
	}

	public static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		//�Լ����е�Ԫ�ص���(����)
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
