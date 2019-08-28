package cn.itcast.gjp.controller;
/*
 *  ��������
 *  ������ͼ�������,���ݴ��ݸ�service��
 *  ��Աλ��,����service����
 */

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();
	/*
	 * ���巽����ʵ��ɾ������
	 * ��ͼ����ã�����int��������
	 * ����service�㷽��������int����
	 */
	public void deleteZhangWu(int zwid) {
		service.deleteZhangWu(zwid);
	}
	
	/*
	 * ���巽����ʵ�ֱ༭������
	 * ����ͼ����ã����ݲ�����Ҳ��ZhangWu����
	 * ����service��ķ�����Ҳ��ZhangWu����
	 */
	public void editZhangWu(ZhangWu zw) {
		service.editZhangWu(zw);
	}
	/*
	 * ���巽����ʵ��������ӹ���
	 * ����ͼ����ã����ݲ���(���ݹ����Ĳ���������5�����ݣ����ݵ���һ��ZhangWu���͵Ķ���)
	 * ����������service��ķ���������ZhangWu���󣬻�ȡ����Ӻ�Ľ����(��ӳɹ�Ӱ���������int)
	 * 
	 */
	public void addZhangWu(ZhangWu zw) {
		service.addZhangWu(zw);
	}
	
	/*
	 * ���巽��,ʵ��������ѯ����
	 * ��������ͼ�����,�����������ڵ��ַ���
	 * ����service��ķ���,�������������ַ���,��ȡ�����
	 * ��������ظ���ͼ
	 */
	public List<ZhangWu> select(String startDate,String endDate){
		return service.select(startDate, endDate);
	}
	
	/*
	 * ���Ʋ��ඨ�巽��,ʵ�ֲ�ѯ���е���������
	 * ��������ͼ�����,��������service��
	 */
	public List<ZhangWu> selectAll(){
		return service.selectAll();
	}
}
