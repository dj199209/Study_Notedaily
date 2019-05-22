class Demo2_Person {
	public static void main(String[] args) {
		Person p1 =new Person();
		p1.show();
		System.out .println("-----------------");
		Person p2 = new Person("张三",23);
		p2.show();
		System.out.println("------------------");
		Person p3 = new Person("李四",24);
		p3.show();
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		System.out.println("空参构造");
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造");
	}
	public void show() {
		System.out .println(name + "----"+ age);
	}
}
