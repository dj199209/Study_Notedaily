class Demo3_Person {
	public static void main(String[] args) {
		Person p1 = new Person("����",23);
		p1 = new Person("������",25);
		//���ַ�ʽ�����н��ò���Ǹ�������,��ʵ�ǽ�ԭ�����Ϊ����
		System.out.println(p1.getName()+"-----------"+p1.getAge());
		System.out.println("---------------");
		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(24);
		p2.setName("liyi");
		System.out.println(p2.getName()+"-----------"+p2.getAge());
	}
}
class Person {
	private String name;
	private int age;
	public Person() {   //�ղι���
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
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
}