/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.aiidc.env.ergs.common.metro.MetroField;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "e3_report")
public class Report {
	@Id
	@MetroField("检验报告编号")
	private String jybgbh;
	@MetroField("内部编号")
	private String nbbh;
	@MetroField("车辆型号")
	private String cpxh;
	@MetroField("车辆名称")
	private String cpmc;
	@MetroField("发动机型号")
	private String fdjxh;
	@MetroField("发动机制造商")
	private String fdjscc;
	@MetroField("检测单位")
	private String jydwmc;
	@MetroField("发送日期")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fsrq;
	@MetroField("检测单位")
	@Temporal(TemporalType.TIMESTAMP)
	private Date edittime;

	public String getJybgbh() {
		return jybgbh;
	}

	public void setJybgbh(String jybgbh) {
		this.jybgbh = jybgbh;
	}

	public String getNbbh() {
		return nbbh;
	}

	public void setNbbh(String nbbh) {
		this.nbbh = nbbh;
	}

	public String getCpxh() {
		return cpxh;
	}

	public void setCpxh(String cpxh) {
		this.cpxh = cpxh;
	}

	public String getCpmc() {
		return cpmc;
	}

	public void setCpmc(String cpmc) {
		this.cpmc = cpmc;
	}

	public String getFdjxh() {
		return fdjxh;
	}

	public void setFdjxh(String fdjxh) {
		this.fdjxh = fdjxh;
	}

	public String getFdjscc() {
		return fdjscc;
	}

	public void setFdjscc(String fdjscc) {
		this.fdjscc = fdjscc;
	}

	public String getJydwmc() {
		return jydwmc;
	}

	public void setJydwmc(String jydwmc) {
		this.jydwmc = jydwmc;
	}

	public Date getFsrq() {
		return fsrq;
	}

	public void setFsrq(Date fsrq) {
		this.fsrq = fsrq;
	}

	public Date getEdittime() {
		return edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}
}
