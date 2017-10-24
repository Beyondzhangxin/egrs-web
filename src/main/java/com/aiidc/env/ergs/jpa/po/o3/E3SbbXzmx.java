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
@Table(name="E3_SBB_CXMX")
public class E3SbbXzmx implements Serializable {
    @Id
    private String sbbh;

    private String clxh;

    private String clmc;

    private String fdjxh;

    private String fdjscc;

    private String fdjgl;

    private String dpxh;

    private String dpmc;

    private String dpscc;

    private String dpfl;

    private Integer cxid;

    private String mxstatus;

    private String shlog;

    private String shr;

    private Date shrq;

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh == null ? null : sbbh.trim();
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

    public String getFdjgl() {
        return fdjgl;
    }

    public void setFdjgl(String fdjgl) {
        this.fdjgl = fdjgl == null ? null : fdjgl.trim();
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

    public String getDpscc() {
        return dpscc;
    }

    public void setDpscc(String dpscc) {
        this.dpscc = dpscc == null ? null : dpscc.trim();
    }

    public String getDpfl() {
        return dpfl;
    }

    public void setDpfl(String dpfl) {
        this.dpfl = dpfl == null ? null : dpfl.trim();
    }

    public Integer getCxid() {
        return cxid;
    }

    public void setCxid(Integer cxid) {
        this.cxid = cxid;
    }

    public String getMxstatus() {
        return mxstatus;
    }

    public void setMxstatus(String mxstatus) {
        this.mxstatus = mxstatus == null ? null : mxstatus.trim();
    }

    public String getShlog() {
        return shlog;
    }

    public void setShlog(String shlog) {
        this.shlog = shlog == null ? null : shlog.trim();
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr == null ? null : shr.trim();
    }

    public Date getShrq() {
        return shrq;
    }

    public void setShrq(Date shrq) {
        this.shrq = shrq;
    }
}
