/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCdx;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainCdxDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainCdxService;

/**
 * @author jiabin fan
 * 轻型汽油车传动系
 */
@Service
public class QqcMainCdxServiceImpl implements QqcMainCdxService {
	@Resource
	private QqcMainCdxDao qqcMainCdxDao;
	/* 
	 * 根据附录编号查找编号
	 */
	@Override
	public String findBhByFlbh(String flbh) {
		//查询bh;
		List<Integer> bhs = qqcMainCdxDao.findByFlbh(flbh);
		
		if (null != bhs && bhs.size() > 0) {
			
			//取出最大的bh
			Integer maxbh = Collections.max(bhs);
			return maxbh + 1 + "";
		}
		return "1";
	}
	/* 
	 * 增加新的传动系
	 */
	@Override
	public int addQqcMainCdx(QqcMainCdx qqcMainCdx) {
		String flbh = qqcMainCdx.getFlbh();
		Integer bh = qqcMainCdx.getBh();
		if(null == bh){
			//设置bh
			qqcMainCdx.setBh(new Integer(findBhByFlbh(flbh)));
		}
		qqcMainCdxDao.save(qqcMainCdx);
		return 1;
	}
	/* 
	 * 修改传动系
	 */
	@Override
	public void updateQqcMainCdx(QqcMainCdx qqcMainCdx) {
		qqcMainCdxDao.save(qqcMainCdx);
	}
	/* 
	 * 删除传动系
	 */
	@Override
	public int deleteQqcMainCdx(String flbh,String sbh) {
		Integer bh = new Integer(sbh);
		qqcMainCdxDao.deleteByFlbhAndBh(flbh,bh);
		return 1;
	}
	/* 
	 * 根据flbh查询所有的传动系
	 */
	@Override
	public List<QqcMainCdx> findAllCdxByFlbh(String flbh) {
	List<QqcMainCdx> cdxs = qqcMainCdxDao.findQqcMainCdxByFlbh(flbh);
		return cdxs;
	}
	/* 
	 * 根据flbh和bh查询其所对应的传动系；
	 */
	@Override
	public QqcMainCdx findByFlbhAndBh(String flbh, String bh) {
		int ibh = new Integer(bh);
		return qqcMainCdxDao.findByFlbhAndBh(flbh,ibh);
	}
	
	
}
