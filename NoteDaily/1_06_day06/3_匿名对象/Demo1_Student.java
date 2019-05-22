class Demo1_Student {
	public static void main(String[] args) {
		print(10);
		Student s = new Student();
		print(s);
	}
	public static void print(int x){
		System.out.println(x);   //基本数据类型当做形式参数
	}
	public static void print(Student stu) {   //引用数据类型当做形式参数
		stu.name = "张三";
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