import java.util.Scanner;
class Text2_2_Scaner {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值");
		int x = sc.nextInt();
		System.out.println("请输入第二个值");
		int y =sc.nextInt();
		int max =(x>y) ? x:y;
		System.out.println("你输入的最大值为:"+max);
	}
}
