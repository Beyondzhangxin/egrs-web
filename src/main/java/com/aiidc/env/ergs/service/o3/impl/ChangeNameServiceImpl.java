/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.repo.o3.ChangeNameDao;
import com.aiidc.env.ergs.service.o3.ChangeNameService;

/**
 * @author jiabin fan
 *
 */
@Service
public class ChangeNameServiceImpl implements ChangeNameService {

	@Resource 
	private ChangeNameDao changeNameDao;
	/* 
	 * 根据旧名字获取新的更新过的名字
	 */
	@Override
	public String getNewName(String oldName) {
		
		return changeNameDao.findByOname(oldName);
	}
}
