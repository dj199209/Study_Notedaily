package com.heima.collection;

import com.heima.bean.Student;

public class Demo1_Arrary {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] =new Student("����", 23);
		arr[1] =new Student("����", 24);
		arr[2] =new Student("����", 25);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
