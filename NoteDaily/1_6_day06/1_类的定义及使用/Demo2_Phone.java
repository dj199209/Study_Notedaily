class Demo2_Phone {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.Brand = "华为";
		p.price = 3999;
		System.out.println(p.Brand+"....."+p.price);
		p.call();
		p.sendMessage();
		p.playgame();
	}
}
class Phone {
	String Brand;
	int price;
	public void call() {
		System.out.println("打电话");
	}
	public void sendMessage() {
		System.out.println("发信息");
	}
	public void playgame() {
		System.out.println("玩游戏");
	}
}
