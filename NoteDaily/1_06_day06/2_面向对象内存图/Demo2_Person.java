class Demo2_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
class Person {
	String name;
	int num;// 成员变量
	public void speak() {
		int num = 10;//局部变量
		System.out.println(name);
		System.out.println(num);
	}
}