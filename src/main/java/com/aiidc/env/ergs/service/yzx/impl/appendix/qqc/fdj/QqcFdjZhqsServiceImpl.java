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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhqs;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZhqsDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZhqsService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjZhqsServiceImpl implements QqcFdjZhqsService{
	@Resource
	private QqcFdjZhqsDao qqcFdjZhqsDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjZhqs qqcFdjZhqs) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjZhqs.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjZhqs> Zhqss = qqcFdjZhqsDao.findByFlbhAndFdjbh(qqcFdjZhqs.getFlbh(), qqcFdjZhqs.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Zhqss && Zhqss.size() > 0){
			for (QqcFdjZhqs Zhqs : Zhqss) {
				list.add(Zhqs.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjZhqs.setBh(max + 1); 
		}else{
			qqcFdjZhqs.setBh(1);
		}
		}
		qqcFdjZhqsDao.save(qqcFdjZhqs);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjZhqs qqcFdjZhqs) {
		qqcFdjZhqsDao.delete(qqcFdjZhqs);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjZhqs qqcFdjZhqs) {
		qqcFdjZhqsDao.save(qqcFdjZhqs);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjZhqs findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjZhqsDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjZhqs> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjZhqsDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
