/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@IdClass(com.aiidc.env.ergs.jpa.po.o3.E3SbbMxPk.class)
@Table(name="E3_SBBMX")
public class E3SbbMx implements Serializable {
    @Id
    private String sbbh;
    @Id
    private String jybgbh;
    @Id
    private String pzbh;
    
    private String flbh;

    private String dh;

    private String restatus;

    private String reshr;

    private Date reshrq;
    
    public String getSbbh() {
		return sbbh;
	}

	public void setSbbh(String sbbh) {
		this.sbbh = sbbh;
	}

	public String getJybgbh() {
		return jybgbh;
	}

	public void setJybgbh(String jybgbh) {
		this.jybgbh = jybgbh;
	}

	public String getPzbh() {
		return pzbh;
	}

	public void setPzbh(String pzbh) {
		this.pzbh = pzbh;
	}

	public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh == null ? null : dh.trim();
    }

    public String getRestatus() {
        return restatus;
    }

    public void setRestatus(String restatus) {
        this.restatus = restatus == null ? null : restatus.trim();
    }

    public String getReshr() {
        return reshr;
    }

    public void setReshr(String reshr) {
        this.reshr = reshr == null ? null : reshr.trim();
    }

    public Date getReshrq() {
        return reshrq;
    }

    public void setReshrq(Date reshrq) {
        this.reshrq = reshrq;
    }
}
