/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhqDy;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZhqDyDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZhqDyService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjZhqDyServiceImpl implements QqcFdjZhqDyService {
	@Resource
	private QqcFdjZhqDyDao qqcFdjZhqDyDao;
	/* 
	 * 增加
	 */
	@Override
	public void add(QqcFdjZhqDy qqcFdjZhqDy) {
		qqcFdjZhqDyDao.save(qqcFdjZhqDy);
	}

	/* 
	 * 删除
	 */
	@Override
	public void delete(QqcFdjZhqDy qqcFdjZhqDy) {
		qqcFdjZhqDyDao.delete(qqcFdjZhqDy);
		
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjZhqDy qqcFdjZhqDy) {
		qqcFdjZhqDyDao.save(qqcFdjZhqDy);
		
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjZhqDy findByFlbhAndFdjbhAndBhAndZhqbh(String flbh, Integer fdjbh, Integer bh, Integer zhqbh) {
		return qqcFdjZhqDyDao.findByFlbhAndFdjbhAndBhAndZhqbh(flbh, fdjbh, bh, zhqbh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjZhqDy> findByFlbhAndFdjbhAndZhqbh(String flbh, Integer fdjbh, Integer zhqbh) {

		return qqcFdjZhqDyDao.findByFlbhAndFdjbhAndZhqbh(flbh, fdjbh, zhqbh);
	}

}
