package com.aiidc.env.ergs.service.pw;

import com.aiidc.env.ergs.jpa.po.yzx.plan.PubKeyId;

public interface PubKeyService {
	//根据keyname获取keyvalue;
	public Integer findByKeyValue(String keyname);
	//更新keyvalue+1;
	public void updateKeyValue(PubKeyId pubKeyId);
}
