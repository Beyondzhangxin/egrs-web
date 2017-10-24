/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;

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
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPk.class)
public class QqcFdj {
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
    @FileTarget
    private String rsstzh;

    private String gj;

    private String xc;

    private String qgsm;

    private String dhsx;

    private String rlbh;

    private String jgl1;

    private String jgl2;

    private String dszs;

    private String gdskrb;

    private String cobfb;

    private String chbfb;

    private String hyqxh;

    private String hyqcp;

    private String lqxt;

    private String xh;

    private String kqpsxs;
    @FileTarget
    private String hsdtzh;
    @FileTarget
    private String hshtzh;

    private String qgpl;

    private String edgl1;

    private String edgl2;

    private String zdnj1;

    private String zdnj2;

    private String jcgycl;

    private String qmbz;

    private String gdszs;

    private String gdscobfb;

    private String gdshcbfb;

    private String wqqyxwz;

    private String kqpsxtxs;

    private String rl;

    private String zdgl1;

    private String zdgl2;

    private String jqfs;

    private String gyfs;

    private String qms;

    private String xbrs;

    private String zdyxzs;

    private String rlpslx;

    private String wdedsz;

    private String syxwz;

    private String iupr;

    private String noxjc;
    
    public String getFlbh() {
    	return flbh;
    }
    
    public void setFlbh(String flbh) {
    	this.flbh = flbh == null ? null : flbh.trim();
    }
    
    public Integer getFdjbh() {
    	return fdjbh;
    }
    
    public void setFdjbh(Integer fdjbh) {
    	this.fdjbh = fdjbh;
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

    public String getRsstzh() {
        return rsstzh;
    }

    public void setRsstzh(String rsstzh) {
        this.rsstzh = rsstzh == null ? null : rsstzh.trim();
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

    public String getGdskrb() {
        return gdskrb;
    }

    public void setGdskrb(String gdskrb) {
        this.gdskrb = gdskrb == null ? null : gdskrb.trim();
    }

    public String getCobfb() {
        return cobfb;
    }

    public void setCobfb(String cobfb) {
        this.cobfb = cobfb == null ? null : cobfb.trim();
    }

    public String getChbfb() {
        return chbfb;
    }

    public void setChbfb(String chbfb) {
        this.chbfb = chbfb == null ? null : chbfb.trim();
    }

    public String getHyqxh() {
        return hyqxh;
    }

    public void setHyqxh(String hyqxh) {
        this.hyqxh = hyqxh == null ? null : hyqxh.trim();
    }

    public String getHyqcp() {
        return hyqcp;
    }

    public void setHyqcp(String hyqcp) {
        this.hyqcp = hyqcp == null ? null : hyqcp.trim();
    }

    public String getLqxt() {
        return lqxt;
    }

    public void setLqxt(String lqxt) {
        this.lqxt = lqxt == null ? null : lqxt.trim();
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getKqpsxs() {
        return kqpsxs;
    }

    public void setKqpsxs(String kqpsxs) {
        this.kqpsxs = kqpsxs == null ? null : kqpsxs.trim();
    }

    public String getHsdtzh() {
        return hsdtzh;
    }

    public void setHsdtzh(String hsdtzh) {
        this.hsdtzh = hsdtzh == null ? null : hsdtzh.trim();
    }

    public String getHshtzh() {
        return hshtzh;
    }

    public void setHshtzh(String hshtzh) {
        this.hshtzh = hshtzh == null ? null : hshtzh.trim();
    }

    public String getQgpl() {
        return qgpl;
    }

    public void setQgpl(String qgpl) {
        this.qgpl = qgpl == null ? null : qgpl.trim();
    }

    public String getEdgl1() {
        return edgl1;
    }

    public void setEdgl1(String edgl1) {
        this.edgl1 = edgl1 == null ? null : edgl1.trim();
    }

    public String getEdgl2() {
        return edgl2;
    }

    public void setEdgl2(String edgl2) {
        this.edgl2 = edgl2 == null ? null : edgl2.trim();
    }

    public String getZdnj1() {
        return zdnj1;
    }

    public void setZdnj1(String zdnj1) {
        this.zdnj1 = zdnj1 == null ? null : zdnj1.trim();
    }

    public String getZdnj2() {
        return zdnj2;
    }

    public void setZdnj2(String zdnj2) {
        this.zdnj2 = zdnj2 == null ? null : zdnj2.trim();
    }

    public String getJcgycl() {
        return jcgycl;
    }

    public void setJcgycl(String jcgycl) {
        this.jcgycl = jcgycl == null ? null : jcgycl.trim();
    }

    public String getQmbz() {
        return qmbz;
    }

    public void setQmbz(String qmbz) {
        this.qmbz = qmbz == null ? null : qmbz.trim();
    }

    public String getGdszs() {
        return gdszs;
    }

    public void setGdszs(String gdszs) {
        this.gdszs = gdszs == null ? null : gdszs.trim();
    }

    public String getGdscobfb() {
        return gdscobfb;
    }

    public void setGdscobfb(String gdscobfb) {
        this.gdscobfb = gdscobfb == null ? null : gdscobfb.trim();
    }

    public String getGdshcbfb() {
        return gdshcbfb;
    }

    public void setGdshcbfb(String gdshcbfb) {
        this.gdshcbfb = gdshcbfb == null ? null : gdshcbfb.trim();
    }

    public String getWqqyxwz() {
        return wqqyxwz;
    }

    public void setWqqyxwz(String wqqyxwz) {
        this.wqqyxwz = wqqyxwz == null ? null : wqqyxwz.trim();
    }

    public String getKqpsxtxs() {
        return kqpsxtxs;
    }

    public void setKqpsxtxs(String kqpsxtxs) {
        this.kqpsxtxs = kqpsxtxs == null ? null : kqpsxtxs.trim();
    }

    public String getRl() {
        return rl;
    }

    public void setRl(String rl) {
        this.rl = rl == null ? null : rl.trim();
    }

    public String getZdgl1() {
        return zdgl1;
    }

    public void setZdgl1(String zdgl1) {
        this.zdgl1 = zdgl1 == null ? null : zdgl1.trim();
    }

    public String getZdgl2() {
        return zdgl2;
    }

    public void setZdgl2(String zdgl2) {
        this.zdgl2 = zdgl2 == null ? null : zdgl2.trim();
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

    public String getQms() {
        return qms;
    }

    public void setQms(String qms) {
        this.qms = qms == null ? null : qms.trim();
    }

    public String getXbrs() {
        return xbrs;
    }

    public void setXbrs(String xbrs) {
        this.xbrs = xbrs == null ? null : xbrs.trim();
    }

    public String getZdyxzs() {
        return zdyxzs;
    }

    public void setZdyxzs(String zdyxzs) {
        this.zdyxzs = zdyxzs == null ? null : zdyxzs.trim();
    }

    public String getRlpslx() {
        return rlpslx;
    }

    public void setRlpslx(String rlpslx) {
        this.rlpslx = rlpslx == null ? null : rlpslx.trim();
    }

    public String getWdedsz() {
        return wdedsz;
    }

    public void setWdedsz(String wdedsz) {
        this.wdedsz = wdedsz == null ? null : wdedsz.trim();
    }

    public String getSyxwz() {
        return syxwz;
    }

    public void setSyxwz(String syxwz) {
        this.syxwz = syxwz == null ? null : syxwz.trim();
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
}
