/**
 * @航天科工智慧产业发展有限公司
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
/**
 * 轻型车传动系
 * @author jiabin fan
 *
 */
@Entity
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.FlbhAndBh.class)
@Table(name = "Y_QCC_MAIN_CDX")
public class QccMainCdx implements Serializable{
    @Id
    private String flbh;
    @Id
    private Integer bh;
	
    private String lhqxs;

    private String bsxxs;

    private String bsxxh;

    private String xdwz;

    private String nbsbcvtmax;

    private String nbsb1;

    private String nbsb2;

    private String nbsb3;

    private String nbsb4;

    private String nbsb5;

    private String nbsbcvtmin;

    private String nbsbdd;

    private String zcdbmax;

    private String zcdb1;

    private String zcdb2;

    private String zcdb3;

    private String zcdb4;

    private String zcdb5;

    private String zcdbmin;

    private String zcdbdd;

    private String zsbmax;

    private String zsb1;

    private String zsb2;

    private String zsb3;

    private String zsb4;

    private String zsb5;

    private String zsbmin;

    private String zsbdd;

    private String bsxdws;

    private String nbsb6;

    private String zsb6;

    private String zdnj;

    private String bsxscc;

    private String flzdgl;

    private String fjzdgl;

    private String nbsb7;

    private String zcdb7;

    private String zsb7;

    private String nbsb8;

    private String zcdb8;

    private String zsb8;

    private String nbsb9;

    private String zcdb9;

    private String zsb9;

    private String nbsb10;

    private String zcdb10;

    private String zsb10;

    private String nbsbcs;

    private String zcdbcs;

    private String zsbcs;

    private String zcdb6;

    public String getFlbh() {
		return flbh;
	}

	public void setFlbh(String flbh) {
		this.flbh = flbh;
	}

	public Integer getBh() {
		return bh;
	}

	public void setBh(Integer bh) {
		this.bh = bh;
	}

	public String getLhqxs() {
        return lhqxs;
    }

    public void setLhqxs(String lhqxs) {
        this.lhqxs = lhqxs == null ? null : lhqxs.trim();
    }

    public String getBsxxs() {
        return bsxxs;
    }

    public void setBsxxs(String bsxxs) {
        this.bsxxs = bsxxs == null ? null : bsxxs.trim();
    }

    public String getBsxxh() {
        return bsxxh;
    }

    public void setBsxxh(String bsxxh) {
        this.bsxxh = bsxxh == null ? null : bsxxh.trim();
    }

    public String getXdwz() {
        return xdwz;
    }

    public void setXdwz(String xdwz) {
        this.xdwz = xdwz == null ? null : xdwz.trim();
    }

    public String getNbsbcvtmax() {
        return nbsbcvtmax;
    }

    public void setNbsbcvtmax(String nbsbcvtmax) {
        this.nbsbcvtmax = nbsbcvtmax == null ? null : nbsbcvtmax.trim();
    }

    public String getNbsb1() {
        return nbsb1;
    }

    public void setNbsb1(String nbsb1) {
        this.nbsb1 = nbsb1 == null ? null : nbsb1.trim();
    }

    public String getNbsb2() {
        return nbsb2;
    }

    public void setNbsb2(String nbsb2) {
        this.nbsb2 = nbsb2 == null ? null : nbsb2.trim();
    }

    public String getNbsb3() {
        return nbsb3;
    }

    public void setNbsb3(String nbsb3) {
        this.nbsb3 = nbsb3 == null ? null : nbsb3.trim();
    }

    public String getNbsb4() {
        return nbsb4;
    }

    public void setNbsb4(String nbsb4) {
        this.nbsb4 = nbsb4 == null ? null : nbsb4.trim();
    }

    public String getNbsb5() {
        return nbsb5;
    }

    public void setNbsb5(String nbsb5) {
        this.nbsb5 = nbsb5 == null ? null : nbsb5.trim();
    }

    public String getNbsbcvtmin() {
        return nbsbcvtmin;
    }

    public void setNbsbcvtmin(String nbsbcvtmin) {
        this.nbsbcvtmin = nbsbcvtmin == null ? null : nbsbcvtmin.trim();
    }

    public String getNbsbdd() {
        return nbsbdd;
    }

    public void setNbsbdd(String nbsbdd) {
        this.nbsbdd = nbsbdd == null ? null : nbsbdd.trim();
    }

    public String getZcdbmax() {
        return zcdbmax;
    }

    public void setZcdbmax(String zcdbmax) {
        this.zcdbmax = zcdbmax == null ? null : zcdbmax.trim();
    }

    public String getZcdb1() {
        return zcdb1;
    }

    public void setZcdb1(String zcdb1) {
        this.zcdb1 = zcdb1 == null ? null : zcdb1.trim();
    }

    public String getZcdb2() {
        return zcdb2;
    }

    public void setZcdb2(String zcdb2) {
        this.zcdb2 = zcdb2 == null ? null : zcdb2.trim();
    }

    public String getZcdb3() {
        return zcdb3;
    }

    public void setZcdb3(String zcdb3) {
        this.zcdb3 = zcdb3 == null ? null : zcdb3.trim();
    }

    public String getZcdb4() {
        return zcdb4;
    }

    public void setZcdb4(String zcdb4) {
        this.zcdb4 = zcdb4 == null ? null : zcdb4.trim();
    }

    public String getZcdb5() {
        return zcdb5;
    }

    public void setZcdb5(String zcdb5) {
        this.zcdb5 = zcdb5 == null ? null : zcdb5.trim();
    }

    public String getZcdbmin() {
        return zcdbmin;
    }

    public void setZcdbmin(String zcdbmin) {
        this.zcdbmin = zcdbmin == null ? null : zcdbmin.trim();
    }

    public String getZcdbdd() {
        return zcdbdd;
    }

    public void setZcdbdd(String zcdbdd) {
        this.zcdbdd = zcdbdd == null ? null : zcdbdd.trim();
    }

    public String getZsbmax() {
        return zsbmax;
    }

    public void setZsbmax(String zsbmax) {
        this.zsbmax = zsbmax == null ? null : zsbmax.trim();
    }

    public String getZsb1() {
        return zsb1;
    }

    public void setZsb1(String zsb1) {
        this.zsb1 = zsb1 == null ? null : zsb1.trim();
    }

    public String getZsb2() {
        return zsb2;
    }

    public void setZsb2(String zsb2) {
        this.zsb2 = zsb2 == null ? null : zsb2.trim();
    }

    public String getZsb3() {
        return zsb3;
    }

    public void setZsb3(String zsb3) {
        this.zsb3 = zsb3 == null ? null : zsb3.trim();
    }

    public String getZsb4() {
        return zsb4;
    }

    public void setZsb4(String zsb4) {
        this.zsb4 = zsb4 == null ? null : zsb4.trim();
    }

    public String getZsb5() {
        return zsb5;
    }

    public void setZsb5(String zsb5) {
        this.zsb5 = zsb5 == null ? null : zsb5.trim();
    }

    public String getZsbmin() {
        return zsbmin;
    }

    public void setZsbmin(String zsbmin) {
        this.zsbmin = zsbmin == null ? null : zsbmin.trim();
    }

    public String getZsbdd() {
        return zsbdd;
    }

    public void setZsbdd(String zsbdd) {
        this.zsbdd = zsbdd == null ? null : zsbdd.trim();
    }

    public String getBsxdws() {
        return bsxdws;
    }

    public void setBsxdws(String bsxdws) {
        this.bsxdws = bsxdws == null ? null : bsxdws.trim();
    }

    public String getNbsb6() {
        return nbsb6;
    }

    public void setNbsb6(String nbsb6) {
        this.nbsb6 = nbsb6 == null ? null : nbsb6.trim();
    }

    public String getZsb6() {
        return zsb6;
    }

    public void setZsb6(String zsb6) {
        this.zsb6 = zsb6 == null ? null : zsb6.trim();
    }

    public String getZdnj() {
        return zdnj;
    }

    public void setZdnj(String zdnj) {
        this.zdnj = zdnj == null ? null : zdnj.trim();
    }

    public String getBsxscc() {
        return bsxscc;
    }

    public void setBsxscc(String bsxscc) {
        this.bsxscc = bsxscc == null ? null : bsxscc.trim();
    }

    public String getFlzdgl() {
        return flzdgl;
    }

    public void setFlzdgl(String flzdgl) {
        this.flzdgl = flzdgl == null ? null : flzdgl.trim();
    }

    public String getFjzdgl() {
        return fjzdgl;
    }

    public void setFjzdgl(String fjzdgl) {
        this.fjzdgl = fjzdgl == null ? null : fjzdgl.trim();
    }

    public String getNbsb7() {
        return nbsb7;
    }

    public void setNbsb7(String nbsb7) {
        this.nbsb7 = nbsb7 == null ? null : nbsb7.trim();
    }

    public String getZcdb7() {
        return zcdb7;
    }

    public void setZcdb7(String zcdb7) {
        this.zcdb7 = zcdb7 == null ? null : zcdb7.trim();
    }

    public String getZsb7() {
        return zsb7;
    }

    public void setZsb7(String zsb7) {
        this.zsb7 = zsb7 == null ? null : zsb7.trim();
    }

    public String getNbsb8() {
        return nbsb8;
    }

    public void setNbsb8(String nbsb8) {
        this.nbsb8 = nbsb8 == null ? null : nbsb8.trim();
    }

    public String getZcdb8() {
        return zcdb8;
    }

    public void setZcdb8(String zcdb8) {
        this.zcdb8 = zcdb8 == null ? null : zcdb8.trim();
    }

    public String getZsb8() {
        return zsb8;
    }

    public void setZsb8(String zsb8) {
        this.zsb8 = zsb8 == null ? null : zsb8.trim();
    }

    public String getNbsb9() {
        return nbsb9;
    }

    public void setNbsb9(String nbsb9) {
        this.nbsb9 = nbsb9 == null ? null : nbsb9.trim();
    }

    public String getZcdb9() {
        return zcdb9;
    }

    public void setZcdb9(String zcdb9) {
        this.zcdb9 = zcdb9 == null ? null : zcdb9.trim();
    }

    public String getZsb9() {
        return zsb9;
    }

    public void setZsb9(String zsb9) {
        this.zsb9 = zsb9 == null ? null : zsb9.trim();
    }

    public String getNbsb10() {
        return nbsb10;
    }

    public void setNbsb10(String nbsb10) {
        this.nbsb10 = nbsb10 == null ? null : nbsb10.trim();
    }

    public String getZcdb10() {
        return zcdb10;
    }

    public void setZcdb10(String zcdb10) {
        this.zcdb10 = zcdb10 == null ? null : zcdb10.trim();
    }

    public String getZsb10() {
        return zsb10;
    }

    public void setZsb10(String zsb10) {
        this.zsb10 = zsb10 == null ? null : zsb10.trim();
    }

    public String getNbsbcs() {
        return nbsbcs;
    }

    public void setNbsbcs(String nbsbcs) {
        this.nbsbcs = nbsbcs == null ? null : nbsbcs.trim();
    }

    public String getZcdbcs() {
        return zcdbcs;
    }

    public void setZcdbcs(String zcdbcs) {
        this.zcdbcs = zcdbcs == null ? null : zcdbcs.trim();
    }

    public String getZsbcs() {
        return zsbcs;
    }

    public void setZsbcs(String zsbcs) {
        this.zsbcs = zsbcs == null ? null : zsbcs.trim();
    }

    public String getZcdb6() {
        return zcdb6;
    }

    public void setZcdb6(String zcdb6) {
        this.zcdb6 = zcdb6 == null ? null : zcdb6.trim();
    }
}