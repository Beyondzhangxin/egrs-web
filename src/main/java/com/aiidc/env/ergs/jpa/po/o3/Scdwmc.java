/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author jiabin fan
 * 汽车生产厂
 */
@Entity
@Table(name = "T_SJDW_SCQYMC")
public class Scdwmc {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
	@SequenceGenerator(name = "id", sequenceName = "id", allocationSize = 1)
	private Long id;

    private String manufid;

    private String manuf;

    private String scdwid;

    private String scdwmc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufid() {
        return manufid;
    }

    public void setManufid(String manufid) {
        this.manufid = manufid == null ? null : manufid.trim();
    }

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf == null ? null : manuf.trim();
    }

    public String getScdwid() {
        return scdwid;
    }

    public void setScdwid(String scdwid) {
        this.scdwid = scdwid == null ? null : scdwid.trim();
    }

    public String getScdwmc() {
        return scdwmc;
    }

    public void setScdwmc(String scdwmc) {
        this.scdwmc = scdwmc == null ? null : scdwmc.trim();
    } 
}
