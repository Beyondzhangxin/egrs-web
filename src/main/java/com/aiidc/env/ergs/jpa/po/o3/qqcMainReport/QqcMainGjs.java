/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3.qqcMainReport;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name="E3_QQC_MAIN_GJS")
public class QqcMainGjs implements Serializable{
	@Id
    private String jybgbh;

    private String clxh;

    private String clmc;

    private String fdjxh;

    private String fdjscc;

    private String njclxh;

    private String njvin;

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

    public String getFdjxh() {
        return fdjxh;
    }

    public void setFdjxh(String fdjxh) {
        this.fdjxh = fdjxh == null ? null : fdjxh.trim();
    }

    public String getFdjscc() {
        return fdjscc;
    }

    public void setFdjscc(String fdjscc) {
        this.fdjscc = fdjscc == null ? null : fdjscc.trim();
    }

    public String getNjclxh() {
        return njclxh;
    }

    public void setNjclxh(String njclxh) {
        this.njclxh = njclxh == null ? null : njclxh.trim();
    }

    public String getNjvin() {
        return njvin;
    }

    public void setNjvin(String njvin) {
        this.njvin = njvin == null ? null : njvin.trim();
    }
}
