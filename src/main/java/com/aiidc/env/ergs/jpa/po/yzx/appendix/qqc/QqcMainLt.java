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
 *	轻型汽油车轮胎
 */
@Entity
@Table(name = "Y_QQC_MAIN_LT")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainLtPk.class)
public class QqcMainLt {
	@Id
	private String flbh;
	@Id
    private Integer bh;

	private String ltxh;

    private String ltyl;

    private String cz;

    private String ltscc;

    private String xs;

    private String ccbj;

    private String zdlxfh;

    private String zdllzb;

    private String ccpc;

    private String gdsxx;

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
    
    public String getLtxh() {
        return ltxh;
    }

    public void setLtxh(String ltxh) {
        this.ltxh = ltxh == null ? null : ltxh.trim();
    }

    public String getLtyl() {
        return ltyl;
    }

    public void setLtyl(String ltyl) {
        this.ltyl = ltyl == null ? null : ltyl.trim();
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz == null ? null : cz.trim();
    }

    public String getLtscc() {
        return ltscc;
    }

    public void setLtscc(String ltscc) {
        this.ltscc = ltscc == null ? null : ltscc.trim();
    }

    public String getXs() {
        return xs;
    }

    public void setXs(String xs) {
        this.xs = xs == null ? null : xs.trim();
    }

    public String getCcbj() {
        return ccbj;
    }

    public void setCcbj(String ccbj) {
        this.ccbj = ccbj == null ? null : ccbj.trim();
    }

    public String getZdlxfh() {
        return zdlxfh;
    }

    public void setZdlxfh(String zdlxfh) {
        this.zdlxfh = zdlxfh == null ? null : zdlxfh.trim();
    }

    public String getZdllzb() {
        return zdllzb;
    }

    public void setZdllzb(String zdllzb) {
        this.zdllzb = zdllzb == null ? null : zdllzb.trim();
    }

    public String getCcpc() {
        return ccpc;
    }

    public void setCcpc(String ccpc) {
        this.ccpc = ccpc == null ? null : ccpc.trim();
    }

    public String getGdsxx() {
        return gdsxx;
    }

    public void setGdsxx(String gdsxx) {
        this.gdsxx = gdsxx == null ? null : gdsxx.trim();
    }
}
