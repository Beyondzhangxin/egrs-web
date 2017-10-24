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
@Table(name="E3_QQC_CONFIG_SDS")
public class QqcSd implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer pzbh;

    private String zhqxh;

    private String zhqscc;

    private String cgqxh;

    private String cgqscc;

    private String egrxh;

    private String egrscc;

    private String dkdyxh;

    private String dkdyscc;

    private String rqhhqxh;

    private String rqhhqscc;

    private String rqpsdyxh;

    private String rqpsdyscc;

    private String zyqxh;

    private String zyqscc;

    private String zlqxh;

    private String zlqscc;

    private String dszs;

    private String dsco;

    private String dshc;

    private String gdszs;

    private String gdsco;

    private String gdshc;

    private String gdslmd;

    private String ldszs;

    private String ldsco;

    private String ldshc;

    private String lgdszs;

    private String lgdsco;

    private String lgdshc;

    private String lgdslmd;

    private String fhxpd;

    private String lfhxpd;

    private String dscoxz;

    private String gdscoxz;

    private String dshcxz;

    private String gdshcxz;

    private String gdslmdxz;

    private String ldscoxz;

    private String lgdscoxz;

    private String ldshcxz;

    private String lgdshcxz;

    private String lgdslmdxz;

    private String dscoxz18352;

    private String dsco18352;

    private String dshcxz18352;

    private String dshc18352;

    private String dszs18352;

    private String gdscoxz18352;

    private String gdsco18352;

    private String gdshcxz18352;

    private String gdshc18352;

    private String gdszs18352;

    private String gdslmdxz18352;

    private String gdslmd18352;

    private String sbzdsco;

    private String sbzdshc;

    private String sbzgdsco;

    private String sbzgdshc;

    private String sbzgdslmd;

    private String ztscc;

    private String tcscc;

    private String fzscc;

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

    public String getDkdyxh() {
        return dkdyxh;
    }

    public void setDkdyxh(String dkdyxh) {
        this.dkdyxh = dkdyxh == null ? null : dkdyxh.trim();
    }

    public String getDkdyscc() {
        return dkdyscc;
    }

    public void setDkdyscc(String dkdyscc) {
        this.dkdyscc = dkdyscc == null ? null : dkdyscc.trim();
    }

    public String getRqhhqxh() {
        return rqhhqxh;
    }

    public void setRqhhqxh(String rqhhqxh) {
        this.rqhhqxh = rqhhqxh == null ? null : rqhhqxh.trim();
    }

    public String getRqhhqscc() {
        return rqhhqscc;
    }

    public void setRqhhqscc(String rqhhqscc) {
        this.rqhhqscc = rqhhqscc == null ? null : rqhhqscc.trim();
    }

    public String getRqpsdyxh() {
        return rqpsdyxh;
    }

    public void setRqpsdyxh(String rqpsdyxh) {
        this.rqpsdyxh = rqpsdyxh == null ? null : rqpsdyxh.trim();
    }

    public String getRqpsdyscc() {
        return rqpsdyscc;
    }

    public void setRqpsdyscc(String rqpsdyscc) {
        this.rqpsdyscc = rqpsdyscc == null ? null : rqpsdyscc.trim();
    }

    public String getZyqxh() {
        return zyqxh;
    }

    public void setZyqxh(String zyqxh) {
        this.zyqxh = zyqxh == null ? null : zyqxh.trim();
    }

    public String getZyqscc() {
        return zyqscc;
    }

    public void setZyqscc(String zyqscc) {
        this.zyqscc = zyqscc == null ? null : zyqscc.trim();
    }

    public String getZlqxh() {
        return zlqxh;
    }

    public void setZlqxh(String zlqxh) {
        this.zlqxh = zlqxh == null ? null : zlqxh.trim();
    }

    public String getZlqscc() {
        return zlqscc;
    }

    public void setZlqscc(String zlqscc) {
        this.zlqscc = zlqscc == null ? null : zlqscc.trim();
    }

    public String getDszs() {
        return dszs;
    }

    public void setDszs(String dszs) {
        this.dszs = dszs == null ? null : dszs.trim();
    }

    public String getDsco() {
        return dsco;
    }

    public void setDsco(String dsco) {
        this.dsco = dsco == null ? null : dsco.trim();
    }

    public String getDshc() {
        return dshc;
    }

    public void setDshc(String dshc) {
        this.dshc = dshc == null ? null : dshc.trim();
    }

    public String getGdszs() {
        return gdszs;
    }

    public void setGdszs(String gdszs) {
        this.gdszs = gdszs == null ? null : gdszs.trim();
    }

    public String getGdsco() {
        return gdsco;
    }

    public void setGdsco(String gdsco) {
        this.gdsco = gdsco == null ? null : gdsco.trim();
    }

    public String getGdshc() {
        return gdshc;
    }

    public void setGdshc(String gdshc) {
        this.gdshc = gdshc == null ? null : gdshc.trim();
    }

    public String getGdslmd() {
        return gdslmd;
    }

    public void setGdslmd(String gdslmd) {
        this.gdslmd = gdslmd == null ? null : gdslmd.trim();
    }

    public String getLdszs() {
        return ldszs;
    }

    public void setLdszs(String ldszs) {
        this.ldszs = ldszs == null ? null : ldszs.trim();
    }

    public String getLdsco() {
        return ldsco;
    }

    public void setLdsco(String ldsco) {
        this.ldsco = ldsco == null ? null : ldsco.trim();
    }

    public String getLdshc() {
        return ldshc;
    }

    public void setLdshc(String ldshc) {
        this.ldshc = ldshc == null ? null : ldshc.trim();
    }

    public String getLgdszs() {
        return lgdszs;
    }

    public void setLgdszs(String lgdszs) {
        this.lgdszs = lgdszs == null ? null : lgdszs.trim();
    }

    public String getLgdsco() {
        return lgdsco;
    }

    public void setLgdsco(String lgdsco) {
        this.lgdsco = lgdsco == null ? null : lgdsco.trim();
    }

    public String getLgdshc() {
        return lgdshc;
    }

    public void setLgdshc(String lgdshc) {
        this.lgdshc = lgdshc == null ? null : lgdshc.trim();
    }

    public String getLgdslmd() {
        return lgdslmd;
    }

    public void setLgdslmd(String lgdslmd) {
        this.lgdslmd = lgdslmd == null ? null : lgdslmd.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

    public String getLfhxpd() {
        return lfhxpd;
    }

    public void setLfhxpd(String lfhxpd) {
        this.lfhxpd = lfhxpd == null ? null : lfhxpd.trim();
    }

    public String getDscoxz() {
        return dscoxz;
    }

    public void setDscoxz(String dscoxz) {
        this.dscoxz = dscoxz == null ? null : dscoxz.trim();
    }

    public String getGdscoxz() {
        return gdscoxz;
    }

    public void setGdscoxz(String gdscoxz) {
        this.gdscoxz = gdscoxz == null ? null : gdscoxz.trim();
    }

    public String getDshcxz() {
        return dshcxz;
    }

    public void setDshcxz(String dshcxz) {
        this.dshcxz = dshcxz == null ? null : dshcxz.trim();
    }

    public String getGdshcxz() {
        return gdshcxz;
    }

    public void setGdshcxz(String gdshcxz) {
        this.gdshcxz = gdshcxz == null ? null : gdshcxz.trim();
    }

    public String getGdslmdxz() {
        return gdslmdxz;
    }

    public void setGdslmdxz(String gdslmdxz) {
        this.gdslmdxz = gdslmdxz == null ? null : gdslmdxz.trim();
    }

    public String getLdscoxz() {
        return ldscoxz;
    }

    public void setLdscoxz(String ldscoxz) {
        this.ldscoxz = ldscoxz == null ? null : ldscoxz.trim();
    }

    public String getLgdscoxz() {
        return lgdscoxz;
    }

    public void setLgdscoxz(String lgdscoxz) {
        this.lgdscoxz = lgdscoxz == null ? null : lgdscoxz.trim();
    }

    public String getLdshcxz() {
        return ldshcxz;
    }

    public void setLdshcxz(String ldshcxz) {
        this.ldshcxz = ldshcxz == null ? null : ldshcxz.trim();
    }

    public String getLgdshcxz() {
        return lgdshcxz;
    }

    public void setLgdshcxz(String lgdshcxz) {
        this.lgdshcxz = lgdshcxz == null ? null : lgdshcxz.trim();
    }

    public String getLgdslmdxz() {
        return lgdslmdxz;
    }

    public void setLgdslmdxz(String lgdslmdxz) {
        this.lgdslmdxz = lgdslmdxz == null ? null : lgdslmdxz.trim();
    }

    public String getDscoxz18352() {
        return dscoxz18352;
    }

    public void setDscoxz18352(String dscoxz18352) {
        this.dscoxz18352 = dscoxz18352 == null ? null : dscoxz18352.trim();
    }

    public String getDsco18352() {
        return dsco18352;
    }

    public void setDsco18352(String dsco18352) {
        this.dsco18352 = dsco18352 == null ? null : dsco18352.trim();
    }

    public String getDshcxz18352() {
        return dshcxz18352;
    }

    public void setDshcxz18352(String dshcxz18352) {
        this.dshcxz18352 = dshcxz18352 == null ? null : dshcxz18352.trim();
    }

    public String getDshc18352() {
        return dshc18352;
    }

    public void setDshc18352(String dshc18352) {
        this.dshc18352 = dshc18352 == null ? null : dshc18352.trim();
    }

    public String getDszs18352() {
        return dszs18352;
    }

    public void setDszs18352(String dszs18352) {
        this.dszs18352 = dszs18352 == null ? null : dszs18352.trim();
    }

    public String getGdscoxz18352() {
        return gdscoxz18352;
    }

    public void setGdscoxz18352(String gdscoxz18352) {
        this.gdscoxz18352 = gdscoxz18352 == null ? null : gdscoxz18352.trim();
    }

    public String getGdsco18352() {
        return gdsco18352;
    }

    public void setGdsco18352(String gdsco18352) {
        this.gdsco18352 = gdsco18352 == null ? null : gdsco18352.trim();
    }

    public String getGdshcxz18352() {
        return gdshcxz18352;
    }

    public void setGdshcxz18352(String gdshcxz18352) {
        this.gdshcxz18352 = gdshcxz18352 == null ? null : gdshcxz18352.trim();
    }

    public String getGdshc18352() {
        return gdshc18352;
    }

    public void setGdshc18352(String gdshc18352) {
        this.gdshc18352 = gdshc18352 == null ? null : gdshc18352.trim();
    }

    public String getGdszs18352() {
        return gdszs18352;
    }

    public void setGdszs18352(String gdszs18352) {
        this.gdszs18352 = gdszs18352 == null ? null : gdszs18352.trim();
    }

    public String getGdslmdxz18352() {
        return gdslmdxz18352;
    }

    public void setGdslmdxz18352(String gdslmdxz18352) {
        this.gdslmdxz18352 = gdslmdxz18352 == null ? null : gdslmdxz18352.trim();
    }

    public String getGdslmd18352() {
        return gdslmd18352;
    }

    public void setGdslmd18352(String gdslmd18352) {
        this.gdslmd18352 = gdslmd18352 == null ? null : gdslmd18352.trim();
    }

    public String getSbzdsco() {
        return sbzdsco;
    }

    public void setSbzdsco(String sbzdsco) {
        this.sbzdsco = sbzdsco == null ? null : sbzdsco.trim();
    }

    public String getSbzdshc() {
        return sbzdshc;
    }

    public void setSbzdshc(String sbzdshc) {
        this.sbzdshc = sbzdshc == null ? null : sbzdshc.trim();
    }

    public String getSbzgdsco() {
        return sbzgdsco;
    }

    public void setSbzgdsco(String sbzgdsco) {
        this.sbzgdsco = sbzgdsco == null ? null : sbzgdsco.trim();
    }

    public String getSbzgdshc() {
        return sbzgdshc;
    }

    public void setSbzgdshc(String sbzgdshc) {
        this.sbzgdshc = sbzgdshc == null ? null : sbzgdshc.trim();
    }

    public String getSbzgdslmd() {
        return sbzgdslmd;
    }

    public void setSbzgdslmd(String sbzgdslmd) {
        this.sbzgdslmd = sbzgdslmd == null ? null : sbzgdslmd.trim();
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
