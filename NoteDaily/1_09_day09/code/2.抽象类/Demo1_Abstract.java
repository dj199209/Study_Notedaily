class Demo1_Abstract {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
	}
}
abstract class Animal {		//������
	public abstract void eat(); //���󷽷�
}
class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}