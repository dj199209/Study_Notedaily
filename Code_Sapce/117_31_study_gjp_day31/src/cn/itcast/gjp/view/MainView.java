package cn.itcast.gjp.view;

import java.util.List;
import java.util.Scanner;

import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("---------------�ܼ��ż�ͥ�������---------------");
			System.out.println("1.�������2.�༭����3.ɾ������4.��ѯ����5.�˳�ϵͳ");
			System.out.println("������Ҫ�����Ĺ������[1-5]:");
			//���ղ˵�ѡ��
			int choose =sc.nextInt();
			switch (choose) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				selectZhangWu();
				break;
			
			case 5:
				
				break;
			}
			
		}
		
	}
	public void selectZhangWu() {
		System.out.println("---------------�ܼ��ż�ͥ�������---------------");
		System.out.println("1.��ѯ���С�2.������ѯ");
		Scanner sc =new Scanner(System.in);
		int seletChooser = sc.nextInt();
		switch (seletChooser) {
		case 1:
			selectAll();
			break;

		case 2:
			select();
			break;
		}
	}
	public void select() {
		// TODO Auto-generated method stub
		
		
	}
	public void selectAll() {
		// TODO Auto-generated method stub
		//���ÿ��Ʋ�
		List<ZhangWu> list = controller.selectAll();
		System.out.println(list);
	}
}
