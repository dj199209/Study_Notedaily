class Demo12_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		int Index = getIndxe(arr,77);
		System.out.println(Index);
	}
	public static int getIndxe (int[] arr,int value) {
		 for (int i = 0;i < arr.length;i++) {
			 if (arr[i] == value) {
				 return i;
			 }
		 }
		 return -1;
	}
}
