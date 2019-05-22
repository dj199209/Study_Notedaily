import java.util.Scanner;
class Text2_1_Scaner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();
		int max = (x>y)?x:y;
		System.out.println("最大值为:"+max);
	}
}
