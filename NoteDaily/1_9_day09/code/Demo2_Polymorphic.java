class Demo2_Polymorphic {
	public static void main(String[] args) {
		Father f = new Son(); //��������ָ���������
		System.out.println(f.num);
		Son s = new Son();
		System.out.println(s.num);
		Father f1 = new Son();
		f1.print();
		f1.method();//�൱����Father.method();
		
	}
}
/*
��Ա����

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