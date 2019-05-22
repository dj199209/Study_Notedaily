import java.util.Scanner;
class Text3_2_Scaner {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值");
		int x = sc.nextInt();
		System.out.println("请输入第二个值");
		int y = sc.nextInt();
		System.out.println("请输入第三个值");
		int z = sc.nextInt();
		int temp = (x>y) ? x:y;
		int max = (temp>z) ? temp:z;
		System.out.println(max);
	}
}
