class Demo9_Array {
	public static void main(String[] args) {
		int[] arr = {33,77,22,44,55};
		int max = getMAx(arr);
		System.out.println(max);
	}
	
public static int getMAx(int[] arr) {
	int max =arr[0];
	for (int i = 1;i <arr.length;i++ ) {
		if (max < arr[i]) {
			max = arr[i];
			}
		}
		return max;
	}
}


