/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3.qqcMainReport;

import java.io.Serializable;

/**
 * @author jiabin fan
 *
 */
public class QqcMainStcPk implements Serializable{
    private String jybgbh;

    private Integer bh;

    public String getJybgbh() {
        return jybgbh;
    }

    public void setJybgbh(String jybgbh) {
        this.jybgbh = jybgbh == null ? null : jybgbh.trim();
    }

    public Integer getbh() {
        return bh;
    }

    public void setbh(Integer bh) {
        this.bh = bh;
    }
}
