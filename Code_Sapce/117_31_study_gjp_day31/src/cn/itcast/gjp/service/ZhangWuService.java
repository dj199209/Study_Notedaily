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
}
