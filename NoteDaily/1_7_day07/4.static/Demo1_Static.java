class Demo1_Static {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "����ʦ";
		p1.country = "�ձ�";
		Person p2 = new Person();
		p2.name = "С����ʦ";
		p2.country = "�ձ�";
		p1.speak();
		p2.speak();
		Person.country = "�ձ�";//��̬����һ�ֵ��÷�ʽ,����ͨ������.
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