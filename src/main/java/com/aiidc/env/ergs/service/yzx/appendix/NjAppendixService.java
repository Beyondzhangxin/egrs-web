/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.NjAppendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.util.BaseService;

/**
 * @author jiabin fan
 *
 */
public interface NjAppendixService  {
	//查询编号
	String findBhByFlbhAndBh(String flbh,Integer bh);
	 //删除
	int deleteNj(String flbh, Integer bh, Integer njbh);
	//查一组
	List<NjAppendix> findByFlbhAndBh(String flbh,Integer bh);
	//增加
	int add(NjAppendix njAppendix);
	//查询一个
	NjAppendix findByFlbhAndBhAndNjbh(String flbh,Integer bh,Integer njbh);
	
	String findByVinma(String vinma);
}
