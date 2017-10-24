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
 * 轻型汽油车
 */
@Entity
@Table(name = "Y_QQC_FDJ_DCZHQ")
@IdClass(com.aiidc.env.ergs.util.BasePk.class)
public class QqcFdjDczhq {
    @Id
	private String flbh;
    @Id
    private Integer fdjbh;
    @Id
    private Integer bh;

    private String dcxh;

    private String dcscc;

    private String dcedgl;

    private String dcjc;

    private String dcdxsx;

    private String dcdyfw;

    public String getDcxh() {
        return dcxh;
    }

    public void setDcxh(String dcxh) {
        this.dcxh = dcxh == null ? null : dcxh.trim();
    }

    public String getDcscc() {
        return dcscc;
    }

    public void setDcscc(String dcscc) {
        this.dcscc = dcscc == null ? null : dcscc.trim();
    }

    public String getDcedgl() {
        return dcedgl;
    }

    public void setDcedgl(String dcedgl) {
        this.dcedgl = dcedgl == null ? null : dcedgl.trim();
    }

    public String getDcjc() {
        return dcjc;
    }

    public void setDcjc(String dcjc) {
        this.dcjc = dcjc == null ? null : dcjc.trim();
    }

    public String getDcdxsx() {
        return dcdxsx;
    }

    public void setDcdxsx(String dcdxsx) {
        this.dcdxsx = dcdxsx == null ? null : dcdxsx.trim();
    }

    public String getDcdyfw() {
        return dcdyfw;
    }

    public void setDcdyfw(String dcdyfw) {
        this.dcdyfw = dcdyfw == null ? null : dcdyfw.trim();
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
