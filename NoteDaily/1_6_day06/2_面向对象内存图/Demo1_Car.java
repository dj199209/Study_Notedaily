class Demo1_Car {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "red";
		c1.num = 8;
		c1.run();
		
		Car c2= new Car();
		c2.color = "black";
		c2.num = 4;
		c2.run();
		Car c3 = c2;
		c3.run();
		
	}
}
class Car {
	String color;//车身的颜色
	int num; //轮胎的个数
	public void run() {
		System.out.println(color + "...."+num);
	}
}