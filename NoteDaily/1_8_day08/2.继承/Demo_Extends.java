class Demo_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}
class Father {
	private String name;
	private void show() {
		Systsem.out.println("这是父类的show方法");
	}
}
class Son extends Father {
	
} 