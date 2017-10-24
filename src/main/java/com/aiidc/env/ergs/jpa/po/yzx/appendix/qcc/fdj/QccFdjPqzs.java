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
@Table(name = "Y_QCC_FDJ_PQZS")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.FlbhAndFdjbh.class)
public class QccFdjPqzs {
	@Id
	private String flbh;
	@Id
    private Integer fdjbh;
	
    private String qfzdsc;

    private String kqjd;

    private String gbjd;
    @FileTarget
    private String zsqx;

    private String kqjqfw;

    private String kqpqfw;

    private String gbjqfw;

    private String gbpqfw;

    public String getQfzdsc() {
        return qfzdsc;
    }

    public void setQfzdsc(String qfzdsc) {
        this.qfzdsc = qfzdsc == null ? null : qfzdsc.trim();
    }

    public String getKqjd() {
        return kqjd;
    }

    public void setKqjd(String kqjd) {
        this.kqjd = kqjd == null ? null : kqjd.trim();
    }

    public String getGbjd() {
        return gbjd;
    }

    public void setGbjd(String gbjd) {
        this.gbjd = gbjd == null ? null : gbjd.trim();
    }

    public String getZsqx() {
        return zsqx;
    }

    public void setZsqx(String zsqx) {
        this.zsqx = zsqx == null ? null : zsqx.trim();
    }

    public String getKqjqfw() {
        return kqjqfw;
    }

    public void setKqjqfw(String kqjqfw) {
        this.kqjqfw = kqjqfw == null ? null : kqjqfw.trim();
    }

    public String getKqpqfw() {
        return kqpqfw;
    }

    public void setKqpqfw(String kqpqfw) {
        this.kqpqfw = kqpqfw == null ? null : kqpqfw.trim();
    }

    public String getGbjqfw() {
        return gbjqfw;
    }

    public void setGbjqfw(String gbjqfw) {
        this.gbjqfw = gbjqfw == null ? null : gbjqfw.trim();
    }

    public String getGbpqfw() {
        return gbpqfw;
    }

    public void setGbpqfw(String gbpqfw) {
        this.gbpqfw = gbpqfw == null ? null : gbpqfw.trim();
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
