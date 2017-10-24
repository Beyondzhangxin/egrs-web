/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author jiabin fan
 *	轻型汽油车悬挂系
 */
@Entity
@Table(name="Y_APPENDIX_NJ")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.NjAppendixPk.class)
public class NjAppendix {
	@Id
	private String flbh;
	@Id
    private Integer bh;
	@Id
	private Integer njbh;
	@Temporal(TemporalType.DATE)
    private Date njstartdate;
	@Temporal(TemporalType.DATE)
    private Date njenddate;

    private String njjcdw;

    private String syxh;

    private String vinma;

    private String lhzh;

    private String lhsm;

    public Date getNjstartdate() {
        return njstartdate;
    }

    public void setNjstartdate(Date njstartdate) {
        this.njstartdate = njstartdate;
    }

    public Date getNjenddate() {
        return njenddate;
    }

    public void setNjenddate(Date njenddate) {
        this.njenddate = njenddate;
    }

    public String getNjjcdw() {
        return njjcdw;
    }

    public void setNjjcdw(String njjcdw) {
        this.njjcdw = njjcdw == null ? null : njjcdw.trim();
    }

    public String getSyxh() {
        return syxh;
    }

    public void setSyxh(String syxh) {
        this.syxh = syxh == null ? null : syxh.trim();
    }

    public String getVinma() {
        return vinma;
    }

    public void setVinma(String vinma) {
        this.vinma = vinma == null ? null : vinma.trim();
    }

    public String getLhzh() {
        return lhzh;
    }

    public void setLhzh(String lhzh) {
        this.lhzh = lhzh == null ? null : lhzh.trim();
    }

    public String getLhsm() {
        return lhsm;
    }

    public void setLhsm(String lhsm) {
        this.lhsm = lhsm == null ? null : lhsm.trim();
    }

    public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

	public Integer getNjbh() {
		return njbh;
	}

	public void setNjbh(Integer njbh) {
		this.njbh = njbh;
	}
    
}
