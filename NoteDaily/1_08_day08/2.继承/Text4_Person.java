class Text4_Person {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����");
		s.setAge(23);
		s.eat();
		s.stduy();
		Teacher t = new Teacher();
		t.setName("����");
		t.setAge(24);		
		t.eat();
		t.teach();
	}
}
class Person {
	private String name;
	private int age;
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void eat() {
		System.out.println(name+"�Է�");
	}
}
class Student extends Person {
	public Student() {}
	public Student(String name, int age) {
		super(name,age);
	}
	public void stduy() {
		System.out.println(this.getName()+"ѧ��ѧϰ");
	}
	
}
class Teacher extends Person {
	public Teacher() {}
	public Teacher(String name,int age) {
		super(name,age);
	}
	public void teach() {
		System.out.println(this.getName()+"��ʦ����");
	}
}