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
@Table(name = "Y_QCC_FDJ_JQXT")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.FlbhAndFdjbh.class)
public class QccFdjJqxt {
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
