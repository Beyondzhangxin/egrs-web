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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjCgq;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjCgqDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjCgqService;

/**
 * @author jiabin fan
 *
 */
@Service 
public class QqcFdjCgqServiceImpl implements QqcFdjCgqService {
	@Resource
	private QqcFdjCgqDao qqcFdjCgqDao;
	/* 
	 * 添加一个
	 */
	@Override
	public int add(QqcFdjCgq qqcFdjCgq) {
		qqcFdjCgq = just(qqcFdjCgq);
		qqcFdjCgqDao.save(qqcFdjCgq);
		return 1;
	}

	/**
	 * @param qqcFdjCgq
	 */
	public QqcFdjCgq just(QqcFdjCgq qqcFdjCgq) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjCgq.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjCgq> cgqs = qqcFdjCgqDao.findByFlbhAndFdjbh(qqcFdjCgq.getFlbh(), qqcFdjCgq.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != cgqs && cgqs.size() > 0){
			for (QqcFdjCgq cgq : cgqs) {
				list.add(cgq.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjCgq.setBh(max + 1); 
		}else{
			qqcFdjCgq.setBh(1);
		}
		}
		return qqcFdjCgq;
	}

	/* 
	 * 删除一个
	 */
	@Override
	public int delete(QqcFdjCgq qqcFdjCgq) {
		qqcFdjCgqDao.delete(qqcFdjCgq);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjCgq qqcFdjCgq) {
		qqcFdjCgqDao.save(qqcFdjCgq);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjCgq findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjCgqDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjCgq> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {

		return qqcFdjCgqDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
