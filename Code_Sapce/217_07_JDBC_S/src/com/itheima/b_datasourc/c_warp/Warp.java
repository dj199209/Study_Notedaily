package com.itheima.b_datasourc.c_warp;

public class Warp implements Car {
	private Car car;

	public Warp (Car car) {
		this.car=car;
	}
	@Override
	public void run() {
		System.out.println("加上电池");
		System.out.println("百秒破百");
	}

	@Override
	public void stop() {
		car.stop();
	}

}
