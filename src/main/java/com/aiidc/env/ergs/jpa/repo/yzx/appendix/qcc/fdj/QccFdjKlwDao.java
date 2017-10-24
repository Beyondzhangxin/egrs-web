/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qcc.fdj;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjKlw;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjKlwDao extends CrudRepository<QccFdjKlw, String> {
	//根据附录编号查询素有的发动机；
	public List<QccFdjKlw> findByFlbh(String flbh);
	//根据附录编号和发动机编号删除发动机；
	@Transactional
	@Modifying
	@Query("delete from QccFdjKlw where flbh = ?1 and fdjbh = ?2")
	public void deleteByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//根据附录编号和发动机编号查出发动机；
	public QccFdjKlw findByFlbhAndFdjbh(String flbh,Integer fdjbh);
}