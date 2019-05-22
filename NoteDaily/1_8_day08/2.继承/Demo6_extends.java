class Demo6_extends {
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println(s1.getName()+"-----"+s1.getAge());
		System.out.println("------------------");
		Son s2 = new Son("张三",23);
		System.out.println(s2.getName()+"----------"+s2.getAge());
		
	}
}
class Father {
	private String name;
	private int age;
	/*public Father() {
		System.out.println("Father的空参构造");
	}*/
	public Father(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("Father的有参构造");
	}
	public void setName() {
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
class Son extends Father {
	public Son() {
		this("王五",25);
		//super("李四",24);
		System.out.println("Son的空参方法");
	}
	public Son(String name, int age) {
		super(name,age);
		System.out.println("Son的有参构造");
	}
	
}