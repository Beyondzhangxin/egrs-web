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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.QccMainCdx;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCdx;

/**
 * @author jiabin fan
 * 轻型车传动系
 */
public interface QccMainCdxDao extends CrudRepository<QccMainCdx, String> {
	//根据附录编号查询编号；
	@Query("select bh from QccMainCdx where flbh = ?1 ")
	public List<Integer> findByFlbh(String flbh);
	//根据附录编号查询所有的传动系；
	@Query("select q from QccMainCdx q where q.flbh = ?1")
	public List<QccMainCdx> findQccMainCdxByFlbh(String flbh);
	//根据附录编号和编号查询传动系
	public QccMainCdx findByFlbhAndBh(String flbh,Integer bh);
	//根据附录编号和编号删除传动系
	@Modifying
	@Transactional
	@Query("delete from QccMainCdx where flbh = ?1 and bh = ?2 ")
	public void deleteByFlbhAndBh(String flbh,Integer bh);
}
