class Demo2_Polymorphic {
	public static void main(String[] args) {
		Father f = new Son(); //父类引用指向子类对象
		System.out.println(f.num);
		Son s = new Son();
		System.out.println(s.num);
		Father f1 = new Son();
		f1.print();
		f1.method();//相当于是Father.method();
		
	}
}
/*
成员变量

*/
class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
	public static void method() {
		System.out.println("father static method");
	}
	
}
class Son extends Father {
	int num = 20;
	public void print() {
		System.out.println("Son");
	}
	public  static void method() {
		System.out.println("son static method");
	}
	
}