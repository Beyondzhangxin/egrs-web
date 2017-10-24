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
@Table(name = "Y_QQC_FDJ_PQXT")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjPqxt {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;

    private String xh;

    private String scc;
    @FileTarget
    private String pqxtsyt;
    @FileTarget
    private String pqzgsyt;

    private String zxmj;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public String getPqxtsyt() {
        return pqxtsyt;
    }

    public void setPqxtsyt(String pqxtsyt) {
        this.pqxtsyt = pqxtsyt == null ? null : pqxtsyt.trim();
    }

    public String getPqzgsyt() {
        return pqzgsyt;
    }

    public void setPqzgsyt(String pqzgsyt) {
        this.pqzgsyt = pqzgsyt == null ? null : pqzgsyt.trim();
    }

    public String getZxmj() {
        return zxmj;
    }

    public void setZxmj(String zxmj) {
        this.zxmj = zxmj == null ? null : zxmj.trim();
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
