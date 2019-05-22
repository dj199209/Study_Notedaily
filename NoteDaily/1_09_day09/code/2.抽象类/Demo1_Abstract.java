class Demo1_Abstract {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
	}
}
abstract class Animal {		//抽象类
	public abstract void eat(); //抽象方法
}
class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}