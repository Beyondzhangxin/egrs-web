/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "V_QCC_SOURCE_VEHICLE_TYPE")
public class QccSourceVehicleType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7384489279963599672L;
	@EmbeddedId
	private QccSourceVehicleTypeKey key; // 车辆型号；
	private String clmc; // 车辆名称；
	@Column(name = "SCCMC")
	private String clscc;// 车辆生产厂；
	private String cllb; // 车辆类别；

	public QccSourceVehicleTypeKey getKey() {
		return key;
	}

	public void setKey(QccSourceVehicleTypeKey key) {
		this.key = key;
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

	public String getCllb() {
		return cllb;
	}

	public void setCllb(String cllb) {
		this.cllb = cllb;
	}
}
