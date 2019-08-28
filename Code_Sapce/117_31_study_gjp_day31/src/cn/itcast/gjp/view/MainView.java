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
				addZhangHu();
				break;
			case 2:
				editZhangWu();
				break;
			case 3:
				deleteZhangWu();
				break;
			case 4:
				selectZhangWu();
				break;
			
			case 5:
				System.out.println("�˳��ɹ�");
				System.exit(0);
				break;
			}
			
		}
		
	}
	private void deleteZhangWu() {
		selectAll();
		System.out.println("ѡ����ɾ������,�������");
		Scanner sc = new Scanner(System.in);
		int zwid = sc.nextInt();
		controller.deleteZhangWu(zwid);
		System.out.println("ɾ���˻��ɹ�");
	}
	private void editZhangWu() {
		selectAll();
		System.out.println("ѡ��༭����,����������");
		Scanner sc = new Scanner(System.in);
		int zwid =sc.nextInt();
		System.out.println("������ID:");
		System.out.println("�����������");
		String flname =sc.next();
		System.out.println("������");
		double money= sc.nextDouble();
		System.out.println("�������˻�����");
		String zhangHu = sc.next();
		System.out.println("��������:�������ʽxxxx-xx-xx");
		String createtime = sc.next();
		System.out.println("������������Ϣ");
		String description = sc.next();
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhangHu, createtime, description);
		controller.editZhangWu(zw);
		System.out.println("�˻��༭�ɹ�");
	}
	private void addZhangHu() {
		System.out.println("ѡ���������˻�����,������һ������");
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������");
		String flname =sc.next();
		System.out.println("������");
		double money= sc.nextDouble();
		System.out.println("�������˻�����");
		String zhangHu = sc.next();
		System.out.println("��������:�������ʽxxxx-xx-xx");
		String createtime = sc.next();
		System.out.println("������������Ϣ");
		String description = sc.next();
		ZhangWu zw = new ZhangWu(0, flname, money, zhangHu, createtime, description);
		controller.addZhangHu(zw);
		System.out.println("��ϲ�������--�ɹ�");
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
		System.out.println("ѡ��������ѯ,�������ڵĸ�ʽΪxxxx-xx-xx");
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		String startDate = sc.nextLine();
		System.out.println("�����������");
		String endDate = sc.nextLine();
		List<ZhangWu> list =controller.select(startDate, endDate);
		if (list.size()!=0) {
			print(list);
		} else {
			System.out.println("û�в�ѯ������");
		}
	}
	public void selectAll() {
		// TODO Auto-generated method stub
		//���ÿ��Ʋ�
		List<ZhangWu> list = controller.selectAll();
		print(list);
	}
	public void print(List<ZhangWu> list) {
		System.out.println("ID\t���\t�˻�\t���\tʱ��\t\t˵��");
		for (ZhangWu zhangWu : list) {
			System.out.println(zhangWu.getZwid()+"\t"+
					zhangWu.getFlname()+"\t"+
					zhangWu.getMoney()+ "\t"+ 
					zhangWu.getZhangHu()+"\t"+
					zhangWu.getCreatetime()+ "\t"+
					zhangWu.getDescription());
		}
	}
}
