//当数组引用赋值为null,再去调用数组中的元素就会出现空指针异常
class Demo7_Exception {
	public static void main(String[] args) {
		int [] arr = new int[5];
		arr = null;
		System.out.println(arr[0]);
	}
}
