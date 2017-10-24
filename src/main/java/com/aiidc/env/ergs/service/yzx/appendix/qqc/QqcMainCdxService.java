/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCdx;

/**
 * @author jiabin fan 轻型车传动系
 */
public interface QqcMainCdxService {
	// 根据flbh查询bh并且按照bh降序
	public String findBhByFlbh(String flbh);

	// 添加新的传动系
	public int addQqcMainCdx(QqcMainCdx qqcMainCdx);

	// 修改传动系
	public void updateQqcMainCdx(QqcMainCdx qqcMainCdx);

	// 删除传动系
	public int deleteQqcMainCdx(String flb, String bh);

	// 根据flbh查询所有的传动系；
	public List<QqcMainCdx> findAllCdxByFlbh(String flbh);

	// 根据附录编号和编号查出所对应的传动系；
	public QqcMainCdx findByFlbhAndBh(String flbh, String bh);

}
