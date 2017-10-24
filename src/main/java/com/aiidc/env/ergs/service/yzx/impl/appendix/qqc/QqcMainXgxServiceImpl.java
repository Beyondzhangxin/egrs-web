/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainXgx;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainXgxDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainXgxService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcMainXgxServiceImpl implements QqcMainXgxService{
	@Resource
	private QqcMainXgxDao qqcMainXgxDao;

	/* 
	 * 根据flbh查询编号；
	 */
	@Override
	public Integer findBhByFlbh(String flbh) {
		//获取所有的附录对应的编号；
		List<Integer> bhs = qqcMainXgxDao.findByFlbh(flbh);
		//取出最大的编号
		if(null != bhs && bhs.size() > 0){
			Integer maxBh = Collections.max(bhs);
			return maxBh + 1;
		}
		return 1;
	}

	/* 
	 * 添加悬挂系
	 */
	@Override
	public void addQqcMainXgx(QqcMainXgx qqcMainXgx) {
		Integer bh = findBhByFlbh(qqcMainXgx.getFlbh());
		qqcMainXgx.setBh(bh);
		qqcMainXgxDao.save(qqcMainXgx);
	}

	/* 
	 * 修改悬挂系；
	 */
	@Override
	public void updateQqcMainXgx(QqcMainXgx qqcMainXgx) {
		qqcMainXgxDao.save(qqcMainXgx);
	}

	/* 
	 * 删除悬挂系；
	 */
	@Override
	public void deleteQqcMainXgx(String flbh, Integer bh) {
		qqcMainXgxDao.deleteByFlbhAndBh(flbh, bh);
	}

	/* 
	 * 根据附录编号和编号查询单个悬挂系
	 */
	@Override
	public QqcMainXgx findByFlbhAndBh(String flbh, Integer bh) {
		
		return qqcMainXgxDao.findByFlbhAndBh(flbh, bh);
	}

	/* 
	 * 根据附录编号查询素有的悬挂系；
	 */
	@Override
	public List<QqcMainXgx> findByFlbh(String flbh) {
		
		return qqcMainXgxDao.findAll(flbh);
	}

}
