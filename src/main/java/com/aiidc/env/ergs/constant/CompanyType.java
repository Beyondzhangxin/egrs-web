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
 * 企业类别
 * 
 * @author wuwenjun
 *
 */
public enum CompanyType implements BaseEnum {
	MANUFACTURING_ENTERPRISE("生产企业"), IMPORT_MERCHANT("进口商");
	private String value;

	CompanyType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static List<LableValueVo> data() {
		List<LableValueVo> data = new ArrayList<LableValueVo>();
		for (CompanyType type : CompanyType.values()) {
			data.add(new LableValueVo(type.value, String.valueOf(type.ordinal())));
		}
		return data;
	}

	@Override
	public int getOrdinal() {
		return this.ordinal();
	}
}
