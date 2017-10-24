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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCt;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainCtDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainCtService;

/**
 * @author jiabin fan
 * 轻型汽油车车体
 */
@Service
public class QqcMainCtServiceImpl implements QqcMainCtService {
	@Resource
	private QqcMainCtDao qqcMainCtDao;
	/* 
	 * 增加车体；
	 */
	@Override
	public int add(QqcMainCt qqcMainCt) {
		//根据附录编号查询所有的车体；
		List<QqcMainCt> cts = qqcMainCtDao.findByFlbh(qqcMainCt.getFlbh());
		Integer bh = qqcMainCt.getBh();
		if(null == bh){
			//用于存放编号；
			List<Integer> list = new ArrayList<Integer>();
			if (null != list && cts.size() > 0) {
				for (QqcMainCt ct : cts) {
					list.add(ct.getBh());
				}
				//取出最大的数；
				 Integer max = Collections.max(list);
				 qqcMainCt.setBh(max + 1);
			}else{
				
				qqcMainCt.setBh(1);
			}
		}
		qqcMainCtDao.save(qqcMainCt);
		return 1;
	}
	/* 
	 * 删除某个车体
	 */
	@Override
	public int delete(String flbh, Integer bh) {
		qqcMainCtDao.deleteCt(flbh, bh);
		return 1;
	}
	/* 
	 * 更新车体
	 */
	@Override
	public void update(QqcMainCt qqcMainCt) {
		qqcMainCtDao.save(qqcMainCt);
	}
	/* 
	 * 根据附录编号和编号查询某个车体；
	 */
	@Override
	public QqcMainCt findByFlbhAndBh(String flbh, Integer bh) {
		
		return qqcMainCtDao.findByFlbhAndBh(flbh, bh);
	}
	/* 
	 * 根据附录编号查询所有的车体；
	 */
	@Override
	public List<QqcMainCt> findByFlbh(String flbh) {
		
		return qqcMainCtDao.findByFlbh(flbh);
	}

}
