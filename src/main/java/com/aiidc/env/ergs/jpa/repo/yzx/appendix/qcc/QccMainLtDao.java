/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qcc;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.QccMainLt;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainLt;

/**
 * @author jiabin fan
 *
 */
public interface QccMainLtDao extends CrudRepository<QccMainLt, String> {
	//根据附录编号获取编号
	public List<QccMainLt> findByFlbh(String flbh);
	//根据附录编号和编号删除；
	@Transactional
	@Modifying
	@Query("delete from QccMainLt where flbh = ?1 and bh = ?2")
	public void deleteLt(String flbh,Integer bh);
	//根据附录编号和编号查询某个；
	public QccMainLt findByFlbhAndBh(String flbh,Integer bh);
}
