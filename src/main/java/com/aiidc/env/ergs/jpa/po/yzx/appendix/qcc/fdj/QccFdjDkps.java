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
@Table(name = "Y_QCC_FDJ_DKPS")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QccFdjDkps {
    @Id
    private String flbh;
    @Id    
    private Integer fdjbh;
    @Id
    private Integer bh;
    
    private String xh;

    private String scc;

    private String bbh;

    private String llcgqxs;

    private String llcgqcp;

    private String rltjqxs;

    private String rltjqcp;

    private String wdcgqxs;

    private String wdcgqcp;

    private String ylcgqxs;

    private String ylcgqcp;

    private String swcgqxs;

    private String swcgqcp;

    private String jlftxs;

    private String jlftcp;

    private String rlfpqxs;

    private String rlfpqcp;

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

    public String getBbh() {
        return bbh;
    }

    public void setBbh(String bbh) {
        this.bbh = bbh == null ? null : bbh.trim();
    }

    public String getLlcgqxs() {
        return llcgqxs;
    }

    public void setLlcgqxs(String llcgqxs) {
        this.llcgqxs = llcgqxs == null ? null : llcgqxs.trim();
    }

    public String getLlcgqcp() {
        return llcgqcp;
    }

    public void setLlcgqcp(String llcgqcp) {
        this.llcgqcp = llcgqcp == null ? null : llcgqcp.trim();
    }

    public String getRltjqxs() {
        return rltjqxs;
    }

    public void setRltjqxs(String rltjqxs) {
        this.rltjqxs = rltjqxs == null ? null : rltjqxs.trim();
    }

    public String getRltjqcp() {
        return rltjqcp;
    }

    public void setRltjqcp(String rltjqcp) {
        this.rltjqcp = rltjqcp == null ? null : rltjqcp.trim();
    }

    public String getWdcgqxs() {
        return wdcgqxs;
    }

    public void setWdcgqxs(String wdcgqxs) {
        this.wdcgqxs = wdcgqxs == null ? null : wdcgqxs.trim();
    }

    public String getWdcgqcp() {
        return wdcgqcp;
    }

    public void setWdcgqcp(String wdcgqcp) {
        this.wdcgqcp = wdcgqcp == null ? null : wdcgqcp.trim();
    }

    public String getYlcgqxs() {
        return ylcgqxs;
    }

    public void setYlcgqxs(String ylcgqxs) {
        this.ylcgqxs = ylcgqxs == null ? null : ylcgqxs.trim();
    }

    public String getYlcgqcp() {
        return ylcgqcp;
    }

    public void setYlcgqcp(String ylcgqcp) {
        this.ylcgqcp = ylcgqcp == null ? null : ylcgqcp.trim();
    }

    public String getSwcgqxs() {
        return swcgqxs;
    }

    public void setSwcgqxs(String swcgqxs) {
        this.swcgqxs = swcgqxs == null ? null : swcgqxs.trim();
    }

    public String getSwcgqcp() {
        return swcgqcp;
    }

    public void setSwcgqcp(String swcgqcp) {
        this.swcgqcp = swcgqcp == null ? null : swcgqcp.trim();
    }

    public String getJlftxs() {
        return jlftxs;
    }

    public void setJlftxs(String jlftxs) {
        this.jlftxs = jlftxs == null ? null : jlftxs.trim();
    }

    public String getJlftcp() {
        return jlftcp;
    }

    public void setJlftcp(String jlftcp) {
        this.jlftcp = jlftcp == null ? null : jlftcp.trim();
    }

    public String getRlfpqxs() {
        return rlfpqxs;
    }

    public void setRlfpqxs(String rlfpqxs) {
        this.rlfpqxs = rlfpqxs == null ? null : rlfpqxs.trim();
    }

    public String getRlfpqcp() {
        return rlfpqcp;
    }

    public void setRlfpqcp(String rlfpqcp) {
        this.rlfpqcp = rlfpqcp == null ? null : rlfpqcp.trim();
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
