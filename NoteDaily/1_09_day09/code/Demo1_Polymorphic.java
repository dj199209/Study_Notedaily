class Demo1_Polymorphic {
	public static void main(String[] args) {
		Cat c = new Cat();	//猫是一只猫
		c.eat();
		Animal a = new Cat(); //猫是一只动物//父类引用指向子类对象
		a.eat();
	}
}
class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}