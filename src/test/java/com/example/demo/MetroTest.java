/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.example.demo;

import java.util.List;

import org.junit.Test;

import com.aiidc.env.ergs.common.metro.MetroMessage;
import com.aiidc.env.ergs.common.metro.MetroUtil;
import com.aiidc.env.ergs.common.metro.vo.LableValueVo;
import com.aiidc.env.ergs.constant.Vehicle;
import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;

/**
 * @author wuwenjun
 *
 */
public class MetroTest {

	@Test
	public void test() {
		MetroMessage[] ms = MetroUtil.getMetroMessage(E3Tmn.class);
		for (MetroMessage metroField : ms) {
			System.out.println(metroField.getCh());
		}
		List<LableValueVo> ds = Vehicle.data();
		for (LableValueVo lableValueVo : ds) {
			System.out.println(lableValueVo.getValue());
		}
	}

}
