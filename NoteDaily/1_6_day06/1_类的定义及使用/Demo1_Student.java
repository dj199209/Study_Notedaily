class Demo1_Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "����";
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
	public void study() {		//����ѧϰ�ķ���
		System.out.println("ѧ��ѧϰ");
	}
	public void sleep() {		//����˯���ķ���
		System.out.println("ѧ��˯��");
	}
}
