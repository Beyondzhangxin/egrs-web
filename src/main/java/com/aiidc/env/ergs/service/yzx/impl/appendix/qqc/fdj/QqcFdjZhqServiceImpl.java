/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc.fdj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhq;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZhqDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZhqService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjZhqServiceImpl implements QqcFdjZhqService{
	@Resource
	private QqcFdjZhqDao qqcFdjZhqDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjZhq qqcFdjZhq) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjZhq.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjZhq> Zhqs = qqcFdjZhqDao.findByFlbhAndFdjbh(qqcFdjZhq.getFlbh(), qqcFdjZhq.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Zhqs && Zhqs.size() > 0){
			for (QqcFdjZhq Zhq : Zhqs) {
				list.add(Zhq.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjZhq.setBh(max + 1); 
		}else{
			qqcFdjZhq.setBh(1);
		}
		}
		qqcFdjZhqDao.save(qqcFdjZhq);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjZhq qqcFdjZhq) {
		qqcFdjZhqDao.delete(qqcFdjZhq);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjZhq qqcFdjZhq) {
		qqcFdjZhqDao.save(qqcFdjZhq);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjZhq findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjZhqDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjZhq> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjZhqDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
