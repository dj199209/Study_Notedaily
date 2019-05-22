class Deno4_interface {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
//亲爹单继承,干爹是多实现
interface 某干爹 {
	public void 关系() ;
	public void 潜规则() ;
}
class 某女星 interface implements {
	public void 关系 () {
		System.out.println("借助干爹关系上位");
	}
	public void 潜规则() {
		System.out.println("你们懂得");
	}
}