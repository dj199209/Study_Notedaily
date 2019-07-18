package com.heima.otherclass;

public class Demo1_Math {

	public static void main(String[] args) {
		//π
		System.out.println(Math.PI);
		//绝对值
		System.out.println(Math.abs(-100));
		//ceil天花板
		System.out.println("天花板ceil"+Math.ceil(12.3));
		System.out.println("天花板ceil"+Math.ceil(12.8));
		System.out.println("------------------");
		//floor地板(向下取整)
		System.out.println(Math.floor(12.3));
		System.out.println(Math.floor(12.99));
		//获取两个值得最大值
		System.out.println(Math.max(13,12));
		//求某个数字的的几次方
		System.out.println(Math.pow(2, 4));
		//随机数random
		System.out.println(Math.random());
		//四舍五入
		System.out.println(Math.round(12.3f));
		System.out.println(Math.round(12.8f));
		//开平方(开根号)
		System.out.println(Math.sqrt(4));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
	}

}
