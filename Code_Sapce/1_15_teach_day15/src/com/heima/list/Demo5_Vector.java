package com.heima.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo5_Vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		
		Enumeration en = v.elements();					//��ȡö��
		while(en.hasMoreElements()) {					//�жϼ������Ƿ���Ԫ��
			System.out.println(en.nextElement());		//��ȡ�����е�Ԫ��
		}
	}

}
