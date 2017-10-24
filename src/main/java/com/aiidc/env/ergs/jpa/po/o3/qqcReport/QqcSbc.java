/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3.qqcReport;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@IdClass(com.aiidc.env.ergs.util.ReportBasePk.class)
@Table(name="E3_QQC_CONFIG_SBC")
public class QqcSbc implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer pzbh;

    private String zhqxh;

    private String zhqscc;

    private String gjshl;

    private String gjsbl;

    private String ztscc;

    private String tcscc;

    private String fzscc;

    private String cgqxh;

    private String cgqscc;

    private String egrxh;

    private String egrscc;

    private String ecuxh;

    private String ecuscc;

    private String co264;

    private String co64;

    private String thc64;

    private String nmhc64;

    private String nox64;

    private String pm64;

    private String co216;

    private String co16;

    private String thc16;

    private String nmhc16;

    private String nox16;

    private String pm16;

    private String co2xs;

    private String coxs;

    private String thcxs;

    private String nmhcxs;

    private String noxxs;

    private String pmxs;

    private String ztcl;

    public String getZhqxh() {
        return zhqxh;
    }

    public void setZhqxh(String zhqxh) {
        this.zhqxh = zhqxh == null ? null : zhqxh.trim();
    }

    public String getZhqscc() {
        return zhqscc;
    }

    public void setZhqscc(String zhqscc) {
        this.zhqscc = zhqscc == null ? null : zhqscc.trim();
    }

    public String getGjshl() {
        return gjshl;
    }

    public void setGjshl(String gjshl) {
        this.gjshl = gjshl == null ? null : gjshl.trim();
    }

    public String getGjsbl() {
        return gjsbl;
    }

    public void setGjsbl(String gjsbl) {
        this.gjsbl = gjsbl == null ? null : gjsbl.trim();
    }

    public String getZtscc() {
        return ztscc;
    }

    public void setZtscc(String ztscc) {
        this.ztscc = ztscc == null ? null : ztscc.trim();
    }

    public String getTcscc() {
        return tcscc;
    }

    public void setTcscc(String tcscc) {
        this.tcscc = tcscc == null ? null : tcscc.trim();
    }

    public String getFzscc() {
        return fzscc;
    }

    public void setFzscc(String fzscc) {
        this.fzscc = fzscc == null ? null : fzscc.trim();
    }

    public String getCgqxh() {
        return cgqxh;
    }

    public void setCgqxh(String cgqxh) {
        this.cgqxh = cgqxh == null ? null : cgqxh.trim();
    }

    public String getCgqscc() {
        return cgqscc;
    }

    public void setCgqscc(String cgqscc) {
        this.cgqscc = cgqscc == null ? null : cgqscc.trim();
    }

    public String getEgrxh() {
        return egrxh;
    }

    public void setEgrxh(String egrxh) {
        this.egrxh = egrxh == null ? null : egrxh.trim();
    }

    public String getEgrscc() {
        return egrscc;
    }

    public void setEgrscc(String egrscc) {
        this.egrscc = egrscc == null ? null : egrscc.trim();
    }

    public String getEcuxh() {
        return ecuxh;
    }

    public void setEcuxh(String ecuxh) {
        this.ecuxh = ecuxh == null ? null : ecuxh.trim();
    }

    public String getEcuscc() {
        return ecuscc;
    }

    public void setEcuscc(String ecuscc) {
        this.ecuscc = ecuscc == null ? null : ecuscc.trim();
    }

    public String getCo264() {
        return co264;
    }

    public void setCo264(String co264) {
        this.co264 = co264 == null ? null : co264.trim();
    }

    public String getCo64() {
        return co64;
    }

    public void setCo64(String co64) {
        this.co64 = co64 == null ? null : co64.trim();
    }

    public String getThc64() {
        return thc64;
    }

    public void setThc64(String thc64) {
        this.thc64 = thc64 == null ? null : thc64.trim();
    }

    public String getNmhc64() {
        return nmhc64;
    }

    public void setNmhc64(String nmhc64) {
        this.nmhc64 = nmhc64 == null ? null : nmhc64.trim();
    }

    public String getNox64() {
        return nox64;
    }

    public void setNox64(String nox64) {
        this.nox64 = nox64 == null ? null : nox64.trim();
    }

    public String getPm64() {
        return pm64;
    }

    public void setPm64(String pm64) {
        this.pm64 = pm64 == null ? null : pm64.trim();
    }

    public String getCo216() {
        return co216;
    }

    public void setCo216(String co216) {
        this.co216 = co216 == null ? null : co216.trim();
    }

    public String getCo16() {
        return co16;
    }

    public void setCo16(String co16) {
        this.co16 = co16 == null ? null : co16.trim();
    }

    public String getThc16() {
        return thc16;
    }

    public void setThc16(String thc16) {
        this.thc16 = thc16 == null ? null : thc16.trim();
    }

    public String getNmhc16() {
        return nmhc16;
    }

    public void setNmhc16(String nmhc16) {
        this.nmhc16 = nmhc16 == null ? null : nmhc16.trim();
    }

    public String getNox16() {
        return nox16;
    }

    public void setNox16(String nox16) {
        this.nox16 = nox16 == null ? null : nox16.trim();
    }

    public String getPm16() {
        return pm16;
    }

    public void setPm16(String pm16) {
        this.pm16 = pm16 == null ? null : pm16.trim();
    }

    public String getCo2xs() {
        return co2xs;
    }

    public void setCo2xs(String co2xs) {
        this.co2xs = co2xs == null ? null : co2xs.trim();
    }

    public String getCoxs() {
        return coxs;
    }

    public void setCoxs(String coxs) {
        this.coxs = coxs == null ? null : coxs.trim();
    }

    public String getThcxs() {
        return thcxs;
    }

    public void setThcxs(String thcxs) {
        this.thcxs = thcxs == null ? null : thcxs.trim();
    }

    public String getNmhcxs() {
        return nmhcxs;
    }

    public void setNmhcxs(String nmhcxs) {
        this.nmhcxs = nmhcxs == null ? null : nmhcxs.trim();
    }

    public String getNoxxs() {
        return noxxs;
    }

    public void setNoxxs(String noxxs) {
        this.noxxs = noxxs == null ? null : noxxs.trim();
    }

    public String getPmxs() {
        return pmxs;
    }

    public void setPmxs(String pmxs) {
        this.pmxs = pmxs == null ? null : pmxs.trim();
    }

    public String getZtcl() {
        return ztcl;
    }

    public void setZtcl(String ztcl) {
        this.ztcl = ztcl == null ? null : ztcl.trim();
    }
    
    public String getJybgbh() {
		return jybgbh;
	}

	public void setJybgbh(String jybgbh) {
		this.jybgbh = jybgbh;
	}

	public Integer getPzbh() {
		return pzbh;
	}

	public void setPzbh(Integer pzbh) {
		this.pzbh = pzbh;
	}


}
