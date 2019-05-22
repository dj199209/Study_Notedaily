class Demo5_Extends {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
class Father extends Object {
	public Father() {
		super();
		System.out.println("Father的构造方法");
	}
}
class Son extends Father {
	public Son() {
		super();
		System.out.println("Son的构造方法");
	}
}
