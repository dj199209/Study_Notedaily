class Test1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
	/*	int a = 10;
		int b = 10;
		int c = 10;
		
		a= b++; //a=10,b=11(�Ȱ�b=10��ֵ��a,b�����ڼ�1)
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
		//b = b + 1;	��byte��int���л�������ʱ��,������Ϊint����,����int��ӵĽ������int,��ֵ��byte����ʧ����
		b=(byte)(b+1);
		System.out.println("b="+b);
		
	}
}
