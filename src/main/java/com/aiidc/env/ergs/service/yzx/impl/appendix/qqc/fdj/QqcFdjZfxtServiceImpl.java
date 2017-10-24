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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZfxt;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZfxtDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZfxtService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjZfxtServiceImpl implements QqcFdjZfxtService{
	@Resource
	private QqcFdjZfxtDao qqcFdjZfxtDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjZfxt qqcFdjZfxt) {
		 qqcFdjZfxt = just(qqcFdjZfxt);
		qqcFdjZfxtDao.save(qqcFdjZfxt);
		return 1;
	}

	/**
	 * @param qqcFdjZfxt
	 */
	public QqcFdjZfxt just(QqcFdjZfxt qqcFdjZfxt) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjZfxt.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjZfxt> Zfxts = qqcFdjZfxtDao.findByFlbhAndFdjbh(qqcFdjZfxt.getFlbh(), qqcFdjZfxt.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Zfxts && Zfxts.size() > 0){
			for (QqcFdjZfxt Zfxt : Zfxts) {
				list.add(Zfxt.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjZfxt.setBh(max + 1); 
		}else{
			qqcFdjZfxt.setBh(1);
		}
		}
		return qqcFdjZfxt;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjZfxt qqcFdjZfxt) {
		qqcFdjZfxtDao.delete(qqcFdjZfxt);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjZfxt qqcFdjZfxt) {
		qqcFdjZfxtDao.save(qqcFdjZfxt);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjZfxt findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjZfxtDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjZfxt> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjZfxtDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
