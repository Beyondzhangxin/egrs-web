/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3.qqcReport;

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
@IdClass(com.aiidc.env.ergs.util.ReportBasePk.class)
@Table(name="E3_QQC_CONFIG_QZX")
public class QqcQzx implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer pzbh;

    private String pcvxh;

    private String pcvscc;

    private String cs1;

    private String xsgl1;

    private String yl1;

    private String cs2;

    private String xsgl2;

    private String yl2;

    private String cs3;

    private String xsgl3;

    private String yl3;

    private String xz;

    private String fhxpd;

    public String getPcvxh() {
        return pcvxh;
    }

    public void setPcvxh(String pcvxh) {
        this.pcvxh = pcvxh == null ? null : pcvxh.trim();
    }

    public String getPcvscc() {
        return pcvscc;
    }

    public void setPcvscc(String pcvscc) {
        this.pcvscc = pcvscc == null ? null : pcvscc.trim();
    }

    public String getCs1() {
        return cs1;
    }

    public void setCs1(String cs1) {
        this.cs1 = cs1 == null ? null : cs1.trim();
    }

    public String getXsgl1() {
        return xsgl1;
    }

    public void setXsgl1(String xsgl1) {
        this.xsgl1 = xsgl1 == null ? null : xsgl1.trim();
    }

    public String getYl1() {
        return yl1;
    }

    public void setYl1(String yl1) {
        this.yl1 = yl1 == null ? null : yl1.trim();
    }

    public String getCs2() {
        return cs2;
    }

    public void setCs2(String cs2) {
        this.cs2 = cs2 == null ? null : cs2.trim();
    }

    public String getXsgl2() {
        return xsgl2;
    }

    public void setXsgl2(String xsgl2) {
        this.xsgl2 = xsgl2 == null ? null : xsgl2.trim();
    }

    public String getYl2() {
        return yl2;
    }

    public void setYl2(String yl2) {
        this.yl2 = yl2 == null ? null : yl2.trim();
    }

    public String getCs3() {
        return cs3;
    }

    public void setCs3(String cs3) {
        this.cs3 = cs3 == null ? null : cs3.trim();
    }

    public String getXsgl3() {
        return xsgl3;
    }

    public void setXsgl3(String xsgl3) {
        this.xsgl3 = xsgl3 == null ? null : xsgl3.trim();
    }

    public String getYl3() {
        return yl3;
    }

    public void setYl3(String yl3) {
        this.yl3 = yl3 == null ? null : yl3.trim();
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz == null ? null : xz.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

	public String getJybgbh() {
		return jybgbh;
	}

	public void setJybgbh(String jybgbh) {
		this.jybgbh = jybgbh;
	}

	public Integer getPzbh() {
		return pzbh;
	}

	public void setPzbh(Integer pzbh) {
		this.pzbh = pzbh;
	}
    

}
