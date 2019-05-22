class Demo1_OPerator {
	public static void main(String[] args) {
	//	System.out.println("Hello World!");
	int a =10;
	int b =20;
	int c =30;
	System.out.println(a < b & b < c);
	System.out.println(a < b & b > c);
	System.out.println(a > b & b < c);
	System.out.println(a > b & b > c);
	
	//逻辑或 或or 遇true则true
		/*System.out.println(a < b | b < c);				//true | true = true
		System.out.println(a < b | b > c);				//true | false = true
		System.out.println(a > b | b < c);				//false | true = true
		System.out.println(a > b | b > c);				//false | flase = false*/

		//逻辑异或 ^ 两边相同为false,两边不同为true
		/*System.out.println(a < b ^ b < c);				//true | true = false
		System.out.println(a < b ^ b > c);				//true | false = true
		System.out.println(a > b ^ b < c);				//false | true = true
		System.out.println(a > b ^ b > c);				//false | flase = false*/

		//逻辑非!
		System.out.println(!true);
		System.out.println(!!true);
	
	}
}
