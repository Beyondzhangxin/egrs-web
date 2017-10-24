package com.aiidc.env.ergs.jpa.po.yzx.appendix;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 附录实体类
 * 
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_APPENDIX")
public class Appendix implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7975666707599328538L;

	@Id
	private String flbh;

	private String fllb;

	private String cjr;

	private Date cjsj;

	private Date zhxgsj;

	private String zhxgr;

	private String cjrid;

	private String xgrid;

	private Integer version;

	private String status;

	private String manuftype;

	private Date zhfssj;

	private String memo;

	private Date shsj;

	private String spr;

	private String shlog;

	private String nbbh;

	private String xzmc;

	private String zstatus;

	private Date zhqfssj;

	private String zhqshr;

	private Date zhqshsj;

	private String zhqshlog;

	private String flag;

	private String bar;

	private Date basj;

	private String balog;

	public String getFlbh() {
		return flbh;
	}

	public void setFlbh(String flbh) {
		this.flbh = flbh == null ? null : flbh.trim();
	}

	public String getFllb() {
		return fllb;
	}

	public void setFllb(String fllb) {
		this.fllb = fllb == null ? null : fllb.trim();
	}

	public String getCjr() {
		return cjr;
	}

	public void setCjr(String cjr) {
		this.cjr = cjr == null ? null : cjr.trim();
	}

	public Date getCjsj() {
		return cjsj;
	}

	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}

	public Date getZhxgsj() {
		return zhxgsj;
	}

	public void setZhxgsj(Date zhxgsj) {
		this.zhxgsj = zhxgsj;
	}

	public String getZhxgr() {
		return zhxgr;
	}

	public void setZhxgr(String zhxgr) {
		this.zhxgr = zhxgr == null ? null : zhxgr.trim();
	}

	public String getCjrid() {
		return cjrid;
	}

	public void setCjrid(String cjrid) {
		this.cjrid = cjrid == null ? null : cjrid.trim();
	}

	public String getXgrid() {
		return xgrid;
	}

	public void setXgrid(String xgrid) {
		this.xgrid = xgrid == null ? null : xgrid.trim();
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getManuftype() {
		return manuftype;
	}

	public void setManuftype(String manuftype) {
		this.manuftype = manuftype == null ? null : manuftype.trim();
	}

	public Date getZhfssj() {
		return zhfssj;
	}

	public void setZhfssj(Date zhfssj) {
		this.zhfssj = zhfssj;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo == null ? null : memo.trim();
	}

	public Date getShsj() {
		return shsj;
	}

	public void setShsj(Date shsj) {
		this.shsj = shsj;
	}

	public String getSpr() {
		return spr;
	}

	public void setSpr(String spr) {
		this.spr = spr == null ? null : spr.trim();
	}

	public String getShlog() {
		return shlog;
	}

	public void setShlog(String shlog) {
		this.shlog = shlog == null ? null : shlog.trim();
	}

	public String getNbbh() {
		return nbbh;
	}

	public void setNbbh(String nbbh) {
		this.nbbh = nbbh == null ? null : nbbh.trim();
	}

	public String getXzmc() {
		return xzmc;
	}

	public void setXzmc(String xzmc) {
		this.xzmc = xzmc == null ? null : xzmc.trim();
	}

	public String getZstatus() {
		return zstatus;
	}

	public void setZstatus(String zstatus) {
		this.zstatus = zstatus == null ? null : zstatus.trim();
	}

	public Date getZhqfssj() {
		return zhqfssj;
	}

	public void setZhqfssj(Date zhqfssj) {
		this.zhqfssj = zhqfssj;
	}

	public String getZhqshr() {
		return zhqshr;
	}

	public void setZhqshr(String zhqshr) {
		this.zhqshr = zhqshr == null ? null : zhqshr.trim();
	}

	public Date getZhqshsj() {
		return zhqshsj;
	}

	public void setZhqshsj(Date zhqshsj) {
		this.zhqshsj = zhqshsj;
	}

	public String getZhqshlog() {
		return zhqshlog;
	}

	public void setZhqshlog(String zhqshlog) {
		this.zhqshlog = zhqshlog == null ? null : zhqshlog.trim();
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag == null ? null : flag.trim();
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar == null ? null : bar.trim();
	}

	public Date getBasj() {
		return basj;
	}

	public void setBasj(Date basj) {
		this.basj = basj;
	}

	public String getBalog() {
		return balog;
	}

	public void setBalog(String balog) {
		this.balog = balog == null ? null : balog.trim();
	}
}
