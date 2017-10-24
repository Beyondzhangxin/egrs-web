/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QCC_FDJ_KLW")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QccFdjKlw {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;

    private String klwxh;

    private String klwscc;

    private String klwcc;

    private String klwtj;

    private String klwwz;

    private String klwjzjl;

    private String klwtz;

    private String zsxtsm;

    private String tccl;

    private String tcscc;

    private String zsffms;

    private String gzyl;

    private String bjqlb;

    private String klwxs;

    private String klwxz;

    private String klbjqsm;

    private String dysm;

    private String klwjg;

    private String rbh;

    private String yxrjb;

    private String gjszhl;

    private String gjshl1;

    private String xdnd;

    private String kmd;

    private String ztcl;

    private String ztscc;

    private String ktxs;

    private String ktscc;

    private String zsetc1;

    private String zsetc2;

    private String gzwdfw;

    private String azfsms;

    private String yczmin;

    private String yczmax;

    private String zdzh;

    private String ztsccbs;

    private String ztsccbssyt;

    private String fzsccbs;

    private String fzsccbssyt;

    private String tcsccbs;

    private String tcsccbssyt;

    private String zsxhcs;

    private String zsxhsm;

    private String zsspcs;

    private String gltzl;

    public String getKlwxh() {
        return klwxh;
    }

    public void setKlwxh(String klwxh) {
        this.klwxh = klwxh == null ? null : klwxh.trim();
    }

    public String getKlwscc() {
        return klwscc;
    }

    public void setKlwscc(String klwscc) {
        this.klwscc = klwscc == null ? null : klwscc.trim();
    }

    public String getKlwcc() {
        return klwcc;
    }

    public void setKlwcc(String klwcc) {
        this.klwcc = klwcc == null ? null : klwcc.trim();
    }

    public String getKlwtj() {
        return klwtj;
    }

    public void setKlwtj(String klwtj) {
        this.klwtj = klwtj == null ? null : klwtj.trim();
    }

    public String getKlwwz() {
        return klwwz;
    }

    public void setKlwwz(String klwwz) {
        this.klwwz = klwwz == null ? null : klwwz.trim();
    }

    public String getKlwjzjl() {
        return klwjzjl;
    }

    public void setKlwjzjl(String klwjzjl) {
        this.klwjzjl = klwjzjl == null ? null : klwjzjl.trim();
    }

    public String getKlwtz() {
        return klwtz;
    }

    public void setKlwtz(String klwtz) {
        this.klwtz = klwtz == null ? null : klwtz.trim();
    }

    public String getZsxtsm() {
        return zsxtsm;
    }

    public void setZsxtsm(String zsxtsm) {
        this.zsxtsm = zsxtsm == null ? null : zsxtsm.trim();
    }

    public String getTccl() {
        return tccl;
    }

    public void setTccl(String tccl) {
        this.tccl = tccl == null ? null : tccl.trim();
    }

    public String getTcscc() {
        return tcscc;
    }

    public void setTcscc(String tcscc) {
        this.tcscc = tcscc == null ? null : tcscc.trim();
    }

    public String getZsffms() {
        return zsffms;
    }

    public void setZsffms(String zsffms) {
        this.zsffms = zsffms == null ? null : zsffms.trim();
    }

    public String getGzyl() {
        return gzyl;
    }

    public void setGzyl(String gzyl) {
        this.gzyl = gzyl == null ? null : gzyl.trim();
    }

    public String getBjqlb() {
        return bjqlb;
    }

    public void setBjqlb(String bjqlb) {
        this.bjqlb = bjqlb == null ? null : bjqlb.trim();
    }

    public String getKlwxs() {
        return klwxs;
    }

    public void setKlwxs(String klwxs) {
        this.klwxs = klwxs == null ? null : klwxs.trim();
    }

    public String getKlwxz() {
        return klwxz;
    }

    public void setKlwxz(String klwxz) {
        this.klwxz = klwxz == null ? null : klwxz.trim();
    }

    public String getKlbjqsm() {
        return klbjqsm;
    }

    public void setKlbjqsm(String klbjqsm) {
        this.klbjqsm = klbjqsm == null ? null : klbjqsm.trim();
    }

    public String getDysm() {
        return dysm;
    }

    public void setDysm(String dysm) {
        this.dysm = dysm == null ? null : dysm.trim();
    }

    public String getKlwjg() {
        return klwjg;
    }

    public void setKlwjg(String klwjg) {
        this.klwjg = klwjg == null ? null : klwjg.trim();
    }

    public String getRbh() {
        return rbh;
    }

    public void setRbh(String rbh) {
        this.rbh = rbh == null ? null : rbh.trim();
    }

    public String getYxrjb() {
        return yxrjb;
    }

    public void setYxrjb(String yxrjb) {
        this.yxrjb = yxrjb == null ? null : yxrjb.trim();
    }

    public String getGjszhl() {
        return gjszhl;
    }

    public void setGjszhl(String gjszhl) {
        this.gjszhl = gjszhl == null ? null : gjszhl.trim();
    }

    public String getGjshl1() {
        return gjshl1;
    }

    public void setGjshl1(String gjshl1) {
        this.gjshl1 = gjshl1 == null ? null : gjshl1.trim();
    }

    public String getXdnd() {
        return xdnd;
    }

    public void setXdnd(String xdnd) {
        this.xdnd = xdnd == null ? null : xdnd.trim();
    }

    public String getKmd() {
        return kmd;
    }

    public void setKmd(String kmd) {
        this.kmd = kmd == null ? null : kmd.trim();
    }

    public String getZtcl() {
        return ztcl;
    }

    public void setZtcl(String ztcl) {
        this.ztcl = ztcl == null ? null : ztcl.trim();
    }

    public String getZtscc() {
        return ztscc;
    }

    public void setZtscc(String ztscc) {
        this.ztscc = ztscc == null ? null : ztscc.trim();
    }

    public String getKtxs() {
        return ktxs;
    }

    public void setKtxs(String ktxs) {
        this.ktxs = ktxs == null ? null : ktxs.trim();
    }

    public String getKtscc() {
        return ktscc;
    }

    public void setKtscc(String ktscc) {
        this.ktscc = ktscc == null ? null : ktscc.trim();
    }

    public String getZsetc1() {
        return zsetc1;
    }

    public void setZsetc1(String zsetc1) {
        this.zsetc1 = zsetc1 == null ? null : zsetc1.trim();
    }

    public String getZsetc2() {
        return zsetc2;
    }

    public void setZsetc2(String zsetc2) {
        this.zsetc2 = zsetc2 == null ? null : zsetc2.trim();
    }

    public String getGzwdfw() {
        return gzwdfw;
    }

    public void setGzwdfw(String gzwdfw) {
        this.gzwdfw = gzwdfw == null ? null : gzwdfw.trim();
    }

    public String getAzfsms() {
        return azfsms;
    }

    public void setAzfsms(String azfsms) {
        this.azfsms = azfsms == null ? null : azfsms.trim();
    }

    public String getYczmin() {
        return yczmin;
    }

    public void setYczmin(String yczmin) {
        this.yczmin = yczmin == null ? null : yczmin.trim();
    }

    public String getYczmax() {
        return yczmax;
    }

    public void setYczmax(String yczmax) {
        this.yczmax = yczmax == null ? null : yczmax.trim();
    }

    public String getZdzh() {
        return zdzh;
    }

    public void setZdzh(String zdzh) {
        this.zdzh = zdzh == null ? null : zdzh.trim();
    }

    public String getZtsccbs() {
        return ztsccbs;
    }

    public void setZtsccbs(String ztsccbs) {
        this.ztsccbs = ztsccbs == null ? null : ztsccbs.trim();
    }

    public String getZtsccbssyt() {
        return ztsccbssyt;
    }

    public void setZtsccbssyt(String ztsccbssyt) {
        this.ztsccbssyt = ztsccbssyt == null ? null : ztsccbssyt.trim();
    }

    public String getFzsccbs() {
        return fzsccbs;
    }

    public void setFzsccbs(String fzsccbs) {
        this.fzsccbs = fzsccbs == null ? null : fzsccbs.trim();
    }

    public String getFzsccbssyt() {
        return fzsccbssyt;
    }

    public void setFzsccbssyt(String fzsccbssyt) {
        this.fzsccbssyt = fzsccbssyt == null ? null : fzsccbssyt.trim();
    }

    public String getTcsccbs() {
        return tcsccbs;
    }

    public void setTcsccbs(String tcsccbs) {
        this.tcsccbs = tcsccbs == null ? null : tcsccbs.trim();
    }

    public String getTcsccbssyt() {
        return tcsccbssyt;
    }

    public void setTcsccbssyt(String tcsccbssyt) {
        this.tcsccbssyt = tcsccbssyt == null ? null : tcsccbssyt.trim();
    }

    public String getZsxhcs() {
        return zsxhcs;
    }

    public void setZsxhcs(String zsxhcs) {
        this.zsxhcs = zsxhcs == null ? null : zsxhcs.trim();
    }

    public String getZsxhsm() {
        return zsxhsm;
    }

    public void setZsxhsm(String zsxhsm) {
        this.zsxhsm = zsxhsm == null ? null : zsxhsm.trim();
    }

    public String getZsspcs() {
        return zsspcs;
    }

    public void setZsspcs(String zsspcs) {
        this.zsspcs = zsspcs == null ? null : zsspcs.trim();
    }

    public String getGltzl() {
        return gltzl;
    }

    public void setGltzl(String gltzl) {
        this.gltzl = gltzl == null ? null : gltzl.trim();
    }
    
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
	
	public Integer getBh() {
		return bh;
	}
	
	public void setBh(Integer bh) {
		this.bh = bh;
	}
	
	
}
