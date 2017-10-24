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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjRhx;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjRhx;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjRhxDao extends CrudRepository<QccFdjRhx, String> {
	//根据附录编号查询素有的发动机；
	public List<QccFdjRhx> findByFlbh(String flbh);
	//根据附录编号和发动机编号删除发动机；
	@Transactional
	@Modifying
	@Query("delete from QccFdjRhx where flbh = ?1 and fdjbh = ?2")
	public void deleteByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//根据附录编号和发动机编号查出发动机；
	public QccFdjRhx findByFlbhAndFdjbh(String flbh,Integer fdjbh);
}
