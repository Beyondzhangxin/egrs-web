/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.plan;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_PLANMX")
public class PlanMX implements Serializable {
		
	private String jhsbh;
	@Id
    private String flbh;

    public String getJhsbh() {
        return jhsbh;
    }

    public void setJhsbh(String jhsbh) {
        this.jhsbh = jhsbh == null ? null : jhsbh.trim();
    }

    public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }
}
