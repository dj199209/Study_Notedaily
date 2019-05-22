class Test1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
	/*	int a = 10;
		int b = 10;
		int c = 10;
		
		a= b++; //a=10,b=11(先把b=10赋值给a,b自身在加1)
		System.out.println(a);
		System.out.println(b);
		c=--a;//a=9 c=9
		b=++a;//b=10,a=10
		a=c--;//a=9c=8
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);
		//System.out.println("x="+x+",y="+y);*/
		/*int x =4;
		//int y =x++;
		//int y =++x;
		int y = (x++)+(++x)+(x*10);
		System.out.println(y);*/
		byte b= 10;
		//b = b + 1;	当byte与int进行混合运算的时候,会提升为int类型,两个int相加的结果还是int,赋值给byte会损失精度
		b=(byte)(b+1);
		System.out.println("b="+b);
		
	}
}
