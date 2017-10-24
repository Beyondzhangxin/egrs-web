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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjConfig;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjConfigDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjConfigService;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcFdjConfigServiceImpl implements QqcFdjConfigService {
	@Resource
	private QqcFdjConfigDao qqcFdjConfigDao;
	/* 
	 * 增加
	 */
	@Override
	public int add(QqcFdjConfig qqcFdjConfig) {
		just(qqcFdjConfig);
		qqcFdjConfigDao.save(qqcFdjConfig);
		return 1;
	}

	/**
	 * @param qqcFdjConfig
	 */
	public QqcFdjConfig just(QqcFdjConfig qqcFdjConfig) {
		//取出qqcFjd编号；
		Integer bh = qqcFdjConfig.getBh();
		if(null == bh){
		//查询所有传感器；
		List<QqcFdjConfig> configs = qqcFdjConfigDao.findByFlbhAndFdjbhAndPzlb(qqcFdjConfig.getFlbh(), qqcFdjConfig.getFdjbh(),qqcFdjConfig.getPzlb());
		List<Integer> list = new ArrayList<>();
		//校验；
		if(null != configs && configs.size() > 0){
			for (QqcFdjConfig config : configs) {
				list.add(config.getBh());
			}
			Integer max = Collections.max(list);
			qqcFdjConfig.setBh(max + 1); 
		}else{
			qqcFdjConfig.setBh(1);
			}
		}
		return qqcFdjConfig;
	}

	/* 
	 * 删除
	 */
	@Override
	public int delete(String flbh, Integer fdjbh,Integer bh,String pzlb) {
		qqcFdjConfigDao.deletFdj(flbh, fdjbh, bh, pzlb);
		return 1;
	}

	/* 
	 * 修改
	 */
	@Override
	public void update(QqcFdjConfig qqcFdjConfig) {
		qqcFdjConfigDao.save(qqcFdjConfig);
	}

	/* 
	 * 查询
	 */
	@Override
	public QqcFdjConfig findByFlbhAndFdjbhAndBhAndPzlb(String flbh, Integer fdjbh, Integer bh, String pzlb) {
		
		return qqcFdjConfigDao.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
	}

	/* 
	 * 查询一组
	 */
	@Override
	public List<QqcFdjConfig> findByFlbhAndFdjbhAndPzlb(String flbh, Integer fdjbh, String pzlb) {
		
		return qqcFdjConfigDao.findByFlbhAndFdjbhAndPzlb(flbh, fdjbh, pzlb);
	}

}
