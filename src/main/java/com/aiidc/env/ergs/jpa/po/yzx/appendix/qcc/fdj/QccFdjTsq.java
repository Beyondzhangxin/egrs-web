/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj;


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
@Table(name = "Y_QCC_FDJ_TSQ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QccFdjTsq {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;
	
    private String tsqxh;

    private String yfzjyd;

    private String kfzjyd;

    public String getTsqxh() {
        return tsqxh;
    }

    public void setTsqxh(String tsqxh) {
        this.tsqxh = tsqxh == null ? null : tsqxh.trim();
    }

    public String getYfzjyd() {
        return yfzjyd;
    }

    public void setYfzjyd(String yfzjyd) {
        this.yfzjyd = yfzjyd == null ? null : yfzjyd.trim();
    }

    public String getKfzjyd() {
        return kfzjyd;
    }

    public void setKfzjyd(String kfzjyd) {
        this.kfzjyd = kfzjyd == null ? null : kfzjyd.trim();
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
