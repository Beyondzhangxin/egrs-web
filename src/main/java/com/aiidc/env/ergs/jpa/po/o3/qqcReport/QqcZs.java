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
@Table(name="E3_QQC_CONFIG_ZS")
public class QqcZs implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer pzbh;

    private String xsqxh;

    private String xsqscc;

    private String pzsxh;

    private String pzsscc;

    private String zhqxh;

    private String zhqscc;

    private String pqgxh;

    private String pqgscc;

    private String bzxz;

    private String zdzs;

    private String fhxpd;

    private String zjjg1;

    private String zjjg2;

    private String zjjg3;

    private String gcpjz1;

    private String gcpjz2;

    private String gcpjz3;

    private String gcpjz4;

    private String gcpjz5;

    private String gcpjz6;

    private String rx1;

    private String rx2;

    private String rx3;

    private String rx4;

    private String rx5;

    private String rx6;

    private String cx1;

    private String cx2;

    private String cx3;

    private String cx4;

    private String cx5;

    private String cx6;

    private String bjzs;

    private String dw1;

    private String dw2;

    private String dw3;

    private String ztscc;

    private String tcscc;

    private String fzscc;

    public String getXsqxh() {
        return xsqxh;
    }

    public void setXsqxh(String xsqxh) {
        this.xsqxh = xsqxh == null ? null : xsqxh.trim();
    }

    public String getXsqscc() {
        return xsqscc;
    }

    public void setXsqscc(String xsqscc) {
        this.xsqscc = xsqscc == null ? null : xsqscc.trim();
    }

    public String getPzsxh() {
        return pzsxh;
    }

    public void setPzsxh(String pzsxh) {
        this.pzsxh = pzsxh == null ? null : pzsxh.trim();
    }

    public String getPzsscc() {
        return pzsscc;
    }

    public void setPzsscc(String pzsscc) {
        this.pzsscc = pzsscc == null ? null : pzsscc.trim();
    }

    public String getZhqxh() {
        return zhqxh;
    }

    public void setZhqxh(String zhqxh) {
        this.zhqxh = zhqxh == null ? null : zhqxh.trim();
    }

    public String getZhqscc() {
        return zhqscc;
    }

    public void setZhqscc(String zhqscc) {
        this.zhqscc = zhqscc == null ? null : zhqscc.trim();
    }

    public String getPqgxh() {
        return pqgxh;
    }

    public void setPqgxh(String pqgxh) {
        this.pqgxh = pqgxh == null ? null : pqgxh.trim();
    }

    public String getPqgscc() {
        return pqgscc;
    }

    public void setPqgscc(String pqgscc) {
        this.pqgscc = pqgscc == null ? null : pqgscc.trim();
    }

    public String getBzxz() {
        return bzxz;
    }

    public void setBzxz(String bzxz) {
        this.bzxz = bzxz == null ? null : bzxz.trim();
    }

    public String getZdzs() {
        return zdzs;
    }

    public void setZdzs(String zdzs) {
        this.zdzs = zdzs == null ? null : zdzs.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

    public String getZjjg1() {
        return zjjg1;
    }

    public void setZjjg1(String zjjg1) {
        this.zjjg1 = zjjg1 == null ? null : zjjg1.trim();
    }

    public String getZjjg2() {
        return zjjg2;
    }

    public void setZjjg2(String zjjg2) {
        this.zjjg2 = zjjg2 == null ? null : zjjg2.trim();
    }

    public String getZjjg3() {
        return zjjg3;
    }

    public void setZjjg3(String zjjg3) {
        this.zjjg3 = zjjg3 == null ? null : zjjg3.trim();
    }

    public String getGcpjz1() {
        return gcpjz1;
    }

    public void setGcpjz1(String gcpjz1) {
        this.gcpjz1 = gcpjz1 == null ? null : gcpjz1.trim();
    }

    public String getGcpjz2() {
        return gcpjz2;
    }

    public void setGcpjz2(String gcpjz2) {
        this.gcpjz2 = gcpjz2 == null ? null : gcpjz2.trim();
    }

    public String getGcpjz3() {
        return gcpjz3;
    }

    public void setGcpjz3(String gcpjz3) {
        this.gcpjz3 = gcpjz3 == null ? null : gcpjz3.trim();
    }

    public String getGcpjz4() {
        return gcpjz4;
    }

    public void setGcpjz4(String gcpjz4) {
        this.gcpjz4 = gcpjz4 == null ? null : gcpjz4.trim();
    }

    public String getGcpjz5() {
        return gcpjz5;
    }

    public void setGcpjz5(String gcpjz5) {
        this.gcpjz5 = gcpjz5 == null ? null : gcpjz5.trim();
    }

    public String getGcpjz6() {
        return gcpjz6;
    }

    public void setGcpjz6(String gcpjz6) {
        this.gcpjz6 = gcpjz6 == null ? null : gcpjz6.trim();
    }

    public String getRx1() {
        return rx1;
    }

    public void setRx1(String rx1) {
        this.rx1 = rx1 == null ? null : rx1.trim();
    }

    public String getRx2() {
        return rx2;
    }

    public void setRx2(String rx2) {
        this.rx2 = rx2 == null ? null : rx2.trim();
    }

    public String getRx3() {
        return rx3;
    }

    public void setRx3(String rx3) {
        this.rx3 = rx3 == null ? null : rx3.trim();
    }

    public String getRx4() {
        return rx4;
    }

    public void setRx4(String rx4) {
        this.rx4 = rx4 == null ? null : rx4.trim();
    }

    public String getRx5() {
        return rx5;
    }

    public void setRx5(String rx5) {
        this.rx5 = rx5 == null ? null : rx5.trim();
    }

    public String getRx6() {
        return rx6;
    }

    public void setRx6(String rx6) {
        this.rx6 = rx6 == null ? null : rx6.trim();
    }

    public String getCx1() {
        return cx1;
    }

    public void setCx1(String cx1) {
        this.cx1 = cx1 == null ? null : cx1.trim();
    }

    public String getCx2() {
        return cx2;
    }

    public void setCx2(String cx2) {
        this.cx2 = cx2 == null ? null : cx2.trim();
    }

    public String getCx3() {
        return cx3;
    }

    public void setCx3(String cx3) {
        this.cx3 = cx3 == null ? null : cx3.trim();
    }

    public String getCx4() {
        return cx4;
    }

    public void setCx4(String cx4) {
        this.cx4 = cx4 == null ? null : cx4.trim();
    }

    public String getCx5() {
        return cx5;
    }

    public void setCx5(String cx5) {
        this.cx5 = cx5 == null ? null : cx5.trim();
    }

    public String getCx6() {
        return cx6;
    }

    public void setCx6(String cx6) {
        this.cx6 = cx6 == null ? null : cx6.trim();
    }

    public String getBjzs() {
        return bjzs;
    }

    public void setBjzs(String bjzs) {
        this.bjzs = bjzs == null ? null : bjzs.trim();
    }

    public String getDw1() {
        return dw1;
    }

    public void setDw1(String dw1) {
        this.dw1 = dw1 == null ? null : dw1.trim();
    }

    public String getDw2() {
        return dw2;
    }

    public void setDw2(String dw2) {
        this.dw2 = dw2 == null ? null : dw2.trim();
    }

    public String getDw3() {
        return dw3;
    }

    public void setDw3(String dw3) {
        this.dw3 = dw3 == null ? null : dw3.trim();
    }

    public String getZtscc() {
        return ztscc;
    }

    public void setZtscc(String ztscc) {
        this.ztscc = ztscc == null ? null : ztscc.trim();
    }

    public String getTcscc() {
        return tcscc;
    }

    public void setTcscc(String tcscc) {
        this.tcscc = tcscc == null ? null : tcscc.trim();
    }

    public String getFzscc() {
        return fzscc;
    }

    public void setFzscc(String fzscc) {
        this.fzscc = fzscc == null ? null : fzscc.trim();
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
