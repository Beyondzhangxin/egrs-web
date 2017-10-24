package com.aiidc.env.ergs.jpa.repo.yzx.plan;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.yzx.plan.PubKeyId;

public interface PubKeyDao extends CrudRepository<PubKeyId, Serializable>{
	
}
