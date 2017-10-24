/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;

import java.io.Serializable;

/**
 * @author jiabin fan
 *
 */
public class QqcFdjConfigPk implements Serializable{
	private String flbh;

    private Integer fdjbh;

    private Integer bh;

    private String pzlb;

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

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public String getPzlb() {
        return pzlb;
    }

    public void setPzlb(String pzlb) {
        this.pzlb = pzlb == null ? null : pzlb.trim();
    }
}
