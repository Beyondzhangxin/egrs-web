/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QQC_FDJ_ZHQS")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjZhqs {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;

    private String wz1;

    private String zhqbh1;

    private String zhqxh1;

    private String zhqscc1;

    private String wz2;

    private BigDecimal zhqbh2;

    private String zhqxh2;

    private String zhqscc2;

    private String wz3;

    private BigDecimal zhqbh3;

    private String zhqxh3;

    private String zhqscc3;

    private String wz4;

    private BigDecimal zhqbh4;

    private String zhqxh4;

    private String zhqscc4;

    private String wz5;

    private BigDecimal zhqbh5;

    private String zhqxh5;

    private String zhqscc5;

    private String wz6;

    private BigDecimal zhqbh6;

    private String zhqxh6;

    private String zhqscc6;

    public String getWz1() {
        return wz1;
    }

    public void setWz1(String wz1) {
        this.wz1 = wz1 == null ? null : wz1.trim();
    }

    public String getZhqbh1() {
        return zhqbh1;
    }

    public void setZhqbh1(String zhqbh1) {
        this.zhqbh1 = zhqbh1 == null ? null : zhqbh1.trim();
    }

    public String getZhqxh1() {
        return zhqxh1;
    }

    public void setZhqxh1(String zhqxh1) {
        this.zhqxh1 = zhqxh1 == null ? null : zhqxh1.trim();
    }

    public String getZhqscc1() {
        return zhqscc1;
    }

    public void setZhqscc1(String zhqscc1) {
        this.zhqscc1 = zhqscc1 == null ? null : zhqscc1.trim();
    }

    public String getWz2() {
        return wz2;
    }

    public void setWz2(String wz2) {
        this.wz2 = wz2 == null ? null : wz2.trim();
    }

    public BigDecimal getZhqbh2() {
        return zhqbh2;
    }

    public void setZhqbh2(BigDecimal zhqbh2) {
        this.zhqbh2 = zhqbh2;
    }

    public String getZhqxh2() {
        return zhqxh2;
    }

    public void setZhqxh2(String zhqxh2) {
        this.zhqxh2 = zhqxh2 == null ? null : zhqxh2.trim();
    }

    public String getZhqscc2() {
        return zhqscc2;
    }

    public void setZhqscc2(String zhqscc2) {
        this.zhqscc2 = zhqscc2 == null ? null : zhqscc2.trim();
    }

    public String getWz3() {
        return wz3;
    }

    public void setWz3(String wz3) {
        this.wz3 = wz3 == null ? null : wz3.trim();
    }

    public BigDecimal getZhqbh3() {
        return zhqbh3;
    }

    public void setZhqbh3(BigDecimal zhqbh3) {
        this.zhqbh3 = zhqbh3;
    }

    public String getZhqxh3() {
        return zhqxh3;
    }

    public void setZhqxh3(String zhqxh3) {
        this.zhqxh3 = zhqxh3 == null ? null : zhqxh3.trim();
    }

    public String getZhqscc3() {
        return zhqscc3;
    }

    public void setZhqscc3(String zhqscc3) {
        this.zhqscc3 = zhqscc3 == null ? null : zhqscc3.trim();
    }

    public String getWz4() {
        return wz4;
    }

    public void setWz4(String wz4) {
        this.wz4 = wz4 == null ? null : wz4.trim();
    }

    public BigDecimal getZhqbh4() {
        return zhqbh4;
    }

    public void setZhqbh4(BigDecimal zhqbh4) {
        this.zhqbh4 = zhqbh4;
    }

    public String getZhqxh4() {
        return zhqxh4;
    }

    public void setZhqxh4(String zhqxh4) {
        this.zhqxh4 = zhqxh4 == null ? null : zhqxh4.trim();
    }

    public String getZhqscc4() {
        return zhqscc4;
    }

    public void setZhqscc4(String zhqscc4) {
        this.zhqscc4 = zhqscc4 == null ? null : zhqscc4.trim();
    }

    public String getWz5() {
        return wz5;
    }

    public void setWz5(String wz5) {
        this.wz5 = wz5 == null ? null : wz5.trim();
    }

    public BigDecimal getZhqbh5() {
        return zhqbh5;
    }

    public void setZhqbh5(BigDecimal zhqbh5) {
        this.zhqbh5 = zhqbh5;
    }

    public String getZhqxh5() {
        return zhqxh5;
    }

    public void setZhqxh5(String zhqxh5) {
        this.zhqxh5 = zhqxh5 == null ? null : zhqxh5.trim();
    }

    public String getZhqscc5() {
        return zhqscc5;
    }

    public void setZhqscc5(String zhqscc5) {
        this.zhqscc5 = zhqscc5 == null ? null : zhqscc5.trim();
    }

    public String getWz6() {
        return wz6;
    }

    public void setWz6(String wz6) {
        this.wz6 = wz6 == null ? null : wz6.trim();
    }

    public BigDecimal getZhqbh6() {
        return zhqbh6;
    }

    public void setZhqbh6(BigDecimal zhqbh6) {
        this.zhqbh6 = zhqbh6;
    }

    public String getZhqxh6() {
        return zhqxh6;
    }

    public void setZhqxh6(String zhqxh6) {
        this.zhqxh6 = zhqxh6 == null ? null : zhqxh6.trim();
    }

    public String getZhqscc6() {
        return zhqscc6;
    }

    public void setZhqscc6(String zhqscc6) {
        this.zhqscc6 = zhqscc6 == null ? null : zhqscc6.trim();
    }
 
	
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
	
	
	
}
