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
@Table(name = "Y_QCC_FDJ_ZHQ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QccFdjZhq {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;

    private String zhqxh;

    private String zhqscc;

    private String gjshl;

    private String xdnd;

    private String chdysm;

    private String zhqtj;

    private String zhqcc;

    private String cctj;

    private String zyxs;

    private String ztxh;

    private String ztscc;

    private String kmd;

    private String ktsccbz;

    private String zhqwz;

    private String rbh;

    private String zhqxz;

    private String fzscc;

    private String tcscc;

    private String zsfs;

    private String gzyl;

    private String zhqlb;

    private String yxrjb;

    private String gjshl1;

    private String zhqsm;

    private String ztjg;

    private String ktxs;

    private String tccl;

    private String gzwdfw;

    private String fyjqpwd;

    private String azfsms;

    private String ztsccbs;

    private String ztsccbssyt;

    private String tcsccbs;

    private String tcsccbssyt;

    private String fzsccbs;

    private String fzsccbssyt;

    private String noxsj;

    private String ztzl;

    private String gjszhl;

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

    public String getGjshl() {
        return gjshl;
    }

    public void setGjshl(String gjshl) {
        this.gjshl = gjshl == null ? null : gjshl.trim();
    }

    public String getXdnd() {
        return xdnd;
    }

    public void setXdnd(String xdnd) {
        this.xdnd = xdnd == null ? null : xdnd.trim();
    }

    public String getChdysm() {
        return chdysm;
    }

    public void setChdysm(String chdysm) {
        this.chdysm = chdysm == null ? null : chdysm.trim();
    }

    public String getZhqtj() {
        return zhqtj;
    }

    public void setZhqtj(String zhqtj) {
        this.zhqtj = zhqtj == null ? null : zhqtj.trim();
    }

    public String getZhqcc() {
        return zhqcc;
    }

    public void setZhqcc(String zhqcc) {
        this.zhqcc = zhqcc == null ? null : zhqcc.trim();
    }

    public String getCctj() {
        return cctj;
    }

    public void setCctj(String cctj) {
        this.cctj = cctj == null ? null : cctj.trim();
    }

    public String getZyxs() {
        return zyxs;
    }

    public void setZyxs(String zyxs) {
        this.zyxs = zyxs == null ? null : zyxs.trim();
    }

    public String getZtxh() {
        return ztxh;
    }

    public void setZtxh(String ztxh) {
        this.ztxh = ztxh == null ? null : ztxh.trim();
    }

    public String getZtscc() {
        return ztscc;
    }

    public void setZtscc(String ztscc) {
        this.ztscc = ztscc == null ? null : ztscc.trim();
    }

    public String getKmd() {
        return kmd;
    }

    public void setKmd(String kmd) {
        this.kmd = kmd == null ? null : kmd.trim();
    }

    public String getKtsccbz() {
        return ktsccbz;
    }

    public void setKtsccbz(String ktsccbz) {
        this.ktsccbz = ktsccbz == null ? null : ktsccbz.trim();
    }

    public String getZhqwz() {
        return zhqwz;
    }

    public void setZhqwz(String zhqwz) {
        this.zhqwz = zhqwz == null ? null : zhqwz.trim();
    }

    public String getRbh() {
        return rbh;
    }

    public void setRbh(String rbh) {
        this.rbh = rbh == null ? null : rbh.trim();
    }

    public String getZhqxz() {
        return zhqxz;
    }

    public void setZhqxz(String zhqxz) {
        this.zhqxz = zhqxz == null ? null : zhqxz.trim();
    }

    public String getFzscc() {
        return fzscc;
    }

    public void setFzscc(String fzscc) {
        this.fzscc = fzscc == null ? null : fzscc.trim();
    }

    public String getTcscc() {
        return tcscc;
    }

    public void setTcscc(String tcscc) {
        this.tcscc = tcscc == null ? null : tcscc.trim();
    }

    public String getZsfs() {
        return zsfs;
    }

    public void setZsfs(String zsfs) {
        this.zsfs = zsfs == null ? null : zsfs.trim();
    }

    public String getGzyl() {
        return gzyl;
    }

    public void setGzyl(String gzyl) {
        this.gzyl = gzyl == null ? null : gzyl.trim();
    }

    public String getZhqlb() {
        return zhqlb;
    }

    public void setZhqlb(String zhqlb) {
        this.zhqlb = zhqlb == null ? null : zhqlb.trim();
    }

    public String getYxrjb() {
        return yxrjb;
    }

    public void setYxrjb(String yxrjb) {
        this.yxrjb = yxrjb == null ? null : yxrjb.trim();
    }

    public String getGjshl1() {
        return gjshl1;
    }

    public void setGjshl1(String gjshl1) {
        this.gjshl1 = gjshl1 == null ? null : gjshl1.trim();
    }

    public String getZhqsm() {
        return zhqsm;
    }

    public void setZhqsm(String zhqsm) {
        this.zhqsm = zhqsm == null ? null : zhqsm.trim();
    }

    public String getZtjg() {
        return ztjg;
    }

    public void setZtjg(String ztjg) {
        this.ztjg = ztjg == null ? null : ztjg.trim();
    }

    public String getKtxs() {
        return ktxs;
    }

    public void setKtxs(String ktxs) {
        this.ktxs = ktxs == null ? null : ktxs.trim();
    }

    public String getTccl() {
        return tccl;
    }

    public void setTccl(String tccl) {
        this.tccl = tccl == null ? null : tccl.trim();
    }

    public String getGzwdfw() {
        return gzwdfw;
    }

    public void setGzwdfw(String gzwdfw) {
        this.gzwdfw = gzwdfw == null ? null : gzwdfw.trim();
    }

    public String getFyjqpwd() {
        return fyjqpwd;
    }

    public void setFyjqpwd(String fyjqpwd) {
        this.fyjqpwd = fyjqpwd == null ? null : fyjqpwd.trim();
    }

    public String getAzfsms() {
        return azfsms;
    }

    public void setAzfsms(String azfsms) {
        this.azfsms = azfsms == null ? null : azfsms.trim();
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

    public String getNoxsj() {
        return noxsj;
    }

    public void setNoxsj(String noxsj) {
        this.noxsj = noxsj == null ? null : noxsj.trim();
    }

    public String getZtzl() {
        return ztzl;
    }

    public void setZtzl(String ztzl) {
        this.ztzl = ztzl == null ? null : ztzl.trim();
    }

    public String getGjszhl() {
        return gjszhl;
    }

    public void setGjszhl(String gjszhl) {
        this.gjszhl = gjszhl == null ? null : gjszhl.trim();
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
