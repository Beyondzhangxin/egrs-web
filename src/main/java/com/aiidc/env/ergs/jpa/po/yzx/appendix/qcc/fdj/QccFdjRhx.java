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
@Table(name = "Y_QCC_FDJ_RHX")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.FlbhAndFdjbh.class)
public class QccFdjRhx {
	@Id
	private String flbh;
	@Id
    private Integer fdjbh;

    private String yxwz;

    private String gyxt;

    private String hhbfb;

    public String getYxwz() {
        return yxwz;
    }

    public void setYxwz(String yxwz) {
        this.yxwz = yxwz == null ? null : yxwz.trim();
    }

    public String getGyxt() {
        return gyxt;
    }

    public void setGyxt(String gyxt) {
        this.gyxt = gyxt == null ? null : gyxt.trim();
    }

    public String getHhbfb() {
        return hhbfb;
    }

    public void setHhbfb(String hhbfb) {
        this.hhbfb = hhbfb == null ? null : hhbfb.trim();
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
