class Test1_Rectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20);
		System.out.println(r.getLength());
		System.out.println(r.getArea());
	}
}
class Rectangle {
	private int width; //宽
	private int hight; //高
	public Rectangle() {  //空参构造
		
	}
	public Rectangle(int width,int hight) {
		this.width = width;
		this.hight = hight;
	}
	public void setWidth(int width) {
		this.width = width;		
	}
	public int getWidth() {
		return width;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getHight() {
		return hight;
	}
	public int getLength() {
		return 2*(width+hight);
	}
	public int getArea() {
		return width*hight;
	}
}