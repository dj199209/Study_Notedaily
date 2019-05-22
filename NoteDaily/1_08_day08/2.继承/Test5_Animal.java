class Test5_Animal {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setColor("red");
		c.setLeg(4);
		c.eat();
		c.catchMouse();
		Dog d = new Dog("heise",4);
		d.eat();
		d.lookHome();
	}
}
class Animal {
	private String color;
	private int leg;
	public Animal() {}
	public Animal(String color, int leg) {
		this.color = color;
		this.leg = leg;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getLeg() {
		return leg;
	}
	public void eat() {
		System.out.println("≥‘∑π");
	}
}
class Cat extends Animal {
	public Cat() {}
	public Cat(String color,int leg) {
		super(color,leg);
	}
	public void eat() {
		System.out.println(this.getColor()+"√®≥‘”„");
	}
	public void catchMouse() {
		System.out.println("◊•¿œ Û");
	}
	
}
class Dog extends Animal {
	public Dog() {}
	public Dog(String color,int leg) {
		super(color,leg);
	}
	public void  eat() {
		System.out.println("π∑≥‘»‚");
	}
	public void lookHome() {
		System.out.println(this.getColor()+"ø¥º“");
	}
	
}