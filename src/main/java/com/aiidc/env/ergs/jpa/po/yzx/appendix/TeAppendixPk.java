/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author jiabin fan
 *	轻型汽油车悬挂系联合主键
 */
@Embeddable
public class TeAppendixPk implements Serializable {
	private String flbh;

    private Integer bh;

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
}
