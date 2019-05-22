class Demo2_1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x= 10;
		int y =5;
		//方法1:引入第三方变量
		/*int  temp;
		temp = x;
		x = y;
		y =temp;*/
		//方法2:不需要引入第三变量方法一
		x = x +y;  //x=15
		y = x -y;  //y=10
		x = x -y;  //x=5
		//此方法可能会超出int的取值方位
		//方法3 用^来做
		/*x= x^y;
		y=x^y;
		x=x^y;*/
		System.out.println("x="+x+",y="+y);
	}
}
