import java.util.Scanner;
class Demo11_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ӧ���������ڵķ�Χ1-7");
		int week = sc.nextInt();
		System.out.println("����" + getweek(week));
	}
	public static char getweek(int week) {
		char[] arr = {' ','һ','��','��','��','��','��','��'}; //������һ�����ڱ�
		return arr[week];
	}
}
 