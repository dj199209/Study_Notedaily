import java.util.Scanner;
class Text2_1_Scaner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int x = sc.nextInt();
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();
		int max = (x>y)?x:y;
		System.out.println("���ֵΪ:"+max);
	}
}
