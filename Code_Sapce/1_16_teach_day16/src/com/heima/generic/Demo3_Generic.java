package com.heima.generic;

import com.heima.bean.Student;
import com.heima.bean.Tool;
import com.heima.bean.Worker;

public class Demo3_Generic {

	/**
	 * A:������ʾ
	 * ���͵�����:ͨ��Objectת����������
	 * ���ڵ�Object���Ϳ��Խ�������Ķ������ͣ�������ʵ�ʵ�ʹ���У���������ת�������⡣Ҳ�ʹ���������������Java�ṩ�˷�������������ȫ���⡣
	 */
	public static void main(String[] args) {
		//demo1();
		Tool<String> t = new Tool<>();
		//t.show("abc");
		t.show(true);
	}

	public static void demo1() {
		Tool<Student> t = new Tool<>();					//�������������
		t.setObj(new Student("����",23));
		
		//Worker w = (Worker) t.getObj();			//����ת��
		//System.out.println(w);
	}

}
