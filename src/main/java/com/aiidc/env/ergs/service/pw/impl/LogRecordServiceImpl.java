/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.impl;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.aspect.LogRecordService;
import com.aiidc.env.ergs.jpa.po.pw.LogRecord;
import com.aiidc.env.ergs.jpa.repo.pw.LogRecordDao;

/**
 * @author wuwenjun
 *
 */
@Service
public class LogRecordServiceImpl implements LogRecordService {

	@Resource
	private LogRecordDao dao;

	@Async
	@Override
	public void save(LogRecord entity) {
		dao.save(entity);
	}
}
