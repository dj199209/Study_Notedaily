package cn.itcast.gjp.view;
/*
 *  ��ͼ��,�û������Ͳ����Ľ���
 *  ���ݴ��ݸ�controller��ʵ��
 *  ��Աλ��,����controller����
 */

import java.util.List;
import java.util.Scanner;

import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	/*
	 *  ʵ�ֽ���Ч��
	 *  �����û�������
	 *  ��������,���ò�ͬ�Ĺ��ܷ���
	 */
	public void run(){
		//����Scanner�����,������������
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("---------------�ܼ��ż�ͥ�������---------------");
			System.out.println("1.�������2.�༭����3.ɾ������4.��ѯ����5.�˳�ϵͳ");
			System.out.println("������Ҫ�����Ĺ������[1-5]:");
			//�����û��Ĳ˵�ѡ��
			int choose = sc.nextInt();
			//��ѡ��Ĳ˵��ж�,���ò�ͬ�Ĺ���
			switch(choose){
			case 1:
			   // ѡ���������,�����������ķ���
				addZhangWu();
				break;
			case 2:
				// ѡ��ı༭����,���ñ༭���񷽷�
				editZhangWu();
				break;
			case 3:
				// ѡ���ɾ������,����ɾ�����񷽷�
				deleteZhangWu();
				break;
			case 4:
				// ѡ����ǲ�ѯ����,���ò�ѯ����
				selectZhangWu();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}
	/*
	 * ���巽����ʵ������ɾ��
	 * ʵ��˼�룺
	 * 	�����û������룬����һ����������
	 *  ���ÿ��Ʋ㷽��������һ������
	 */
	public void deleteZhangWu() {
		//���ò�ѯ�����������ݵĹ��ܣ���ʾ����
		//�����������ݣ�����ѡ��һ������޸�
		selectAll();
		System.out.println("ѡ�����ɾ�����ܣ���������ż���");
		int zwid = new Scanner(System.in).nextInt();
		//���ÿ��Ʋ㷽������������id����
		controller.deleteZhangWu(zwid);
		System.out.println("ɾ������ɹ�");
	}
	/*
	 * ���巽����ʵ�ֶ�����ı༭����
	 * ʵ��˼�룺
	 * 	�����û����������Ϣ
	 *  ��װ��ZhangWu����
	 *  ���ÿ��Ʋ�ķ���������ZhangWu����ʵ�ֱ༭
	 * 
	 */
	public void editZhangWu() {
		//���ò�ѯ�����������ݵĹ��ܣ���ʾ����
		//�����������ݣ�����ѡ��һ������޸�
		selectAll();
		System.out.println("ѡ����Ǳ༭���ܣ�����������");
		Scanner sc = new Scanner(System.in);
		System.out.print("������ID");
		int zwid = sc.nextInt();
		System.out.println("�����������");
		String flname = sc.next();
		System.out.println("������");
		double money = sc.nextDouble();
		System.out.println("�����˻�");
		String zhanghu = sc.next();
		System.out.println("�������ڣ���ʽXXXX-XX-xx");
		String createtime = sc.next();
		System.out.println("�����������");
		String description = sc.next();
		//���û���������ݣ���װ��ZhangWu������
		//�û������ID�������װ����������
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
		//����controller���еķ�����ʵ�ֱ༭����
		controller.editZhangWu(zw);
		System.out.println("����༭�ɹ�");
	}
	/*
	 * ���巽��addZhangWu
	 * �������ķ������û��ڽ�����ѡ��˵�1��ʱ����á�
	 * ʵ��˼�룺
	 * 	  ���ռ������룬5�����룬����controller�㷽��
	 */
	public void addZhangWu() {
		System.out.println("ѡ�����������ܣ���������������");
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������");
		String flname = sc.next();
		System.out.println("������");
		double money = sc.nextDouble();
		System.out.println("�����˻�");
		String zhanghu = sc.next();
		System.out.println("�������ڣ���ʽXXXX-XX-xx");
		String createtime = sc.next();
		System.out.println("�����������");
		String description = sc.next();
		//�����յ������ݣ�����controller��ķ��������ݲ�����ʵ���������
		//���û���������в�������װ��ZhangWu����
		ZhangWu zw = new ZhangWu(0, flname, money, zhanghu, createtime, description);
		controller.addZhangWu(zw);
		System.out.println("��ϲ�������ɹ�");
	}
	/*
	 * ���巽�� selectZhangWu()
	 * ��ʾ��ѯ�ķ�ʽ 1 ���в�ѯ   2 ������ѯ
	 * �����û���ѡ��
	 */
	 public void selectZhangWu(){
		 System.out.println("1. ��ѯ����    2. ������ѯ");
		 Scanner sc = new Scanner(System.in);
		 int selectChooser = sc.nextInt();
		 //�жϸ����û���ѡ��,���ò�ͬ�Ĺ���
		 switch(selectChooser){
		 case 1:
			 //ѡ��Ĳ�ѯ����,���ò�ѯ���еķ���
			 selectAll();
			 break;
		 case 2:
			 //ѡ��������ѯ,���ô��в�ѯ�����ķ���
			 select();
			 break;
		 }
	 }
	 /*
	  * ���巽��,ʵ�ֲ�ѯ���е���������
	  */
	 public void selectAll(){
		 //���ÿ��Ʋ��еķ���,��ѯ���е���������
		 List<ZhangWu> list = controller.selectAll();
		 if(list.size()!=0)
			 print(list);
		 else
			 System.out.println("û�в�ѯ������");
	 }
	
	 /*
	  * ���巽��,ʵ��������ѯ��������
	  * �ṩ�û�����������,��ʼ���ڽ�������
	  * ��2������,���ݵ�controller��
	  * ����controller�ķ���,����2�����ڲ���
	  * ��ȡ��controller��ѯ�Ľ����,��ӡ����
	  */
	 public void select(){
		 System.out.println("ѡ��������ѯ,�������ڸ�ʽXXXX-XX-XX");
		 Scanner sc = new Scanner(System.in);
		 System.out.print("�����뿪ʼ����:");
		 String startDate = sc.nextLine();
		 System.out.print("������������:");
		 String endDate = sc.nextLine();
		 //����controller��ķ���,��������,��ȡ��ѯ�����
		 List<ZhangWu> list = controller.select(startDate, endDate);
		 if(list.size()!=0)
			 print(list);
		 else
			 System.out.println("û�в�ѯ������");
	 }
	 
	 //����������ݷ���,����List����,��������,������
	 private void print(List<ZhangWu> list) {
			//�����ͷ
			 System.out.println("ID\t\t���\t\t�˻�\t\t���\t\tʱ��\t\t˵��");
			 //��������,����������̨
			 for(ZhangWu zw : list){
				 System.out.println(zw.getZwid()+"\t\t"+zw.getFlname()+"\t\t"+zw.getZhanghu()+"\t\t"+
			     zw.getMoney()+"\t\t"+zw.getCreatetime()+"\t"+zw.getDescription());
			 }
		}
}
