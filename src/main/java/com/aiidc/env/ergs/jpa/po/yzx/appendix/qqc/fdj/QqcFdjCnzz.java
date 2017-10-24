/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *  轻型汽油车储能装置
 */
@Entity
@Table(name = "Y_QQC_FDJ_CNZZ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjCnzz {
    @Id
	private String flbh;
    @Id
    private Integer fdjbh;
    @Id
    private Integer bh;
    
	private String cnzzxh;

    private String cnzzscc;

    private String cnzzlx;

    private String sbh;

    private String cdzz;

    private String cnzznl;

    private String smljfs;

    private String zdcdgl;

    private String dtdy;

    private String dtscc;

    private String zcedrl;

    private String zcbcdy;

    private String zcedscdl;

    private String zzdl;

    private String zdfdgl;

    private String dcbzl;
    
    public String getFlbh() {
    	return flbh;
    }
    
    public void setFlbh(String flbh) {
    	this.flbh = flbh == null ? null : flbh.trim();
    }
    
    public Integer getFdjbh() {
    	return fdjbh;
    }
    
    public void setFdjbh(Integer fdjbh) {
    	this.fdjbh = fdjbh;
    }
    
    public Integer getBh() {
    	return bh;
    }
    
    public void setBh(Integer bh) {
    	this.bh = bh;
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

    public String getCnzzlx() {
        return cnzzlx;
    }

    public void setCnzzlx(String cnzzlx) {
        this.cnzzlx = cnzzlx == null ? null : cnzzlx.trim();
    }

    public String getSbh() {
        return sbh;
    }

    public void setSbh(String sbh) {
        this.sbh = sbh == null ? null : sbh.trim();
    }

    public String getCdzz() {
        return cdzz;
    }

    public void setCdzz(String cdzz) {
        this.cdzz = cdzz == null ? null : cdzz.trim();
    }

    public String getCnzznl() {
        return cnzznl;
    }

    public void setCnzznl(String cnzznl) {
        this.cnzznl = cnzznl == null ? null : cnzznl.trim();
    }

    public String getSmljfs() {
        return smljfs;
    }

    public void setSmljfs(String smljfs) {
        this.smljfs = smljfs == null ? null : smljfs.trim();
    }

    public String getZdcdgl() {
        return zdcdgl;
    }

    public void setZdcdgl(String zdcdgl) {
        this.zdcdgl = zdcdgl == null ? null : zdcdgl.trim();
    }

    public String getDtdy() {
        return dtdy;
    }

    public void setDtdy(String dtdy) {
        this.dtdy = dtdy == null ? null : dtdy.trim();
    }

    public String getDtscc() {
        return dtscc;
    }

    public void setDtscc(String dtscc) {
        this.dtscc = dtscc == null ? null : dtscc.trim();
    }

    public String getZcedrl() {
        return zcedrl;
    }

    public void setZcedrl(String zcedrl) {
        this.zcedrl = zcedrl == null ? null : zcedrl.trim();
    }

    public String getZcbcdy() {
        return zcbcdy;
    }

    public void setZcbcdy(String zcbcdy) {
        this.zcbcdy = zcbcdy == null ? null : zcbcdy.trim();
    }

    public String getZcedscdl() {
        return zcedscdl;
    }

    public void setZcedscdl(String zcedscdl) {
        this.zcedscdl = zcedscdl == null ? null : zcedscdl.trim();
    }

    public String getZzdl() {
        return zzdl;
    }

    public void setZzdl(String zzdl) {
        this.zzdl = zzdl == null ? null : zzdl.trim();
    }

    public String getZdfdgl() {
        return zdfdgl;
    }

    public void setZdfdgl(String zdfdgl) {
        this.zdfdgl = zdfdgl == null ? null : zdfdgl.trim();
    }

    public String getDcbzl() {
        return dcbzl;
    }

    public void setDcbzl(String dcbzl) {
        this.dcbzl = dcbzl == null ? null : dcbzl.trim();
    }	
}
