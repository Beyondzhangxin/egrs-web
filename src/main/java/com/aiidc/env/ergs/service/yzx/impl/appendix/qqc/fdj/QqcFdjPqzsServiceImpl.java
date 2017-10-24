/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPqzs;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjPqzsDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjPqzsService;

/**
 * @author jiabin fan
 * 轻型车发动机
 */
@Service
public class QqcFdjPqzsServiceImpl implements QqcFdjPqzsService {
	@Resource 
	private QqcFdjPqzsDao qqcFdjPqzsDao;
	/* 
	 * 增加一个发动机
	 */
	@Override
	public int add(QqcFdjPqzs qqcFdjPqzs) {
		/*//根据附录编号查询所有的车体；
		List<QqcFdjPqzs> Pqzss = qqcFdjPqzsDao.findByFlbh(qqcFdjPqzs.getFlbh());
		//用于存放编号；
		List<Integer> list = new ArrayList<Integer>();
		if (null != list && Pqzss.size() > 0) {
			for (QqcFdjPqzs Pqzs : Pqzss) {
				list.add(Pqzs.getFdjbh());
			}
			//取出最大的数；
			 Integer max = Collections.max(list);
			 qqcFdjPqzs.setFdjbh(max + 1);
		}else{
			
			qqcFdjPqzs.setFdjbh(1);
		}*/
		qqcFdjPqzsDao.save(qqcFdjPqzs);
		return 1;
	}

	/* 
	 * 删除发动机
	 */
	@Override
	public int delete(String flbh, Integer fdjbh) {
		qqcFdjPqzsDao.deleteByFlbhAndFdjbh(flbh, fdjbh);
		return 1;
	}

	/* 
	 * 修改发动机
	 */
	@Override
	public void update(QqcFdjPqzs qqcFdjPqzs) {
		//根据flbh和fdjbh查出发动机；
		qqcFdjPqzsDao.save(qqcFdjPqzs);
	}

	/* 
	 * 根据附录编号和发动机编号查询一个发动机
	 */
	@Override
	public QqcFdjPqzs findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjPqzsDao.findByFlbhAndFdjbh(flbh,fdjbh);
	}

	/* 
	 * 根据附录编号查询所有
	 */
	@Override
	public List<QqcFdjPqzs> findByFlbh(String flbh) {
		//根据附录编号查询所有的车体；
	   List<QqcFdjPqzs> Pqzss = qqcFdjPqzsDao.findByFlbh(flbh);
		return Pqzss;
	}
	
}
