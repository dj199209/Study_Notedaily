class Demo2_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setBrand("HUAWEI");
		p1.setPrice(3999);
		System.out.println(p1.getBrand()+"-----"+p1.getPrcie());
		p1.call();
		
	}
}
class Phone {
	private String brand;
	private int price;
	public void setBrand (String brand) {
		this.brand = brand;
	}
	public String getBrand () {
		return this.brand;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrcie() {
		return price;
	}
	public void call() {
		System.out.println("´òµç»°");
	}
	
}