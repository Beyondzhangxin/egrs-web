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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjDhzz;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDhzzDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjDhzzService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjDhzzServiceImpl implements QqcFdjDhzzService{
	@Resource
	private QqcFdjDhzzDao qqcFdjDhzzDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjDhzz qqcFdjDhzz) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjDhzz.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjDhzz> Dhzzs = qqcFdjDhzzDao.findByFlbhAndFdjbh(qqcFdjDhzz.getFlbh(), qqcFdjDhzz.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Dhzzs && Dhzzs.size() > 0){
			for (QqcFdjDhzz Dhzz : Dhzzs) {
				list.add(Dhzz.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjDhzz.setBh(max + 1); 
		}else{
			qqcFdjDhzz.setBh(1);
			}
		}
		qqcFdjDhzzDao.save(qqcFdjDhzz);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjDhzz qqcFdjDhzz) {
		qqcFdjDhzzDao.delete(qqcFdjDhzz);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjDhzz qqcFdjDhzz) {
		qqcFdjDhzzDao.save(qqcFdjDhzz);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjDhzz findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjDhzzDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjDhzz> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjDhzzDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
