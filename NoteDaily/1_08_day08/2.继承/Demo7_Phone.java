class Demo7_Phone {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
		i.siri();
		
	}
}
class Ios7 {
	public void call() {
		System.out.println("打电话");
	}
	public void siri() {
		System.out.println("speak English");
	}
}
class Ios8 extends Ios7 {
	public void siri() {
		System.out.println("说中文");
		super.siri();
	}
}
