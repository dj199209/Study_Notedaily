package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.heima.bean.Student;

public class Demo2_List {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("����", 23));
		list.add(new Student("����", 24));
		list.add(new Student("����", 25));
		list.add(new Student("����", 26));
		for( int i= 0 ;i<list.size();i++) {
			Student s = (Student)list.get(i);
			System.out.println(s.getName()+ "===="+s.getAge());
		}
	}

}
