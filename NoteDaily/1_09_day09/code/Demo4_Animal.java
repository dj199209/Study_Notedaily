class Demo4_Animal {
	public static void main(String[] args) {
		//Cat c1 = new Cat();
			//c1.eat();
			method(new Cat());
			method(new Dog());  //Cat c = new Dog();狗是一只猫是错误的
			
	}
	/*public static void method(Cat c) {
		c.eat();
	}
	public static void method(Dog d) {
		d.eat();
	}*/
	//关键字:instanseof 判断前边的应用是否是后边的数据类型
	public static void method(Animal a) {
		if (a instanseof Cat) {
		Cat c = (Cat)a;//强转
		c.eat();
		c.catchMouse();
		} else if (a instanseof Dog) {
			Dog d = (Dog)a;
			d.eat();
			d.lookHome();
		} else {
			a.eat();
		}
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
	public void catchMouse() {
		 System.out.println("猫抓老鼠");
	}
}
class Dog extends Animal {
	public void eat() {
		 System.out.println("狗吃肉");
	}
	public void lookHome() {
		 System.out.println("看家");
	}
}