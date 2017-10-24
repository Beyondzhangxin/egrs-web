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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPyb;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjPybDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjPybService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjPybServiceImpl implements QqcFdjPybService{
	@Resource
	private QqcFdjPybDao qqcFdjPybDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjPyb qqcFdjPyb) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjPyb.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjPyb> Pybs = qqcFdjPybDao.findByFlbhAndFdjbh(qqcFdjPyb.getFlbh(), qqcFdjPyb.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Pybs && Pybs.size() > 0){
			for (QqcFdjPyb Pyb : Pybs) {
				list.add(Pyb.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjPyb.setBh(max + 1); 
		}else{
			qqcFdjPyb.setBh(1);
		}
		}
		qqcFdjPybDao.save(qqcFdjPyb);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjPyb qqcFdjPyb) {
		qqcFdjPybDao.delete(qqcFdjPyb);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjPyb qqcFdjPyb) {
		qqcFdjPybDao.save(qqcFdjPyb);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjPyb findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjPybDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjPyb> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjPybDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
