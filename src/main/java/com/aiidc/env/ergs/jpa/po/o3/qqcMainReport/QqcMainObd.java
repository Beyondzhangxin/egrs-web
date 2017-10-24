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
@Table(name="E3_QQC_MAIN_OBD")
public class QqcMainObd implements Serializable{
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

    private String bsxdws;

    private String bsxczfs;

    private String bsxxs;

    private String zjsb;

    private String sb1;

    private String sb2;

    private String sb3;

    private String sb4;

    private String sb5;

    private String sb6;

    private String bsxxh;

    private String bsxscc;

    private String fdjxh;

    private String fdjscc;

    private String fdjxs;

    private String fdjbh;

    private String edglzs;

    private String edgl;

    private String zdglzs;

    private String zdgl;

    private String zdnj;

    private String zdnjzs;

    private String dszs;

    private String pl;

    private String fdjgycl;

    private String qmbz;

    private String rlpsxtxs;

    private String dhxtxh;

    private String dhxtscc;

    private String sb;

    private String obdxt;

    private String hhdl;

    private String jzzl;

    private String ltxh1;

    private String ltxh2;

    private String ltxh3;

    private String ltxh4;

    private String qhltyl1;

    private String qhltyl2;

    private String qhltyl3;

    private String qhltyl4;

    private String qdltyl1;

    private String qdltyl2;

    private String qdltyl3;

    private String qdltyl4;

    private String sb7;

    private String sb8;

    private String sb9;

    private String sb10;

    private String csd;

    private String dd;

    private String lhqxs;

    private String plfs;

    private String qgs;

    private String qfs;

    private String ccs;

    private String lqfs;

    private String jqfs;

    private String gyfs;

    private String hhdlfl;

    private String hhdlljfs;

    private String xhlc;

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

    public String getBsxdws() {
        return bsxdws;
    }

    public void setBsxdws(String bsxdws) {
        this.bsxdws = bsxdws == null ? null : bsxdws.trim();
    }

    public String getBsxczfs() {
        return bsxczfs;
    }

    public void setBsxczfs(String bsxczfs) {
        this.bsxczfs = bsxczfs == null ? null : bsxczfs.trim();
    }

    public String getBsxxs() {
        return bsxxs;
    }

    public void setBsxxs(String bsxxs) {
        this.bsxxs = bsxxs == null ? null : bsxxs.trim();
    }

    public String getZjsb() {
        return zjsb;
    }

    public void setZjsb(String zjsb) {
        this.zjsb = zjsb == null ? null : zjsb.trim();
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

    public String getEdglzs() {
        return edglzs;
    }

    public void setEdglzs(String edglzs) {
        this.edglzs = edglzs == null ? null : edglzs.trim();
    }

    public String getEdgl() {
        return edgl;
    }

    public void setEdgl(String edgl) {
        this.edgl = edgl == null ? null : edgl.trim();
    }

    public String getZdglzs() {
        return zdglzs;
    }

    public void setZdglzs(String zdglzs) {
        this.zdglzs = zdglzs == null ? null : zdglzs.trim();
    }

    public String getZdgl() {
        return zdgl;
    }

    public void setZdgl(String zdgl) {
        this.zdgl = zdgl == null ? null : zdgl.trim();
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

    public String getHhdl() {
        return hhdl;
    }

    public void setHhdl(String hhdl) {
        this.hhdl = hhdl == null ? null : hhdl.trim();
    }

    public String getJzzl() {
        return jzzl;
    }

    public void setJzzl(String jzzl) {
        this.jzzl = jzzl == null ? null : jzzl.trim();
    }

    public String getLtxh1() {
        return ltxh1;
    }

    public void setLtxh1(String ltxh1) {
        this.ltxh1 = ltxh1 == null ? null : ltxh1.trim();
    }

    public String getLtxh2() {
        return ltxh2;
    }

    public void setLtxh2(String ltxh2) {
        this.ltxh2 = ltxh2 == null ? null : ltxh2.trim();
    }

    public String getLtxh3() {
        return ltxh3;
    }

    public void setLtxh3(String ltxh3) {
        this.ltxh3 = ltxh3 == null ? null : ltxh3.trim();
    }

    public String getLtxh4() {
        return ltxh4;
    }

    public void setLtxh4(String ltxh4) {
        this.ltxh4 = ltxh4 == null ? null : ltxh4.trim();
    }

    public String getQhltyl1() {
        return qhltyl1;
    }

    public void setQhltyl1(String qhltyl1) {
        this.qhltyl1 = qhltyl1 == null ? null : qhltyl1.trim();
    }

    public String getQhltyl2() {
        return qhltyl2;
    }

    public void setQhltyl2(String qhltyl2) {
        this.qhltyl2 = qhltyl2 == null ? null : qhltyl2.trim();
    }

    public String getQhltyl3() {
        return qhltyl3;
    }

    public void setQhltyl3(String qhltyl3) {
        this.qhltyl3 = qhltyl3 == null ? null : qhltyl3.trim();
    }

    public String getQhltyl4() {
        return qhltyl4;
    }

    public void setQhltyl4(String qhltyl4) {
        this.qhltyl4 = qhltyl4 == null ? null : qhltyl4.trim();
    }

    public String getQdltyl1() {
        return qdltyl1;
    }

    public void setQdltyl1(String qdltyl1) {
        this.qdltyl1 = qdltyl1 == null ? null : qdltyl1.trim();
    }

    public String getQdltyl2() {
        return qdltyl2;
    }

    public void setQdltyl2(String qdltyl2) {
        this.qdltyl2 = qdltyl2 == null ? null : qdltyl2.trim();
    }

    public String getQdltyl3() {
        return qdltyl3;
    }

    public void setQdltyl3(String qdltyl3) {
        this.qdltyl3 = qdltyl3 == null ? null : qdltyl3.trim();
    }

    public String getQdltyl4() {
        return qdltyl4;
    }

    public void setQdltyl4(String qdltyl4) {
        this.qdltyl4 = qdltyl4 == null ? null : qdltyl4.trim();
    }

    public String getSb7() {
        return sb7;
    }

    public void setSb7(String sb7) {
        this.sb7 = sb7 == null ? null : sb7.trim();
    }

    public String getSb8() {
        return sb8;
    }

    public void setSb8(String sb8) {
        this.sb8 = sb8 == null ? null : sb8.trim();
    }

    public String getSb9() {
        return sb9;
    }

    public void setSb9(String sb9) {
        this.sb9 = sb9 == null ? null : sb9.trim();
    }

    public String getSb10() {
        return sb10;
    }

    public void setSb10(String sb10) {
        this.sb10 = sb10 == null ? null : sb10.trim();
    }

    public String getCsd() {
        return csd;
    }

    public void setCsd(String csd) {
        this.csd = csd == null ? null : csd.trim();
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd == null ? null : dd.trim();
    }

    public String getLhqxs() {
        return lhqxs;
    }

    public void setLhqxs(String lhqxs) {
        this.lhqxs = lhqxs == null ? null : lhqxs.trim();
    }

    public String getPlfs() {
        return plfs;
    }

    public void setPlfs(String plfs) {
        this.plfs = plfs == null ? null : plfs.trim();
    }

    public String getQgs() {
        return qgs;
    }

    public void setQgs(String qgs) {
        this.qgs = qgs == null ? null : qgs.trim();
    }

    public String getQfs() {
        return qfs;
    }

    public void setQfs(String qfs) {
        this.qfs = qfs == null ? null : qfs.trim();
    }

    public String getCcs() {
        return ccs;
    }

    public void setCcs(String ccs) {
        this.ccs = ccs == null ? null : ccs.trim();
    }

    public String getLqfs() {
        return lqfs;
    }

    public void setLqfs(String lqfs) {
        this.lqfs = lqfs == null ? null : lqfs.trim();
    }

    public String getJqfs() {
        return jqfs;
    }

    public void setJqfs(String jqfs) {
        this.jqfs = jqfs == null ? null : jqfs.trim();
    }

    public String getGyfs() {
        return gyfs;
    }

    public void setGyfs(String gyfs) {
        this.gyfs = gyfs == null ? null : gyfs.trim();
    }

    public String getHhdlfl() {
        return hhdlfl;
    }

    public void setHhdlfl(String hhdlfl) {
        this.hhdlfl = hhdlfl == null ? null : hhdlfl.trim();
    }

    public String getHhdlljfs() {
        return hhdlljfs;
    }

    public void setHhdlljfs(String hhdlljfs) {
        this.hhdlljfs = hhdlljfs == null ? null : hhdlljfs.trim();
    }

    public String getXhlc() {
        return xhlc;
    }

    public void setXhlc(String xhlc) {
        this.xhlc = xhlc == null ? null : xhlc.trim();
    }
}
