class Demo1_Extends {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.color = "red";
		c.leg =4;
		c.eat();
		c.sleep();
		System.out.println(c.leg + "----"+c.color);
	}
}
class Animal {
	String color;
	int leg;
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
}
}
class Cat extends Animal {
	
}
class Dog extends Animal {}