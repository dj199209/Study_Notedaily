class Test3_Overload {
	public static void main(String[] args) {
		boolean x = isEqules(10,10);
		boolean x2 = isEqules(10.5,10.5);
		System.out.println(x);
		System.out.println(x2);
	}
	public static boolean isEqules(double a, double b){
		return a == b;
	}
	public static boolean isEqules(int a, int b){
		return a == b;
	}
}
