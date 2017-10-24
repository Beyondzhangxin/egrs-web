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
 * 车机型类别
 * 
 * @author wuwenjun
 *
 */
public enum CarType implements BaseEnum {
	/**
	 * 轻型汽车
	 */
	LIGHT_CAR("轻型汽车"),
	/**
	 * 重型汽车
	 */
	HEAVY_DUTY_CAR("重型汽车"),
	/**
	 * 重型车用发动机
	 */
	HEAVY_DUTY_MOTOR("重型车用发动机"),
	/**
	 * 摩托车
	 */
	MOTOR_CYCLE("摩托车"),
	/**
	 * 低速汽车
	 */
	LOW_SPEED_CAR("低速汽车"),
	/**
	 * 非道路移动机械用发动机
	 */
	NON_ROAD_MOVING_MOTOR("非道路移动机械用发动机"),
	/**
	 * 非道路机械
	 */
	NON_ROAD_MACHINERY("非道路机械");

	private String value;

	private CarType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static List<LableValueVo> data() {
		List<LableValueVo> data = new ArrayList<LableValueVo>();
		for (CarType type : CarType.values()) {
			data.add(new LableValueVo(type.value, String.valueOf(type.ordinal())));
		}
		return data;
	}

	@Override
	public int getOrdinal() {
		return this.ordinal();
	}
}
