package com.aiidc.env.ergs.jpa.po.pw;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SJDW")
public class SJDW implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "manuf_id_seq")
	@SequenceGenerator(name = "manuf_id_seq", sequenceName = "manuf_id_seq", allocationSize = 1)
	private Long manufid;

	private String groupid;

	private String manuf;

	private String manufshort;

	private String ywqc;

	private String ywsx;

	private String qydz;

	private String fddbr;

	private String tel;

	private String lxr;

	private String fax;

	private String code;

	private String email;

	private String province;

	private String sbfzr;

	private Date createdate;

	private Date jzrq;

	private Date jfrq;

	private String groupmanuf;

	private String jb;

	private String type;

	private String scqydz;

	private String scqymc;

	private String jylb;

	private String ymanufid;

	private String dll;

	private String version;

	private Date yxrq;

	private String config;

	private String frtel;

	private String qytel;

	private String mtype;

	public Long getManufid() {
		return manufid;
	}

	public void setManufid(Long manufid) {
		this.manufid = manufid;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid == null ? null : groupid.trim();
	}

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf == null ? null : manuf.trim();
	}

	public String getManufshort() {
		return manufshort;
	}

	public void setManufshort(String manufshort) {
		this.manufshort = manufshort == null ? null : manufshort.trim();
	}

	public String getYwqc() {
		return ywqc;
	}

	public void setYwqc(String ywqc) {
		this.ywqc = ywqc == null ? null : ywqc.trim();
	}

	public String getYwsx() {
		return ywsx;
	}

	public void setYwsx(String ywsx) {
		this.ywsx = ywsx == null ? null : ywsx.trim();
	}

	public String getQydz() {
		return qydz;
	}

	public void setQydz(String qydz) {
		this.qydz = qydz == null ? null : qydz.trim();
	}

	public String getFddbr() {
		return fddbr;
	}

	public void setFddbr(String fddbr) {
		this.fddbr = fddbr == null ? null : fddbr.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr == null ? null : lxr.trim();
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax == null ? null : fax.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	public String getSbfzr() {
		return sbfzr;
	}

	public void setSbfzr(String sbfzr) {
		this.sbfzr = sbfzr == null ? null : sbfzr.trim();
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getJzrq() {
		return jzrq;
	}

	public void setJzrq(Date jzrq) {
		this.jzrq = jzrq;
	}

	public Date getJfrq() {
		return jfrq;
	}

	public void setJfrq(Date jfrq) {
		this.jfrq = jfrq;
	}

	public String getGroupmanuf() {
		return groupmanuf;
	}

	public void setGroupmanuf(String groupmanuf) {
		this.groupmanuf = groupmanuf == null ? null : groupmanuf.trim();
	}

	public String getJb() {
		return jb;
	}

	public void setJb(String jb) {
		this.jb = jb == null ? null : jb.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public String getScqydz() {
		return scqydz;
	}

	public void setScqydz(String scqydz) {
		this.scqydz = scqydz == null ? null : scqydz.trim();
	}

	public String getScqymc() {
		return scqymc;
	}

	public void setScqymc(String scqymc) {
		this.scqymc = scqymc == null ? null : scqymc.trim();
	}

	public String getJylb() {
		return jylb;
	}

	public void setJylb(String jylb) {
		this.jylb = jylb == null ? null : jylb.trim();
	}

	public String getYmanufid() {
		return ymanufid;
	}

	public void setYmanufid(String ymanufid) {
		this.ymanufid = ymanufid == null ? null : ymanufid.trim();
	}

	public String getDll() {
		return dll;
	}

	public void setDll(String dll) {
		this.dll = dll == null ? null : dll.trim();
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}

	public Date getYxrq() {
		return yxrq;
	}

	public void setYxrq(Date yxrq) {
		this.yxrq = yxrq;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config == null ? null : config.trim();
	}

	public String getFrtel() {
		return frtel;
	}

	public void setFrtel(String frtel) {
		this.frtel = frtel == null ? null : frtel.trim();
	}

	public String getQytel() {
		return qytel;
	}

	public void setQytel(String qytel) {
		this.qytel = qytel == null ? null : qytel.trim();
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype == null ? null : mtype.trim();
	}
}
