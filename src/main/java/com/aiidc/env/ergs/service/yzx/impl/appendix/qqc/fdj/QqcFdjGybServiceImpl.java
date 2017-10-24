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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjGyb;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjGybDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjGybService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjGybServiceImpl implements QqcFdjGybService{
	@Resource
	private QqcFdjGybDao qqcFdjGybDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjGyb qqcFdjGyb) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjGyb.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjGyb> Gybs = qqcFdjGybDao.findByFlbhAndFdjbh(qqcFdjGyb.getFlbh(), qqcFdjGyb.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Gybs && Gybs.size() > 0){
			for (QqcFdjGyb Gyb : Gybs) {
				list.add(Gyb.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjGyb.setBh(max + 1); 
		}else{
			qqcFdjGyb.setBh(1);
			}
		}
		qqcFdjGybDao.save(qqcFdjGyb);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(QqcFdjGyb qqcFdjGyb) {
		qqcFdjGybDao.delete(qqcFdjGyb);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjGyb qqcFdjGyb) {
		qqcFdjGybDao.save(qqcFdjGyb);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjGyb findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjGybDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjGyb> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjGybDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
