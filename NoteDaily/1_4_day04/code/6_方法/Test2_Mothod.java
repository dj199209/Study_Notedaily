import java.util.Scanner;
class Test2_Mothod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个你要制作的乘法表,范围在1-9");
		int x = sc.nextInt();
		print99(x);
	}
	public static void print99(int a){
		for (int i = 1; i <= a ; i++){
			for (int j = 1; j < i; j++ ){
				System.out.print(i +"*"+ a +"=" + i*a+"\t");
			}
		System.out.println();
		}
		
	}
}
