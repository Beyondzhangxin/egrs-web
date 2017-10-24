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
@Table(name="E3_QQC_CONFIG_RYZF")
public class QqcRyzf implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer pzbh;

    private String tgxh;

    private String tgscc;

    private String hxpfl;

    private String rjpfl;

    private String pfzl;

    private String bzxz;

    private String fhxpd;

    private String hxtxh;

    private String hxtscc;

    private String hxtzl;

    private String tgyxrj;

    private String csnlsbz;

    private String cssbz11;

    private String csjg;

    private String rjsbz;

    private String rjsbz11;

    private String rjjg;

    private String csfhxpd;

    private String cnzzxh;

    private String cnzzscc;

    private String dcrl;

    private String djxh;

    private String djscc;

    private String djzyyt;

    private String djazsl;

    public String getTgxh() {
        return tgxh;
    }

    public void setTgxh(String tgxh) {
        this.tgxh = tgxh == null ? null : tgxh.trim();
    }

    public String getTgscc() {
        return tgscc;
    }

    public void setTgscc(String tgscc) {
        this.tgscc = tgscc == null ? null : tgscc.trim();
    }

    public String getHxpfl() {
        return hxpfl;
    }

    public void setHxpfl(String hxpfl) {
        this.hxpfl = hxpfl == null ? null : hxpfl.trim();
    }

    public String getRjpfl() {
        return rjpfl;
    }

    public void setRjpfl(String rjpfl) {
        this.rjpfl = rjpfl == null ? null : rjpfl.trim();
    }

    public String getPfzl() {
        return pfzl;
    }

    public void setPfzl(String pfzl) {
        this.pfzl = pfzl == null ? null : pfzl.trim();
    }

    public String getBzxz() {
        return bzxz;
    }

    public void setBzxz(String bzxz) {
        this.bzxz = bzxz == null ? null : bzxz.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

    public String getHxtxh() {
        return hxtxh;
    }

    public void setHxtxh(String hxtxh) {
        this.hxtxh = hxtxh == null ? null : hxtxh.trim();
    }

    public String getHxtscc() {
        return hxtscc;
    }

    public void setHxtscc(String hxtscc) {
        this.hxtscc = hxtscc == null ? null : hxtscc.trim();
    }

    public String getHxtzl() {
        return hxtzl;
    }

    public void setHxtzl(String hxtzl) {
        this.hxtzl = hxtzl == null ? null : hxtzl.trim();
    }

    public String getTgyxrj() {
        return tgyxrj;
    }

    public void setTgyxrj(String tgyxrj) {
        this.tgyxrj = tgyxrj == null ? null : tgyxrj.trim();
    }

    public String getCsnlsbz() {
        return csnlsbz;
    }

    public void setCsnlsbz(String csnlsbz) {
        this.csnlsbz = csnlsbz == null ? null : csnlsbz.trim();
    }

    public String getCssbz11() {
        return cssbz11;
    }

    public void setCssbz11(String cssbz11) {
        this.cssbz11 = cssbz11 == null ? null : cssbz11.trim();
    }

    public String getCsjg() {
        return csjg;
    }

    public void setCsjg(String csjg) {
        this.csjg = csjg == null ? null : csjg.trim();
    }

    public String getRjsbz() {
        return rjsbz;
    }

    public void setRjsbz(String rjsbz) {
        this.rjsbz = rjsbz == null ? null : rjsbz.trim();
    }

    public String getRjsbz11() {
        return rjsbz11;
    }

    public void setRjsbz11(String rjsbz11) {
        this.rjsbz11 = rjsbz11 == null ? null : rjsbz11.trim();
    }

    public String getRjjg() {
        return rjjg;
    }

    public void setRjjg(String rjjg) {
        this.rjjg = rjjg == null ? null : rjjg.trim();
    }

    public String getCsfhxpd() {
        return csfhxpd;
    }

    public void setCsfhxpd(String csfhxpd) {
        this.csfhxpd = csfhxpd == null ? null : csfhxpd.trim();
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
