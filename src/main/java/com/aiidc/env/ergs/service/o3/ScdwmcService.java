/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.o3.Scdwmc;

/**
 * @author jiabin fan
 *
 */
public interface ScdwmcService {
	//增加；
		public void addScdwmc(Scdwmc scdwmc);
		//删除；
		public void delScdwmc(Scdwmc scdwmc);
		//修改；
		public void updateScdwmc(Scdwmc scdwmc);
		//根据manufid查询所有的企业名称；
		public List<String> selectScdwmc(String manufid);
}
