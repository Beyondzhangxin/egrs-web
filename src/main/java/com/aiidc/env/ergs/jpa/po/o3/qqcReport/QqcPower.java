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
@Table(name="E3_QQC_CONFIG_PQWR")
public class QqcPower implements Serializable {
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

    private String cobzxz;

    private String co1;

    private String co2;

    private String co3;

    private String hcbzxz;

    private String hc1;

    private String hc2;

    private String hc3;

    private String noxbzxz;

    private String nox1;

    private String nox2;

    private String nox3;

    private String coxs;

    private String hcxs;

    private String noxxs;

    private String fhxpd;

    private String dszs;

    private String dsco;

    private String dshc;

    private String gdszs;

    private String gdsco;

    private String gdshc;

    private String gdslmd;

    private String vicobzxz;

    private String vico1;

    private String vico2;

    private String vico3;

    private String vihcbzxz;

    private String vihc1;

    private String vihc2;

    private String vihc3;

    private String vifhxpd;

    private String lcobzxz;

    private String lco1;

    private String lco2;

    private String lco3;

    private String lhcbzxz;

    private String lhc1;

    private String lhc2;

    private String lhc3;

    private String lnoxbzxz;

    private String lnox1;

    private String lnox2;

    private String lnox3;

    private String lcoxs;

    private String lhcxs;

    private String lnoxxs;

    private String ldszs;

    private String ldsco;

    private String ldshc;

    private String lgdszs;

    private String lgdsco;

    private String lgdshc;

    private String lgdslmd;

    private String lfhxpd;

    private String sbzdsco;

    private String sbzdshc;

    private String sbzgdsco;

    private String sbzgdshc;

    private String sbzgdslmd;

    private String sbzldsco;

    private String sbzldshc;

    private String sbzlgdsco;

    private String sbzlgdshc;

    private String sbzlgdslmd;

    private String ztscc;

    private String tcscc;

    private String fzscc;
    
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

    public String getCobzxz() {
        return cobzxz;
    }

    public void setCobzxz(String cobzxz) {
        this.cobzxz = cobzxz == null ? null : cobzxz.trim();
    }

    public String getCo1() {
        return co1;
    }

    public void setCo1(String co1) {
        this.co1 = co1 == null ? null : co1.trim();
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2 == null ? null : co2.trim();
    }

    public String getCo3() {
        return co3;
    }

    public void setCo3(String co3) {
        this.co3 = co3 == null ? null : co3.trim();
    }

    public String getHcbzxz() {
        return hcbzxz;
    }

    public void setHcbzxz(String hcbzxz) {
        this.hcbzxz = hcbzxz == null ? null : hcbzxz.trim();
    }

    public String getHc1() {
        return hc1;
    }

    public void setHc1(String hc1) {
        this.hc1 = hc1 == null ? null : hc1.trim();
    }

    public String getHc2() {
        return hc2;
    }

    public void setHc2(String hc2) {
        this.hc2 = hc2 == null ? null : hc2.trim();
    }

    public String getHc3() {
        return hc3;
    }

    public void setHc3(String hc3) {
        this.hc3 = hc3 == null ? null : hc3.trim();
    }

    public String getNoxbzxz() {
        return noxbzxz;
    }

    public void setNoxbzxz(String noxbzxz) {
        this.noxbzxz = noxbzxz == null ? null : noxbzxz.trim();
    }

    public String getNox1() {
        return nox1;
    }

    public void setNox1(String nox1) {
        this.nox1 = nox1 == null ? null : nox1.trim();
    }

    public String getNox2() {
        return nox2;
    }

    public void setNox2(String nox2) {
        this.nox2 = nox2 == null ? null : nox2.trim();
    }

    public String getNox3() {
        return nox3;
    }

    public void setNox3(String nox3) {
        this.nox3 = nox3 == null ? null : nox3.trim();
    }

    public String getCoxs() {
        return coxs;
    }

    public void setCoxs(String coxs) {
        this.coxs = coxs == null ? null : coxs.trim();
    }

    public String getHcxs() {
        return hcxs;
    }

    public void setHcxs(String hcxs) {
        this.hcxs = hcxs == null ? null : hcxs.trim();
    }

    public String getNoxxs() {
        return noxxs;
    }

    public void setNoxxs(String noxxs) {
        this.noxxs = noxxs == null ? null : noxxs.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
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

    public String getVicobzxz() {
        return vicobzxz;
    }

    public void setVicobzxz(String vicobzxz) {
        this.vicobzxz = vicobzxz == null ? null : vicobzxz.trim();
    }

    public String getVico1() {
        return vico1;
    }

    public void setVico1(String vico1) {
        this.vico1 = vico1 == null ? null : vico1.trim();
    }

    public String getVico2() {
        return vico2;
    }

    public void setVico2(String vico2) {
        this.vico2 = vico2 == null ? null : vico2.trim();
    }

    public String getVico3() {
        return vico3;
    }

    public void setVico3(String vico3) {
        this.vico3 = vico3 == null ? null : vico3.trim();
    }

    public String getVihcbzxz() {
        return vihcbzxz;
    }

    public void setVihcbzxz(String vihcbzxz) {
        this.vihcbzxz = vihcbzxz == null ? null : vihcbzxz.trim();
    }

    public String getVihc1() {
        return vihc1;
    }

    public void setVihc1(String vihc1) {
        this.vihc1 = vihc1 == null ? null : vihc1.trim();
    }

    public String getVihc2() {
        return vihc2;
    }

    public void setVihc2(String vihc2) {
        this.vihc2 = vihc2 == null ? null : vihc2.trim();
    }

    public String getVihc3() {
        return vihc3;
    }

    public void setVihc3(String vihc3) {
        this.vihc3 = vihc3 == null ? null : vihc3.trim();
    }

    public String getVifhxpd() {
        return vifhxpd;
    }

    public void setVifhxpd(String vifhxpd) {
        this.vifhxpd = vifhxpd == null ? null : vifhxpd.trim();
    }

    public String getLcobzxz() {
        return lcobzxz;
    }

    public void setLcobzxz(String lcobzxz) {
        this.lcobzxz = lcobzxz == null ? null : lcobzxz.trim();
    }

    public String getLco1() {
        return lco1;
    }

    public void setLco1(String lco1) {
        this.lco1 = lco1 == null ? null : lco1.trim();
    }

    public String getLco2() {
        return lco2;
    }

    public void setLco2(String lco2) {
        this.lco2 = lco2 == null ? null : lco2.trim();
    }

    public String getLco3() {
        return lco3;
    }

    public void setLco3(String lco3) {
        this.lco3 = lco3 == null ? null : lco3.trim();
    }

    public String getLhcbzxz() {
        return lhcbzxz;
    }

    public void setLhcbzxz(String lhcbzxz) {
        this.lhcbzxz = lhcbzxz == null ? null : lhcbzxz.trim();
    }

    public String getLhc1() {
        return lhc1;
    }

    public void setLhc1(String lhc1) {
        this.lhc1 = lhc1 == null ? null : lhc1.trim();
    }

    public String getLhc2() {
        return lhc2;
    }

    public void setLhc2(String lhc2) {
        this.lhc2 = lhc2 == null ? null : lhc2.trim();
    }

    public String getLhc3() {
        return lhc3;
    }

    public void setLhc3(String lhc3) {
        this.lhc3 = lhc3 == null ? null : lhc3.trim();
    }

    public String getLnoxbzxz() {
        return lnoxbzxz;
    }

    public void setLnoxbzxz(String lnoxbzxz) {
        this.lnoxbzxz = lnoxbzxz == null ? null : lnoxbzxz.trim();
    }

    public String getLnox1() {
        return lnox1;
    }

    public void setLnox1(String lnox1) {
        this.lnox1 = lnox1 == null ? null : lnox1.trim();
    }

    public String getLnox2() {
        return lnox2;
    }

    public void setLnox2(String lnox2) {
        this.lnox2 = lnox2 == null ? null : lnox2.trim();
    }

    public String getLnox3() {
        return lnox3;
    }

    public void setLnox3(String lnox3) {
        this.lnox3 = lnox3 == null ? null : lnox3.trim();
    }

    public String getLcoxs() {
        return lcoxs;
    }

    public void setLcoxs(String lcoxs) {
        this.lcoxs = lcoxs == null ? null : lcoxs.trim();
    }

    public String getLhcxs() {
        return lhcxs;
    }

    public void setLhcxs(String lhcxs) {
        this.lhcxs = lhcxs == null ? null : lhcxs.trim();
    }

    public String getLnoxxs() {
        return lnoxxs;
    }

    public void setLnoxxs(String lnoxxs) {
        this.lnoxxs = lnoxxs == null ? null : lnoxxs.trim();
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

    public String getLfhxpd() {
        return lfhxpd;
    }

    public void setLfhxpd(String lfhxpd) {
        this.lfhxpd = lfhxpd == null ? null : lfhxpd.trim();
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

    public String getSbzldsco() {
        return sbzldsco;
    }

    public void setSbzldsco(String sbzldsco) {
        this.sbzldsco = sbzldsco == null ? null : sbzldsco.trim();
    }

    public String getSbzldshc() {
        return sbzldshc;
    }

    public void setSbzldshc(String sbzldshc) {
        this.sbzldshc = sbzldshc == null ? null : sbzldshc.trim();
    }

    public String getSbzlgdsco() {
        return sbzlgdsco;
    }

    public void setSbzlgdsco(String sbzlgdsco) {
        this.sbzlgdsco = sbzlgdsco == null ? null : sbzlgdsco.trim();
    }

    public String getSbzlgdshc() {
        return sbzlgdshc;
    }

    public void setSbzlgdshc(String sbzlgdshc) {
        this.sbzlgdshc = sbzlgdshc == null ? null : sbzlgdshc.trim();
    }

    public String getSbzlgdslmd() {
        return sbzlgdslmd;
    }

    public void setSbzlgdslmd(String sbzlgdslmd) {
        this.sbzlgdslmd = sbzlgdslmd == null ? null : sbzlgdslmd.trim();
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
}
