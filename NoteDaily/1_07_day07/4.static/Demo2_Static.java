class Demo2_Static {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.print1();
		Demo2.print2();
	}
}
class Demo2 {
	int num1 = 10;
	static int num2 = 20;
	public void print1() {
		System.out.println(num1);
		System.out.println(num2);
	}
	public static void print2() {
		System.out.println(num1);
		System.out.println(num2);
	}
}