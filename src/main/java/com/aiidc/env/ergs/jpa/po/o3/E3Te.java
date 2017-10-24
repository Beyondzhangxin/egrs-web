/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

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
@IdClass(com.aiidc.env.ergs.jpa.po.o3.E3TePk.class)
@Table(name="E3_TE")
public class E3Te implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer bh;

    private String jzjybgbh;

    private String manufid;

    private String clmc;

    private String clxh;

    private String xhmc;

    private String fdjxh;

    private String fdjscc;

    private String jzclmc;

    private String jzclxh;

    private String jzfdjxh;

    private String jzfdjscc;

    private String isdp;

    private String dpxh;

    private String dpmc;

    private String dpfl;

    private String dpscc;
    
    public String getJybgbh() {
		return jybgbh;
	}

	public void setJybgbh(String jybgbh) {
		this.jybgbh = jybgbh;
	}

	public Integer getBh() {
		return bh;
	}

	public void setBh(Integer bh) {
		this.bh = bh;
	}

	public String getJzjybgbh() {
        return jzjybgbh;
    }

    public void setJzjybgbh(String jzjybgbh) {
        this.jzjybgbh = jzjybgbh == null ? null : jzjybgbh.trim();
    }

    public String getManufid() {
        return manufid;
    }

    public void setManufid(String manufid) {
        this.manufid = manufid == null ? null : manufid.trim();
    }

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc == null ? null : clmc.trim();
    }

    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh == null ? null : clxh.trim();
    }

    public String getXhmc() {
        return xhmc;
    }

    public void setXhmc(String xhmc) {
        this.xhmc = xhmc == null ? null : xhmc.trim();
    }

    public String getFdjxh() {
        return fdjxh;
    }

    public void setFdjxh(String fdjxh) {
        this.fdjxh = fdjxh == null ? null : fdjxh.trim();
    }

    public String getFdjscc() {
        return fdjscc;
    }

    public void setFdjscc(String fdjscc) {
        this.fdjscc = fdjscc == null ? null : fdjscc.trim();
    }

    public String getJzclmc() {
        return jzclmc;
    }

    public void setJzclmc(String jzclmc) {
        this.jzclmc = jzclmc == null ? null : jzclmc.trim();
    }

    public String getJzclxh() {
        return jzclxh;
    }

    public void setJzclxh(String jzclxh) {
        this.jzclxh = jzclxh == null ? null : jzclxh.trim();
    }

    public String getJzfdjxh() {
        return jzfdjxh;
    }

    public void setJzfdjxh(String jzfdjxh) {
        this.jzfdjxh = jzfdjxh == null ? null : jzfdjxh.trim();
    }

    public String getJzfdjscc() {
        return jzfdjscc;
    }

    public void setJzfdjscc(String jzfdjscc) {
        this.jzfdjscc = jzfdjscc == null ? null : jzfdjscc.trim();
    }

    public String getIsdp() {
        return isdp;
    }

    public void setIsdp(String isdp) {
        this.isdp = isdp == null ? null : isdp.trim();
    }

    public String getDpxh() {
        return dpxh;
    }

    public void setDpxh(String dpxh) {
        this.dpxh = dpxh == null ? null : dpxh.trim();
    }

    public String getDpmc() {
        return dpmc;
    }

    public void setDpmc(String dpmc) {
        this.dpmc = dpmc == null ? null : dpmc.trim();
    }

    public String getDpfl() {
        return dpfl;
    }

    public void setDpfl(String dpfl) {
        this.dpfl = dpfl == null ? null : dpfl.trim();
    }

    public String getDpscc() {
        return dpscc;
    }

    public void setDpscc(String dpscc) {
        this.dpscc = dpscc == null ? null : dpscc.trim();
    }
}
