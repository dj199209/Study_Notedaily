class Demo4_Animal {
	public static void main(String[] args) {
		//Cat c1 = new Cat();
			//c1.eat();
			method(new Cat());
			method(new Dog());  //Cat c = new Dog();����һֻè�Ǵ����
			
	}
	/*public static void method(Cat c) {
		c.eat();
	}
	public static void method(Dog d) {
		d.eat();
	}*/
	//�ؼ���:instanseof �ж�ǰ�ߵ�Ӧ���Ƿ��Ǻ�ߵ���������
	public static void method(Animal a) {
		if (a instanseof Cat) {
		Cat c = (Cat)a;//ǿת
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
		 System.out.println("����Է�");
	}
}
class Cat extends Animal {
	public void eat() {
		 System.out.println("è����");
	}
	public void catchMouse() {
		 System.out.println("èץ����");
	}
}
class Dog extends Animal {
	public void eat() {
		 System.out.println("������");
	}
	public void lookHome() {
		 System.out.println("����");
	}
}