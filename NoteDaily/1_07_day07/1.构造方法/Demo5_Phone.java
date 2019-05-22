class Demo5_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setBrand("iphone");
		p1.setPrice(9999);
		System.out.println(p1.getbrand()+"-----"+p1.getPrice());
		Phone p2 = new Phone("xiaomi",999);
		p2.show();
	}
}
class Phone {
	private String brand;
	private int price;
	public Phone() {	//无参构造	
	}
	public Phone(String brand,int price) {
		this.brand = brand;
		this.price = price;		
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void show() {
		System.out.println(brand + "---"+ price);
	}
}