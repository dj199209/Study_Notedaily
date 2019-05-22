class Demo3_Car {
	public static void main(String[] args) {
		method(new Car());//Car c2 = new Car();//method(new Car());
	}
	public static void method(Car cc){
		cc.color = "red";
		cc.num = 8;
		cc.run();
	}
}
class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color +"...."+num);
	}
}