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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjDj;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDjDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjDjService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjDjServiceImpl implements QqcFdjDjService{
	@Resource
	private QqcFdjDjDao qqcFdjDjDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjDj qqcFdjDj) {
		qqcFdjDj = just(qqcFdjDj);
		qqcFdjDjDao.save(qqcFdjDj);
		return 1;
	}

	/**
	 * @param qqcFdjDj
	 */
	public QqcFdjDj just(QqcFdjDj qqcFdjDj) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjDj.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjDj> Djs = qqcFdjDjDao.findByFlbhAndFdjbh(qqcFdjDj.getFlbh(), qqcFdjDj.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Djs && Djs.size() > 0){
			for (QqcFdjDj Dj : Djs) {
				list.add(Dj.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjDj.setBh(max + 1); 
		}else{
			qqcFdjDj.setBh(1);
		}
		}
		return qqcFdjDj;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjDj qqcFdjDj) {
		qqcFdjDjDao.delete(qqcFdjDj);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjDj qqcFdjDj) {
		qqcFdjDjDao.save(qqcFdjDj);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjDj findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjDjDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjDj> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjDjDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
