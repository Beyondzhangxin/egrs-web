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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjFl;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjFlDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjFlService;

/**
 * @author jiabin fan
 *
 */
@Service 
public class QqcFdjFlServiceImpl implements QqcFdjFlService {
	@Resource
	private QqcFdjFlDao qqcFdjFlDao;
	/* 
	 * 添加一个
	 */
	@Override
	public int add(QqcFdjFl qqcFdjFl) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjFl.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjFl> Fls = qqcFdjFlDao.findByFlbhAndFdjbh(qqcFdjFl.getFlbh(), qqcFdjFl.getFdjbh());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != Fls && Fls.size() > 0){
			for (QqcFdjFl Fl : Fls) {
				list.add(Fl.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjFl.setBh(max + 1); 
		}else{
			qqcFdjFl.setBh(1);
			}
		}
		qqcFdjFlDao.save(qqcFdjFl);
		return 1;
	}

	/* 
	 * 删除一个
	 */
	@Override
	public int delete(QqcFdjFl qqcFdjFl) {
		qqcFdjFlDao.delete(qqcFdjFl);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjFl qqcFdjFl) {
		qqcFdjFlDao.save(qqcFdjFl);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public QqcFdjFl findByFlbhAndFdjbhAndBh(String flbh, Integer fdjbh, Integer bh) {
		
		return qqcFdjFlDao.findByFlbhAndFdjbhAndBh(flbh, fdjbh,bh);
	}

	/* 
	 * 查询多个
	 */
	@Override
	public List<QqcFdjFl> findByFlbhAndFdjbh(String flbh, Integer fdjbh) {

		return qqcFdjFlDao.findByFlbhAndFdjbh(flbh, fdjbh);
	}

}
