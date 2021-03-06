/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 * 轻型汽油车车体
 */
@Entity
@Table(name = "Y_QQC_MAIN_CT")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCdxPk.class)
public class QqcMainCt {
	@Id
	private String flbh;
	@Id
    private Integer bh;

	private String zws;

    private String xs;
    
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

	public String getZws() {
        return zws;
    }

    public void setZws(String zws) {
        this.zws = zws == null ? null : zws.trim();
    }

    public String getXs() {
        return xs;
    }

    public void setXs(String xs) {
        this.xs = xs == null ? null : xs.trim();
    }
}
