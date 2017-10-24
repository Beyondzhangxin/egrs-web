/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.constant;

import java.util.ArrayList;
import java.util.List;

import com.aiidc.env.ergs.common.converter.BaseEnum;
import com.aiidc.env.ergs.common.metro.vo.LableValueVo;

/**
 * 受检单位类别
 * 
 * @author wuwenjun
 *
 */
public enum SJDWType implements BaseEnum {
	SELF_PRODUCED("自产汽车"), HOT_ROD("改装汽车"), MOTOR("摩托车"), HEAVY_MOTOR("重型发动机"), NON_ROAD("非道路移动器械"), IMPORT("进口");
	private String value;

	SJDWType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static List<LableValueVo> data() {
		List<LableValueVo> data = new ArrayList<LableValueVo>();
		for (SJDWType type : SJDWType.values()) {
			data.add(new LableValueVo(type.value, String.valueOf(type.ordinal())));
		}
		return data;
	}

	@Override
	public int getOrdinal() {
		return this.ordinal();
	}
}
