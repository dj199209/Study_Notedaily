class Text2_Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		
	}
}
class Fu {
	static {
		System.out.println("1��̬�����Fu");
	}
	{
		System.out.println("3��������Fu");
	}
	public Fu {
		System.out.println("4���췽��Fu");
	}
}
class Zi extends Fu {
	static {
		System.out.println("2��̬�����zi");
	}
	{
		System.out.println("5���췽��zi");
	}
	public Zi() {
		System.out.println("6���췽��zi");
	}
}