class Demo1_Student {
	public static void main(String[] args) {
		print(10);
		Student s = new Student();
		print(s);
	}
	public static void print(int x){
		System.out.println(x);   //�����������͵�����ʽ����
	}
	public static void print(Student stu) {   //�����������͵�����ʽ����
		stu.name = "����";
		stu.age = 23;
		stu.speak();
	}
}
class Student {
	String name;
	int age;
	public void speak() {
		System.out.println(name + "..."+age);
	}
	
}