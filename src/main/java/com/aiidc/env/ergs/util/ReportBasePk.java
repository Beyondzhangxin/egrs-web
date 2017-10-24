/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.util;

import java.io.Serializable;

/**
 * @author jiabin fan
 *
 */
public class ReportBasePk implements Serializable{
    private String jybgbh;

    private Integer pzbh;

    public String getJybgbh() {
        return jybgbh;
    }

    public void setJybgbh(String jybgbh) {
        this.jybgbh = jybgbh == null ? null : jybgbh.trim();
    }

    public Integer getPzbh() {
        return pzbh;
    }

    public void setPzbh(Integer pzbh) {
        this.pzbh = pzbh;
    }
}
