import java.util.Scanner;
class Test1_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�Ƚϵĵ�һ��ֵ:");
		int x = sc.nextInt();
		System.out.println("��������Ҫ�Ƚϵĵڶ���ֵ:");
		int y = sc.nextInt();
		int max = maxs(x,y);
		System.out.println(max);
		boolean isEq = isEqules(x,y);
		System.out.println(isEq);
		
		
	}
	public static boolean isEqules(int onenum, int twonum){
		return onenum == twonum;
	}
	public static int maxs(int a, int b){
		return a>b?a:b;
	}
}
