import java.util.Scanner;
class Text3_2_Scaner {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��ֵ");
		int x = sc.nextInt();
		System.out.println("������ڶ���ֵ");
		int y = sc.nextInt();
		System.out.println("�����������ֵ");
		int z = sc.nextInt();
		int temp = (x>y) ? x:y;
		int max = (temp>z) ? temp:z;
		System.out.println(max);
	}
}
