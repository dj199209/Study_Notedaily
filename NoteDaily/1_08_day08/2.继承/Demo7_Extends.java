class Demo7_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.prints();
	}
}
class Father {
	public void prints() {
		System.out.println("Fu prints");
	}
}
class Son extends Father {
	public void methods() {
		System.out.println("zi method");
	}
	public void prints() {
		super.prints();
		System.out.println("zi print");
	}
}

