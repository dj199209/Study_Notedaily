class ArrayTool {
	private ArrayTool(){}
	//��ȡ���ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	//��������
	public static void prints(int[] arr) {
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i] + "");
		}
	}
	//��ת����
	public static void revArray(int[] arr) {
		for (int i = 0;i < arr.length/2;i++) {
		int temp = arr[i];
		arr[i] = arr[arr.length-1-i];
		arr[arr.length-1-i] = temp;
		}
		
	}
	  
}
