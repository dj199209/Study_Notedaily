class Demo5_Extends {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
class Father extends Object {
	public Father() {
		super();
		System.out.println("Father�Ĺ��췽��");
	}
}
class Son extends Father {
	public Son() {
		super();
		System.out.println("Son�Ĺ��췽��");
	}
}
