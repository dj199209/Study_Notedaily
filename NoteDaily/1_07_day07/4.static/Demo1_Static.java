class Demo1_Static {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "苍老师";
		p1.country = "日本";
		Person p2 = new Person();
		p2.name = "小泽老师";
		p2.country = "日本";
		p1.speak();
		p2.speak();
		Person.country = "日本";//静态多了一种调用方式,可以通过类名.
		System.out.println(Person.country);
	} 
}
class Person {
	String name;
	static String country;
	public void speak() {
		System.out.println(name + "----"+country);
	}
}