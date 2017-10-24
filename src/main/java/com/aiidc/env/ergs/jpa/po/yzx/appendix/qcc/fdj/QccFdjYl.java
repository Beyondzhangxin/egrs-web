/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_QCC_FDJ_YL")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QccFdjYl {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;

    private String xh;

    private String scc;

    private String tx;

    private String cdb;

    private String sm;

    private String lqxz;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx == null ? null : tx.trim();
    }

    public String getCdb() {
        return cdb;
    }

    public void setCdb(String cdb) {
        this.cdb = cdb == null ? null : cdb.trim();
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm == null ? null : sm.trim();
    }

    public String getLqxz() {
        return lqxz;
    }

    public void setLqxz(String lqxz) {
        this.lqxz = lqxz == null ? null : lqxz.trim();
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
