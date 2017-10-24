/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.E3SbbXzmx;
import com.aiidc.env.ergs.jpa.repo.o3.E3SbbXzmxDao;
import com.aiidc.env.ergs.service.o3.E3SbbXzmxService;

/**
 * @author jiabin fan
 *
 */
@Service
public class E3SbbXzmxServiceImpl implements E3SbbXzmxService {
	@Resource
	private E3SbbXzmxDao e3SbbXzmxDao;
	/* 
	 * 
	 */
	@Override
	public void save(E3SbbXzmx e3SbbXzmx) {
		e3SbbXzmxDao.save(e3SbbXzmx);
	}

}
