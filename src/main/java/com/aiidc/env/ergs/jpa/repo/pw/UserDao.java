/**
 * 
 */
package com.aiidc.env.ergs.jpa.repo.pw;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.pw.User;

/**
 * @author wuwen
 *
 */
@Repository
public interface UserDao extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {

	User findByManufidAndUsername(String manufid, String username);

	Integer countByEmail(String email);

	Integer countByManufidAndUsername(String manufid, String username);

}
