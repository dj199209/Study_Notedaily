class Demo3_Person {
	public static void main(String[] args) {
		Person p1 = new Person("张三",23);
		p1 = new Person("张诶大",25);
		//这种方式看运行结果貌似是改名字了,其实是将原对象变为垃圾
		System.out.println(p1.getName()+"-----------"+p1.getAge());
		System.out.println("---------------");
		Person p2 = new Person();
		p2.setName("李四");
		p2.setAge(24);
		p2.setName("liyi");
		System.out.println(p2.getName()+"-----------"+p2.getAge());
	}
}
class Person {
	private String name;
	private int age;
	public Person() {   //空参构造
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