class Demo1_Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
		s.age = 23;
		System.out.println(s.name + "..."+s.age);
		s.study();
		s.sleep();
	}
}
class Student {
	String name;
	int age;
	String gender;
	public void study() {		//定义学习的方法
		System.out.println("学生学习");
	}
	public void sleep() {		//定义睡觉的方法
		System.out.println("学生睡觉");
	}
}
