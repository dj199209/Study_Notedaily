class Demo2_Person {
	public static void main(String[] args) {
		Person p1 =new Person();
		p1.show();
		System.out .println("-----------------");
		Person p2 = new Person("����",23);
		p2.show();
		System.out.println("------------------");
		Person p3 = new Person("����",24);
		p3.show();
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		System.out.println("�ղι���");
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вι���");
	}
	public void show() {
		System.out .println(name + "----"+ age);
	}
}
