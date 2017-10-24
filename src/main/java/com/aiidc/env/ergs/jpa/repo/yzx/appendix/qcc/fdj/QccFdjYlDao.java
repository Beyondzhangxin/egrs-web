/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qcc.fdj;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjYl;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjYlDao extends CrudRepository<QccFdjYl, Serializable>{
	//根据附录编号和发动机编号查询多个；
	public List<QccFdjYl> findByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//查询一个；
	public QccFdjYl findByFlbhAndFdjbhAndBh(String flbh,Integer fdjbh,Integer bh);
}
