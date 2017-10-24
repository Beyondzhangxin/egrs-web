/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.aiidc.env.ergs.common.metro.MetroField;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "E3_JCDW")
public class Jcdw implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1498554476321543878L;
	@Id
	private String manufid;
	@MetroField("检测单位")
	private String manuf;
	@MetroField("联系人")
	private String lxr;
	@MetroField("地址")
	private String maddress;
	@MetroField("联系电话")
	private String tel;
	@MetroField("传真")
	private String fax;
	@MetroField(value = "邮编", list = false)
	private String code;
	@MetroField("电子邮件")
	private String email;
	private String sx;
	private String module;
	private String jzrq;
	private String config;
	private String configpasswd;
	private String edition;
	private String qzgx;
	@ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
	@CollectionTable(name = "E3_VEHICLE_QX", joinColumns = { @JoinColumn(name = "JCDWID") })
	@Column(name = "manufid")
	private Set<String> manufids = new HashSet<String>();

	public String getManufid() {
		return manufid;
	}

	public void setManufid(String manufid) {
		this.manufid = manufid;
	}

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getMaddress() {
		return maddress;
	}

	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSx() {
		return sx;
	}

	public void setSx(String sx) {
		this.sx = sx;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getJzrq() {
		return jzrq;
	}

	public void setJzrq(String jzrq) {
		this.jzrq = jzrq;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getConfigpasswd() {
		return configpasswd;
	}

	public void setConfigpasswd(String configpasswd) {
		this.configpasswd = configpasswd;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getQzgx() {
		return qzgx;
	}

	public void setQzgx(String qzgx) {
		this.qzgx = qzgx;
	}

	public boolean add(String e) {
		return manufids.add(e);
	}

	public boolean remove(String o) {
		if (manufids.contains(o)) {
			return manufids.remove(o);
		} else {
			return false;
		}
	}

	public Set<String> getManufids() {
		return manufids;
	}

	public void setManufids(Set<String> manufids) {
		this.manufids = manufids;
	}

}
