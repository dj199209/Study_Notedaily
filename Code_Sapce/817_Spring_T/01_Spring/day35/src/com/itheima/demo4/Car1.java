package com.itheima.demo4;

/**
 * 演示的构造方法的注入的方式
 * @author Administrator
 */
public class Car1 {
	
	private String cname;
	private Double price;
	
	public Car1(String cname, Double price) {
		this.cname = cname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car1 [cname=" + cname + ", price=" + price + "]";
	}
	
}
