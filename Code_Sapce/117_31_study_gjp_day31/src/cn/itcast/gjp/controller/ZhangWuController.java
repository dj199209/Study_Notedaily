package cn.itcast.gjp.controller;

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();
	
	public List<ZhangWu> selectAll() {
		return service.seletAll();
	}
	public List<ZhangWu> select (String startDate,String endDate) {
		return service.select(startDate, endDate);
	}
	public void addZhangHu(ZhangWu zw) {
		// TODO Auto-generated method stub
		service.addZhangHu(zw);
	}
	public void editZhangWu(ZhangWu zw) {
		service.editZhangWu(zw);
	}
	public void deleteZhangWu(int zwid) {
		// TODO Auto-generated method stub
		service.deleteZhangWu(zwid);
	}
}
