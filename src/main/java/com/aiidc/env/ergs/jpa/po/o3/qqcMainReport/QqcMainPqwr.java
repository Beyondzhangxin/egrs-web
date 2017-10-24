/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3.qqcMainReport;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name="E3_QQC_MAIN_PQWR")
public class QqcMainPqwr implements Serializable{
	@Id
    private String jybgbh;

    private String vin;

    private String zdcs;

    private String zdzzl;

    private String zbzl;

    private String clwxcc;

    private String sjcys;

    private String ltxh;

    private String ltsl;

    private String qhltyl;

    private String qdltyl;

    private String qdxs;

    private String yh;

    private String lcbds;

    private String qcfl;

    private String rllx;

    private String rygg;

    private String yxrj;

    private String rygjxs;

    private String dpxh;

    private String dpscc;

    private String bsxxs;

    private String bsxxh;

    private String bsxscc;

    private String zjsb;

    private String bsxczfs;

    private String bsxdws;

    private String sb1;

    private String sb2;

    private String sb3;

    private String sb4;

    private String sb5;

    private String sb6;

    private String fdjxh;

    private String fdjscc;

    private String fdjxs;

    private String fdjbh;

    private String edgl;

    private String edglzs;

    private String zdgl;

    private String zdglzs;

    private String zdnj;

    private String zdnjzs;

    private String dszs;

    private String pl;

    private String dhxtxh;

    private String dhxtscc;

    private String fdjgycl;

    private String qmbz;

    private String rlpsxtxs;

    private String sb;

    private String obdxt;

    public String getJybgbh() {
        return jybgbh;
    }

    public void setJybgbh(String jybgbh) {
        this.jybgbh = jybgbh == null ? null : jybgbh.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getZdcs() {
        return zdcs;
    }

    public void setZdcs(String zdcs) {
        this.zdcs = zdcs == null ? null : zdcs.trim();
    }

    public String getZdzzl() {
        return zdzzl;
    }

    public void setZdzzl(String zdzzl) {
        this.zdzzl = zdzzl == null ? null : zdzzl.trim();
    }

    public String getZbzl() {
        return zbzl;
    }

    public void setZbzl(String zbzl) {
        this.zbzl = zbzl == null ? null : zbzl.trim();
    }

    public String getClwxcc() {
        return clwxcc;
    }

    public void setClwxcc(String clwxcc) {
        this.clwxcc = clwxcc == null ? null : clwxcc.trim();
    }

    public String getSjcys() {
        return sjcys;
    }

    public void setSjcys(String sjcys) {
        this.sjcys = sjcys == null ? null : sjcys.trim();
    }

    public String getLtxh() {
        return ltxh;
    }

    public void setLtxh(String ltxh) {
        this.ltxh = ltxh == null ? null : ltxh.trim();
    }

    public String getLtsl() {
        return ltsl;
    }

    public void setLtsl(String ltsl) {
        this.ltsl = ltsl == null ? null : ltsl.trim();
    }

    public String getQhltyl() {
        return qhltyl;
    }

    public void setQhltyl(String qhltyl) {
        this.qhltyl = qhltyl == null ? null : qhltyl.trim();
    }

    public String getQdltyl() {
        return qdltyl;
    }

    public void setQdltyl(String qdltyl) {
        this.qdltyl = qdltyl == null ? null : qdltyl.trim();
    }

    public String getQdxs() {
        return qdxs;
    }

    public void setQdxs(String qdxs) {
        this.qdxs = qdxs == null ? null : qdxs.trim();
    }

    public String getYh() {
        return yh;
    }

    public void setYh(String yh) {
        this.yh = yh == null ? null : yh.trim();
    }

    public String getLcbds() {
        return lcbds;
    }

    public void setLcbds(String lcbds) {
        this.lcbds = lcbds == null ? null : lcbds.trim();
    }

    public String getQcfl() {
        return qcfl;
    }

    public void setQcfl(String qcfl) {
        this.qcfl = qcfl == null ? null : qcfl.trim();
    }

    public String getRllx() {
        return rllx;
    }

    public void setRllx(String rllx) {
        this.rllx = rllx == null ? null : rllx.trim();
    }

    public String getRygg() {
        return rygg;
    }

    public void setRygg(String rygg) {
        this.rygg = rygg == null ? null : rygg.trim();
    }

    public String getYxrj() {
        return yxrj;
    }

    public void setYxrj(String yxrj) {
        this.yxrj = yxrj == null ? null : yxrj.trim();
    }

    public String getRygjxs() {
        return rygjxs;
    }

    public void setRygjxs(String rygjxs) {
        this.rygjxs = rygjxs == null ? null : rygjxs.trim();
    }

    public String getDpxh() {
        return dpxh;
    }

    public void setDpxh(String dpxh) {
        this.dpxh = dpxh == null ? null : dpxh.trim();
    }

    public String getDpscc() {
        return dpscc;
    }

    public void setDpscc(String dpscc) {
        this.dpscc = dpscc == null ? null : dpscc.trim();
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

    public String getBsxscc() {
        return bsxscc;
    }

    public void setBsxscc(String bsxscc) {
        this.bsxscc = bsxscc == null ? null : bsxscc.trim();
    }

    public String getZjsb() {
        return zjsb;
    }

    public void setZjsb(String zjsb) {
        this.zjsb = zjsb == null ? null : zjsb.trim();
    }

    public String getBsxczfs() {
        return bsxczfs;
    }

    public void setBsxczfs(String bsxczfs) {
        this.bsxczfs = bsxczfs == null ? null : bsxczfs.trim();
    }

    public String getBsxdws() {
        return bsxdws;
    }

    public void setBsxdws(String bsxdws) {
        this.bsxdws = bsxdws == null ? null : bsxdws.trim();
    }

    public String getSb1() {
        return sb1;
    }

    public void setSb1(String sb1) {
        this.sb1 = sb1 == null ? null : sb1.trim();
    }

    public String getSb2() {
        return sb2;
    }

    public void setSb2(String sb2) {
        this.sb2 = sb2 == null ? null : sb2.trim();
    }

    public String getSb3() {
        return sb3;
    }

    public void setSb3(String sb3) {
        this.sb3 = sb3 == null ? null : sb3.trim();
    }

    public String getSb4() {
        return sb4;
    }

    public void setSb4(String sb4) {
        this.sb4 = sb4 == null ? null : sb4.trim();
    }

    public String getSb5() {
        return sb5;
    }

    public void setSb5(String sb5) {
        this.sb5 = sb5 == null ? null : sb5.trim();
    }

    public String getSb6() {
        return sb6;
    }

    public void setSb6(String sb6) {
        this.sb6 = sb6 == null ? null : sb6.trim();
    }

    public String getFdjxh() {
        return fdjxh;
    }

    public void setFdjxh(String fdjxh) {
        this.fdjxh = fdjxh == null ? null : fdjxh.trim();
    }

    public String getFdjscc() {
        return fdjscc;
    }

    public void setFdjscc(String fdjscc) {
        this.fdjscc = fdjscc == null ? null : fdjscc.trim();
    }

    public String getFdjxs() {
        return fdjxs;
    }

    public void setFdjxs(String fdjxs) {
        this.fdjxs = fdjxs == null ? null : fdjxs.trim();
    }

    public String getFdjbh() {
        return fdjbh;
    }

    public void setFdjbh(String fdjbh) {
        this.fdjbh = fdjbh == null ? null : fdjbh.trim();
    }

    public String getEdgl() {
        return edgl;
    }

    public void setEdgl(String edgl) {
        this.edgl = edgl == null ? null : edgl.trim();
    }

    public String getEdglzs() {
        return edglzs;
    }

    public void setEdglzs(String edglzs) {
        this.edglzs = edglzs == null ? null : edglzs.trim();
    }

    public String getZdgl() {
        return zdgl;
    }

    public void setZdgl(String zdgl) {
        this.zdgl = zdgl == null ? null : zdgl.trim();
    }

    public String getZdglzs() {
        return zdglzs;
    }

    public void setZdglzs(String zdglzs) {
        this.zdglzs = zdglzs == null ? null : zdglzs.trim();
    }

    public String getZdnj() {
        return zdnj;
    }

    public void setZdnj(String zdnj) {
        this.zdnj = zdnj == null ? null : zdnj.trim();
    }

    public String getZdnjzs() {
        return zdnjzs;
    }

    public void setZdnjzs(String zdnjzs) {
        this.zdnjzs = zdnjzs == null ? null : zdnjzs.trim();
    }

    public String getDszs() {
        return dszs;
    }

    public void setDszs(String dszs) {
        this.dszs = dszs == null ? null : dszs.trim();
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl == null ? null : pl.trim();
    }

    public String getDhxtxh() {
        return dhxtxh;
    }

    public void setDhxtxh(String dhxtxh) {
        this.dhxtxh = dhxtxh == null ? null : dhxtxh.trim();
    }

    public String getDhxtscc() {
        return dhxtscc;
    }

    public void setDhxtscc(String dhxtscc) {
        this.dhxtscc = dhxtscc == null ? null : dhxtscc.trim();
    }

    public String getFdjgycl() {
        return fdjgycl;
    }

    public void setFdjgycl(String fdjgycl) {
        this.fdjgycl = fdjgycl == null ? null : fdjgycl.trim();
    }

    public String getQmbz() {
        return qmbz;
    }

    public void setQmbz(String qmbz) {
        this.qmbz = qmbz == null ? null : qmbz.trim();
    }

    public String getRlpsxtxs() {
        return rlpsxtxs;
    }

    public void setRlpsxtxs(String rlpsxtxs) {
        this.rlpsxtxs = rlpsxtxs == null ? null : rlpsxtxs.trim();
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb == null ? null : sb.trim();
    }

    public String getObdxt() {
        return obdxt;
    }

    public void setObdxt(String obdxt) {
        this.obdxt = obdxt == null ? null : obdxt.trim();
    }
}
