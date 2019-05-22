import java.util.Scanner;
class Demo11_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入对应的星期所在的范围1-7");
		int week = sc.nextInt();
		System.out.println("星期" + getweek(week));
	}
	public static char getweek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日'}; //定义了一张星期表
		return arr[week];
	}
}
 