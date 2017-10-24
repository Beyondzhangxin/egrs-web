package com.aiidc.env.ergs.service.pw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.jpa.po.pw.SJDW;
import com.aiidc.env.ergs.jpa.repo.pw.SJDWDao;
import com.aiidc.env.ergs.service.pw.SJDWService;

/**
 * 根据manuid查询SJDW
 * 
 * @author jiabin fan
 *
 */
@Service
public class SJDWServiceImpl implements SJDWService {
	@Autowired
	private SJDWDao SJDWdao;

	// 根据manuid查询sjdw;
	@Override
	public SJDW findByManufid(Long Manufid) {
		return SJDWdao.findOne(Manufid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.pw.SJDWService#update(com.aiidc.env.ergs.jpa.
	 * po.pw.SJDW)
	 */
	@Override
	public void update(SJDW sjdw) {
		SJDW item = SJDWdao.findOne(sjdw.getManufid());
		BeanUtil.copyProperties(sjdw, item);
		SJDWdao.save(item);
	}

}
