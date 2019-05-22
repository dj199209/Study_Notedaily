class Demo1_Constructor {
	public static void main(String[] args) {
		Person p = new Person();
		p.show();
		//p.Person();//构造方法不能用对象调用
		Person p1 = new Person();
		p1.show();
		
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		name = " 张三";
		age = 23;
	}
	public void show() {
		System.out.println(name + "----"+ age);
	}
}