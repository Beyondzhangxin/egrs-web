/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjRhx;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjRhxDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjRhxService;

/**
 * @author jiabin fan
 * 轻型车发动机
 */
@Service
public class QqcFdjRhxServiceImpl implements QqcFdjRhxService {
	@Resource 
	private QqcFdjRhxDao qqcFdjRhxDao;
	/* 
	 * 增加一个发动机
	 */
	@Override
	public int add(QqcFdjRhx qqcFdjRhx) {
		/*//根据附录编号查询所有的车体；
		List<QqcFdjRhx> Rhxs = qqcFdjRhxDao.findByFlbh(qqcFdjRhx.getFlbh());
		//用于存放编号；
		List<Integer> list = new ArrayList<Integer>();
		if (null != list && Rhxs.size() > 0) {
			for (QqcFdjRhx Rhx : Rhxs) {
				list.add(Rhx.getFdjbh());
			}
			//取出最大的数；
			 Integer max = Collections.max(list);
			 qqcFdjRhx.setFdjbh(max + 1);
		}else{
			
			qqcFdjRhx.setFdjbh(1);
		}*/
		qqcFdjRhxDao.save(qqcFdjRhx);
		return 1;
	}

	/* 
	 * 删除发动机
	 */
	@Override
	public int delete(String flbh, Integer fdjbh) {
		qqcFdjRhxDao.deleteByFlbhAndFdjbh(flbh, fdjbh);
		return 1;
	}

	/* 
	 * 修改发动机
	 */
	@Override
	public void update(QqcFdjRhx qqcFdjRhx) {
		//根据flbh和fdjbh查出发动机；
		qqcFdjRhxDao.save(qqcFdjRhx);
	}

	/* 
	 * 根据附录编号和发动机编号查询一个发动机
	 */
	@Override
	public QqcFdjRhx findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjRhxDao.findByFlbhAndFdjbh(flbh,fdjbh);
	}

	/* 
	 * 根据附录编号查询所有
	 */
	@Override
	public List<QqcFdjRhx> findByFlbh(String flbh) {
		//根据附录编号查询所有的车体；
	   List<QqcFdjRhx> Rhxs = qqcFdjRhxDao.findByFlbh(flbh);
		return Rhxs;
	}
	
}
