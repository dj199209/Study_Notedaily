class Demo2_Car {
	public static void main(String[] args) {
		new Car().color = "red";
		new Car().num = 4;
		new Car().run();
	}
}
class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color +"..."+num);
	}
	
	
}