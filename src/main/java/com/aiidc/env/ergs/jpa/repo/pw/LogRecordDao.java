/**
 * 
 */
package com.aiidc.env.ergs.jpa.repo.pw;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.pw.LogRecord;

/**
 * @author wuwen
 *
 */
@Repository
public interface LogRecordDao extends CrudRepository<LogRecord, Long> {

}
