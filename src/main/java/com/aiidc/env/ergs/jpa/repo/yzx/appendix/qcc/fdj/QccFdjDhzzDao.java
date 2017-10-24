/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qcc.fdj;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjDhzz;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjDhzzDao extends CrudRepository<QqcFdjDhzz, Serializable>{
	//根据附录编号和发动机编号查询多个；
	public List<QqcFdjDhzz> findByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//查询一个；
	public QqcFdjDhzz findByFlbhAndFdjbhAndBh(String flbh,Integer fdjbh,Integer bh);
}
