/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjWd;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjWdDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjWdService;

/**
 * @author jiabin fan
 * 轻型车发动机
 */
@Service
public class QqcFdjWdServiceImpl implements QqcFdjWdService {
	@Resource 
	private QqcFdjWdDao qqcFdjWdDao;
	/* 
	 * 增加一个发动机
	 */
	@Override
	public int add(QqcFdjWd qqcFdjWd) {
	/*	//根据附录编号查询所有的车体；
		List<QqcFdjWd> Wds = qqcFdjWdDao.findByFlbh(qqcFdjWd.getFlbh());
		//用于存放编号；
		List<Integer> list = new ArrayList<Integer>();
		if (null != list && Wds.size() > 0) {
			for (QqcFdjWd Wd : Wds) {
				list.add(Wd.getFdjbh());
			}
			//取出最大的数；
			 Integer max = Collections.max(list);
			 qqcFdjWd.setFdjbh(max + 1);
		}else{
			
			qqcFdjWd.setFdjbh(1);
		}*/
		qqcFdjWdDao.save(qqcFdjWd);
		return 1;
	}

	/* 
	 * 删除发动机
	 */
	@Override
	public int delete(String flbh, Integer fdjbh) {
		qqcFdjWdDao.deleteByFlbhAndFdjbh(flbh, fdjbh);
		return 1;
	}

	/* 
	 * 修改发动机
	 */
	@Override
	public void update(QqcFdjWd qqcFdjWd) {
		//根据flbh和fdjbh查出发动机；
		qqcFdjWdDao.save(qqcFdjWd);
	}

	/* 
	 * 根据附录编号和发动机编号查询一个发动机
	 */
	@Override
	public QqcFdjWd findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjWdDao.findByFlbhAndFdjbh(flbh,fdjbh);
	}

	/* 
	 * 根据附录编号查询所有
	 */
	@Override
	public List<QqcFdjWd> findByFlbh(String flbh) {
		//根据附录编号查询所有的车体；
	   List<QqcFdjWd> Wds = qqcFdjWdDao.findByFlbh(flbh);
		return Wds;
	}
	
}
