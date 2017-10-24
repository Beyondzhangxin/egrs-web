/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.view;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author wuwenjun
 *
 */
@Embeddable
public class QccSourceVehicleTypeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6138010678700735562L;
	private String flbh; // 附录编号；
	private String clxh; // 车辆型号；

	public QccSourceVehicleTypeKey(String flbh, String clxh, String cxlb) {
		super();
		this.flbh = flbh;
		this.clxh = clxh;
		this.cxlb = cxlb;
	}

	public QccSourceVehicleTypeKey() {
		super();
	}

	private String cxlb;// 基本车型or扩展车型

	public String getFlbh() {
		return flbh;
	}

	public void setFlbh(String flbh) {
		this.flbh = flbh;
	}

	public String getClxh() {
		return clxh;
	}

	public void setClxh(String clxh) {
		this.clxh = clxh;
	}

	public String getCxlb() {
		return cxlb;
	}

	public void setCxlb(String cxlb) {
		this.cxlb = cxlb;
	}
}
