class Demo1_InterClass {
	public static void main(String[] args) {
		//Inner i = new Inner();
		//i.method();���ֵ���ʱ�����
		Outer.Inner oi = new Outer().new.Inner();
		oi.method();
	}
}
class Outer {
	private int num = 10;
	class Inter {
		public void method() {
			System.out.println(num);
		}
	}	
}