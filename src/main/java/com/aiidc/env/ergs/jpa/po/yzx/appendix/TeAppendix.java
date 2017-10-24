/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *	轻型汽油车悬挂系
 */
@Entity
@Table(name="Y_APPENDIX_VEHICLE_TE")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendixPk.class)
public class TeAppendix {
	@Id
	private String flbh;
	@Id
    private Integer bh;
	
    private String clxh;

    private String clmc;

    private String clsb;

    private String vin;

    private String qcfl;

    private String cxbswz;

    private String sccdz;

    private String clwxcc;

    private String zbzl;

    private String zdzzl;

    private String yh;

    private String yxrj;

    private String zdsjcs;

    private String zws;

    private String sjcysmin;

    private String sjcysmax;

    private String qcflm3;

    private String obdwz;

    private String zghll;

    private String mtclx;

    private String hhdl;

    private String njsource;

    private Date njstartdate;

    private Date njenddate;

    private String njjcdw;

    private String hhdllx;

    private String jzzl;

    private String ycjc;

    private String isdsqtzz;

    private String qdxs;

    private String d30zgcs;

    private String xhlcgkf;

    private String xhlcdsf;

    private String hhdlljfs;

    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh == null ? null : clxh.trim();
    }

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc == null ? null : clmc.trim();
    }

    public String getClsb() {
        return clsb;
    }

    public void setClsb(String clsb) {
        this.clsb = clsb == null ? null : clsb.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getQcfl() {
        return qcfl;
    }

    public void setQcfl(String qcfl) {
        this.qcfl = qcfl == null ? null : qcfl.trim();
    }

    public String getCxbswz() {
        return cxbswz;
    }

    public void setCxbswz(String cxbswz) {
        this.cxbswz = cxbswz == null ? null : cxbswz.trim();
    }

    public String getSccdz() {
        return sccdz;
    }

    public void setSccdz(String sccdz) {
        this.sccdz = sccdz == null ? null : sccdz.trim();
    }

    public String getClwxcc() {
        return clwxcc;
    }

    public void setClwxcc(String clwxcc) {
        this.clwxcc = clwxcc == null ? null : clwxcc.trim();
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

    public String getYh() {
        return yh;
    }

    public void setYh(String yh) {
        this.yh = yh == null ? null : yh.trim();
    }

    public String getYxrj() {
        return yxrj;
    }

    public void setYxrj(String yxrj) {
        this.yxrj = yxrj == null ? null : yxrj.trim();
    }

    public String getZdsjcs() {
        return zdsjcs;
    }

    public void setZdsjcs(String zdsjcs) {
        this.zdsjcs = zdsjcs == null ? null : zdsjcs.trim();
    }

    public String getZws() {
        return zws;
    }

    public void setZws(String zws) {
        this.zws = zws == null ? null : zws.trim();
    }

    public String getSjcysmin() {
        return sjcysmin;
    }

    public void setSjcysmin(String sjcysmin) {
        this.sjcysmin = sjcysmin == null ? null : sjcysmin.trim();
    }

    public String getSjcysmax() {
        return sjcysmax;
    }

    public void setSjcysmax(String sjcysmax) {
        this.sjcysmax = sjcysmax == null ? null : sjcysmax.trim();
    }

    public String getQcflm3() {
        return qcflm3;
    }

    public void setQcflm3(String qcflm3) {
        this.qcflm3 = qcflm3 == null ? null : qcflm3.trim();
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

    public String getMtclx() {
        return mtclx;
    }

    public void setMtclx(String mtclx) {
        this.mtclx = mtclx == null ? null : mtclx.trim();
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

    public String getYcjc() {
        return ycjc;
    }

    public void setYcjc(String ycjc) {
        this.ycjc = ycjc == null ? null : ycjc.trim();
    }

    public String getIsdsqtzz() {
        return isdsqtzz;
    }

    public void setIsdsqtzz(String isdsqtzz) {
        this.isdsqtzz = isdsqtzz == null ? null : isdsqtzz.trim();
    }

    public String getQdxs() {
        return qdxs;
    }

    public void setQdxs(String qdxs) {
        this.qdxs = qdxs == null ? null : qdxs.trim();
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

    public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }
}
