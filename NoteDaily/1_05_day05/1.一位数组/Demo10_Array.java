class Demo10_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,77,55,66};
		reverseArray(arr);
		prints(arr);
	}
	//数组翻转
	public static void reverseArray(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	//数组遍历
	public static void prints(int[] arr) {
		for (int i = 0;i <arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
