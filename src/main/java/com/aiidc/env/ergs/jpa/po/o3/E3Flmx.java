/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name="E3_FLMX")
public class E3Flmx implements Serializable {
    @Id
    private String jybgbh;

    private String clxh;

    private String clmc;

    private String flbh;

    private String fsrq;

    public String getJybgbh() {
        return jybgbh;
    }

    public void setJybgbh(String jybgbh) {
        this.jybgbh = jybgbh == null ? null : jybgbh.trim();
    }

    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh == null ? null : clxh.trim();
    }

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc == null ? null : clmc.trim();
    }

    public String getFlbh() {
        return flbh;
    }

    public void setFlbh(String flbh) {
        this.flbh = flbh == null ? null : flbh.trim();
    }

    public String getFsrq() {
        return fsrq;
    }

    public void setFsrq(String fsrq) {
        this.fsrq = fsrq == null ? null : fsrq.trim();
    }
}
