/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.o3;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author jiabin fan
 *
 */
@Entity
@IdClass(com.aiidc.env.ergs.jpa.po.o3.E3SbbConfigQqcPk.class)
@Table(name="E3_SBB_CONFIG_QQC")
public class E3SbbConfigQqc implements Serializable {
    @Id
    private String sbbh;
    @Id
    private Integer bh;

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh == null ? null : sbbh.trim();
    }

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }
    private String zhqxh;

    private String zhqscc;

    private String tgxh;

    private String tgscc;

    private String cgqxh;

    private String cgqscc;

    private String qzxxh;

    private String qzxscc;

    private String egrxh;

    private String egrscc;

    private String obdxh;

    private String obdscc;

    private String ecuxh;

    private String ecuscc;

    private String bsqxs;

    private String dws;

    private String xsqxh;

    private String xsqscc;

    private String pqjybgbh;

    private Integer pqpzid;

    private String obdjybgbh;

    private Integer obdpzid;

    private String sdsjybgbh;

    private Integer sdspzid;

    private String yhjybgbh;

    private Integer yhpzid;

    private String njjybgbh;

    private Integer njpzid;

    private String qzxjybgbh;

    private Integer qzxpzid;

    private String ryjybgbh;

    private Integer rypzid;

    private String zsjybgbh;

    private Integer zspzid;

    private String zyqxh;

    private String zyqscc;

    private String zlqxs;

    private String ztscc;

    private String tcscc;

    private String fzscc;

    private String iupr;

    private String noxjc;

    private String gjsjybgbh;

    private Integer gjspzid;

    private String sbcjybgbh;

    private Integer sbcpzid;

    private String dwjybgbh;

    private Integer dwpzid;

    private String cwjybgbh;

    private Integer cwpzid;

    private String cnzzxh;

    private String cnzzscc;

    private String dcrl;

    private String djxh;

    private String djscc;

    private String djzyyt;

    private String djazsl;

    public String getZhqxh() {
        return zhqxh;
    }

    public void setZhqxh(String zhqxh) {
        this.zhqxh = zhqxh == null ? null : zhqxh.trim();
    }

    public String getZhqscc() {
        return zhqscc;
    }

    public void setZhqscc(String zhqscc) {
        this.zhqscc = zhqscc == null ? null : zhqscc.trim();
    }

    public String getTgxh() {
        return tgxh;
    }

    public void setTgxh(String tgxh) {
        this.tgxh = tgxh == null ? null : tgxh.trim();
    }

    public String getTgscc() {
        return tgscc;
    }

    public void setTgscc(String tgscc) {
        this.tgscc = tgscc == null ? null : tgscc.trim();
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

    public String getQzxxh() {
        return qzxxh;
    }

    public void setQzxxh(String qzxxh) {
        this.qzxxh = qzxxh == null ? null : qzxxh.trim();
    }

    public String getQzxscc() {
        return qzxscc;
    }

    public void setQzxscc(String qzxscc) {
        this.qzxscc = qzxscc == null ? null : qzxscc.trim();
    }

    public String getEgrxh() {
        return egrxh;
    }

    public void setEgrxh(String egrxh) {
        this.egrxh = egrxh == null ? null : egrxh.trim();
    }

    public String getEgrscc() {
        return egrscc;
    }

    public void setEgrscc(String egrscc) {
        this.egrscc = egrscc == null ? null : egrscc.trim();
    }

    public String getObdxh() {
        return obdxh;
    }

    public void setObdxh(String obdxh) {
        this.obdxh = obdxh == null ? null : obdxh.trim();
    }

    public String getObdscc() {
        return obdscc;
    }

    public void setObdscc(String obdscc) {
        this.obdscc = obdscc == null ? null : obdscc.trim();
    }

    public String getEcuxh() {
        return ecuxh;
    }

    public void setEcuxh(String ecuxh) {
        this.ecuxh = ecuxh == null ? null : ecuxh.trim();
    }

    public String getEcuscc() {
        return ecuscc;
    }

    public void setEcuscc(String ecuscc) {
        this.ecuscc = ecuscc == null ? null : ecuscc.trim();
    }

    public String getBsqxs() {
        return bsqxs;
    }

    public void setBsqxs(String bsqxs) {
        this.bsqxs = bsqxs == null ? null : bsqxs.trim();
    }

    public String getDws() {
        return dws;
    }

    public void setDws(String dws) {
        this.dws = dws == null ? null : dws.trim();
    }

    public String getXsqxh() {
        return xsqxh;
    }

    public void setXsqxh(String xsqxh) {
        this.xsqxh = xsqxh == null ? null : xsqxh.trim();
    }

    public String getXsqscc() {
        return xsqscc;
    }

    public void setXsqscc(String xsqscc) {
        this.xsqscc = xsqscc == null ? null : xsqscc.trim();
    }

    public String getPqjybgbh() {
        return pqjybgbh;
    }

    public void setPqjybgbh(String pqjybgbh) {
        this.pqjybgbh = pqjybgbh == null ? null : pqjybgbh.trim();
    }

    public Integer getPqpzid() {
        return pqpzid;
    }

    public void setPqpzid(Integer pqpzid) {
        this.pqpzid = pqpzid;
    }

    public String getObdjybgbh() {
        return obdjybgbh;
    }

    public void setObdjybgbh(String obdjybgbh) {
        this.obdjybgbh = obdjybgbh == null ? null : obdjybgbh.trim();
    }

    public Integer getObdpzid() {
        return obdpzid;
    }

    public void setObdpzid(Integer obdpzid) {
        this.obdpzid = obdpzid;
    }

    public String getSdsjybgbh() {
        return sdsjybgbh;
    }

    public void setSdsjybgbh(String sdsjybgbh) {
        this.sdsjybgbh = sdsjybgbh == null ? null : sdsjybgbh.trim();
    }

    public Integer getSdspzid() {
        return sdspzid;
    }

    public void setSdspzid(Integer sdspzid) {
        this.sdspzid = sdspzid;
    }

    public String getYhjybgbh() {
        return yhjybgbh;
    }

    public void setYhjybgbh(String yhjybgbh) {
        this.yhjybgbh = yhjybgbh == null ? null : yhjybgbh.trim();
    }

    public Integer getYhpzid() {
        return yhpzid;
    }

    public void setYhpzid(Integer yhpzid) {
        this.yhpzid = yhpzid;
    }

    public String getNjjybgbh() {
        return njjybgbh;
    }

    public void setNjjybgbh(String njjybgbh) {
        this.njjybgbh = njjybgbh == null ? null : njjybgbh.trim();
    }

    public Integer getNjpzid() {
        return njpzid;
    }

    public void setNjpzid(Integer njpzid) {
        this.njpzid = njpzid;
    }

    public String getQzxjybgbh() {
        return qzxjybgbh;
    }

    public void setQzxjybgbh(String qzxjybgbh) {
        this.qzxjybgbh = qzxjybgbh == null ? null : qzxjybgbh.trim();
    }

    public Integer getQzxpzid() {
        return qzxpzid;
    }

    public void setQzxpzid(Integer qzxpzid) {
        this.qzxpzid = qzxpzid;
    }

    public String getRyjybgbh() {
        return ryjybgbh;
    }

    public void setRyjybgbh(String ryjybgbh) {
        this.ryjybgbh = ryjybgbh == null ? null : ryjybgbh.trim();
    }

    public Integer getRypzid() {
        return rypzid;
    }

    public void setRypzid(Integer rypzid) {
        this.rypzid = rypzid;
    }

    public String getZsjybgbh() {
        return zsjybgbh;
    }

    public void setZsjybgbh(String zsjybgbh) {
        this.zsjybgbh = zsjybgbh == null ? null : zsjybgbh.trim();
    }

    public Integer getZspzid() {
        return zspzid;
    }

    public void setZspzid(Integer zspzid) {
        this.zspzid = zspzid;
    }

    public String getZyqxh() {
        return zyqxh;
    }

    public void setZyqxh(String zyqxh) {
        this.zyqxh = zyqxh == null ? null : zyqxh.trim();
    }

    public String getZyqscc() {
        return zyqscc;
    }

    public void setZyqscc(String zyqscc) {
        this.zyqscc = zyqscc == null ? null : zyqscc.trim();
    }

    public String getZlqxs() {
        return zlqxs;
    }

    public void setZlqxs(String zlqxs) {
        this.zlqxs = zlqxs == null ? null : zlqxs.trim();
    }

    public String getZtscc() {
        return ztscc;
    }

    public void setZtscc(String ztscc) {
        this.ztscc = ztscc == null ? null : ztscc.trim();
    }

    public String getTcscc() {
        return tcscc;
    }

    public void setTcscc(String tcscc) {
        this.tcscc = tcscc == null ? null : tcscc.trim();
    }

    public String getFzscc() {
        return fzscc;
    }

    public void setFzscc(String fzscc) {
        this.fzscc = fzscc == null ? null : fzscc.trim();
    }

    public String getIupr() {
        return iupr;
    }

    public void setIupr(String iupr) {
        this.iupr = iupr == null ? null : iupr.trim();
    }

    public String getNoxjc() {
        return noxjc;
    }

    public void setNoxjc(String noxjc) {
        this.noxjc = noxjc == null ? null : noxjc.trim();
    }

    public String getGjsjybgbh() {
        return gjsjybgbh;
    }

    public void setGjsjybgbh(String gjsjybgbh) {
        this.gjsjybgbh = gjsjybgbh == null ? null : gjsjybgbh.trim();
    }

    public Integer getGjspzid() {
        return gjspzid;
    }

    public void setGjspzid(Integer gjspzid) {
        this.gjspzid = gjspzid;
    }

    public String getSbcjybgbh() {
        return sbcjybgbh;
    }

    public void setSbcjybgbh(String sbcjybgbh) {
        this.sbcjybgbh = sbcjybgbh == null ? null : sbcjybgbh.trim();
    }

    public Integer getSbcpzid() {
        return sbcpzid;
    }

    public void setSbcpzid(Integer sbcpzid) {
        this.sbcpzid = sbcpzid;
    }

    public String getDwjybgbh() {
        return dwjybgbh;
    }

    public void setDwjybgbh(String dwjybgbh) {
        this.dwjybgbh = dwjybgbh == null ? null : dwjybgbh.trim();
    }

    public Integer getDwpzid() {
        return dwpzid;
    }

    public void setDwpzid(Integer dwpzid) {
        this.dwpzid = dwpzid;
    }

    public String getCwjybgbh() {
        return cwjybgbh;
    }

    public void setCwjybgbh(String cwjybgbh) {
        this.cwjybgbh = cwjybgbh == null ? null : cwjybgbh.trim();
    }

    public Integer getCwpzid() {
        return cwpzid;
    }

    public void setCwpzid(Integer cwpzid) {
        this.cwpzid = cwpzid;
    }

    public String getCnzzxh() {
        return cnzzxh;
    }

    public void setCnzzxh(String cnzzxh) {
        this.cnzzxh = cnzzxh == null ? null : cnzzxh.trim();
    }

    public String getCnzzscc() {
        return cnzzscc;
    }

    public void setCnzzscc(String cnzzscc) {
        this.cnzzscc = cnzzscc == null ? null : cnzzscc.trim();
    }

    public String getDcrl() {
        return dcrl;
    }

    public void setDcrl(String dcrl) {
        this.dcrl = dcrl == null ? null : dcrl.trim();
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh == null ? null : djxh.trim();
    }

    public String getDjscc() {
        return djscc;
    }

    public void setDjscc(String djscc) {
        this.djscc = djscc == null ? null : djscc.trim();
    }

    public String getDjzyyt() {
        return djzyyt;
    }

    public void setDjzyyt(String djzyyt) {
        this.djzyyt = djzyyt == null ? null : djzyyt.trim();
    }

    public String getDjazsl() {
        return djazsl;
    }

    public void setDjazsl(String djazsl) {
        this.djazsl = djazsl == null ? null : djazsl.trim();
    }
}
