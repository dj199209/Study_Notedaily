class Demo8_Shuang_Jiang {
	public static void main(String[] args) {
		DayOne d = new DayOne();
		d.paoniu();
		
	}
}
class Shuang_JIang {
	public void sing() {
		System.out.println("�����");
	}
	public void paoniu() {
		System.out.println("�����㶨��Ůʿ");
	}
	
}
class DayOne extends Shuang_JIang {
	public void paoniu() {
		System.out.println("����Ӳ�Ϲ�");
		super.paoniu();
	}
}