/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QCC_FDJ_KLW_DY")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.FlbhAndFdjbhAndBhAndZhqbh.class)
public class QccFdjKlwDy {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;
	@Id
	private Integer zhqbh;
	
    private String dylb;

    private String gjshl;

    private String xdnd;

    private String gltzl;

    private String ztcl;

    private String glttj;

    private String ztscc;

    private String ztsccbs;

    private String ztsccbssyt;

    private String tcscc;

    private String tcsccbs;

    private String tcsccbssyt;
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
	
   public Integer getZhqbh() {
		return zhqbh;
	}

	public void setZhqbh(Integer zhqbh) {
		this.zhqbh = zhqbh;
	}

	public String getDylb() {
        return dylb;
    }

    public void setDylb(String dylb) {
        this.dylb = dylb == null ? null : dylb.trim();
    }

    public String getGjshl() {
        return gjshl;
    }

    public void setGjshl(String gjshl) {
        this.gjshl = gjshl == null ? null : gjshl.trim();
    }

    public String getXdnd() {
        return xdnd;
    }

    public void setXdnd(String xdnd) {
        this.xdnd = xdnd == null ? null : xdnd.trim();
    }

    public String getGltzl() {
        return gltzl;
    }

    public void setGltzl(String gltzl) {
        this.gltzl = gltzl == null ? null : gltzl.trim();
    }

    public String getZtcl() {
        return ztcl;
    }

    public void setZtcl(String ztcl) {
        this.ztcl = ztcl == null ? null : ztcl.trim();
    }

    public String getGlttj() {
        return glttj;
    }

    public void setGlttj(String glttj) {
        this.glttj = glttj == null ? null : glttj.trim();
    }

    public String getZtscc() {
        return ztscc;
    }

    public void setZtscc(String ztscc) {
        this.ztscc = ztscc == null ? null : ztscc.trim();
    }

    public String getZtsccbs() {
        return ztsccbs;
    }

    public void setZtsccbs(String ztsccbs) {
        this.ztsccbs = ztsccbs == null ? null : ztsccbs.trim();
    }

    public String getZtsccbssyt() {
        return ztsccbssyt;
    }

    public void setZtsccbssyt(String ztsccbssyt) {
        this.ztsccbssyt = ztsccbssyt == null ? null : ztsccbssyt.trim();
    }

    public String getTcscc() {
        return tcscc;
    }

    public void setTcscc(String tcscc) {
        this.tcscc = tcscc == null ? null : tcscc.trim();
    }

    public String getTcsccbs() {
        return tcsccbs;
    }

    public void setTcsccbs(String tcsccbs) {
        this.tcsccbs = tcsccbs == null ? null : tcsccbs.trim();
    }

    public String getTcsccbssyt() {
        return tcsccbssyt;
    }

    public void setTcsccbssyt(String tcsccbssyt) {
        this.tcsccbssyt = tcsccbssyt == null ? null : tcsccbssyt.trim();
    }
}
