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
@Table(name="E3_QQC_CONFIG_NJX")
public class QqcNj implements Serializable {
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

    private String coyq;

    private String hcyq;

    private String fhxpd;

    private String km1;

    private String km2;

    private String km3;

    private String km4;

    private String km5;

    private String km6;

    private String km7;

    private String km8;

    private String km9;

    private String co1;

    private String co2;

    private String co3;

    private String co4;

    private String co5;

    private String co6;

    private String co7;

    private String co8;

    private String co9;

    private String hc1;

    private String hc2;

    private String hc3;

    private String hc4;

    private String hc5;

    private String hc6;

    private String hc7;

    private String hc8;

    private String hc9;

    private String coxs;

    private String hcnoxxs;

    private String nox1;

    private String nox2;

    private String nox3;

    private String nox4;

    private String nox5;

    private String nox6;

    private String nox7;

    private String nox8;

    private String nox9;

    private String hcnox1;

    private String hcnox2;

    private String hcnox3;

    private String hcnox4;

    private String hcnox5;

    private String hcnox6;

    private String hcnox7;

    private String hcnox8;

    private String hcnox9;

    private String co64k;

    private String co80k;

    private String hc64k;

    private String hc80k;

    private String nox64k;

    private String nox80k;

    private String hcnox64k;

    private String hcnox80k;

    private String noxyq;

    private String hcxs;

    private String noxxs;

    private String coxsjg;

    private String noxxsjg;

    private String hcxsjg;

    private String co21;

    private String co22;

    private String co23;

    private String co24;

    private String co25;

    private String co26;

    private String co27;

    private String co28;

    private String co29;

    private String lctime1;

    private String lctime2;

    private String lctime3;

    private String lctime4;

    private String lctime5;

    private String lctime6;

    private String lctime7;

    private String lctime8;

    private String lctime9;

    private String lctime10;

    private String ztscc;

    private String tcscc;

    private String fzscc;

    private String gjshl;

    private String gjsbl;

    private String ztcl;

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

    public String getCoyq() {
        return coyq;
    }

    public void setCoyq(String coyq) {
        this.coyq = coyq == null ? null : coyq.trim();
    }

    public String getHcyq() {
        return hcyq;
    }

    public void setHcyq(String hcyq) {
        this.hcyq = hcyq == null ? null : hcyq.trim();
    }

    public String getFhxpd() {
        return fhxpd;
    }

    public void setFhxpd(String fhxpd) {
        this.fhxpd = fhxpd == null ? null : fhxpd.trim();
    }

    public String getKm1() {
        return km1;
    }

    public void setKm1(String km1) {
        this.km1 = km1 == null ? null : km1.trim();
    }

    public String getKm2() {
        return km2;
    }

    public void setKm2(String km2) {
        this.km2 = km2 == null ? null : km2.trim();
    }

    public String getKm3() {
        return km3;
    }

    public void setKm3(String km3) {
        this.km3 = km3 == null ? null : km3.trim();
    }

    public String getKm4() {
        return km4;
    }

    public void setKm4(String km4) {
        this.km4 = km4 == null ? null : km4.trim();
    }

    public String getKm5() {
        return km5;
    }

    public void setKm5(String km5) {
        this.km5 = km5 == null ? null : km5.trim();
    }

    public String getKm6() {
        return km6;
    }

    public void setKm6(String km6) {
        this.km6 = km6 == null ? null : km6.trim();
    }

    public String getKm7() {
        return km7;
    }

    public void setKm7(String km7) {
        this.km7 = km7 == null ? null : km7.trim();
    }

    public String getKm8() {
        return km8;
    }

    public void setKm8(String km8) {
        this.km8 = km8 == null ? null : km8.trim();
    }

    public String getKm9() {
        return km9;
    }

    public void setKm9(String km9) {
        this.km9 = km9 == null ? null : km9.trim();
    }

    public String getCo1() {
        return co1;
    }

    public void setCo1(String co1) {
        this.co1 = co1 == null ? null : co1.trim();
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2 == null ? null : co2.trim();
    }

    public String getCo3() {
        return co3;
    }

    public void setCo3(String co3) {
        this.co3 = co3 == null ? null : co3.trim();
    }

    public String getCo4() {
        return co4;
    }

    public void setCo4(String co4) {
        this.co4 = co4 == null ? null : co4.trim();
    }

    public String getCo5() {
        return co5;
    }

    public void setCo5(String co5) {
        this.co5 = co5 == null ? null : co5.trim();
    }

    public String getCo6() {
        return co6;
    }

    public void setCo6(String co6) {
        this.co6 = co6 == null ? null : co6.trim();
    }

    public String getCo7() {
        return co7;
    }

    public void setCo7(String co7) {
        this.co7 = co7 == null ? null : co7.trim();
    }

    public String getCo8() {
        return co8;
    }

    public void setCo8(String co8) {
        this.co8 = co8 == null ? null : co8.trim();
    }

    public String getCo9() {
        return co9;
    }

    public void setCo9(String co9) {
        this.co9 = co9 == null ? null : co9.trim();
    }

    public String getHc1() {
        return hc1;
    }

    public void setHc1(String hc1) {
        this.hc1 = hc1 == null ? null : hc1.trim();
    }

    public String getHc2() {
        return hc2;
    }

    public void setHc2(String hc2) {
        this.hc2 = hc2 == null ? null : hc2.trim();
    }

    public String getHc3() {
        return hc3;
    }

    public void setHc3(String hc3) {
        this.hc3 = hc3 == null ? null : hc3.trim();
    }

    public String getHc4() {
        return hc4;
    }

    public void setHc4(String hc4) {
        this.hc4 = hc4 == null ? null : hc4.trim();
    }

    public String getHc5() {
        return hc5;
    }

    public void setHc5(String hc5) {
        this.hc5 = hc5 == null ? null : hc5.trim();
    }

    public String getHc6() {
        return hc6;
    }

    public void setHc6(String hc6) {
        this.hc6 = hc6 == null ? null : hc6.trim();
    }

    public String getHc7() {
        return hc7;
    }

    public void setHc7(String hc7) {
        this.hc7 = hc7 == null ? null : hc7.trim();
    }

    public String getHc8() {
        return hc8;
    }

    public void setHc8(String hc8) {
        this.hc8 = hc8 == null ? null : hc8.trim();
    }

    public String getHc9() {
        return hc9;
    }

    public void setHc9(String hc9) {
        this.hc9 = hc9 == null ? null : hc9.trim();
    }

    public String getCoxs() {
        return coxs;
    }

    public void setCoxs(String coxs) {
        this.coxs = coxs == null ? null : coxs.trim();
    }

    public String getHcnoxxs() {
        return hcnoxxs;
    }

    public void setHcnoxxs(String hcnoxxs) {
        this.hcnoxxs = hcnoxxs == null ? null : hcnoxxs.trim();
    }

    public String getNox1() {
        return nox1;
    }

    public void setNox1(String nox1) {
        this.nox1 = nox1 == null ? null : nox1.trim();
    }

    public String getNox2() {
        return nox2;
    }

    public void setNox2(String nox2) {
        this.nox2 = nox2 == null ? null : nox2.trim();
    }

    public String getNox3() {
        return nox3;
    }

    public void setNox3(String nox3) {
        this.nox3 = nox3 == null ? null : nox3.trim();
    }

    public String getNox4() {
        return nox4;
    }

    public void setNox4(String nox4) {
        this.nox4 = nox4 == null ? null : nox4.trim();
    }

    public String getNox5() {
        return nox5;
    }

    public void setNox5(String nox5) {
        this.nox5 = nox5 == null ? null : nox5.trim();
    }

    public String getNox6() {
        return nox6;
    }

    public void setNox6(String nox6) {
        this.nox6 = nox6 == null ? null : nox6.trim();
    }

    public String getNox7() {
        return nox7;
    }

    public void setNox7(String nox7) {
        this.nox7 = nox7 == null ? null : nox7.trim();
    }

    public String getNox8() {
        return nox8;
    }

    public void setNox8(String nox8) {
        this.nox8 = nox8 == null ? null : nox8.trim();
    }

    public String getNox9() {
        return nox9;
    }

    public void setNox9(String nox9) {
        this.nox9 = nox9 == null ? null : nox9.trim();
    }

    public String getHcnox1() {
        return hcnox1;
    }

    public void setHcnox1(String hcnox1) {
        this.hcnox1 = hcnox1 == null ? null : hcnox1.trim();
    }

    public String getHcnox2() {
        return hcnox2;
    }

    public void setHcnox2(String hcnox2) {
        this.hcnox2 = hcnox2 == null ? null : hcnox2.trim();
    }

    public String getHcnox3() {
        return hcnox3;
    }

    public void setHcnox3(String hcnox3) {
        this.hcnox3 = hcnox3 == null ? null : hcnox3.trim();
    }

    public String getHcnox4() {
        return hcnox4;
    }

    public void setHcnox4(String hcnox4) {
        this.hcnox4 = hcnox4 == null ? null : hcnox4.trim();
    }

    public String getHcnox5() {
        return hcnox5;
    }

    public void setHcnox5(String hcnox5) {
        this.hcnox5 = hcnox5 == null ? null : hcnox5.trim();
    }

    public String getHcnox6() {
        return hcnox6;
    }

    public void setHcnox6(String hcnox6) {
        this.hcnox6 = hcnox6 == null ? null : hcnox6.trim();
    }

    public String getHcnox7() {
        return hcnox7;
    }

    public void setHcnox7(String hcnox7) {
        this.hcnox7 = hcnox7 == null ? null : hcnox7.trim();
    }

    public String getHcnox8() {
        return hcnox8;
    }

    public void setHcnox8(String hcnox8) {
        this.hcnox8 = hcnox8 == null ? null : hcnox8.trim();
    }

    public String getHcnox9() {
        return hcnox9;
    }

    public void setHcnox9(String hcnox9) {
        this.hcnox9 = hcnox9 == null ? null : hcnox9.trim();
    }

    public String getCo64k() {
        return co64k;
    }

    public void setCo64k(String co64k) {
        this.co64k = co64k == null ? null : co64k.trim();
    }

    public String getCo80k() {
        return co80k;
    }

    public void setCo80k(String co80k) {
        this.co80k = co80k == null ? null : co80k.trim();
    }

    public String getHc64k() {
        return hc64k;
    }

    public void setHc64k(String hc64k) {
        this.hc64k = hc64k == null ? null : hc64k.trim();
    }

    public String getHc80k() {
        return hc80k;
    }

    public void setHc80k(String hc80k) {
        this.hc80k = hc80k == null ? null : hc80k.trim();
    }

    public String getNox64k() {
        return nox64k;
    }

    public void setNox64k(String nox64k) {
        this.nox64k = nox64k == null ? null : nox64k.trim();
    }

    public String getNox80k() {
        return nox80k;
    }

    public void setNox80k(String nox80k) {
        this.nox80k = nox80k == null ? null : nox80k.trim();
    }

    public String getHcnox64k() {
        return hcnox64k;
    }

    public void setHcnox64k(String hcnox64k) {
        this.hcnox64k = hcnox64k == null ? null : hcnox64k.trim();
    }

    public String getHcnox80k() {
        return hcnox80k;
    }

    public void setHcnox80k(String hcnox80k) {
        this.hcnox80k = hcnox80k == null ? null : hcnox80k.trim();
    }

    public String getNoxyq() {
        return noxyq;
    }

    public void setNoxyq(String noxyq) {
        this.noxyq = noxyq == null ? null : noxyq.trim();
    }

    public String getHcxs() {
        return hcxs;
    }

    public void setHcxs(String hcxs) {
        this.hcxs = hcxs == null ? null : hcxs.trim();
    }

    public String getNoxxs() {
        return noxxs;
    }

    public void setNoxxs(String noxxs) {
        this.noxxs = noxxs == null ? null : noxxs.trim();
    }

    public String getCoxsjg() {
        return coxsjg;
    }

    public void setCoxsjg(String coxsjg) {
        this.coxsjg = coxsjg == null ? null : coxsjg.trim();
    }

    public String getNoxxsjg() {
        return noxxsjg;
    }

    public void setNoxxsjg(String noxxsjg) {
        this.noxxsjg = noxxsjg == null ? null : noxxsjg.trim();
    }

    public String getHcxsjg() {
        return hcxsjg;
    }

    public void setHcxsjg(String hcxsjg) {
        this.hcxsjg = hcxsjg == null ? null : hcxsjg.trim();
    }

    public String getCo21() {
        return co21;
    }

    public void setCo21(String co21) {
        this.co21 = co21 == null ? null : co21.trim();
    }

    public String getCo22() {
        return co22;
    }

    public void setCo22(String co22) {
        this.co22 = co22 == null ? null : co22.trim();
    }

    public String getCo23() {
        return co23;
    }

    public void setCo23(String co23) {
        this.co23 = co23 == null ? null : co23.trim();
    }

    public String getCo24() {
        return co24;
    }

    public void setCo24(String co24) {
        this.co24 = co24 == null ? null : co24.trim();
    }

    public String getCo25() {
        return co25;
    }

    public void setCo25(String co25) {
        this.co25 = co25 == null ? null : co25.trim();
    }

    public String getCo26() {
        return co26;
    }

    public void setCo26(String co26) {
        this.co26 = co26 == null ? null : co26.trim();
    }

    public String getCo27() {
        return co27;
    }

    public void setCo27(String co27) {
        this.co27 = co27 == null ? null : co27.trim();
    }

    public String getCo28() {
        return co28;
    }

    public void setCo28(String co28) {
        this.co28 = co28 == null ? null : co28.trim();
    }

    public String getCo29() {
        return co29;
    }

    public void setCo29(String co29) {
        this.co29 = co29 == null ? null : co29.trim();
    }

    public String getLctime1() {
        return lctime1;
    }

    public void setLctime1(String lctime1) {
        this.lctime1 = lctime1 == null ? null : lctime1.trim();
    }

    public String getLctime2() {
        return lctime2;
    }

    public void setLctime2(String lctime2) {
        this.lctime2 = lctime2 == null ? null : lctime2.trim();
    }

    public String getLctime3() {
        return lctime3;
    }

    public void setLctime3(String lctime3) {
        this.lctime3 = lctime3 == null ? null : lctime3.trim();
    }

    public String getLctime4() {
        return lctime4;
    }

    public void setLctime4(String lctime4) {
        this.lctime4 = lctime4 == null ? null : lctime4.trim();
    }

    public String getLctime5() {
        return lctime5;
    }

    public void setLctime5(String lctime5) {
        this.lctime5 = lctime5 == null ? null : lctime5.trim();
    }

    public String getLctime6() {
        return lctime6;
    }

    public void setLctime6(String lctime6) {
        this.lctime6 = lctime6 == null ? null : lctime6.trim();
    }

    public String getLctime7() {
        return lctime7;
    }

    public void setLctime7(String lctime7) {
        this.lctime7 = lctime7 == null ? null : lctime7.trim();
    }

    public String getLctime8() {
        return lctime8;
    }

    public void setLctime8(String lctime8) {
        this.lctime8 = lctime8 == null ? null : lctime8.trim();
    }

    public String getLctime9() {
        return lctime9;
    }

    public void setLctime9(String lctime9) {
        this.lctime9 = lctime9 == null ? null : lctime9.trim();
    }

    public String getLctime10() {
        return lctime10;
    }

    public void setLctime10(String lctime10) {
        this.lctime10 = lctime10 == null ? null : lctime10.trim();
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

    public String getGjshl() {
        return gjshl;
    }

    public void setGjshl(String gjshl) {
        this.gjshl = gjshl == null ? null : gjshl.trim();
    }

    public String getGjsbl() {
        return gjsbl;
    }

    public void setGjsbl(String gjsbl) {
        this.gjsbl = gjsbl == null ? null : gjsbl.trim();
    }

    public String getZtcl() {
        return ztcl;
    }

    public void setZtcl(String ztcl) {
        this.ztcl = ztcl == null ? null : ztcl.trim();
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
