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
@Table(name="E3_QQC_CONFIG_YH")
public class QqcYh implements Serializable {
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

    private String ltdmkd;

    private String ltjg;

    private String zyqxh;

    private String zyqscc;

    private String zlqxh;

    private String zlqscc;

    private String rlsqxh;

    private String rlsjxh;

    private String rlzh;

    private String co2sqxh;

    private String co2sjxh;

    private String co2zh;

    private String ztscc;

    private String tcscc;

    private String fzscc;

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

    public String getLtdmkd() {
        return ltdmkd;
    }

    public void setLtdmkd(String ltdmkd) {
        this.ltdmkd = ltdmkd == null ? null : ltdmkd.trim();
    }

    public String getLtjg() {
        return ltjg;
    }

    public void setLtjg(String ltjg) {
        this.ltjg = ltjg == null ? null : ltjg.trim();
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

    public String getRlsqxh() {
        return rlsqxh;
    }

    public void setRlsqxh(String rlsqxh) {
        this.rlsqxh = rlsqxh == null ? null : rlsqxh.trim();
    }

    public String getRlsjxh() {
        return rlsjxh;
    }

    public void setRlsjxh(String rlsjxh) {
        this.rlsjxh = rlsjxh == null ? null : rlsjxh.trim();
    }

    public String getRlzh() {
        return rlzh;
    }

    public void setRlzh(String rlzh) {
        this.rlzh = rlzh == null ? null : rlzh.trim();
    }

    public String getCo2sqxh() {
        return co2sqxh;
    }

    public void setCo2sqxh(String co2sqxh) {
        this.co2sqxh = co2sqxh == null ? null : co2sqxh.trim();
    }

    public String getCo2sjxh() {
        return co2sjxh;
    }

    public void setCo2sjxh(String co2sjxh) {
        this.co2sjxh = co2sjxh == null ? null : co2sjxh.trim();
    }

    public String getCo2zh() {
        return co2zh;
    }

    public void setCo2zh(String co2zh) {
        this.co2zh = co2zh == null ? null : co2zh.trim();
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
