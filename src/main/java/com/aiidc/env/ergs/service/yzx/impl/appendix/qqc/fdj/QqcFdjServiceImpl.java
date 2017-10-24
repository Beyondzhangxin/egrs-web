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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdj;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjService;

/**
 * @author jiabin fan
 * 轻型车发动机
 */
@Service
public class QqcFdjServiceImpl implements QqcFdjService {
	@Resource 
	private QqcFdjDao qqcFdjDao;
	/* 
	 * 增加一个发动机
	 */
	@Override
	public int add(QqcFdj qqcFdj) {
		qqcFdj = just(qqcFdj);
		qqcFdjDao.save(qqcFdj);
		return 1;
	}

	/**
	 * @param qqcFdj
	 */
	public QqcFdj just(QqcFdj qqcFdj) {
		//取出qqcFjd编号；
		Integer fdjbh = qqcFdj.getFdjbh();
		if(null == fdjbh){
			//根据附录编号查询所有的车体；
			List<QqcFdj> fdjs = qqcFdjDao.findByFlbh(qqcFdj.getFlbh());
			//用于存放编号；
			List<Integer> list = new ArrayList<Integer>();
			if (null != fdjs && fdjs.size() > 0) {
				for (QqcFdj fdj : fdjs) {
					list.add(fdj.getFdjbh());
				}
				//取出最大的数；
				Integer max = Collections.max(list);
				qqcFdj.setFdjbh(max + 1);
			}else{
				qqcFdj.setFdjbh(1);
			}
		}
		return qqcFdj;
	}

	/* 
	 * 删除发动机
	 */
	@Override
	public int delete(String flbh, Integer fdjbh) {
		qqcFdjDao.deleteByFlbhAndFdjbh(flbh, fdjbh);
		return 1;
	}

	/* 
	 * 修改发动机
	 */
	@Override
	public void update(QqcFdj qqcFdj) {
		//根据flbh和fdjbh查出发动机；
		qqcFdjDao.save(qqcFdj);
	}

	/* 
	 * 根据附录编号和发动机编号查询一个发动机
	 */
	@Override
	public QqcFdj findByFlbhAndBh(String flbh, Integer fdjbh) {
		
		return qqcFdjDao.findByFlbhAndFdjbh(flbh,fdjbh);
	}

	/* 
	 * 根据附录编号查询所有
	 */
	@Override
	public List<QqcFdj> findByFlbh(String flbh) {
		//根据附录编号查询所有的车体；
	   List<QqcFdj> fdjs = qqcFdjDao.findByFlbh(flbh);
		return fdjs;
	}
	
}
