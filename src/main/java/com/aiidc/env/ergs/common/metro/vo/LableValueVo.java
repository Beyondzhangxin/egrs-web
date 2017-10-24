/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.metro.vo;

/**
 * @author wuwenjun
 *
 */
public class LableValueVo {
	private String lable;
	private String value;

	public LableValueVo(String value) {
		super();
		this.value = value;
		this.lable = value;
	}

	public LableValueVo(String lable, String value) {
		super();
		this.lable = lable;
		this.value = value;
	}

	public String getLable() {
		return lable;
	}

	public String getValue() {
		return value;
	}
}
