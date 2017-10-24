package com.aiidc.env.ergs.jpa.po.yzx.plan;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Y_PLAN")
public class Plan implements Serializable{
	private static final long serialVersionUID = 1L;
	
    @Id
    /* @GeneratedValue(generator = "idGenerator")
	@GenericGenerator(name = "idGenerator", strategy = "com.aiidc.env.ergs.common.IdGenerator") */
    
//    @GeneratedValue(strategy = GenerationType.AUTO)
	private String jhsbh;
	
    private String nbbh;

    private String manufid;

    private String groupid;

    private String manuf;

    private String cjr;

    private String cjrid;
    @Temporal(TemporalType.DATE)
    private Date cjsj;

    private String cllb;

    private String status;
    @Temporal(TemporalType.DATE)
    private Date edittime ;

    private String xgr;

    private String xgrid;

    private Short version;
    @Temporal(TemporalType.DATE)
    private Date zhfssj;

    private String memo;
    @Temporal(TemporalType.DATE)
    private Date shsj;

    private String spr;

    private String shlog;

    private String xz;

    private String isxz;

    private String flag;

    private String bar;
    @Temporal(TemporalType.DATE)
    private Date basj;

    private String balog;
    /*@OneToMany(cascade={CascadeType.REMOVE},mappedBy="plan",fetch=FetchType.EAGER)
    private List<PlanFiles> planFiless = new ArrayList<PlanFiles>();
    
    
    public List<PlanFiles> getPlanFiless() {
		return planFiless;
	}

	public void setPlanFiless(List<PlanFiles> planFiless) {
		this.planFiless = planFiless;
	}
	*/
	public String getJhsbh() {
        return jhsbh;
    }

    public void setJhsbh(String jhsbh) {
        this.jhsbh = jhsbh == null ? null : jhsbh.trim();
    }

    public String getNbbh() {
        return nbbh;
    }

    public void setNbbh(String nbbh) {
        this.nbbh = nbbh == null ? null : nbbh.trim();
    }

    public String getManufid() {
        return manufid;
    }

    public void setManufid(String manufid) {
        this.manufid = manufid == null ? null : manufid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf == null ? null : manuf.trim();
    }

    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr == null ? null : cjr.trim();
    }

    public String getCjrid() {
        return cjrid;
    }

    public void setCjrid(String cjrid) {
        this.cjrid = cjrid == null ? null : cjrid.trim();
    }
    
    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public String getCllb() {
        return cllb;
    }

    public void setCllb(String cllb) {
        this.cllb = cllb == null ? null : cllb.trim();
    }

    public String getStatus() {
    	return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr == null ? null : xgr.trim();
    }

    public String getXgrid() {
        return xgrid;
    }

    public void setXgrid(String xgrid) {
        this.xgrid = xgrid == null ? null : xgrid.trim();
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }

    public Date getZhfssj() {
        return zhfssj;
    }

    public void setZhfssj(Date zhfssj) {
        this.zhfssj = zhfssj;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getShsj() {
        return shsj;
    }

    public void setShsj(Date shsj) {
        this.shsj = shsj;
    }

    public String getSpr() {
        return spr;
    }

    public void setSpr(String spr) {
        this.spr = spr == null ? null : spr.trim();
    }

    public String getShlog() {
        return shlog;
    }

    public void setShlog(String shlog) {
        this.shlog = shlog == null ? null : shlog.trim();
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz == null ? null : xz.trim();
    }

    public String getIsxz() {
        return isxz;
    }

    public void setIsxz(String isxz) {
        this.isxz = isxz == null ? null : isxz.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar == null ? null : bar.trim();
    }

    public Date getBasj() {
        return basj;
    }

    public void setBasj(Date basj) {
        this.basj = basj;
    }

    public String getBalog() {
        return balog;
    }

    public void setBalog(String balog) {
        this.balog = balog == null ? null : balog.trim();
    }
}
