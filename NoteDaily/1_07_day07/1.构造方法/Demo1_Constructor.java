class Demo1_Constructor {
	public static void main(String[] args) {
		Person p = new Person();
		p.show();
		//p.Person();//���췽�������ö������
		Person p1 = new Person();
		p1.show();
		
	}
}
class Person {
	private String name;
	private int age;
	public Person() {
		name = " ����";
		age = 23;
	}
	public void show() {
		System.out.println(name + "----"+ age);
	}
}