/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainLt;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainLtDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainLtService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcMainLtServiceImpl implements QqcMainLtService {
	@Resource
	private QqcMainLtDao qqcMainLtDao;
	/* 
	 * 根据附录编号查询所有
	 */
	@Override
	public List<QqcMainLt> findByFlbh(String flbh) {
		
		return qqcMainLtDao.findByFlbh(flbh);
	}
	/* 
	 * 增加；
	 */
	@Override
	public int add(QqcMainLt qqcMainLt) {
		//根据附录编号查询所有；
		List<QqcMainLt> Lts = qqcMainLtDao.findByFlbh(qqcMainLt.getFlbh());
		Integer bh = qqcMainLt.getBh();
		if(null == bh){
			//用于存放编号；
			List<Integer> list = new ArrayList<Integer>();
			if (null != list && Lts.size() > 0) {
				for (QqcMainLt lt : Lts) {
					list.add(lt.getBh());
				}
				//取出最大的数；
				 Integer max = Collections.max(list);
				 qqcMainLt.setBh(max + 1);
			}else{
				
				qqcMainLt.setBh(1);
			}
		}
		qqcMainLtDao.save(qqcMainLt);
		return 1;
	}
	/* 
	 * 删除某个
	 */
	@Override
	public int delete(String flbh, Integer bh) {
		qqcMainLtDao.deleteLt(flbh, bh);
		return 1;
	}
	/* 
	 * 更新
	 */
	@Override
	public void update(QqcMainLt qqcMainLt) {
		qqcMainLtDao.save(qqcMainLt);
	}
	/* 
	 * 根据附录编号和编号查询某个车体；
	 */
	@Override
	public QqcMainLt findByFlbhAndBh(String flbh, Integer bh) {
		
		return qqcMainLtDao.findByFlbhAndBh(flbh, bh);
	}
	
}
