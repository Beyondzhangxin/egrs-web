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
 * 产品类别
 * 
 * @author wuwenjun
 *
 */
public enum ProductType implements BaseEnum {
	/**
	 * 轻型汽油车
	 */
	QQC("轻型汽油车", CarType.LIGHT_CAR),
	/**
	 * 轻型柴油车
	 */
	QCQ("轻型柴油车", CarType.LIGHT_CAR),
	/**
	 * 轻型单一气体燃料车
	 */
	QQR("轻型单一气体燃料车", CarType.LIGHT_CAR),
	/**
	 * 轻型两用气体燃料车
	 */
	QLY("轻型两用气体燃料车", CarType.LIGHT_CAR),
	/**
	 * 轻型混合动力车
	 */
	QHC("轻型混合动力车", CarType.LIGHT_CAR),
	/**
	 * 轻型电动车
	 */
	QDC("轻型电动车", CarType.LIGHT_CAR),
	/**
	 * 重型柴油车
	 */
	ZCC("重型柴油车", CarType.HEAVY_DUTY_CAR),
	/**
	 * 重型汽油车
	 */
	ZQC("重型汽油车", CarType.HEAVY_DUTY_CAR),
	/**
	 * 重型燃气车
	 */
	ZRC("重型燃气车", CarType.HEAVY_DUTY_CAR),
	/**
	 * 重型电动汽车
	 */
	ZDC("重型电动汽车", CarType.HEAVY_DUTY_CAR),
	/**
	 * 重型燃气机
	 */
	ZRJ("重型燃气机", CarType.HEAVY_DUTY_MOTOR),
	/**
	 * 重型汽油机
	 */
	ZQJ("重型汽油机", CarType.HEAVY_DUTY_MOTOR),
	/**
	 * 重型柴油机
	 */
	ZCJ("重型柴油机", CarType.HEAVY_DUTY_MOTOR),
	/**
	 * 摩托车
	 */
	MT("摩托车", CarType.MOTOR_CYCLE),
	/**
	 * 轻便摩托车
	 */
	QMT("轻便摩托车", CarType.MOTOR_CYCLE),
	/**
	 * 三轮汽车
	 */
	SLQC("三轮汽车", CarType.LOW_SPEED_CAR),
	/**
	 * 低速货车
	 */
	DSHC("低速货车", CarType.LOW_SPEED_CAR),
	/**
	 * 低速货车装用的柴油机
	 */
	DSCYJ("低速货车装用的柴油机", CarType.LOW_SPEED_CAR),
	/**
	 * 非道路移动机械用柴油机
	 */
	FJXCYJ("非道路移动机械用柴油机", CarType.NON_ROAD_MOVING_MOTOR),
	/**
	 * 非道路移动机械用小型点燃式发动机
	 */
	FJXXRJ("非道路移动机械用小型点燃式发动机", CarType.NON_ROAD_MOVING_MOTOR),
	/**
	 * 非道路移动机械（汽油）
	 */
	FJXQY("非道路移动机械（汽油）", CarType.NON_ROAD_MACHINERY),
	/**
	 * 非道路移动机械（柴油）
	 */
	FJXCY("非道路移动机械（柴油）", CarType.NON_ROAD_MACHINERY);

	private String value;

	private CarType type;

	ProductType(String value, CarType type) {
		this.value = value;
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public static List<LableValueVo> data() {
		List<LableValueVo> data = new ArrayList<LableValueVo>();
		for (ProductType type : ProductType.values()) {
			data.add(new LableValueVo(type.value, String.valueOf(type.ordinal())));
		}
		return data;
	}

	public CarType getType() {
		return type;
	}

	@Override
	public int getOrdinal() {
		return this.ordinal();
	}
}
