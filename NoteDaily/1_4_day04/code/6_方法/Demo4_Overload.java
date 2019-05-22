class Demo4_Overload {
	public static void main(String[] args) {
		double sum = add(10.5,4);
		System.out.println(sum);
		
	}
	public static double add (int a,double b){
		return a + b;
	}
	public static double add (double a , int b){
		return a + b;
	}
	public static int add (int a , int b, int c ){
		return a + b + c; 
	}
 }
