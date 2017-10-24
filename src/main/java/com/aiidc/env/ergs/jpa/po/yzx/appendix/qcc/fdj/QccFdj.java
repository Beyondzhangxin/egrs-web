/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.aiidc.env.ergs.common.file.FileTarget;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QQC_FDJ")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.FlbhAndFdjbh.class)
public class QccFdj {
	@Id
	private String flbh;
	@Id
    private Integer fdjbh;

    private String fdjxh;

    private String fdjscc;

    private String fdjpl;

    private String ysb1;

    private String ysb2;

    private String gzyl;

    private String rlpsgzyl;

    private String gj;

    private String xc;

    private String qgsm;

    private String dhsx;

    private String rlbh;

    private String jgl1;

    private String jgl2;

    private String dszs;

    private String lqxt;
    @FileTarget
    private String rsstzh;

    private String zgzs;

    private String zdjnj1;

    private String zdjnj2;

    private String qgpl;

    private String jqfs;

    private String gyfs;

    private String rsfs;

    private String pytqj;

    private String pytqqx;

    private String rlgjxs;

    private String edglzs;

    private String edgl;

    private String qms;

    private String hsdsyt;

    private String hshsyt;

    private String gycl;

    private String qmbz;

    private String rlpsxtxs;

    private String rlpsxtsm;

    private String wdedsz;

    private String noxjc;

    private String iupr;

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

    public String getFdjpl() {
        return fdjpl;
    }

    public void setFdjpl(String fdjpl) {
        this.fdjpl = fdjpl == null ? null : fdjpl.trim();
    }

    public String getYsb1() {
        return ysb1;
    }

    public void setYsb1(String ysb1) {
        this.ysb1 = ysb1 == null ? null : ysb1.trim();
    }

    public String getYsb2() {
        return ysb2;
    }

    public void setYsb2(String ysb2) {
        this.ysb2 = ysb2 == null ? null : ysb2.trim();
    }

    public String getGzyl() {
        return gzyl;
    }

    public void setGzyl(String gzyl) {
        this.gzyl = gzyl == null ? null : gzyl.trim();
    }

    public String getRlpsgzyl() {
        return rlpsgzyl;
    }

    public void setRlpsgzyl(String rlpsgzyl) {
        this.rlpsgzyl = rlpsgzyl == null ? null : rlpsgzyl.trim();
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj == null ? null : gj.trim();
    }

    public String getXc() {
        return xc;
    }

    public void setXc(String xc) {
        this.xc = xc == null ? null : xc.trim();
    }

    public String getQgsm() {
        return qgsm;
    }

    public void setQgsm(String qgsm) {
        this.qgsm = qgsm == null ? null : qgsm.trim();
    }

    public String getDhsx() {
        return dhsx;
    }

    public void setDhsx(String dhsx) {
        this.dhsx = dhsx == null ? null : dhsx.trim();
    }

    public String getRlbh() {
        return rlbh;
    }

    public void setRlbh(String rlbh) {
        this.rlbh = rlbh == null ? null : rlbh.trim();
    }

    public String getJgl1() {
        return jgl1;
    }

    public void setJgl1(String jgl1) {
        this.jgl1 = jgl1 == null ? null : jgl1.trim();
    }

    public String getJgl2() {
        return jgl2;
    }

    public void setJgl2(String jgl2) {
        this.jgl2 = jgl2 == null ? null : jgl2.trim();
    }

    public String getDszs() {
        return dszs;
    }

    public void setDszs(String dszs) {
        this.dszs = dszs == null ? null : dszs.trim();
    }

    public String getLqxt() {
        return lqxt;
    }

    public void setLqxt(String lqxt) {
        this.lqxt = lqxt == null ? null : lqxt.trim();
    }

    public String getRsstzh() {
        return rsstzh;
    }

    public void setRsstzh(String rsstzh) {
        this.rsstzh = rsstzh == null ? null : rsstzh.trim();
    }

    public String getZgzs() {
        return zgzs;
    }

    public void setZgzs(String zgzs) {
        this.zgzs = zgzs == null ? null : zgzs.trim();
    }

    public String getZdjnj1() {
        return zdjnj1;
    }

    public void setZdjnj1(String zdjnj1) {
        this.zdjnj1 = zdjnj1 == null ? null : zdjnj1.trim();
    }

    public String getZdjnj2() {
        return zdjnj2;
    }

    public void setZdjnj2(String zdjnj2) {
        this.zdjnj2 = zdjnj2 == null ? null : zdjnj2.trim();
    }

    public String getQgpl() {
        return qgpl;
    }

    public void setQgpl(String qgpl) {
        this.qgpl = qgpl == null ? null : qgpl.trim();
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

    public String getRsfs() {
        return rsfs;
    }

    public void setRsfs(String rsfs) {
        this.rsfs = rsfs == null ? null : rsfs.trim();
    }

    public String getPytqj() {
        return pytqj;
    }

    public void setPytqj(String pytqj) {
        this.pytqj = pytqj == null ? null : pytqj.trim();
    }

    public String getPytqqx() {
        return pytqqx;
    }

    public void setPytqqx(String pytqqx) {
        this.pytqqx = pytqqx == null ? null : pytqqx.trim();
    }

    public String getRlgjxs() {
        return rlgjxs;
    }

    public void setRlgjxs(String rlgjxs) {
        this.rlgjxs = rlgjxs == null ? null : rlgjxs.trim();
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

    public String getQms() {
        return qms;
    }

    public void setQms(String qms) {
        this.qms = qms == null ? null : qms.trim();
    }

    public String getHsdsyt() {
        return hsdsyt;
    }

    public void setHsdsyt(String hsdsyt) {
        this.hsdsyt = hsdsyt == null ? null : hsdsyt.trim();
    }

    public String getHshsyt() {
        return hshsyt;
    }

    public void setHshsyt(String hshsyt) {
        this.hshsyt = hshsyt == null ? null : hshsyt.trim();
    }

    public String getGycl() {
        return gycl;
    }

    public void setGycl(String gycl) {
        this.gycl = gycl == null ? null : gycl.trim();
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

    public String getRlpsxtsm() {
        return rlpsxtsm;
    }

    public void setRlpsxtsm(String rlpsxtsm) {
        this.rlpsxtsm = rlpsxtsm == null ? null : rlpsxtsm.trim();
    }

    public String getWdedsz() {
        return wdedsz;
    }

    public void setWdedsz(String wdedsz) {
        this.wdedsz = wdedsz == null ? null : wdedsz.trim();
    }

    public String getNoxjc() {
        return noxjc;
    }

    public void setNoxjc(String noxjc) {
        this.noxjc = noxjc == null ? null : noxjc.trim();
    }

    public String getIupr() {
        return iupr;
    }

    public void setIupr(String iupr) {
        this.iupr = iupr == null ? null : iupr.trim();
    }
}
