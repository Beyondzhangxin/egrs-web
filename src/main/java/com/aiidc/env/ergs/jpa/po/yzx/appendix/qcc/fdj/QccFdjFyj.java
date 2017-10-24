/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QCC_FDJ_FYJ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QccFdjFyj {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;

    private String mc;

    private String scc;

    private String lx;

    private String nd;

    private String wdfw;

    private String zxbz;

    private String bcpl;

    private String pswz;

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx == null ? null : lx.trim();
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd == null ? null : nd.trim();
    }

    public String getWdfw() {
        return wdfw;
    }

    public void setWdfw(String wdfw) {
        this.wdfw = wdfw == null ? null : wdfw.trim();
    }

    public String getZxbz() {
        return zxbz;
    }

    public void setZxbz(String zxbz) {
        this.zxbz = zxbz == null ? null : zxbz.trim();
    }

    public String getBcpl() {
        return bcpl;
    }

    public void setBcpl(String bcpl) {
        this.bcpl = bcpl == null ? null : bcpl.trim();
    }

    public String getPswz() {
        return pswz;
    }

    public void setPswz(String pswz) {
        this.pswz = pswz == null ? null : pswz.trim();
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
