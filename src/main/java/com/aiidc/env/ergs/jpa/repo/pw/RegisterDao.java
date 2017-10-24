/**
 * 
 */
package com.aiidc.env.ergs.jpa.repo.pw;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.pw.Register;

/**
 * @author wuwen
 *
 */
@Repository
public interface RegisterDao extends PagingAndSortingRepository<Register, Long>, JpaSpecificationExecutor<Register> {

}
