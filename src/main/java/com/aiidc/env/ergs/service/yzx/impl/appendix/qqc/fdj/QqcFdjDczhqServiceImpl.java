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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjDczhq;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDczhqDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjDczhqService;

/**
 * @author jiabin fan
 *
 */
@Service 
public class QqcFdjDczhqServiceImpl implements QqcFdjDczhqService {
	@Resource
	private QqcFdjDczhqDao qqcFdjDczhqDao;
	/* 
	 * 添加一个
	 */
	@Override
	public int add(QqcFdjDczhq qqcFdjDczhq) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjDczhq.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjDczhq> chqs = qqcFdjDczhqDao.findByFlbhAndFdjbh(qqcFdjDczhq.getFlbh(), qqcFdjDczhq.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != chqs && chqs.size() > 0){
			for (QqcFdjDczhq chq : chqs) {
				list.add(chq.getBh());
			
			}
			Integer max = Collections.max(list);
			qqcFdjDczhq.setBh(max + 1); 
		}else{
			qqcFdjDczhq.setBh(1);
		}
		}
		qqcFdjDczhqDao.save(qqcFdjDczhq);
		return 1;
	}

	/* 
	 * 删除一个
	 */
	@Override
	public int delete(QqcFdjDczhq qqcFdjDczhq) {
		qqcFdjDczhqDao.delete(qqcFdjDczhq);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjDczhq qqcFdjDczhq) {
		qqcFdjDczhqDao.save(qqcFdjDczhq);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjDczhq findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjDczhqDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjDczhq> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {

		return qqcFdjDczhqDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
