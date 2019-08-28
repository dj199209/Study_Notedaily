package cn.itcast.gjp.service;

import java.util.List;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

public class ZhangWuService {
	private ZhangWuDao dao =new ZhangWuDao();
	public List<ZhangWu> seletAll() {
//		List<ZhangWu> list= dao.seletAll();
//		return list;
		return dao.seletAll();
	}
	public List<ZhangWu> select(String startDate,String endDate) {
		return dao.select(startDate, endDate);
	}
	public void addZhangHu(ZhangWu zw) {
		// TODO Auto-generated method stub
		dao.addZhangHu(zw);
	}
	public void editZhangWu(ZhangWu zw) {
		dao.editZhangWu(zw);
	}
	public void deleteZhangWu(int zwid) {
		dao.deleteZhangWu(zwid);
	}
	
}
