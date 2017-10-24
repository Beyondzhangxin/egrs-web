/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po;

import java.io.Serializable;

/**
 * @author jiabin fan
 *
 */
public class OriginalCar implements Serializable {
	private String clxh; // 车辆型号；
	private String clmc; // 车辆名称；
	private String clscc;// 车辆生产厂；
	private String flbh; // 附录编号；
	private String cllb; // 车辆类别；
	private String cxlb;// 基本车型or扩展车型

	public String getClxh() {
		return clxh;
	}

	public void setClxh(String clxh) {
		this.clxh = clxh;
	}

	public String getClmc() {
		return clmc;
	}

	public void setClmc(String clmc) {
		this.clmc = clmc;
	}

	public String getClscc() {
		return clscc;
	}

	public void setClscc(String clscc) {
		this.clscc = clscc;
	}

	public String getFlbh() {
		return flbh;
	}

	public void setFlbh(String flbh) {
		this.flbh = flbh;
	}

	public String getCllb() {
		return cllb;
	}

	public void setCllb(String cllb) {
		this.cllb = cllb;
	}

	public String getCxlb() {
		return cxlb;
	}

	public void setCxlb(String cxlb) {
		this.cxlb = cxlb;
	}

}
