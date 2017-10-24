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
 *
 */
@Entity
@Table(name = "Y_QQC_FDJ_GYB")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjGyb {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;
	
    private String gybxh;

    private String gybscc;

    private String gybyl;

    public String getGybxh() {
        return gybxh;
    }

    public void setGybxh(String gybxh) {
        this.gybxh = gybxh == null ? null : gybxh.trim();
    }

    public String getGybscc() {
        return gybscc;
    }

    public void setGybscc(String gybscc) {
        this.gybscc = gybscc == null ? null : gybscc.trim();
    }

    public String getGybyl() {
        return gybyl;
    }

    public void setGybyl(String gybyl) {
        this.gybyl = gybyl == null ? null : gybyl.trim();
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
