/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.pw;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.pw.EnvFile;

/**
 * @author wuwenjun
 *
 */
@Repository
public interface EnvFileDao extends CrudRepository<EnvFile, String> {
	@Query("from EnvFile where used=false and createTime<?1")
	List<EnvFile> getUnusedFiles(Date time);

}
