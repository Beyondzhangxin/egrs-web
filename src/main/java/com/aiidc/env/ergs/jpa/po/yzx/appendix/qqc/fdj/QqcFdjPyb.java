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
@Table(name = "Y_QQC_FDJ_PYB")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjPyb {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;
	
    private String pybxh;

    private String pybscc;

    private String bzs1;

    private String bzs2;

    private String pyds;

    private String pytqqx;

    private String zgpyyl;

    public String getPybxh() {
        return pybxh;
    }

    public void setPybxh(String pybxh) {
        this.pybxh = pybxh == null ? null : pybxh.trim();
    }

    public String getPybscc() {
        return pybscc;
    }

    public void setPybscc(String pybscc) {
        this.pybscc = pybscc == null ? null : pybscc.trim();
    }

    public String getBzs1() {
        return bzs1;
    }

    public void setBzs1(String bzs1) {
        this.bzs1 = bzs1 == null ? null : bzs1.trim();
    }

    public String getBzs2() {
        return bzs2;
    }

    public void setBzs2(String bzs2) {
        this.bzs2 = bzs2 == null ? null : bzs2.trim();
    }

    public String getPyds() {
        return pyds;
    }

    public void setPyds(String pyds) {
        this.pyds = pyds == null ? null : pyds.trim();
    }

    public String getPytqqx() {
        return pytqqx;
    }

    public void setPytqqx(String pytqqx) {
        this.pytqqx = pytqqx == null ? null : pytqqx.trim();
    }

    public String getZgpyyl() {
        return zgpyyl;
    }

    public void setZgpyyl(String zgpyyl) {
        this.zgpyyl = zgpyyl == null ? null : zgpyyl.trim();
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
