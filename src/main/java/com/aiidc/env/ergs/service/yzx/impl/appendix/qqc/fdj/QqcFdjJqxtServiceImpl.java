/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjJqxt;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjJqxtDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjJqxtService;

/**
 * @author jiabin fan
 * 轻型车发动机
 */
@Service
public class QqcFdjJqxtServiceImpl implements QqcFdjJqxtService {
	@Resource 
	private QqcFdjJqxtDao qqcFdjJqxtDao;
	/* 
	 * 增加一个
	 */
	@Override
	public int add(QqcFdjJqxt qqcFdjJqxt) {
/*		//取出qqcFjd编号；
		Integer fdjbh = qqcFdjJqxt.getFdjbh();
		if(null == fdjbh){
		//根据附录编号查询所有的车体；
		List<QqcFdjJqxt> Jqxts = qqcFdjJqxtDao.findByFlbh(qqcFdjJqxt.getFlbh());
		//用于存放编号；
		List<Integer> list = new ArrayList<Integer>();
		if (null != list && Jqxts.size() > 0) {
			for (QqcFdjJqxt Jqxt : Jqxts) {
				list.add(Jqxt.getFdjbh());
			}
			//取出最大的数；
			 Integer max = Collections.max(list);
			 qqcFdjJqxt.setFdjbh(max + 1);
		}else{
			
			qqcFdjJqxt.setFdjbh(1);
			}
		}*/
		qqcFdjJqxtDao.save(qqcFdjJqxt);
		return 1;
	}

	/* 
	 * 删除发动机
	 */
	@Override
	public int delete(String flbh, Integer fdjbh) {
		qqcFdjJqxtDao.deleteByFlbhAndFdjbh(flbh, fdjbh);
		return 1;
	}

	/* 
	 * 修改发动机
	 */
	@Override
	public void update(QqcFdjJqxt qqcFdjJqxt) {
		//根据flbh和fdjbh查出发动机；
		qqcFdjJqxtDao.save(qqcFdjJqxt);
	}

	/* 
	 * 根据附录编号和发动机编号查询一个发动机
	 */
	@Override
	public QqcFdjJqxt findByFlbhAndFdjbh(String flbh, Integer fdjbh) {
		
		return qqcFdjJqxtDao.findByFlbhAndFdjbh(flbh,fdjbh);
	}

	/* 
	 * 根据附录编号查询所有
	 */
	@Override
	public List<QqcFdjJqxt> findByFlbh(String flbh) {
		//根据附录编号查询所有的车体；
	   List<QqcFdjJqxt> Jqxts = qqcFdjJqxtDao.findByFlbh(flbh);
		return Jqxts;
	}
	
}
