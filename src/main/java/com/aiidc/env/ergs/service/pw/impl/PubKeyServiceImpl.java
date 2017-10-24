package com.aiidc.env.ergs.service.pw.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.plan.PubKeyId;
import com.aiidc.env.ergs.jpa.repo.yzx.plan.PubKeyDao;
import com.aiidc.env.ergs.service.pw.PubKeyService;
/**
 * 计划书编号-流水号
 * @author jiabin fan
 *
 */
@Service
public class PubKeyServiceImpl implements PubKeyService {
	public String keyname;
	public Integer keyvalue;
	
	@Resource
	private PubKeyDao pubKeyDao;
	//根据keyname返回keyvalue;
	@Override
	public Integer findByKeyValue(String keyname) {
		//查询出pubkeyId对象;
		PubKeyId pubKeyId = pubKeyDao.findOne(keyname);
		if (pubKeyId != null) {
			//获得keyvalue;
			keyvalue = pubKeyId.getKeyvalue();
			//keyvalue+1;
			pubKeyId.setKeyvalue(keyvalue + 1);
			//更新pubKeyId;
			updateKeyValue(pubKeyId);
		}
		return keyvalue;
	}
	//更新keyvalue;
	@Override
	public void updateKeyValue(PubKeyId pubKeyId) {
		
		pubKeyDao.save(pubKeyId);
		
	}

}
