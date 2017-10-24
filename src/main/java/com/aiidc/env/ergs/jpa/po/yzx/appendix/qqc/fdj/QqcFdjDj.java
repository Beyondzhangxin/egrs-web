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
@Table(name = "Y_QQC_FDJ_DJ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjDj {
    @Id
	private String flbh;
    @Id
    private Integer fdjbh;
    @Id
    private Integer bh;
	
	private String djxh;

    private String djscc;

    private String djyt;

    private String djazsl;

    private String djwz;

    private String djlqfs;

    private String djedgl;

    private String djedglzs;

    private String djedglzj;

    private String djfzgl;

    private String djfzglzs;

    private String djfzglzj;

    private String djgzyl1;

    private String djgzyl2;

    private String djgzyl3;

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

    public String getDjyt() {
        return djyt;
    }

    public void setDjyt(String djyt) {
        this.djyt = djyt == null ? null : djyt.trim();
    }

    public String getDjazsl() {
        return djazsl;
    }

    public void setDjazsl(String djazsl) {
        this.djazsl = djazsl == null ? null : djazsl.trim();
    }

    public String getDjwz() {
        return djwz;
    }

    public void setDjwz(String djwz) {
        this.djwz = djwz == null ? null : djwz.trim();
    }

    public String getDjlqfs() {
        return djlqfs;
    }

    public void setDjlqfs(String djlqfs) {
        this.djlqfs = djlqfs == null ? null : djlqfs.trim();
    }

    public String getDjedgl() {
        return djedgl;
    }

    public void setDjedgl(String djedgl) {
        this.djedgl = djedgl == null ? null : djedgl.trim();
    }

    public String getDjedglzs() {
        return djedglzs;
    }

    public void setDjedglzs(String djedglzs) {
        this.djedglzs = djedglzs == null ? null : djedglzs.trim();
    }

    public String getDjedglzj() {
        return djedglzj;
    }

    public void setDjedglzj(String djedglzj) {
        this.djedglzj = djedglzj == null ? null : djedglzj.trim();
    }

    public String getDjfzgl() {
        return djfzgl;
    }

    public void setDjfzgl(String djfzgl) {
        this.djfzgl = djfzgl == null ? null : djfzgl.trim();
    }

    public String getDjfzglzs() {
        return djfzglzs;
    }

    public void setDjfzglzs(String djfzglzs) {
        this.djfzglzs = djfzglzs == null ? null : djfzglzs.trim();
    }

    public String getDjfzglzj() {
        return djfzglzj;
    }

    public void setDjfzglzj(String djfzglzj) {
        this.djfzglzj = djfzglzj == null ? null : djfzglzj.trim();
    }

    public String getDjgzyl1() {
        return djgzyl1;
    }

    public void setDjgzyl1(String djgzyl1) {
        this.djgzyl1 = djgzyl1 == null ? null : djgzyl1.trim();
    }

    public String getDjgzyl2() {
        return djgzyl2;
    }

    public void setDjgzyl2(String djgzyl2) {
        this.djgzyl2 = djgzyl2 == null ? null : djgzyl2.trim();
    }

    public String getDjgzyl3() {
        return djgzyl3;
    }

    public void setDjgzyl3(String djgzyl3) {
        this.djgzyl3 = djgzyl3 == null ? null : djgzyl3.trim();
    }
}
