/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.constant;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.aiidc.env.ergs.common.converter.BaseEnum;
import com.aiidc.env.ergs.common.metro.vo.LableValueVo;

/**
 * 附录状态
 * 
 * @author wuwenjun
 *
 */
public enum AppendixStatus implements BaseEnum {
	/**
	 * 未备案
	 */
	NO_RECORD("0", "未备案"),
	/**
	 * 已备案
	 */
	RECORDED("1", "已备案"),
	/**
	 * 申请修改中
	 */
	APPLY_MODIFY("2", "申请修改中"),
	/**
	 * 申请中
	 */
	APPLYING("3", "申请中"),
	/**
	 * 被打回
	 */
	REPULSE("4", "被打回"),
	/**
	 * 等待总公司申请
	 */
	HEAD_OFFICE_APPLY("5", "等待总公司申请"),
	/**
	 * 已备案申请修改中
	 */
	RECORDED_MODIFY("6", "已备案申请修改中"),
	/**
	 * 催化转化器检验中
	 */
	CATALYTIC_CONVERTER_TEST("7", "催化转化器检验中"),
	/**
	 * 已封样,贵金属通过,已解封,催化器已备案
	 */
	CATALYTIC_CONVERTER_RECORDED("8", "已封样,贵金属通过,已解封,催化器已备案"),
	/**
	 * 催化转化器等待总公司发送
	 */
	CATALYTIC_CONVERTER_WATTING_SENDDING("9", "催化转化器等待总公司发送"),
	/**
	 * 催化转化器已封样
	 */
	CATALYTIC_CONVERTER_BLOCK("A", "催化转化器已封样"),
	/**
	 * 已封样,贵金属通过,催化器解封
	 */
	CATALYTIC_CONVERTER_DEBLOCK_PRECIOUS_METAL_BLOCK("B", "已封样,贵金属通过,催化器解封"),
	/**
	 * 已封样,贵金属通过
	 */
	BLOCK_PRECIOUS_METAL_PASS("C", "已封样,贵金属通过"),
	/**
	 * 已审核待备案
	 */
	BERECORD("D", "已审核待备案"),
	/**
	 * 已公开
	 */
	OPEN("E", "已公开"),
	/**
	 * 已入库
	 */
	STORAGED("F", "已入库");
	private String value;
	private String lable;

	AppendixStatus(String value, String lable) {
		this.value = value;
		this.lable = lable;
	};

	public static List<LableValueVo> data() {
		List<LableValueVo> data = new ArrayList<LableValueVo>();
		for (AppendixStatus type : AppendixStatus.values()) {
			try {
				Field field = AppendixStatus.class.getField(type.name());
				Deprecated deprecated = field.getAnnotation(Deprecated.class);
				if (deprecated == null) {
					data.add(new LableValueVo(type.lable, type.value));
				}
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.common.converter.BaseEnum#getOrdinal()
	 */
	@Override
	public int getOrdinal() {
		return this.ordinal();
	}

	public String getValue() {
		return value;
	}

	public String getLable() {
		return lable;
	}

}
