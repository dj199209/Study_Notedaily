class Demo2_Operator {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println((++x==3)&(++y == 4));
		System.out.println("x="+x);
		System.out.println("y="+y);
		int x1 =3;
		int y1 =4;
		System.out.println((++x1 == 3)&&(++y1 ==4));
		System.out.println("x1="+x1);
		System.out.println("y1="+y1);
	}
}
