/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QQC_FDJ_ZHQ_DY")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhqDyPk.class)
public class QqcFdjZhqDy {
    @Id
	private String flbh;

    @Id
    private Integer fdjbh;

    @Id
    private Integer zhqbh;

    @Id
    private Integer bh;

    private String dylb;

    private String gjshl;

    private String xdnd;

    private String ztzl;

    private String ztxh;

    private String ztscc;

    private String ztsccbs;

    private String ztsccbssyt;

    private String tcscc;

    private String tcsccbs;

    private String tcsccbssyt;

    private String ztrj;

    public String getDylb() {
        return dylb;
    }

    public void setDylb(String dylb) {
        this.dylb = dylb == null ? null : dylb.trim();
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

    public String getZtzl() {
        return ztzl;
    }

    public void setZtzl(String ztzl) {
        this.ztzl = ztzl == null ? null : ztzl.trim();
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

    public String getTcscc() {
        return tcscc;
    }

    public void setTcscc(String tcscc) {
        this.tcscc = tcscc == null ? null : tcscc.trim();
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

    public String getZtrj() {
        return ztrj;
    }

    public void setZtrj(String ztrj) {
        this.ztrj = ztrj == null ? null : ztrj.trim();
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

    public Integer getZhqbh() {
        return zhqbh;
    }

    public void setZhqbh(Integer zhqbh) {
        this.zhqbh = zhqbh;
    }

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }	
}
