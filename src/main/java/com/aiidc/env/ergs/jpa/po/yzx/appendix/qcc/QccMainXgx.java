/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *	轻型汽油车悬挂系
 */
@Entity
@Table(name="Y_QCC_MAIN_XGX")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.FlbhAndBh.class)
public class QccMainXgx {
	@Id
	private String flbh;
	@Id
    private Integer bh;
	
	private String xgxss;

    private String xgxscc;

    public String getXgxss() {
        return xgxss;
    }

    public void setXgxss(String xgxss) {
        this.xgxss = xgxss == null ? null : xgxss.trim();
    }

    public String getXgxscc() {
        return xgxscc;
    }

    public void setXgxscc(String xgxscc) {
        this.xgxscc = xgxscc == null ? null : xgxscc.trim();
    }

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
