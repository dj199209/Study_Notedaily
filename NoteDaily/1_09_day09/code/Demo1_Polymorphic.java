class Demo1_Polymorphic {
	public static void main(String[] args) {
		Cat c = new Cat();	//è��һֻè
		c.eat();
		Animal a = new Cat(); //è��һֻ����//��������ָ���������
		a.eat();
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
}