import java.util.Scanner;
class Text3_1_Scaner {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要比较的的第一个值");
		int x = sc.nextInt();
		System.out.println("请输入需要比较的第二个值");
		int y = sc.nextInt();
		boolean b = (x==y) ;
		System.out.println(b);
		
	}
}
