/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author jiabin fan
 * qcc发动机复合主键
 */
@Embeddable

public class FlbhAndFdjbh implements Serializable {
	    
	private String flbh;

    private Integer fdjbh;

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
