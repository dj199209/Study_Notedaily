class Demo2_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
class Person {
	String name;
	int num;// ��Ա����
	public void speak() {
		int num = 10;//�ֲ�����
		System.out.println(name);
		System.out.println(num);
	}
}