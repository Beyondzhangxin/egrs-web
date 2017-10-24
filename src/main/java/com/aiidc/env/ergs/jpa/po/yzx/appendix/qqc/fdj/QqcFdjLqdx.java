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
@Table(name = "Y_QQC_FDJ_LQDXT")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPk.class)
public class QqcFdjLqdx {
	@Id
	private String flbh;
	@Id
    private Integer fdjbh;

    private String lqdgzyl;

    private String czsd;

    public String getLqdgzyl() {
        return lqdgzyl;
    }

    public void setLqdgzyl(String lqdgzyl) {
        this.lqdgzyl = lqdgzyl == null ? null : lqdgzyl.trim();
    }

    public String getCzsd() {
        return czsd;
    }

    public void setCzsd(String czsd) {
        this.czsd = czsd == null ? null : czsd.trim();
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
