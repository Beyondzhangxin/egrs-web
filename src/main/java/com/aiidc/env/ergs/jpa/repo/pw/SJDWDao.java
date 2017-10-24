package com.aiidc.env.ergs.jpa.repo.pw;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.aiidc.env.ergs.jpa.po.pw.SJDW;

public interface SJDWDao extends JpaSpecificationExecutor<SJDW>,PagingAndSortingRepository<SJDW, Long> {
	
}
