class Test1_1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//获取三个整数中的最大值
		int a = 10;
		int b = 20;
		int c = 30;
		int temp =(a>b)?a:b;
		int max =(temp>c)?temp:c;
		System.out.println("max="+max);
	}
}
