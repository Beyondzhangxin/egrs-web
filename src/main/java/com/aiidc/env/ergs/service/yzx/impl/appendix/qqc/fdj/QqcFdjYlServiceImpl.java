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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjYl;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjYlDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjYlService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjYlServiceImpl implements QqcFdjYlService{
	@Resource
	private QqcFdjYlDao qqcFdjYlDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjYl qqcFdjYl) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjYl.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjYl> Yls = qqcFdjYlDao.findByFlbhAndFdjbh(qqcFdjYl.getFlbh(), qqcFdjYl.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Yls && Yls.size() > 0){
			for (QqcFdjYl Yl : Yls) {
				list.add(Yl.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjYl.setBh(max + 1); 
		}else{
			qqcFdjYl.setBh(1);
			}
		}
		qqcFdjYlDao.save(qqcFdjYl);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjYl qqcFdjYl) {
		qqcFdjYlDao.delete(qqcFdjYl);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjYl qqcFdjYl) {
		qqcFdjYlDao.save(qqcFdjYl);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjYl findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjYlDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjYl> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjYlDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
