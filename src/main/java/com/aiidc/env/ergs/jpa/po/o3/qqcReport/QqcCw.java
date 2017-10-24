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
@Table(name="E3_QQC_CONFIG_CW")
public class QqcCw implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer pzbh;

    private String zhqxh;

    private String zhqscc;

    private String ztscc;

    private String tcscc;

    private String fzscc;

    private String cgqxh;

    private String cgqscc;

    private String egrxh;

    private String egrscc;

    private String ecuxh;

    private String ecuscc;

    private String zyqxh;

    private String zyqscc;

    private String zlqxh;

    private String hhqxh;

    private String hhqscc;

    private String psdyxh;

    private String psdyscc;

    private String coxz;

    private String cojg1;

    private String cojg2;

    private String cojg3;

    private String thcxz;

    private String thcjg1;

    private String thcjg2;

    private String thcjg3;

    private String nmhcxz;

    private String nmhcjg1;

    private String nmhcjg2;

    private String nmhcjg3;

    private String noxxz;

    private String noxjg1;

    private String noxjg2;

    private String noxjg3;

    private String pmxz;

    private String pmjg1;

    private String pmjg2;

    private String pmjg3;

    private String coxs;

    private String thcxs;

    private String nmhcxs;

    private String noxxs;

    private String pmxs;

    private String fswz;

    private String ldgd;

    private String hxwz;

    private String fhxpd;

    private String lcoxz;

    private String lcojg1;

    private String lcojg2;

    private String lcojg3;

    private String lthcxz;

    private String lthcjg1;

    private String lthcjg2;

    private String lthcjg3;

    private String lnmhcxz;

    private String lnmhcjg1;

    private String lnmhcjg2;

    private String lnmhcjg3;

    private String lnoxxz;

    private String lnoxjg1;

    private String lnoxjg2;

    private String lnoxjg3;

    private String lcoxs;

    private String lthcxs;

    private String lnmhcxs;

    private String lnoxxs;

    private String lfswz;

    private String lldgd;

    private String lhxwz;

    private String lfhxpd;

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

    public String getHhqxh() {
        return hhqxh;
    }

    public void setHhqxh(String hhqxh) {
        this.hhqxh = hhqxh == null ? null : hhqxh.trim();
    }

    public String getHhqscc() {
        return hhqscc;
    }

    public void setHhqscc(String hhqscc) {
        this.hhqscc = hhqscc == null ? null : hhqscc.trim();
    }

    public String getPsdyxh() {
        return psdyxh;
    }

    public void setPsdyxh(String psdyxh) {
        this.psdyxh = psdyxh == null ? null : psdyxh.trim();
    }

    public String getPsdyscc() {
        return psdyscc;
    }

    public void setPsdyscc(String psdyscc) {
        this.psdyscc = psdyscc == null ? null : psdyscc.trim();
    }

    public String getCoxz() {
        return coxz;
    }

    public void setCoxz(String coxz) {
        this.coxz = coxz == null ? null : coxz.trim();
    }

    public String getCojg1() {
        return cojg1;
    }

    public void setCojg1(String cojg1) {
        this.cojg1 = cojg1 == null ? null : cojg1.trim();
    }

    public String getCojg2() {
        return cojg2;
    }

    public void setCojg2(String cojg2) {
        this.cojg2 = cojg2 == null ? null : cojg2.trim();
    }

    public String getCojg3() {
        return cojg3;
    }

    public void setCojg3(String cojg3) {
        this.cojg3 = cojg3 == null ? null : cojg3.trim();
    }

    public String getThcxz() {
        return thcxz;
    }

    public void setThcxz(String thcxz) {
        this.thcxz = thcxz == null ? null : thcxz.trim();
    }

    public String getThcjg1() {
        return thcjg1;
    }

    public void setThcjg1(String thcjg1) {
        this.thcjg1 = thcjg1 == null ? null : thcjg1.trim();
    }

    public String getThcjg2() {
        return thcjg2;
    }

    public void setThcjg2(String thcjg2) {
        this.thcjg2 = thcjg2 == null ? null : thcjg2.trim();
    }

    public String getThcjg3() {
        return thcjg3;
    }

    public void setThcjg3(String thcjg3) {
        this.thcjg3 = thcjg3 == null ? null : thcjg3.trim();
    }

    public String getNmhcxz() {
        return nmhcxz;
    }

    public void setNmhcxz(String nmhcxz) {
        this.nmhcxz = nmhcxz == null ? null : nmhcxz.trim();
    }

    public String getNmhcjg1() {
        return nmhcjg1;
    }

    public void setNmhcjg1(String nmhcjg1) {
        this.nmhcjg1 = nmhcjg1 == null ? null : nmhcjg1.trim();
    }

    public String getNmhcjg2() {
        return nmhcjg2;
    }

    public void setNmhcjg2(String nmhcjg2) {
        this.nmhcjg2 = nmhcjg2 == null ? null : nmhcjg2.trim();
    }

    public String getNmhcjg3() {
        return nmhcjg3;
    }

    public void setNmhcjg3(String nmhcjg3) {
        this.nmhcjg3 = nmhcjg3 == null ? null : nmhcjg3.trim();
    }

    public String getNoxxz() {
        return noxxz;
    }

    public void setNoxxz(String noxxz) {
        this.noxxz = noxxz == null ? null : noxxz.trim();
    }

    public String getNoxjg1() {
        return noxjg1;
    }

    public void setNoxjg1(String noxjg1) {
        this.noxjg1 = noxjg1 == null ? null : noxjg1.trim();
    }

    public String getNoxjg2() {
        return noxjg2;
    }

    public void setNoxjg2(String noxjg2) {
        this.noxjg2 = noxjg2 == null ? null : noxjg2.trim();
    }

    public String getNoxjg3() {
        return noxjg3;
    }

    public void setNoxjg3(String noxjg3) {
        this.noxjg3 = noxjg3 == null ? null : noxjg3.trim();
    }

    public String getPmxz() {
        return pmxz;
    }

    public void setPmxz(String pmxz) {
        this.pmxz = pmxz == null ? null : pmxz.trim();
    }

    public String getPmjg1() {
        return pmjg1;
    }

    public void setPmjg1(String pmjg1) {
        this.pmjg1 = pmjg1 == null ? null : pmjg1.trim();
    }

    public String getPmjg2() {
        return pmjg2;
    }

    public void setPmjg2(String pmjg2) {
        this.pmjg2 = pmjg2 == null ? null : pmjg2.trim();
    }

    public String getPmjg3() {
        return pmjg3;
    }

    public void setPmjg3(String pmjg3) {
        this.pmjg3 = pmjg3 == null ? null : pmjg3.trim();
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

    public String getFswz() {
        return fswz;
    }

    public void setFswz(String fswz) {
        this.fswz = fswz == null ? null : fswz.trim();
    }

    public String getLdgd() {
        return ldgd;
    }

    public void setLdgd(String ldgd) {
        this.ldgd = ldgd == null ? null : ldgd.trim();
    }

    public String getHxwz() {
        return hxwz;
    }

    public void setHxwz(String hxwz) {
        this.hxwz = hxwz == null ? null : hxwz.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

    public String getLcoxz() {
        return lcoxz;
    }

    public void setLcoxz(String lcoxz) {
        this.lcoxz = lcoxz == null ? null : lcoxz.trim();
    }

    public String getLcojg1() {
        return lcojg1;
    }

    public void setLcojg1(String lcojg1) {
        this.lcojg1 = lcojg1 == null ? null : lcojg1.trim();
    }

    public String getLcojg2() {
        return lcojg2;
    }

    public void setLcojg2(String lcojg2) {
        this.lcojg2 = lcojg2 == null ? null : lcojg2.trim();
    }

    public String getLcojg3() {
        return lcojg3;
    }

    public void setLcojg3(String lcojg3) {
        this.lcojg3 = lcojg3 == null ? null : lcojg3.trim();
    }

    public String getLthcxz() {
        return lthcxz;
    }

    public void setLthcxz(String lthcxz) {
        this.lthcxz = lthcxz == null ? null : lthcxz.trim();
    }

    public String getLthcjg1() {
        return lthcjg1;
    }

    public void setLthcjg1(String lthcjg1) {
        this.lthcjg1 = lthcjg1 == null ? null : lthcjg1.trim();
    }

    public String getLthcjg2() {
        return lthcjg2;
    }

    public void setLthcjg2(String lthcjg2) {
        this.lthcjg2 = lthcjg2 == null ? null : lthcjg2.trim();
    }

    public String getLthcjg3() {
        return lthcjg3;
    }

    public void setLthcjg3(String lthcjg3) {
        this.lthcjg3 = lthcjg3 == null ? null : lthcjg3.trim();
    }

    public String getLnmhcxz() {
        return lnmhcxz;
    }

    public void setLnmhcxz(String lnmhcxz) {
        this.lnmhcxz = lnmhcxz == null ? null : lnmhcxz.trim();
    }

    public String getLnmhcjg1() {
        return lnmhcjg1;
    }

    public void setLnmhcjg1(String lnmhcjg1) {
        this.lnmhcjg1 = lnmhcjg1 == null ? null : lnmhcjg1.trim();
    }

    public String getLnmhcjg2() {
        return lnmhcjg2;
    }

    public void setLnmhcjg2(String lnmhcjg2) {
        this.lnmhcjg2 = lnmhcjg2 == null ? null : lnmhcjg2.trim();
    }

    public String getLnmhcjg3() {
        return lnmhcjg3;
    }

    public void setLnmhcjg3(String lnmhcjg3) {
        this.lnmhcjg3 = lnmhcjg3 == null ? null : lnmhcjg3.trim();
    }

    public String getLnoxxz() {
        return lnoxxz;
    }

    public void setLnoxxz(String lnoxxz) {
        this.lnoxxz = lnoxxz == null ? null : lnoxxz.trim();
    }

    public String getLnoxjg1() {
        return lnoxjg1;
    }

    public void setLnoxjg1(String lnoxjg1) {
        this.lnoxjg1 = lnoxjg1 == null ? null : lnoxjg1.trim();
    }

    public String getLnoxjg2() {
        return lnoxjg2;
    }

    public void setLnoxjg2(String lnoxjg2) {
        this.lnoxjg2 = lnoxjg2 == null ? null : lnoxjg2.trim();
    }

    public String getLnoxjg3() {
        return lnoxjg3;
    }

    public void setLnoxjg3(String lnoxjg3) {
        this.lnoxjg3 = lnoxjg3 == null ? null : lnoxjg3.trim();
    }

    public String getLcoxs() {
        return lcoxs;
    }

    public void setLcoxs(String lcoxs) {
        this.lcoxs = lcoxs == null ? null : lcoxs.trim();
    }

    public String getLthcxs() {
        return lthcxs;
    }

    public void setLthcxs(String lthcxs) {
        this.lthcxs = lthcxs == null ? null : lthcxs.trim();
    }

    public String getLnmhcxs() {
        return lnmhcxs;
    }

    public void setLnmhcxs(String lnmhcxs) {
        this.lnmhcxs = lnmhcxs == null ? null : lnmhcxs.trim();
    }

    public String getLnoxxs() {
        return lnoxxs;
    }

    public void setLnoxxs(String lnoxxs) {
        this.lnoxxs = lnoxxs == null ? null : lnoxxs.trim();
    }

    public String getLfswz() {
        return lfswz;
    }

    public void setLfswz(String lfswz) {
        this.lfswz = lfswz == null ? null : lfswz.trim();
    }

    public String getLldgd() {
        return lldgd;
    }

    public void setLldgd(String lldgd) {
        this.lldgd = lldgd == null ? null : lldgd.trim();
    }

    public String getLhxwz() {
        return lhxwz;
    }

    public void setLhxwz(String lhxwz) {
        this.lhxwz = lhxwz == null ? null : lhxwz.trim();
    }

    public String getLfhxpd() {
        return lfhxpd;
    }

    public void setLfhxpd(String lfhxpd) {
        this.lfhxpd = lfhxpd == null ? null : lfhxpd.trim();
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
