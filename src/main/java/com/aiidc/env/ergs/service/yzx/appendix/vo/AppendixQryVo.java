/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.vo;

import com.aiidc.env.ergs.constant.Vehicle;

/**
 * @author wuwenjun
 *
 */
public class AppendixQryVo {
	private String vehicle = Vehicle.QQ.getCode();
	private String flbh;
	private String xh;

	public String getFlbh() {
		return flbh;
	}

	public void setFlbh(String flbh) {
		this.flbh = flbh;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

}
