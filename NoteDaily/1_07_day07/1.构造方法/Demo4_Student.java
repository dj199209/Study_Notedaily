class Demo4_Student {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(25);
		System.out.println("�ҵ�������"+s1.getName()+",�ҵ�������"+s1.getAge());
		Student s2 = new Student("����",24);
		s2.show();
		
	}
}
class Student {
	private String name;
	private int age;
	public Student() {
		
	}
	public Student(String name,int age) {
		this.name =name;
		this.age = age;
	}
	public void setName(String name) {
		this.name =name;
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
	public void show() {
		System.out.println("�ҵ�������" + name +",�ҵ�������:"+ age);
	}
}