/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.aiidc.env.ergs.common.metro.MetroEditField;
import com.aiidc.env.ergs.common.metro.MetroField;
import com.aiidc.env.ergs.common.metro.MetroValidator;
import com.aiidc.env.ergs.common.metro.converter.Converter;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "E3_TMN")
public class E3Tmn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@MetroField(edit = @MetroEditField("hidden"), list = false)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tmn_id_seq")
	@SequenceGenerator(name = "tmn_id_seq", sequenceName = "tmn_id_seq", allocationSize = 1)
	private BigDecimal tmid;

	@MetroField(value = "企业编号", list = false, edit = @MetroEditField("hidden"))
	private String manufid;

	@MetroField(edit = @MetroEditField("hidden"), list = false)
	private String sccmc;

	@MetroField(value = "英文名", edit = @MetroEditField(validate = @MetroValidator(func = "required")))
	private String tme;
	@MetroField(value = "中文名", edit = @MetroEditField(validate = @MetroValidator(func = "required")))
	private String tmc;

	@MetroField(value = "进口品牌", convert = Converter.CHART_BOOLEAN, edit = @MetroEditField("radio"))
	private Character jk;

	@MetroField(edit = @MetroEditField("hidden"), list = false)
	private Character status;

	public BigDecimal getTmid() {
		return tmid;
	}

	public void setTmid(BigDecimal tmid) {
		this.tmid = tmid;
	}

	public String getManufid() {
		return manufid;
	}

	public void setManufid(String manufid) {
		this.manufid = manufid;
	}

	public String getSccmc() {
		return sccmc;
	}

	public void setSccmc(String sccmc) {
		this.sccmc = sccmc;
	}

	public String getTme() {
		return tme;
	}

	public void setTme(String tme) {
		this.tme = tme;
	}

	public String getTmc() {
		return tmc;
	}

	public void setTmc(String tmc) {
		this.tmc = tmc;
	}

	public Character getJk() {
		return jk;
	}

	public void setJk(Character jk) {
		this.jk = jk;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

}
