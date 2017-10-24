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
@Table(name = "Y_QQC_FDJ_CONFIG")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjConfigPk.class)
public class QqcFdjConfig {
	@Id
	private String flbh;
	@Id
    private Integer fdjbh;
	@Id
    private Integer bh;
	@Id
    private String pzlb;
    
    private String pzxh;

    private String pzscc;
    @FileTarget
    private String syt;

    private String sm;

    public String getPzxh() {
        return pzxh;
    }

    public void setPzxh(String pzxh) {
        this.pzxh = pzxh == null ? null : pzxh.trim();
    }

    public String getPzscc() {
        return pzscc;
    }

    public void setPzscc(String pzscc) {
        this.pzscc = pzscc == null ? null : pzscc.trim();
    }

    public String getSyt() {
        return syt;
    }

    public void setSyt(String syt) {
        this.syt = syt == null ? null : syt.trim();
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm == null ? null : sm.trim();
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

    public String getPzlb() {
        return pzlb;
    }

    public void setPzlb(String pzlb) {
        this.pzlb = pzlb == null ? null : pzlb.trim();
    }
}
