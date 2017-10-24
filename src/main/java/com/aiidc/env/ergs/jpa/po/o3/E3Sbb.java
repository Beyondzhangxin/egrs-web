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
@Table(name="E3_SBB")
public class E3Sbb implements Serializable {
    @Id
    private String sbbh;

    private String manufid;

    private String groupid;

    private String clxh;

    private String clmc;

    private String fdjxh;

    private String fdjscc;

    private Date sbrq;

    private Date sprq;

    private String status;

    private String userid;

    private String sbr;

    private String cllb;

    private String pf;

    private String zs;

    private String wjhh;

    private String zsh;

    private String type;

    private String bz;

    private String batch;

    private String jkc;

    private String xzmc;

    private String vt;

    private String bgflag;

    private String scqymc;

    private String flag;

    private String wz;

    private String xshz;

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh == null ? null : sbbh.trim();
    }

    public String getManufid() {
        return manufid;
    }

    public void setManufid(String manufid) {
        this.manufid = manufid == null ? null : manufid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
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

    public Date getSbrq() {
        return sbrq;
    }

    public void setSbrq(Date sbrq) {
        this.sbrq = sbrq;
    }

    public Date getSprq() {
        return sprq;
    }

    public void setSprq(Date sprq) {
        this.sprq = sprq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getSbr() {
        return sbr;
    }

    public void setSbr(String sbr) {
        this.sbr = sbr == null ? null : sbr.trim();
    }

    public String getCllb() {
        return cllb;
    }

    public void setCllb(String cllb) {
        this.cllb = cllb == null ? null : cllb.trim();
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf == null ? null : pf.trim();
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs == null ? null : zs.trim();
    }

    public String getWjhh() {
        return wjhh;
    }

    public void setWjhh(String wjhh) {
        this.wjhh = wjhh == null ? null : wjhh.trim();
    }

    public String getZsh() {
        return zsh;
    }

    public void setZsh(String zsh) {
        this.zsh = zsh == null ? null : zsh.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getJkc() {
        return jkc;
    }

    public void setJkc(String jkc) {
        this.jkc = jkc == null ? null : jkc.trim();
    }

    public String getXzmc() {
        return xzmc;
    }

    public void setXzmc(String xzmc) {
        this.xzmc = xzmc == null ? null : xzmc.trim();
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt == null ? null : vt.trim();
    }

    public String getBgflag() {
        return bgflag;
    }

    public void setBgflag(String bgflag) {
        this.bgflag = bgflag == null ? null : bgflag.trim();
    }

    public String getScqymc() {
        return scqymc;
    }

    public void setScqymc(String scqymc) {
        this.scqymc = scqymc == null ? null : scqymc.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getWz() {
        return wz;
    }

    public void setWz(String wz) {
        this.wz = wz == null ? null : wz.trim();
    }

    public String getXshz() {
        return xshz;
    }

    public void setXshz(String xshz) {
        this.xshz = xshz == null ? null : xshz.trim();
    }
}
