/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.aiidc.env.ergs.common.file.FileTarget;

/**
 * @author jiabin fan
 * 轻型汽油车
 */
@Entity
@Table(name = "Y_QQC_FDJ_DHZZ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjDhzz {
    private String dhzzcp;

    private String dhzzxh;

    private String dhgzyl;
    @FileTarget
    private String dhtqqx;

    private String dhzs;

    private String cdjx;

    private String bhjds;
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

    public String getDhzzcp() {
        return dhzzcp;
    }

    public void setDhzzcp(String dhzzcp) {
        this.dhzzcp = dhzzcp == null ? null : dhzzcp.trim();
    }

    public String getDhzzxh() {
        return dhzzxh;
    }

    public void setDhzzxh(String dhzzxh) {
        this.dhzzxh = dhzzxh == null ? null : dhzzxh.trim();
    }

    public String getDhgzyl() {
        return dhgzyl;
    }

    public void setDhgzyl(String dhgzyl) {
        this.dhgzyl = dhgzyl == null ? null : dhgzyl.trim();
    }

    public String getDhtqqx() {
        return dhtqqx;
    }

    public void setDhtqqx(String dhtqqx) {
        this.dhtqqx = dhtqqx == null ? null : dhtqqx.trim();
    }

    public String getDhzs() {
        return dhzs;
    }

    public void setDhzs(String dhzs) {
        this.dhzs = dhzs == null ? null : dhzs.trim();
    }

    public String getCdjx() {
        return cdjx;
    }

    public void setCdjx(String cdjx) {
        this.cdjx = cdjx == null ? null : cdjx.trim();
    }

    public String getBhjds() {
        return bhjds;
    }

    public void setBhjds(String bhjds) {
        this.bhjds = bhjds == null ? null : bhjds.trim();
    }
}
