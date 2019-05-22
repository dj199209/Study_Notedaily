class Demo1_Person {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ÕÅÈý";
		p1.setAge(-17);
		System.out.println(p1.getAge());
	}
}
class Person {
	String name;
	private int age;
	
	public void setAge(int a) {
		if (a > 0 && a < 200) {
			age = a;
		}
		else {
			System.out.println("xxxxx");
		}
	}
	public int getAge() {
		return age;
	}
	public void speak() {
		System.out.println(name + "...."+ age);
	}
}