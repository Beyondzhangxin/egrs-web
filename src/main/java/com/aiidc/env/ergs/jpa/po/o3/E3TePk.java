/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author jiabin fan
 * 复合主键
 */
@Embeddable

public class E3TePk implements Serializable {
	    
    private String jybgbh;

    private Integer bh;

    public String getJybgbh() {
        return jybgbh;
    }

    public void setJybgbh(String jybgbh) {
        this.jybgbh = jybgbh == null ? null : jybgbh.trim();
    }

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }
}
