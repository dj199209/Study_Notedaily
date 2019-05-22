class Test3_Flower {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		for (int i = 100; i<=999;i++ ){
			int ge = i %10;
			int shi = i/10%10;
			int bai = i /100%10;
			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				System.out.println(i);
			}
		}
	}
}
