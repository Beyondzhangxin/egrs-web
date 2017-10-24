/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QQC_FDJ_CGQ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjCgq {
	private String cgqxh;

    private String cgqscc;

    private String cgqazwz;

    private String cgqkzfw;

    private String ljhmsb;
    @Id
    private String flbh;
    @Id    
    private Integer fdjbh;
    @Id
    private Integer bh;

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

    public String getCgqxh() {
        return cgqxh;
    }

    public void setCgqxh(String cgqxh) {
        this.cgqxh = cgqxh == null ? null : cgqxh.trim();
    }

    public String getCgqscc() {
        return cgqscc;
    }

    public void setCgqscc(String cgqscc) {
        this.cgqscc = cgqscc == null ? null : cgqscc.trim();
    }

    public String getCgqazwz() {
        return cgqazwz;
    }

    public void setCgqazwz(String cgqazwz) {
        this.cgqazwz = cgqazwz == null ? null : cgqazwz.trim();
    }

    public String getCgqkzfw() {
        return cgqkzfw;
    }

    public void setCgqkzfw(String cgqkzfw) {
        this.cgqkzfw = cgqkzfw == null ? null : cgqkzfw.trim();
    }

    public String getLjhmsb() {
        return ljhmsb;
    }

    public void setLjhmsb(String ljhmsb) {
        this.ljhmsb = ljhmsb == null ? null : ljhmsb.trim();
    }
}
