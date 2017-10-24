/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author jiabin fan
 *
 */
@Embeddable
public class NjAppendixPk implements Serializable {
	 private String flbh;

	    private Integer bh;

	    private Integer njbh;

	    public String getFlbh() {
	        return flbh;
	    }

	    public void setFlbh(String flbh) {
	        this.flbh = flbh == null ? null : flbh.trim();
	    }

	    public Integer getBh() {
	        return bh;
	    }

	    public void setBh(Integer bh) {
	        this.bh = bh;
	    }

	    public Integer getNjbh() {
	        return njbh;
	    }

	    public void setNjbh(Integer njbh) {
	        this.njbh = njbh;
	    }
}
