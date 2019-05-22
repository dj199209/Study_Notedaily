import java.util.Scanner;
class Text1_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//键盘录入一个成绩，判断并输出成绩的等级。
		// 90-100 优
		// 80-89  良
		// 70-79  中
		// 60-69  及
		// 0-59   差
		System.out.println("请输入你要查询成绩的等级,请输入0-100的数值");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x > 90 && x <= 100){
			System.out.println("优");
		}
		else if(x>80 && x<=89){
			System.out.println("良");
		}
		else if(x>70 && x<=79){
			System.out.println("中");
			
		}
		else if(x>60 && x<69){
			System.out.println("及格");
		}
		else if(x>0 && x<=59){
			System.out.println("差");
		}
		else{
			System.out.println("输入错误");
		}
	}
}
