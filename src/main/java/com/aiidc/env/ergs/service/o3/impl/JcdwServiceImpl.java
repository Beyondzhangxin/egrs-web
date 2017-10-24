/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.o3.Jcdw;
import com.aiidc.env.ergs.jpa.repo.o3.JcdwDao;
import com.aiidc.env.ergs.service.o3.JcdwService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author wuwenjun
 *
 */
@Service
public class JcdwServiceImpl implements JcdwService {
	@Resource
	private JcdwDao dao;

	@Override
	public void addAuth(String jcwdId) {
		Jcdw item = dao.findOne(jcwdId);
		item.add(LoginUserUtil.getLoginManufid());
		dao.save(item);
	}

	@Override
	public void removeAuth(String jcwdId) {
		Jcdw item = dao.findOne(jcwdId);
		item.remove(LoginUserUtil.getLoginManufid());
		dao.save(item);
	}

	@Override
	public Page<Jcdw> find(QryPageVo qryVo) {
		return dao.findAll(qryVo.pageRequest());
	}

}
