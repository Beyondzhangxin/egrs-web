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
@Table(name = "Y_QCC_FDJ_WD")
@IdClass(com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.FlbhAndFdjbh.class)
public class QccFdjWd {
	@Id
	private String flbh;
	@Id
    private Integer fdjbh;

    private String ckwd;

    private String ckd;

    private String ckdwd;

    private String zlqzgwd;

    private String pqgzgwd;

    private String rlzdwd;

    private String rlzgwd;

    private String rhyzdwd;

    private String rhyzgwd;

    public String getCkwd() {
        return ckwd;
    }

    public void setCkwd(String ckwd) {
        this.ckwd = ckwd == null ? null : ckwd.trim();
    }

    public String getCkd() {
        return ckd;
    }

    public void setCkd(String ckd) {
        this.ckd = ckd == null ? null : ckd.trim();
    }

    public String getCkdwd() {
        return ckdwd;
    }

    public void setCkdwd(String ckdwd) {
        this.ckdwd = ckdwd == null ? null : ckdwd.trim();
    }

    public String getZlqzgwd() {
        return zlqzgwd;
    }

    public void setZlqzgwd(String zlqzgwd) {
        this.zlqzgwd = zlqzgwd == null ? null : zlqzgwd.trim();
    }

    public String getPqgzgwd() {
        return pqgzgwd;
    }

    public void setPqgzgwd(String pqgzgwd) {
        this.pqgzgwd = pqgzgwd == null ? null : pqgzgwd.trim();
    }

    public String getRlzdwd() {
        return rlzdwd;
    }

    public void setRlzdwd(String rlzdwd) {
        this.rlzdwd = rlzdwd == null ? null : rlzdwd.trim();
    }

    public String getRlzgwd() {
        return rlzgwd;
    }

    public void setRlzgwd(String rlzgwd) {
        this.rlzgwd = rlzgwd == null ? null : rlzgwd.trim();
    }

    public String getRhyzdwd() {
        return rhyzdwd;
    }

    public void setRhyzdwd(String rhyzdwd) {
        this.rhyzdwd = rhyzdwd == null ? null : rhyzdwd.trim();
    }

    public String getRhyzgwd() {
        return rhyzgwd;
    }

    public void setRhyzgwd(String rhyzgwd) {
        this.rhyzgwd = rhyzgwd == null ? null : rhyzgwd.trim();
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
    

}
