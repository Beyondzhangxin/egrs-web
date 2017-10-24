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
@Table(name="E3_QQC_CONFIG_DW")
public class QqcDw implements Serializable {
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

    private String coxz;

    private String cojg1;

    private String cojg2;

    private String cojg3;

    private String hcxz;

    private String hcjg1;

    private String hcjg2;

    private String hcjg3;

    private String fhxpd;

    private String cnzzxh;

    private String cnzzscc;

    private String dcrl;

    private String djxh;

    private String djscc;

    private String djzyyt;

    private String djazsl;

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

    public String getHcxz() {
        return hcxz;
    }

    public void setHcxz(String hcxz) {
        this.hcxz = hcxz == null ? null : hcxz.trim();
    }

    public String getHcjg1() {
        return hcjg1;
    }

    public void setHcjg1(String hcjg1) {
        this.hcjg1 = hcjg1 == null ? null : hcjg1.trim();
    }

    public String getHcjg2() {
        return hcjg2;
    }

    public void setHcjg2(String hcjg2) {
        this.hcjg2 = hcjg2 == null ? null : hcjg2.trim();
    }

    public String getHcjg3() {
        return hcjg3;
    }

    public void setHcjg3(String hcjg3) {
        this.hcjg3 = hcjg3 == null ? null : hcjg3.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

    public String getCnzzxh() {
        return cnzzxh;
    }

    public void setCnzzxh(String cnzzxh) {
        this.cnzzxh = cnzzxh == null ? null : cnzzxh.trim();
    }

    public String getCnzzscc() {
        return cnzzscc;
    }

    public void setCnzzscc(String cnzzscc) {
        this.cnzzscc = cnzzscc == null ? null : cnzzscc.trim();
    }

    public String getDcrl() {
        return dcrl;
    }

    public void setDcrl(String dcrl) {
        this.dcrl = dcrl == null ? null : dcrl.trim();
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh == null ? null : djxh.trim();
    }

    public String getDjscc() {
        return djscc;
    }

    public void setDjscc(String djscc) {
        this.djscc = djscc == null ? null : djscc.trim();
    }

    public String getDjzyyt() {
        return djzyyt;
    }

    public void setDjzyyt(String djzyyt) {
        this.djzyyt = djzyyt == null ? null : djzyyt.trim();
    }

    public String getDjazsl() {
        return djazsl;
    }

    public void setDjazsl(String djazsl) {
        this.djazsl = djazsl == null ? null : djazsl.trim();
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
