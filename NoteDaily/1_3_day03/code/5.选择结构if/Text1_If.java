import java.util.Scanner;
class Text1_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//����¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
		// 90-100 ��
		// 80-89  ��
		// 70-79  ��
		// 60-69  ��
		// 0-59   ��
		System.out.println("��������Ҫ��ѯ�ɼ��ĵȼ�,������0-100����ֵ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x > 90 && x <= 100){
			System.out.println("��");
		}
		else if(x>80 && x<=89){
			System.out.println("��");
		}
		else if(x>70 && x<=79){
			System.out.println("��");
			
		}
		else if(x>60 && x<69){
			System.out.println("����");
		}
		else if(x>0 && x<=59){
			System.out.println("��");
		}
		else{
			System.out.println("�������");
		}
	}
}
