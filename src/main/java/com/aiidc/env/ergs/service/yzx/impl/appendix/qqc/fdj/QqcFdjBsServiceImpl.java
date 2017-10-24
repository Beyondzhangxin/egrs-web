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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjBs;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjBsDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjBsServiceImpl implements QqcFdjBsService {
	@Resource
	private QqcFdjBsDao qqcFdjBsDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjBs qqcFdjBs) {
		/*//取出qqcFjd编号；
		Integer bh = qqcFdjBs.getBh();
		if(null == bh){
		//查询所有
		List<QqcFdjBs> bss = qqcFdjBsDao.findByFlbhAndFdjbhAndPzlb(qqcFdjBs.getFlbh(), qqcFdjBs.getFdjbh(),qqcFdjBs.getPzlb());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != bss && bss.size() > 0){
			for (QqcFdjBs bs : bss) {
				list.add(bs.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjBs.setBh(max + 1); 
		}else{
			qqcFdjBs.setBh(1);
			}
		}*/
		qqcFdjBsDao.save(qqcFdjBs);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(String flbh, Integer fdjbh,Integer bh,String pzlb) {
		qqcFdjBsDao.deletFdj(flbh, fdjbh, bh, pzlb);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjBs qqcFdjBs) {
		qqcFdjBsDao.save(qqcFdjBs);
	}

	/* 
	 * 查询
	 */
	@Override
	public QqcFdjBs findByFlbhAndFdjbhAndBhAndPzlb(String flbh, Integer fdjbh, Integer bh, String pzlb) {
		
		return qqcFdjBsDao.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
	}
	/* 
	 * 查询一组
	 */
	@Override
	public List<QqcFdjBs> findByFlbhAndFdjbhAndPzlb(String flbh, Integer fdjbh, String pzlb) {
		
		return qqcFdjBsDao.findByFlbhAndFdjbhAndPzlb(flbh, fdjbh, pzlb);
	}

}
