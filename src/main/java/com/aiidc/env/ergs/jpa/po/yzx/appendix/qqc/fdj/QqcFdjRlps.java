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
@Table(name = "Y_QQC_FDJ_RLPS")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjRlps {
	@Id
	private String flbh;
	@Id
	private Integer fdjbh;
	@Id
	private Integer bh;
	
    private String dkdyxh;

    private String dkdyscc;

    private String xtsm;

    private String kzdyxs;

    private String kqllcgqxs;

    private String rlfpqxs;

    private String yltjqxs;

    private String jlftxs;

    private String swcgqxs;

    private String kqwdcgqxs;

    private String kqcgqcp;

    private String kqcgqxh;

    private String kqyl;

    private String rltjq;

    private String wkgxs;

    private String dstzldxs;

    private String wdkgxs;

    private String pyzs;

    private String dkdybbh;

    private String kqllcgqscc;

    private String wkgscc;

    private String jlftscc;

    private String swcgqscc;

    private String kqwdcgqscc;

    private String yltjqscc;

    public String getDkdyxh() {
        return dkdyxh;
    }

    public void setDkdyxh(String dkdyxh) {
        this.dkdyxh = dkdyxh == null ? null : dkdyxh.trim();
    }

    public String getDkdyscc() {
        return dkdyscc;
    }

    public void setDkdyscc(String dkdyscc) {
        this.dkdyscc = dkdyscc == null ? null : dkdyscc.trim();
    }

    public String getXtsm() {
        return xtsm;
    }

    public void setXtsm(String xtsm) {
        this.xtsm = xtsm == null ? null : xtsm.trim();
    }

    public String getKzdyxs() {
        return kzdyxs;
    }

    public void setKzdyxs(String kzdyxs) {
        this.kzdyxs = kzdyxs == null ? null : kzdyxs.trim();
    }

    public String getKqllcgqxs() {
        return kqllcgqxs;
    }

    public void setKqllcgqxs(String kqllcgqxs) {
        this.kqllcgqxs = kqllcgqxs == null ? null : kqllcgqxs.trim();
    }

    public String getRlfpqxs() {
        return rlfpqxs;
    }

    public void setRlfpqxs(String rlfpqxs) {
        this.rlfpqxs = rlfpqxs == null ? null : rlfpqxs.trim();
    }

    public String getYltjqxs() {
        return yltjqxs;
    }

    public void setYltjqxs(String yltjqxs) {
        this.yltjqxs = yltjqxs == null ? null : yltjqxs.trim();
    }

    public String getJlftxs() {
        return jlftxs;
    }

    public void setJlftxs(String jlftxs) {
        this.jlftxs = jlftxs == null ? null : jlftxs.trim();
    }

    public String getSwcgqxs() {
        return swcgqxs;
    }

    public void setSwcgqxs(String swcgqxs) {
        this.swcgqxs = swcgqxs == null ? null : swcgqxs.trim();
    }

    public String getKqwdcgqxs() {
        return kqwdcgqxs;
    }

    public void setKqwdcgqxs(String kqwdcgqxs) {
        this.kqwdcgqxs = kqwdcgqxs == null ? null : kqwdcgqxs.trim();
    }

    public String getKqcgqcp() {
        return kqcgqcp;
    }

    public void setKqcgqcp(String kqcgqcp) {
        this.kqcgqcp = kqcgqcp == null ? null : kqcgqcp.trim();
    }

    public String getKqcgqxh() {
        return kqcgqxh;
    }

    public void setKqcgqxh(String kqcgqxh) {
        this.kqcgqxh = kqcgqxh == null ? null : kqcgqxh.trim();
    }

    public String getKqyl() {
        return kqyl;
    }

    public void setKqyl(String kqyl) {
        this.kqyl = kqyl == null ? null : kqyl.trim();
    }

    public String getRltjq() {
        return rltjq;
    }

    public void setRltjq(String rltjq) {
        this.rltjq = rltjq == null ? null : rltjq.trim();
    }

    public String getWkgxs() {
        return wkgxs;
    }

    public void setWkgxs(String wkgxs) {
        this.wkgxs = wkgxs == null ? null : wkgxs.trim();
    }

    public String getDstzldxs() {
        return dstzldxs;
    }

    public void setDstzldxs(String dstzldxs) {
        this.dstzldxs = dstzldxs == null ? null : dstzldxs.trim();
    }

    public String getWdkgxs() {
        return wdkgxs;
    }

    public void setWdkgxs(String wdkgxs) {
        this.wdkgxs = wdkgxs == null ? null : wdkgxs.trim();
    }

    public String getPyzs() {
        return pyzs;
    }

    public void setPyzs(String pyzs) {
        this.pyzs = pyzs == null ? null : pyzs.trim();
    }

    public String getDkdybbh() {
        return dkdybbh;
    }

    public void setDkdybbh(String dkdybbh) {
        this.dkdybbh = dkdybbh == null ? null : dkdybbh.trim();
    }

    public String getKqllcgqscc() {
        return kqllcgqscc;
    }

    public void setKqllcgqscc(String kqllcgqscc) {
        this.kqllcgqscc = kqllcgqscc == null ? null : kqllcgqscc.trim();
    }

    public String getWkgscc() {
        return wkgscc;
    }

    public void setWkgscc(String wkgscc) {
        this.wkgscc = wkgscc == null ? null : wkgscc.trim();
    }

    public String getJlftscc() {
        return jlftscc;
    }

    public void setJlftscc(String jlftscc) {
        this.jlftscc = jlftscc == null ? null : jlftscc.trim();
    }

    public String getSwcgqscc() {
        return swcgqscc;
    }

    public void setSwcgqscc(String swcgqscc) {
        this.swcgqscc = swcgqscc == null ? null : swcgqscc.trim();
    }

    public String getKqwdcgqscc() {
        return kqwdcgqscc;
    }

    public void setKqwdcgqscc(String kqwdcgqscc) {
        this.kqwdcgqscc = kqwdcgqscc == null ? null : kqwdcgqscc.trim();
    }

    public String getYltjqscc() {
        return yltjqscc;
    }

    public void setYltjqscc(String yltjqscc) {
        this.yltjqscc = yltjqscc == null ? null : yltjqscc.trim();
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
