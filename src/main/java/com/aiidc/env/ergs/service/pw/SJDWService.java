package com.aiidc.env.ergs.service.pw;

import com.aiidc.env.ergs.jpa.po.pw.SJDW;

/**
 * 根据manuid获取ymanuid
 * 
 * @author jiabin fan
 *
 */
public interface SJDWService {
	SJDW findByManufid(Long Manufid);

	void update(SJDW sjdw);
}
