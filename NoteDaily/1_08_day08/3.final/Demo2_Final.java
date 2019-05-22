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
	private String name;			//姓名
	private int age;				//年龄

	public Person(){}				//空参构造

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//设置姓名
		this.name = name;
	}

	public String getName() {		//获取姓名
		return name;
	}

	public void setAge(int age) {	//设置年龄
		this.age = age;
	}

	public int getAge() {			//获取年龄
		return age;
	}
}