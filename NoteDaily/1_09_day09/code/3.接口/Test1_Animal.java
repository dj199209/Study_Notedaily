class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("111",8);
		c.eat();
		c.sleep();
		JumpCat jc = new JumpCat("hh",3);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}
abstract class Animal {
	private String name;
	private int age;
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public abstract void eat();
	public abstract void sleep();
}
interface Jumping {
	public void jump();
}
class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("Ã¨³ÔÓã");
	}
	public void sleep() {
		System.out.println("²à×ÅË¯");
	}
}class JumpCat extends Cat implements Jumping {
	public JumpCat() {}
	public JumpCat(String name, int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("Ã¨µ÷¸ß");
	}
}