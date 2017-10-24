/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name="E3_VEHICLES")
public class E3Vehicles implements Serializable {
    @Id
	private Long cxid;

    private String clxh;

    private String clmc;

    private String fdjxh;

    private String fdjscc;

    private String manufid;

    private String fdjgl;

    private String fdjzs;

    private String cllb;

    private Date zhrq;

    private String newsbbh;

    private String sbstatus;

    private String newwjh;

    private String zsh;

    private String xzmc;

    public Long getCxid() {
        return cxid;
    }

    public void setCxid(Long cxid) {
        this.cxid = cxid;
    }

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

    public String getManufid() {
        return manufid;
    }

    public void setManufid(String manufid) {
        this.manufid = manufid == null ? null : manufid.trim();
    }

    public String getFdjgl() {
        return fdjgl;
    }

    public void setFdjgl(String fdjgl) {
        this.fdjgl = fdjgl == null ? null : fdjgl.trim();
    }

    public String getFdjzs() {
        return fdjzs;
    }

    public void setFdjzs(String fdjzs) {
        this.fdjzs = fdjzs == null ? null : fdjzs.trim();
    }

    public String getCllb() {
        return cllb;
    }

    public void setCllb(String cllb) {
        this.cllb = cllb == null ? null : cllb.trim();
    }

    public Date getZhrq() {
        return zhrq;
    }

    public void setZhrq(Date zhrq) {
        this.zhrq = zhrq;
    }

    public String getNewsbbh() {
        return newsbbh;
    }

    public void setNewsbbh(String newsbbh) {
        this.newsbbh = newsbbh == null ? null : newsbbh.trim();
    }

    public String getSbstatus() {
        return sbstatus;
    }

    public void setSbstatus(String sbstatus) {
        this.sbstatus = sbstatus == null ? null : sbstatus.trim();
    }

    public String getNewwjh() {
        return newwjh;
    }

    public void setNewwjh(String newwjh) {
        this.newwjh = newwjh == null ? null : newwjh.trim();
    }

    public String getZsh() {
        return zsh;
    }

    public void setZsh(String zsh) {
        this.zsh = zsh == null ? null : zsh.trim();
    }

    public String getXzmc() {
        return xzmc;
    }

    public void setXzmc(String xzmc) {
        this.xzmc = xzmc == null ? null : xzmc.trim();
    }
}
