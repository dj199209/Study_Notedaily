class Demo2_1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x= 10;
		int y =5;
		//����1:�������������
		/*int  temp;
		temp = x;
		x = y;
		y =temp;*/
		//����2:����Ҫ���������������һ
		x = x +y;  //x=15
		y = x -y;  //y=10
		x = x -y;  //x=5
		//�˷������ܻᳬ��int��ȡֵ��λ
		//����3 ��^����
		/*x= x^y;
		y=x^y;
		x=x^y;*/
		System.out.println("x="+x+",y="+y);
	}
}
