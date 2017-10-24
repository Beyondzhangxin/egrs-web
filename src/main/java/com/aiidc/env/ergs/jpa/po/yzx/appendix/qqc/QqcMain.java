package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.aiidc.env.ergs.common.file.FileTarget;

@Entity
@Table(name = "Y_QQC_MAIN")
public class QqcMain {
	@Id
	private String flbh;

	private String zclxh;

	private String zclmc;

	private String sccmc;

	private String cp;

	private String sb;

	private String sccdz;

	private String vinwz;

	private String zzcmc;

	private String zzcdz;

	private String cllb;

	private String yscx;

	private String ysmc;

	private String yscj;

	@FileTarget
	private String clzp;
	@FileTarget
	private String pfkzsyt;

	private String qdzsl;

	private String qdzwz;

	private String qdzxhlj;

	private String zbzl;

	private String zdzzl;

	private String zdsjcs;

	private String clwxcc;

	private String qdxs;

	private String yh;

	private String rllx;

	private String rygg;

	private String yxrj;

	private String rygjxs;

	private String dpxh;

	private String dpscc;

	private String cxbswz;

	private String obdwz;

	private String zghll;

	private String hhdl;

	private String njsource;

	private Date njstartdate;

	private Date njenddate;

	private String njjcdw;

	private String ycjc;

	private String hhdllx;

	private String jzzl;

	private String isdsqtzz;

	private String njfzbh;

	private String pfjzkz;

	private String pfxzbh;

	private String d30zgcs;

	private String xhlcgkf;

	private String xhlcdsf;

	private String hhdlljfs;

	public String getFlbh() {
		return flbh;
	}

	public void setFlbh(String flbh) {
		this.flbh = flbh == null ? null : flbh.trim();
	}

	public String getZclxh() {
		return zclxh;
	}

	public void setZclxh(String zclxh) {
		this.zclxh = zclxh == null ? null : zclxh.trim();
	}

	public String getZclmc() {
		return zclmc;
	}

	public void setZclmc(String zclmc) {
		this.zclmc = zclmc == null ? null : zclmc.trim();
	}

	public String getSccmc() {
		return sccmc;
	}

	public void setSccmc(String sccmc) {
		this.sccmc = sccmc == null ? null : sccmc.trim();
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp == null ? null : cp.trim();
	}

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb == null ? null : sb.trim();
	}

	public String getSccdz() {
		return sccdz;
	}

	public void setSccdz(String sccdz) {
		this.sccdz = sccdz == null ? null : sccdz.trim();
	}

	public String getVinwz() {
		return vinwz;
	}

	public void setVinwz(String vinwz) {
		this.vinwz = vinwz == null ? null : vinwz.trim();
	}

	public String getZzcmc() {
		return zzcmc;
	}

	public void setZzcmc(String zzcmc) {
		this.zzcmc = zzcmc == null ? null : zzcmc.trim();
	}

	public String getZzcdz() {
		return zzcdz;
	}

	public void setZzcdz(String zzcdz) {
		this.zzcdz = zzcdz == null ? null : zzcdz.trim();
	}

	public String getCllb() {
		return cllb;
	}

	public void setCllb(String cllb) {
		this.cllb = cllb == null ? null : cllb.trim();
	}

	public String getYscx() {
		return yscx;
	}

	public void setYscx(String yscx) {
		this.yscx = yscx == null ? null : yscx.trim();
	}

	public String getYsmc() {
		return ysmc;
	}

	public void setYsmc(String ysmc) {
		this.ysmc = ysmc == null ? null : ysmc.trim();
	}

	public String getYscj() {
		return yscj;
	}

	public void setYscj(String yscj) {
		this.yscj = yscj == null ? null : yscj.trim();
	}

	public String getClzp() {
		return clzp;
	}

	public void setClzp(String clzp) {
		this.clzp = clzp == null ? null : clzp.trim();
	}

	public String getPfkzsyt() {
		return pfkzsyt;
	}

	public void setPfkzsyt(String pfkzsyt) {
		this.pfkzsyt = pfkzsyt == null ? null : pfkzsyt.trim();
	}

	public String getQdzsl() {
		return qdzsl;
	}

	public void setQdzsl(String qdzsl) {
		this.qdzsl = qdzsl == null ? null : qdzsl.trim();
	}

	public String getQdzwz() {
		return qdzwz;
	}

	public void setQdzwz(String qdzwz) {
		this.qdzwz = qdzwz == null ? null : qdzwz.trim();
	}

	public String getQdzxhlj() {
		return qdzxhlj;
	}

	public void setQdzxhlj(String qdzxhlj) {
		this.qdzxhlj = qdzxhlj == null ? null : qdzxhlj.trim();
	}

	public String getZbzl() {
		return zbzl;
	}

	public void setZbzl(String zbzl) {
		this.zbzl = zbzl == null ? null : zbzl.trim();
	}

	public String getZdzzl() {
		return zdzzl;
	}

	public void setZdzzl(String zdzzl) {
		this.zdzzl = zdzzl == null ? null : zdzzl.trim();
	}

	public String getZdsjcs() {
		return zdsjcs;
	}

	public void setZdsjcs(String zdsjcs) {
		this.zdsjcs = zdsjcs == null ? null : zdsjcs.trim();
	}

	public String getClwxcc() {
		return clwxcc;
	}

	public void setClwxcc(String clwxcc) {
		this.clwxcc = clwxcc == null ? null : clwxcc.trim();
	}

	public String getQdxs() {
		return qdxs;
	}

	public void setQdxs(String qdxs) {
		this.qdxs = qdxs == null ? null : qdxs.trim();
	}

	public String getYh() {
		return yh;
	}

	public void setYh(String yh) {
		this.yh = yh == null ? null : yh.trim();
	}

	public String getRllx() {
		return rllx;
	}

	public void setRllx(String rllx) {
		this.rllx = rllx == null ? null : rllx.trim();
	}

	public String getRygg() {
		return rygg;
	}

	public void setRygg(String rygg) {
		this.rygg = rygg == null ? null : rygg.trim();
	}

	public String getYxrj() {
		return yxrj;
	}

	public void setYxrj(String yxrj) {
		this.yxrj = yxrj == null ? null : yxrj.trim();
	}

	public String getRygjxs() {
		return rygjxs;
	}

	public void setRygjxs(String rygjxs) {
		this.rygjxs = rygjxs == null ? null : rygjxs.trim();
	}

	public String getDpxh() {
		return dpxh;
	}

	public void setDpxh(String dpxh) {
		this.dpxh = dpxh == null ? null : dpxh.trim();
	}

	public String getDpscc() {
		return dpscc;
	}

	public void setDpscc(String dpscc) {
		this.dpscc = dpscc == null ? null : dpscc.trim();
	}

	public String getCxbswz() {
		return cxbswz;
	}

	public void setCxbswz(String cxbswz) {
		this.cxbswz = cxbswz == null ? null : cxbswz.trim();
	}

	public String getObdwz() {
		return obdwz;
	}

	public void setObdwz(String obdwz) {
		this.obdwz = obdwz == null ? null : obdwz.trim();
	}

	public String getZghll() {
		return zghll;
	}

	public void setZghll(String zghll) {
		this.zghll = zghll == null ? null : zghll.trim();
	}

	public String getHhdl() {
		return hhdl;
	}

	public void setHhdl(String hhdl) {
		this.hhdl = hhdl == null ? null : hhdl.trim();
	}

	public String getNjsource() {
		return njsource;
	}

	public void setNjsource(String njsource) {
		this.njsource = njsource == null ? null : njsource.trim();
	}

	public Date getNjstartdate() {
		return njstartdate;
	}

	public void setNjstartdate(Date njstartdate) {
		this.njstartdate = njstartdate;
	}

	public Date getNjenddate() {
		return njenddate;
	}

	public void setNjenddate(Date njenddate) {
		this.njenddate = njenddate;
	}

	public String getNjjcdw() {
		return njjcdw;
	}

	public void setNjjcdw(String njjcdw) {
		this.njjcdw = njjcdw == null ? null : njjcdw.trim();
	}

	public String getYcjc() {
		return ycjc;
	}

	public void setYcjc(String ycjc) {
		this.ycjc = ycjc == null ? null : ycjc.trim();
	}

	public String getHhdllx() {
		return hhdllx;
	}

	public void setHhdllx(String hhdllx) {
		this.hhdllx = hhdllx == null ? null : hhdllx.trim();
	}

	public String getJzzl() {
		return jzzl;
	}

	public void setJzzl(String jzzl) {
		this.jzzl = jzzl == null ? null : jzzl.trim();
	}

	public String getIsdsqtzz() {
		return isdsqtzz;
	}

	public void setIsdsqtzz(String isdsqtzz) {
		this.isdsqtzz = isdsqtzz == null ? null : isdsqtzz.trim();
	}

	public String getNjfzbh() {
		return njfzbh;
	}

	public void setNjfzbh(String njfzbh) {
		this.njfzbh = njfzbh == null ? null : njfzbh.trim();
	}

	public String getPfjzkz() {
		return pfjzkz;
	}

	public void setPfjzkz(String pfjzkz) {
		this.pfjzkz = pfjzkz == null ? null : pfjzkz.trim();
	}

	public String getPfxzbh() {
		return pfxzbh;
	}

	public void setPfxzbh(String pfxzbh) {
		this.pfxzbh = pfxzbh == null ? null : pfxzbh.trim();
	}

	public String getD30zgcs() {
		return d30zgcs;
	}

	public void setD30zgcs(String d30zgcs) {
		this.d30zgcs = d30zgcs == null ? null : d30zgcs.trim();
	}

	public String getXhlcgkf() {
		return xhlcgkf;
	}

	public void setXhlcgkf(String xhlcgkf) {
		this.xhlcgkf = xhlcgkf == null ? null : xhlcgkf.trim();
	}

	public String getXhlcdsf() {
		return xhlcdsf;
	}

	public void setXhlcdsf(String xhlcdsf) {
		this.xhlcdsf = xhlcdsf == null ? null : xhlcdsf.trim();
	}

	public String getHhdlljfs() {
		return hhdlljfs;
	}

	public void setHhdlljfs(String hhdlljfs) {
		this.hhdlljfs = hhdlljfs == null ? null : hhdlljfs.trim();
	}
}