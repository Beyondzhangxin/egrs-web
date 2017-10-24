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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPqxt;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjPqxtDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjPqxtService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjPqxtServiceImpl implements QqcFdjPqxtService{
	@Resource
	private QqcFdjPqxtDao qqcFdjPqxtDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjPqxt qqcFdjPqxt) {
		QqcFdjPqxt qqcFdjPqxt1 = just(qqcFdjPqxt);
		qqcFdjPqxtDao.save(qqcFdjPqxt1);
		return 1;
	}

	/**
	 * @param qqcFdjPqxt
	 */
	public QqcFdjPqxt just(QqcFdjPqxt qqcFdjPqxt) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjPqxt.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjPqxt> Pqxts = qqcFdjPqxtDao.findByFlbhAndFdjbh(qqcFdjPqxt.getFlbh(), qqcFdjPqxt.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Pqxts && Pqxts.size() > 0){
			for (QqcFdjPqxt Pqxt : Pqxts) {
				list.add(Pqxt.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjPqxt.setBh(max + 1); 
		}else{
			qqcFdjPqxt.setBh(1);
		}
		}
		return qqcFdjPqxt;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjPqxt qqcFdjPqxt) {
		qqcFdjPqxtDao.delete(qqcFdjPqxt);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjPqxt qqcFdjPqxt) {
		qqcFdjPqxtDao.save(qqcFdjPqxt);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjPqxt findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjPqxtDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjPqxt> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjPqxtDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
