class Demo2_Extends {
	public static void main(String[] args) {
		DemoC c = new DemoC();
			c.show();
			c.printss();
	}
}
class DemoA {
	public void show() {
		System.out.println("DemoA");
	}
}

class DemoB extends DemoA {
	public void method() {
		System.out.println("DemoB");
	}
}
class DemoC extends DemoA {
	public void prints() {
		System.out.print("DemoC");
	}
} 