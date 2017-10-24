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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjCnzz;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjCnzzDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjCnzzService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjCnzzServiceImpl implements QqcFdjCnzzService{
	@Resource
	private QqcFdjCnzzDao qqcFdjCnzzDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjCnzz qqcFdjCnzz) {
		qqcFdjCnzz = just(qqcFdjCnzz);
		qqcFdjCnzzDao.save(qqcFdjCnzz);
		return 1;
	}

	/**
	 * @param qqcFdjCnzz
	 */
	public QqcFdjCnzz just(QqcFdjCnzz qqcFdjCnzz) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjCnzz.getBh();
		if(null == bh){	
		//查询所有传感器；
		List<QqcFdjCnzz> cnzzs = qqcFdjCnzzDao.findByFlbhAndFdjbh(qqcFdjCnzz.getFlbh(), qqcFdjCnzz.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != cnzzs && cnzzs.size() > 0){
			for (QqcFdjCnzz cnzz : cnzzs) {
				list.add(cnzz.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjCnzz.setBh(max + 1); 
		}else{
			qqcFdjCnzz.setBh(1);
		}
		}
		return qqcFdjCnzz;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjCnzz qqcFdjCnzz) {
		qqcFdjCnzzDao.delete(qqcFdjCnzz);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjCnzz qqcFdjCnzz) {
		qqcFdjCnzzDao.save(qqcFdjCnzz);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjCnzz findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjCnzzDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjCnzz> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjCnzzDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
