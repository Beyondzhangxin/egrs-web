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
@Table(name = "Y_QQC_FDJ_JQXT")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPk.class)
public class QqcFdjJqxt {
	@Id
	private String flbh;
	@Id
    private Integer fdjbh;

    private String jqgsm;
    @FileTarget
    private String jqgsyt;

    private String jqzgsm;
    @FileTarget
    private String jqzgsyt;

    private String zdjqzl;

    public String getJqgsm() {
        return jqgsm;
    }

    public void setJqgsm(String jqgsm) {
        this.jqgsm = jqgsm == null ? null : jqgsm.trim();
    }

    public String getJqgsyt() {
        return jqgsyt;
    }

    public void setJqgsyt(String jqgsyt) {
        this.jqgsyt = jqgsyt == null ? null : jqgsyt.trim();
    }

    public String getJqzgsm() {
        return jqzgsm;
    }

    public void setJqzgsm(String jqzgsm) {
        this.jqzgsm = jqzgsm == null ? null : jqzgsm.trim();
    }

    public String getJqzgsyt() {
        return jqzgsyt;
    }

    public void setJqzgsyt(String jqzgsyt) {
        this.jqzgsyt = jqzgsyt == null ? null : jqzgsyt.trim();
    }

    public String getZdjqzl() {
        return zdjqzl;
    }

    public void setZdjqzl(String zdjqzl) {
        this.zdjqzl = zdjqzl == null ? null : zdjqzl.trim();
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
    

}
