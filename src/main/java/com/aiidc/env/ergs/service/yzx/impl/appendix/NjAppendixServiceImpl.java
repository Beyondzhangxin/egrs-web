/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.NjAppendix;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.NjAppendixDao;
import com.aiidc.env.ergs.service.yzx.appendix.NjAppendixService;

/**
 * @author jiabin fan
 *
 */
@Service
public class NjAppendixServiceImpl implements NjAppendixService {

	@Resource
	private NjAppendixDao njAppendixDao;
	
	/* 
	 * 根据附录编号查找编号
	 */
	@Override
	public String findBhByFlbhAndBh(String flbh,Integer bh) {
		//查询bh;
		List<Integer> bhs = njAppendixDao.findBhByFlbhAndBh(flbh,bh);
		
		if (null != bhs && bhs.size() > 0) {
			//取出最大的bh
			Integer maxbh = Collections.max(bhs);
			return maxbh + 1 + "";
		}
		return "1";
	}
	/* 
	 * 增加
	 */
	@Override
	public int add(NjAppendix njAppendix) {
		String flbh = njAppendix.getFlbh();
		Integer bh = njAppendix.getBh();
		Integer njbh = njAppendix.getNjbh();
		if(null == njbh){
			//设置bh
			njAppendix.setNjbh(new Integer(findBhByFlbhAndBh(flbh,bh)));
		}
		njAppendixDao.save(njAppendix);
		return 1;
	}

	/* 
	 * 删除
	 */
	@Override
	public int deleteNj(String flbh, Integer bh,Integer njbh) {
		Integer bhs = new Integer(bh);
		Integer njbhs = new Integer(njbh);
		njAppendixDao.deleteByFlbhAndBhAndNjbh(flbh,bhs,njbhs);
		return 1;
	}


	/* 
	 * 查询一个
	 */
	@Override
	public NjAppendix findByFlbhAndBhAndNjbh(String flbh, Integer bh,Integer njbh) {
		int bhs = new Integer(bh);
		int njbhs = new Integer(njbh);
		return njAppendixDao.findByFlbhAndBhAndNjbh(flbh, bh,njbhs);
	}

	/* 
	 * 查询一组视同附录
	 */
	@Override
	public List<NjAppendix> findByFlbhAndBh(String flbh,Integer bh) {
		List<NjAppendix> njs = njAppendixDao.findByFlbhAndBh(flbh,bh);
		return njs;
	}
	/* 
	 * 
	 */
	@Override
	public String findByVinma(String vinma) {
		
		return njAppendixDao.findByVinma(vinma);
	}
	

}
