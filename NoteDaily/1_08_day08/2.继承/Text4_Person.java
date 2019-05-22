class Text4_Person {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("张三");
		s.setAge(23);
		s.eat();
		s.stduy();
		Teacher t = new Teacher();
		t.setName("李四");
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
		System.out.println(name+"吃饭");
	}
}
class Student extends Person {
	public Student() {}
	public Student(String name, int age) {
		super(name,age);
	}
	public void stduy() {
		System.out.println(this.getName()+"学生学习");
	}
	
}
class Teacher extends Person {
	public Teacher() {}
	public Teacher(String name,int age) {
		super(name,age);
	}
	public void teach() {
		System.out.println(this.getName()+"老师讲课");
	}
}