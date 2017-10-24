/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.TeAppendixDao;
import com.aiidc.env.ergs.service.yzx.appendix.TeAppendixService;

/**
 * @author jiabin fan
 *
 */
@Service
public class TeAppendixServiceImpl implements TeAppendixService {

	@Resource
	private TeAppendixDao teAppendixDao;

	/*
	 * 根据附录编号查找编号
	 */
	@Override
	public String findBhByFlbh(String flbh) {
		// 查询bh;
		List<Integer> bhs = teAppendixDao.findBhByFlbh(flbh);

		if (null != bhs && bhs.size() > 0) {
			// 取出最大的bh
			Integer maxbh = Collections.max(bhs);
			return maxbh + 1 + "";
		}
		return "1";
	}

	/*
	 * 增加
	 */
	@Override
	public int add(TeAppendix teAppendix) {
		String flbh = teAppendix.getFlbh();
		Integer bh = teAppendix.getBh();
		if (null == bh) {
			// 设置bh
			teAppendix.setBh(new Integer(findBhByFlbh(flbh)));
		}
		teAppendixDao.save(teAppendix);
		return teAppendix.getBh();
	}

	/* 
	 * 
	 */
	@Override
	public int delete(String flbh, Integer bh) {
		Integer bhs = new Integer(bh);
		teAppendixDao.deleteByFlbhAndBh(flbh, bhs);
		return 1;
	}

	/*
	 * 查询一个视同附录
	 */
	@Override
	public TeAppendix findByFlbhAndBh(String flbh, Integer bh) {
		int bhs = new Integer(bh);
		return teAppendixDao.findByFlbhAndBh(flbh, bh);
	}

	/*
	 * 查询一组视同附录
	 */
	@Override
	public List<TeAppendix> findByFlbh(String flbh) {
		List<TeAppendix> tes = teAppendixDao.findByFlbh(flbh);
		return tes;
	}

	/* 
	 * 
	 */
	@Override
	public void update(TeAppendix t) {
		teAppendixDao.save(t);
	}

}
