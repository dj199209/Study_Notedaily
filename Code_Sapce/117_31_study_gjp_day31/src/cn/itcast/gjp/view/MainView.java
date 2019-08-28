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
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			//接收菜单选择
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
				System.out.println("退出成功");
				System.exit(0);
				break;
			}
			
		}
		
	}
	private void deleteZhangWu() {
		selectAll();
		System.out.println("选择是删除功能,输入序号");
		Scanner sc = new Scanner(System.in);
		int zwid = sc.nextInt();
		controller.deleteZhangWu(zwid);
		System.out.println("删除账户成功");
	}
	private void editZhangWu() {
		selectAll();
		System.out.println("选择编辑功能,请输入数据");
		Scanner sc = new Scanner(System.in);
		int zwid =sc.nextInt();
		System.out.println("请输入ID:");
		System.out.println("输入分类名称");
		String flname =sc.next();
		System.out.println("输入金额");
		double money= sc.nextDouble();
		System.out.println("请输入账户名称");
		String zhangHu = sc.next();
		System.out.println("输入日期:请输入格式xxxx-xx-xx");
		String createtime = sc.next();
		System.out.println("请输入描述信息");
		String description = sc.next();
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhangHu, createtime, description);
		controller.editZhangWu(zw);
		System.out.println("账户编辑成功");
	}
	private void addZhangHu() {
		System.out.println("选择的是添加账户功能,请输入一下内容");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入分类名称");
		String flname =sc.next();
		System.out.println("输入金额");
		double money= sc.nextDouble();
		System.out.println("请输入账户名称");
		String zhangHu = sc.next();
		System.out.println("输入日期:请输入格式xxxx-xx-xx");
		String createtime = sc.next();
		System.out.println("请输入描述信息");
		String description = sc.next();
		ZhangWu zw = new ZhangWu(0, flname, money, zhangHu, createtime, description);
		controller.addZhangHu(zw);
		System.out.println("恭喜添加账务--成功");
	}
	public void selectZhangWu() {
		System.out.println("---------------管家婆家庭记账软件---------------");
		System.out.println("1.查询所有　2.条件查询");
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
		System.out.println("选择条件查询,输入日期的格式为xxxx-xx-xx");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始日期");
		String startDate = sc.nextLine();
		System.out.println("输入结束日期");
		String endDate = sc.nextLine();
		List<ZhangWu> list =controller.select(startDate, endDate);
		if (list.size()!=0) {
			print(list);
		} else {
			System.out.println("没有查询到数据");
		}
	}
	public void selectAll() {
		// TODO Auto-generated method stub
		//调用控制层
		List<ZhangWu> list = controller.selectAll();
		print(list);
	}
	public void print(List<ZhangWu> list) {
		System.out.println("ID\t类别\t账户\t金额\t时间\t\t说明");
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
