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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjRlps;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjRlpsDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjRlpsService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjRlpsServiceImpl implements QqcFdjRlpsService{
	@Resource
	private QqcFdjRlpsDao qqcFdjRlpsDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjRlps qqcFdjRlps) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjRlps.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjRlps> Rlpss = qqcFdjRlpsDao.findByFlbhAndFdjbh(qqcFdjRlps.getFlbh(), qqcFdjRlps.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Rlpss && Rlpss.size() > 0){
			for (QqcFdjRlps Rlps : Rlpss) {
				list.add(Rlps.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjRlps.setBh(max + 1); 
		}else{
			qqcFdjRlps.setBh(1);
			}
		}
		qqcFdjRlpsDao.save(qqcFdjRlps);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjRlps qqcFdjRlps) {
		qqcFdjRlpsDao.delete(qqcFdjRlps);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjRlps qqcFdjRlps) {
		qqcFdjRlpsDao.save(qqcFdjRlps);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjRlps findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjRlpsDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjRlps> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjRlpsDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
