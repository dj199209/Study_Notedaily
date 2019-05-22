class Demo1_This {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("张三");
		p1.setAge(23);
		System.out.println(p1.getName()+"----"+p1.getAge());
		Person p2 = new Person();
		p2.setName("李四");
		p2.setAge(25);
		System.out.println(p2.getName()+"----"+p2.getAge());
	}
}
class Person {
	private String name;
	private int age;
	public void setAge(int age) {
		if (age > 0 && age < 200) {
			this.age = age;
			//System.out.println(age);
		}
		else {
			System.out.println("你是神还是人");
		}
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}