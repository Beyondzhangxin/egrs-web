/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.E3Sbb;
import com.aiidc.env.ergs.jpa.repo.o3.E3SbbDao;
import com.aiidc.env.ergs.service.o3.E3SbbService;

/**
 * @author jiabin fan
 *
 */
@Service
public class E3SbbServiceImpl implements E3SbbService {
	@Resource
	private E3SbbDao e3SbbDao;
	/* 
	 * 
	 */
	@Override
	public void save(E3Sbb e3Sbb) {
		e3SbbDao.save(e3Sbb);
	}

}
