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
 * 车辆类别
 * 
 * @author wuwenjun
 *
 */
public enum Vehicle implements BaseEnum {
	/**
	 * 轻型摩托车
	 */
	QM("0", "轻型摩托车", "qmc"),
	/**
	 * 摩托车
	 */
	MT("1", "摩托车", "mtc"),
	/**
	 * 三轮汽车和低速货车
	 */
	NY("2", "三轮汽车和低速货车", "nyc"),
	/**
	 * 轻型汽油车
	 */
	QQ("3", "轻型汽油车", "QQC"),
	/**
	 * 轻型柴油车
	 */
	QC("4", "轻型柴油车", "QCC"),
	/**
	 * 重型汽油车
	 */
	ZQ("5", "重型汽油车", "ZQC"),
	/**
	 * 重型柴油车(城市车辆)
	 */
	ZC("6", "重型柴油车(城市车辆)", "zcc"),
	/**
	 * 重型柴油机(城市车辆用柴油发动机)
	 */
	ZCJ("7", "重型柴油机(城市车辆用柴油发动机)", "zcj"),
	/**
	 * 重型汽油机
	 */
	ZQJ("8", "重型汽油机", "zqj"),
	/**
	 * 重型燃气车
	 */
	RQC("9", "重型燃气车", "rqc"),
	/**
	 * 重型燃气机
	 */
	RQJ("A", "重型燃气机", "rqj"),
	/**
	 * 电动车
	 */
	DDC("B", "电动车", "ddc"),
	/**
	 * 轻型NG车
	 */
	NG("C", "轻型NG车", "ng"),
	/**
	 * 重型LPG车
	 */
	LPGC("D", "重型LPG车", "lpgc"),
	/**
	 * 重型NG车
	 */
	NGC("E", "重型NG车", "ngc"),
	/**
	 * 重型LPG发动机
	 */
	LPGJ("F", "重型LPG发动机", "lpgj"),
	/**
	 * 重型NG发动机
	 */
	NGJ("G", "重型NG发动机", "ngj"),
	/**
	 * 三轮和低速车用柴油机
	 */
	NYJ("H", "三轮和低速车用柴油机", "nyj"),
	/**
	 * 轻型两用燃料车
	 */
	QLY("I", "轻型两用燃料车", "qly"),
	/**
	 * 轻型燃气车
	 */
	QRQ("J", "轻型燃气车", "qrq"),
	/**
	 * 重型两用燃料车
	 */
	@Deprecated
	ZLY("K", "重型两用燃料车"),
	/**
	 * 重型柴油车(依据GB18352.3型式核准)
	 */
	ZCC2("L", "重型柴油车(依据GB18352.3型式核准)", "zcc2"),
	/**
	 * 轻型燃料车
	 */
	@Deprecated
	QRL("J", "轻型燃料车"),
	/**
	 * 重型汽油车(依据GB18352.3型式核准)
	 */
	ZQC2("M", "重型汽油车(依据GB18352.3型式核准)", "zqc2"),
	/**
	 * 非道路移动机械用柴油机
	 */
	CYJ("N", "非道路移动机械用柴油机", "cyj"),
	/**
	 * 车用清净剂
	 */
	@Deprecated
	QQJ("O", "车用清净剂"),
	/**
	 * 非道路移动机械用小型点燃式发动机
	 */
	XTJ("P", "非道路移动机械用小型点燃式发动机", "xtj"),
	/**
	 * 非道路移动机械
	 */
	FJX("Q", "非道路移动机械", "fjx");
	private String value;
	private String lable;
	private String code;

	Vehicle(String value, String lable) {
		this.value = value;
		this.lable = lable;
	};

	Vehicle(String value, String lable, String code) {
		this.value = value;
		this.lable = lable;
		this.code = code;
	};

	public static List<LableValueVo> data() {
		List<LableValueVo> data = new ArrayList<LableValueVo>();
		for (Vehicle type : Vehicle.values()) {
			try {
				Field field = Vehicle.class.getField(type.name());
				Deprecated deprecated = field.getAnnotation(Deprecated.class);
				if (deprecated == null) {
					data.add(new LableValueVo(type.lable, type.code));
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

	public String getCode() {
		return code;
	}

}
