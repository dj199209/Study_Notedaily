class Demo3_Array {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		//这是一个二维数组,这个二维数组中有三个一维数组,三个一维数组都没有被赋值
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[3];//第一个数组可以存3个int值
		arr[1] = new int[5];//第二个数组可以存5个int值
		System.out.println("--------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
