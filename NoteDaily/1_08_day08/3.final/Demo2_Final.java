class Demo2_Final {
	public static void main(String[] args) {
		final int num = 10;
		System.out.println(num);
		final Person p = new Person("zhangs",26);
		p.setName("lisi");
		p.setAge(24);
		System.out.println(p.getName()+"****"+p.getAge());
	}
}
class Person {
	private String name;			//����
	private int age;				//����

	public Person(){}				//�ղι���

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//��������
		this.name = name;
	}

	public String getName() {		//��ȡ����
		return name;
	}

	public void setAge(int age) {	//��������
		this.age = age;
	}

	public int getAge() {			//��ȡ����
		return age;
	}
}