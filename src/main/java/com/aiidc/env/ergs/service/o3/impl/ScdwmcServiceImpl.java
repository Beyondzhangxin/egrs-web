/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.Scdwmc;
import com.aiidc.env.ergs.jpa.repo.o3.ScdwmcDao;
import com.aiidc.env.ergs.service.o3.ScdwmcService;

/**
 * @author jiabin fan
 *
 */
@Service
public class ScdwmcServiceImpl implements ScdwmcService {

	@Resource
	private ScdwmcDao scdwmcDao;
	/* 
	 * 新增
	 */
	@Override
	public void addScdwmc(Scdwmc scdwmc) {
		scdwmcDao.save(scdwmc);
	}

	/* 
	 * 删除
	 */
	@Override
	public void delScdwmc(Scdwmc scdwmc) {
		scdwmcDao.delete(scdwmc);
	}

	/* 
	 * 修改
	 */
	@Override
	public void updateScdwmc(Scdwmc scdwmc) {
		scdwmcDao.save(scdwmc);
	}

	/* 
	 * 根据manufid查询生产厂地址；
	 */
	@Override
	public List<String> selectScdwmc(String manufid) {
		List<String> list = new ArrayList<String>();
		//查询
		List<Scdwmc> qymcs = scdwmcDao.findByManufid(manufid);
		if(null != qymcs && qymcs.size() > 0){
			for (Scdwmc scdwmc : qymcs) {
				list.add(scdwmc.getScdwmc());
			}
		return list;
		}
		return null;
	}
}
