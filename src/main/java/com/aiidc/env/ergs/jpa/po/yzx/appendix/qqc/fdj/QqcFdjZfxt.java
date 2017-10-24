/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.aiidc.env.ergs.common.file.FileTarget;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QQC_FDJ_ZFXT")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjZfxt {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;

    private String tffkqd;
    @FileTarget
    private String xtsyt;

    private String gtzl;
    @FileTarget
    private String yxsyt;

    private String yxrj;

    private String yxcl;

    private String rbhsm;

    private String rygcd;

    private String rygcl;
    @FileTarget
    private String tgsyt;

    private String tgxh;

    private String tgscc;

    private String tzzt;

    private String tgbwc;

    private String csgznl;
    @FileTarget
    private String rbhsyt;

    private String tgyxrj;

    private String hxtxh;

    private String hxtscc;

    public String getTffkqd() {
        return tffkqd;
    }

    public void setTffkqd(String tffkqd) {
        this.tffkqd = tffkqd == null ? null : tffkqd.trim();
    }

    public String getXtsyt() {
        return xtsyt;
    }

    public void setXtsyt(String xtsyt) {
        this.xtsyt = xtsyt == null ? null : xtsyt.trim();
    }

    public String getGtzl() {
        return gtzl;
    }

    public void setGtzl(String gtzl) {
        this.gtzl = gtzl == null ? null : gtzl.trim();
    }

    public String getYxsyt() {
        return yxsyt;
    }

    public void setYxsyt(String yxsyt) {
        this.yxsyt = yxsyt == null ? null : yxsyt.trim();
    }

    public String getYxrj() {
        return yxrj;
    }

    public void setYxrj(String yxrj) {
        this.yxrj = yxrj == null ? null : yxrj.trim();
    }

    public String getYxcl() {
        return yxcl;
    }

    public void setYxcl(String yxcl) {
        this.yxcl = yxcl == null ? null : yxcl.trim();
    }

    public String getRbhsm() {
        return rbhsm;
    }

    public void setRbhsm(String rbhsm) {
        this.rbhsm = rbhsm == null ? null : rbhsm.trim();
    }

    public String getRygcd() {
        return rygcd;
    }

    public void setRygcd(String rygcd) {
        this.rygcd = rygcd == null ? null : rygcd.trim();
    }

    public String getRygcl() {
        return rygcl;
    }

    public void setRygcl(String rygcl) {
        this.rygcl = rygcl == null ? null : rygcl.trim();
    }

    public String getTgsyt() {
        return tgsyt;
    }

    public void setTgsyt(String tgsyt) {
        this.tgsyt = tgsyt == null ? null : tgsyt.trim();
    }

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

    public String getTzzt() {
        return tzzt;
    }

    public void setTzzt(String tzzt) {
        this.tzzt = tzzt == null ? null : tzzt.trim();
    }

    public String getTgbwc() {
        return tgbwc;
    }

    public void setTgbwc(String tgbwc) {
        this.tgbwc = tgbwc == null ? null : tgbwc.trim();
    }

    public String getCsgznl() {
        return csgznl;
    }

    public void setCsgznl(String csgznl) {
        this.csgznl = csgznl == null ? null : csgznl.trim();
    }

    public String getRbhsyt() {
        return rbhsyt;
    }

    public void setRbhsyt(String rbhsyt) {
        this.rbhsyt = rbhsyt == null ? null : rbhsyt.trim();
    }

    public String getTgyxrj() {
        return tgyxrj;
    }

    public void setTgyxrj(String tgyxrj) {
        this.tgyxrj = tgyxrj == null ? null : tgyxrj.trim();
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
	
	
	
}
