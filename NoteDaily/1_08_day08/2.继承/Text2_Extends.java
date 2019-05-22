class Text2_Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		
	}
}
class Fu {
	static {
		System.out.println("1静态代码块Fu");
	}
	{
		System.out.println("3构造代码块Fu");
	}
	public Fu {
		System.out.println("4构造方法Fu");
	}
}
class Zi extends Fu {
	static {
		System.out.println("2静态代码块zi");
	}
	{
		System.out.println("5构造方法zi");
	}
	public Zi() {
		System.out.println("6构造方法zi");
	}
}