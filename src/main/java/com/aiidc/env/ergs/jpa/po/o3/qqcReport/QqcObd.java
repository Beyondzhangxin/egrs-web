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
@Table(name="E3_QQC_CONFIG_OBD")
public class QqcObd implements Serializable {
    @Id
    private String jybgbh;
    @Id
    private Integer pzbh;
    
    private String zhqxh;

    private String zhqscc;

    private String cgqxh;

    private String cgqscc;

    private String egrxh;

    private String egrscc;

    private String dkdyxh;

    private String dkdyscc;

    private String mixh;

    private String miscc;

    private String cobzyq;

    private String thcbzyq;

    private String noxbzyq;

    private String ycgqco;

    private String chzhqco;

    private String shco;

    private String ycgqthc;

    private String chzhqthc;

    private String shthc;

    private String ycgqnox;

    private String chzhqnox;

    private String shnox;

    private String ycgqm1;

    private String chzhqm1;

    private String shm1;

    private String dxm1;

    private String fhxpd;

    private String qtxt;

    private String coqtjg;

    private String thcqtjg;

    private String noxqtjg;

    private String ztscc;

    private String tcscc;

    private String fzscc;

    private String iupr;

    private String noxjc;

    private String nmhcbzyq;

    private String pmbzyq;

    private String cgqnmhcjg;

    private String cgqpmjg;

    private String zhqnmhcjg;

    private String zhqpmjg;

    private String shnmhcjg;

    private String shpmjg;

    private String dxnmhcjg;

    private String dxpmjg;

    private String iusy1;

    private String iusy2;

    private String iusy3;

    private String iusy4;

    private String iujg1;

    private String iujg2;

    private String iujg3;

    private String iujg4;

    private String iufhxpd1;

    private String iufhxpd2;

    private String iufhxpd3;

    private String iufhxpd4;

    private String cnzzxh;

    private String cnzzscc;

    private String dcrl;

    private String djxh;

    private String djscc;

    private String djzyyt;

    private String djazsl;

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

    public String getCgqxh() {
        return cgqxh;
    }

    public void setCgqxh(String cgqxh) {
        this.cgqxh = cgqxh == null ? null : cgqxh.trim();
    }

    public String getCgqscc() {
        return cgqscc;
    }

    public void setCgqscc(String cgqscc) {
        this.cgqscc = cgqscc == null ? null : cgqscc.trim();
    }

    public String getEgrxh() {
        return egrxh;
    }

    public void setEgrxh(String egrxh) {
        this.egrxh = egrxh == null ? null : egrxh.trim();
    }

    public String getEgrscc() {
        return egrscc;
    }

    public void setEgrscc(String egrscc) {
        this.egrscc = egrscc == null ? null : egrscc.trim();
    }

    public String getDkdyxh() {
        return dkdyxh;
    }

    public void setDkdyxh(String dkdyxh) {
        this.dkdyxh = dkdyxh == null ? null : dkdyxh.trim();
    }

    public String getDkdyscc() {
        return dkdyscc;
    }

    public void setDkdyscc(String dkdyscc) {
        this.dkdyscc = dkdyscc == null ? null : dkdyscc.trim();
    }

    public String getMixh() {
        return mixh;
    }

    public void setMixh(String mixh) {
        this.mixh = mixh == null ? null : mixh.trim();
    }

    public String getMiscc() {
        return miscc;
    }

    public void setMiscc(String miscc) {
        this.miscc = miscc == null ? null : miscc.trim();
    }

    public String getCobzyq() {
        return cobzyq;
    }

    public void setCobzyq(String cobzyq) {
        this.cobzyq = cobzyq == null ? null : cobzyq.trim();
    }

    public String getThcbzyq() {
        return thcbzyq;
    }

    public void setThcbzyq(String thcbzyq) {
        this.thcbzyq = thcbzyq == null ? null : thcbzyq.trim();
    }

    public String getNoxbzyq() {
        return noxbzyq;
    }

    public void setNoxbzyq(String noxbzyq) {
        this.noxbzyq = noxbzyq == null ? null : noxbzyq.trim();
    }

    public String getYcgqco() {
        return ycgqco;
    }

    public void setYcgqco(String ycgqco) {
        this.ycgqco = ycgqco == null ? null : ycgqco.trim();
    }

    public String getChzhqco() {
        return chzhqco;
    }

    public void setChzhqco(String chzhqco) {
        this.chzhqco = chzhqco == null ? null : chzhqco.trim();
    }

    public String getShco() {
        return shco;
    }

    public void setShco(String shco) {
        this.shco = shco == null ? null : shco.trim();
    }

    public String getYcgqthc() {
        return ycgqthc;
    }

    public void setYcgqthc(String ycgqthc) {
        this.ycgqthc = ycgqthc == null ? null : ycgqthc.trim();
    }

    public String getChzhqthc() {
        return chzhqthc;
    }

    public void setChzhqthc(String chzhqthc) {
        this.chzhqthc = chzhqthc == null ? null : chzhqthc.trim();
    }

    public String getShthc() {
        return shthc;
    }

    public void setShthc(String shthc) {
        this.shthc = shthc == null ? null : shthc.trim();
    }

    public String getYcgqnox() {
        return ycgqnox;
    }

    public void setYcgqnox(String ycgqnox) {
        this.ycgqnox = ycgqnox == null ? null : ycgqnox.trim();
    }

    public String getChzhqnox() {
        return chzhqnox;
    }

    public void setChzhqnox(String chzhqnox) {
        this.chzhqnox = chzhqnox == null ? null : chzhqnox.trim();
    }

    public String getShnox() {
        return shnox;
    }

    public void setShnox(String shnox) {
        this.shnox = shnox == null ? null : shnox.trim();
    }

    public String getYcgqm1() {
        return ycgqm1;
    }

    public void setYcgqm1(String ycgqm1) {
        this.ycgqm1 = ycgqm1 == null ? null : ycgqm1.trim();
    }

    public String getChzhqm1() {
        return chzhqm1;
    }

    public void setChzhqm1(String chzhqm1) {
        this.chzhqm1 = chzhqm1 == null ? null : chzhqm1.trim();
    }

    public String getShm1() {
        return shm1;
    }

    public void setShm1(String shm1) {
        this.shm1 = shm1 == null ? null : shm1.trim();
    }

    public String getDxm1() {
        return dxm1;
    }

    public void setDxm1(String dxm1) {
        this.dxm1 = dxm1 == null ? null : dxm1.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

    public String getQtxt() {
        return qtxt;
    }

    public void setQtxt(String qtxt) {
        this.qtxt = qtxt == null ? null : qtxt.trim();
    }

    public String getCoqtjg() {
        return coqtjg;
    }

    public void setCoqtjg(String coqtjg) {
        this.coqtjg = coqtjg == null ? null : coqtjg.trim();
    }

    public String getThcqtjg() {
        return thcqtjg;
    }

    public void setThcqtjg(String thcqtjg) {
        this.thcqtjg = thcqtjg == null ? null : thcqtjg.trim();
    }

    public String getNoxqtjg() {
        return noxqtjg;
    }

    public void setNoxqtjg(String noxqtjg) {
        this.noxqtjg = noxqtjg == null ? null : noxqtjg.trim();
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

    public String getIupr() {
        return iupr;
    }

    public void setIupr(String iupr) {
        this.iupr = iupr == null ? null : iupr.trim();
    }

    public String getNoxjc() {
        return noxjc;
    }

    public void setNoxjc(String noxjc) {
        this.noxjc = noxjc == null ? null : noxjc.trim();
    }

    public String getNmhcbzyq() {
        return nmhcbzyq;
    }

    public void setNmhcbzyq(String nmhcbzyq) {
        this.nmhcbzyq = nmhcbzyq == null ? null : nmhcbzyq.trim();
    }

    public String getPmbzyq() {
        return pmbzyq;
    }

    public void setPmbzyq(String pmbzyq) {
        this.pmbzyq = pmbzyq == null ? null : pmbzyq.trim();
    }

    public String getCgqnmhcjg() {
        return cgqnmhcjg;
    }

    public void setCgqnmhcjg(String cgqnmhcjg) {
        this.cgqnmhcjg = cgqnmhcjg == null ? null : cgqnmhcjg.trim();
    }

    public String getCgqpmjg() {
        return cgqpmjg;
    }

    public void setCgqpmjg(String cgqpmjg) {
        this.cgqpmjg = cgqpmjg == null ? null : cgqpmjg.trim();
    }

    public String getZhqnmhcjg() {
        return zhqnmhcjg;
    }

    public void setZhqnmhcjg(String zhqnmhcjg) {
        this.zhqnmhcjg = zhqnmhcjg == null ? null : zhqnmhcjg.trim();
    }

    public String getZhqpmjg() {
        return zhqpmjg;
    }

    public void setZhqpmjg(String zhqpmjg) {
        this.zhqpmjg = zhqpmjg == null ? null : zhqpmjg.trim();
    }

    public String getShnmhcjg() {
        return shnmhcjg;
    }

    public void setShnmhcjg(String shnmhcjg) {
        this.shnmhcjg = shnmhcjg == null ? null : shnmhcjg.trim();
    }

    public String getShpmjg() {
        return shpmjg;
    }

    public void setShpmjg(String shpmjg) {
        this.shpmjg = shpmjg == null ? null : shpmjg.trim();
    }

    public String getDxnmhcjg() {
        return dxnmhcjg;
    }

    public void setDxnmhcjg(String dxnmhcjg) {
        this.dxnmhcjg = dxnmhcjg == null ? null : dxnmhcjg.trim();
    }

    public String getDxpmjg() {
        return dxpmjg;
    }

    public void setDxpmjg(String dxpmjg) {
        this.dxpmjg = dxpmjg == null ? null : dxpmjg.trim();
    }

    public String getIusy1() {
        return iusy1;
    }

    public void setIusy1(String iusy1) {
        this.iusy1 = iusy1 == null ? null : iusy1.trim();
    }

    public String getIusy2() {
        return iusy2;
    }

    public void setIusy2(String iusy2) {
        this.iusy2 = iusy2 == null ? null : iusy2.trim();
    }

    public String getIusy3() {
        return iusy3;
    }

    public void setIusy3(String iusy3) {
        this.iusy3 = iusy3 == null ? null : iusy3.trim();
    }

    public String getIusy4() {
        return iusy4;
    }

    public void setIusy4(String iusy4) {
        this.iusy4 = iusy4 == null ? null : iusy4.trim();
    }

    public String getIujg1() {
        return iujg1;
    }

    public void setIujg1(String iujg1) {
        this.iujg1 = iujg1 == null ? null : iujg1.trim();
    }

    public String getIujg2() {
        return iujg2;
    }

    public void setIujg2(String iujg2) {
        this.iujg2 = iujg2 == null ? null : iujg2.trim();
    }

    public String getIujg3() {
        return iujg3;
    }

    public void setIujg3(String iujg3) {
        this.iujg3 = iujg3 == null ? null : iujg3.trim();
    }

    public String getIujg4() {
        return iujg4;
    }

    public void setIujg4(String iujg4) {
        this.iujg4 = iujg4 == null ? null : iujg4.trim();
    }

    public String getIufhxpd1() {
        return iufhxpd1;
    }

    public void setIufhxpd1(String iufhxpd1) {
        this.iufhxpd1 = iufhxpd1 == null ? null : iufhxpd1.trim();
    }

    public String getIufhxpd2() {
        return iufhxpd2;
    }

    public void setIufhxpd2(String iufhxpd2) {
        this.iufhxpd2 = iufhxpd2 == null ? null : iufhxpd2.trim();
    }

    public String getIufhxpd3() {
        return iufhxpd3;
    }

    public void setIufhxpd3(String iufhxpd3) {
        this.iufhxpd3 = iufhxpd3 == null ? null : iufhxpd3.trim();
    }

    public String getIufhxpd4() {
        return iufhxpd4;
    }

    public void setIufhxpd4(String iufhxpd4) {
        this.iufhxpd4 = iufhxpd4 == null ? null : iufhxpd4.trim();
    }

    public String getCnzzxh() {
        return cnzzxh;
    }

    public void setCnzzxh(String cnzzxh) {
        this.cnzzxh = cnzzxh == null ? null : cnzzxh.trim();
    }

    public String getCnzzscc() {
        return cnzzscc;
    }

    public void setCnzzscc(String cnzzscc) {
        this.cnzzscc = cnzzscc == null ? null : cnzzscc.trim();
    }

    public String getDcrl() {
        return dcrl;
    }

    public void setDcrl(String dcrl) {
        this.dcrl = dcrl == null ? null : dcrl.trim();
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh == null ? null : djxh.trim();
    }

    public String getDjscc() {
        return djscc;
    }

    public void setDjscc(String djscc) {
        this.djscc = djscc == null ? null : djscc.trim();
    }

    public String getDjzyyt() {
        return djzyyt;
    }

    public void setDjzyyt(String djzyyt) {
        this.djzyyt = djzyyt == null ? null : djzyyt.trim();
    }

    public String getDjazsl() {
        return djazsl;
    }

    public void setDjazsl(String djazsl) {
        this.djazsl = djazsl == null ? null : djazsl.trim();
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
