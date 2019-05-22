class Test1_2_while {
	public static void main(String[] args) {
		//Test1_2_whileSystem.out.println("Hello World!");
		int count = 0;
		int i = 100;
		while (i<=999){
			int ge = i %10;
			int shi =i/10%10;
			int bai = i/100%10;
			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				count++;
				
			}
			i++;
		}
		System.out.println(count);
	}
}
