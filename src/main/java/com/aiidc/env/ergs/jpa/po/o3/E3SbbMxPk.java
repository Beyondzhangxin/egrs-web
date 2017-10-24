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

public class E3SbbMxPk implements Serializable {
	    
    private String sbbh;

    private String jybgbh;

    private String pzbh;

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh == null ? null : sbbh.trim();
    }

    public String getJybgbh() {
        return jybgbh;
    }

    public void setJybgbh(String jybgbh) {
        this.jybgbh = jybgbh == null ? null : jybgbh.trim();
    }

    public String getPzbh() {
        return pzbh;
    }

    public void setPzbh(String pzbh) {
        this.pzbh = pzbh == null ? null : pzbh.trim();
    }
}
