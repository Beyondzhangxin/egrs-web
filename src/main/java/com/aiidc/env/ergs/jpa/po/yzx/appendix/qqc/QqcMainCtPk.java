/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc;

import java.io.Serializable;

/**
 * @author jiabin fan
 * 轻型汽油车车体主键
 */

public class QqcMainCtPk implements Serializable {
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
