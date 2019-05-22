import java.util.Scanner;
class Demo3_Method {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入行数:");
		int row = sc.nextInt();
		System.out.println("请输入列数:");
		int col = sc.nextInt();
		prints(row,col);
	}
	public static void prints (int a,int b) {
		for (int i = 1 ;i <=a; i++){
			for (int j = 1; j <= b ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
