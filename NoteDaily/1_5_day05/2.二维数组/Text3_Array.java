class Text3_Array {
	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5};
		change(arr);
		System.out.println(arr[1]);

	}
	public static void change(int a, int b) {
		System.out.println("a:"+a+",b:"+b);
		a = b;
		b =a + b;
		System.out.println("a:"+a+",b:"+b);
	}
	public static void change(int[] arr) {
		for(int x=0;x < arr.length; x++) {
			if(arr[x]%2==0) {
				arr[x]*=2;
			}
		}
	}
}
 