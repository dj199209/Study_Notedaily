class Demo_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}
class Father {
	private String name;
	private void show() {
		Systsem.out.println("���Ǹ����show����");
	}
}
class Son extends Father {
	
} 