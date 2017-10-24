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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjLqdx;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjLqdxDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjLqdxService;

/**
 * @author jiabin fan
 * 轻型车发动机
 */
@Service
public class QqcFdjLqdxServiceImpl implements QqcFdjLqdxService {
	@Resource 
	private QqcFdjLqdxDao qqcFdjLqdxDao;
	/* 
	 * 增加一个发动机
	 */
	@Override
	public int add(QqcFdjLqdx qqcFdjLqdx) {
		//根据附录编号查询所有的车体；
		/*List<QqcFdjLqdx> Lqdxs = qqcFdjLqdxDao.findByFlbh(qqcFdjLqdx.getFlbh());
		//用于存放编号；
		List<Integer> list = new ArrayList<Integer>();
		if (null != list && Lqdxs.size() > 0) {
			for (QqcFdjLqdx Lqdx : Lqdxs) {
				list.add(Lqdx.getFdjbh());
			}
			//取出最大的数；
			 Integer max = Collections.max(list);
			 qqcFdjLqdx.setFdjbh(max + 1);
		}else{
			
			qqcFdjLqdx.setFdjbh(1);
		}*/
		qqcFdjLqdxDao.save(qqcFdjLqdx);
		return 1;
	}

	/* 
	 * 删除发动机
	 */
	@Override
	public int delete(String flbh, Integer fdjbh) {
		qqcFdjLqdxDao.deleteByFlbhAndFdjbh(flbh, fdjbh);
		return 1;
	}

	/* 
	 * 修改发动机
	 */
	@Override
	public void update(QqcFdjLqdx qqcFdjLqdx) {
		//根据flbh和fdjbh查出发动机；
		qqcFdjLqdxDao.save(qqcFdjLqdx);
	}

	/* 
	 * 根据附录编号和发动机编号查询一个发动机
	 */
	@Override
	public QqcFdjLqdx findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjLqdxDao.findByFlbhAndFdjbh(flbh,fdjbh);
	}

	/* 
	 * 根据附录编号查询所有
	 */
	@Override
	public List<QqcFdjLqdx> findByFlbh(String flbh) {
		//根据附录编号查询所有的车体；
	   List<QqcFdjLqdx> Lqdxs = qqcFdjLqdxDao.findByFlbh(flbh);
		return Lqdxs;
	}
	
}
