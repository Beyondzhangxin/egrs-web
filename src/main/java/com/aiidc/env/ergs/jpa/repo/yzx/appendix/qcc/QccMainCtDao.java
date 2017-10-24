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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.QccMainCt;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCt;

/**
 * @author jiabin fan
 *
 */
public interface QccMainCtDao extends CrudRepository<QccMainCt, String> {
	//根据附录编号获取编号
	public List<QccMainCt> findByFlbh(String flbh);
	//根据附录编号和编号删除车体；
	@Transactional
	@Modifying
	@Query("delete from QccMainCt where flbh = ?1 and bh = ?2")
	public void deleteCt(String flbh,Integer bh);
	//根据附录编号和编号查询某个车体；
	public QccMainCt findByFlbhAndBh(String flbh,Integer bh);
	
}
