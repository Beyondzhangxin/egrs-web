/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.po.yzx.plan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author jiabin fan
 *
 */
@Entity
@Table(name = "Y_PLAN_FILES")
public class PlanFiles implements Serializable {
	@Id
	private String jhsbh;

    private String gjbz;

    private String hybz;

    private String qybz;

	private String fdjwjh;

    private String fdjtzh;

    private String ecuwjh;

    private String ecutzh;

    private String cgqwjh;

    private String cgqtzh;

    private String pcvwjh;

    private String pcvtzh;

    private String hyqwjh;

    private String hyqtzh;

    private String pybwjh;

    private String pybtzh;

    private String rqhhqwjh;

    private String rqhhqtzh;

    private String rqpsqwjh;

    private String rqpsqtzh;

    private String yltjqwjh;

    private String yltjqtzh;

    private String kqlqqwjh;

    private String kqlqqtzh;

    private String pyqwjh;

    private String pyqtzh;

    private String tgwjh;

    private String tgtzh;

    private String zyqwjh;

    private String zyqtzh;

    private String zlqwjh;

    private String zlqtzh;

    private String egrwjh;

    private String egrtzh;

    private String zhqwjh;

    private String zhqtzh;

    private String klbzqwjh;

    private String klbzqtzh;

    private String obdwjh;

    private String obdtzh;

    private String jqxsqwjh;

    private String jqxsqtzh;

    private String pqxsqwjh;

    private String pqxsqtzh;

    private String gyswjh;

    private String rcjdwjh;

    private String cgcpwjh;

    private String gxwjh;

    private String kzffwjh;

    private String zxjywjh;

    private String dqcjpcwjh;

    private String bhgpwjh;

    private String ryglwjh;

    private String zpyqwjh;

    private String zpkzwjh;

    private String zpdqcjpcwjh;

    private String zpzxjywjh;

    private String zpbhgpwjh;

    private String zpryglwjh;

    private String sbtzwjh;

    private String sbglzdwjh;

    private String lxjywjh;

    private String dqjywjh;

    private String jzcswjh;

    private String gybwjh;

    private String gybtzh;

    private String rhywjh;

    private String rhytzh;

    private String kqpswjh;

    private String kqpstzh;

    private String gyxtwjh;

    private String gyxttzh;

    private String scrwjh;

    private String scrtzh;

    private String noxcgqwjh;

    private String noxcgqtzh;

    private String zfqwjh;

    private String zfqtzh;

    private String hhzzwjh;

    private String hhzztzh;

    private String pszzwjh;

    private String pszztzh;

    private String psqwjh;

    private String psqtzh;

    private String dpxtwjh;

    private String dpxttzh;

    private String eecuwjh;

    private String eecutzh;

    private String rlgjxtwjh;

    private String rlgjxttzh;

    private String pqhclxtwjh;

    private String pqhclxttzh;

    private String qzxwjh;

    private String qzxtzh;

    private String psbwjh;

    private String psbtzh;

    private String doczhqwjh;

    private String doczhqtzh;

    private String poczhqwjh;

    private String poczhqtzh;

    private String yxpc;

    private String rypc;

    private String zspc;

    private String sdpc;

    private String qzpc;

    private String jqgwjh;

    private String jqgtzh;
    
    private String xxjywjh;
    
    private String cwpc;
    
    private String dwpc;
    
    private String jypfpc;
    
    private String obdpc;
    
    private String kqzlpc;
    @Transient
    private List<String> gblist = new ArrayList<String>();
    /*@ManyToOne()
    @JoinColumn(name = "plan_id")
    private Plan plan;
    
    public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}*/

	public List getGblist() {
		return gblist;
	}

	public void setGblist(List gblist) {
		this.gblist = gblist;
	}

	public String getKqzlpc() {
		return kqzlpc;
	}

	public void setKqzlpc(String kqzlpc) {
		this.kqzlpc = kqzlpc;
	}

	public String getObdpc() {
		return obdpc;
	}

	public void setObdpc(String obdpc) {
		this.obdpc = obdpc;
	}

	public String getJypfpc() {
		return jypfpc;
	}

	public void setJypfpc(String jypfpc) {
		this.jypfpc = jypfpc;
	}

	public String getDwpc() {
		return dwpc;
	}

	public void setDwpc(String dwpc) {
		this.dwpc = dwpc;
	}

	public String getCwpc() {
		return cwpc;
	}

	public void setCwpc(String cwpc) {
		this.cwpc = cwpc;
	}

	public String getXxjywjh() {
		return xxjywjh;
	}

	public void setXxjywjh(String xxjywjh) {
		this.xxjywjh = xxjywjh;
	}

	public String getJhsbh() {
        return jhsbh;
    }

    public void setJhsbh(String jhsbh) {
        this.jhsbh = jhsbh == null ? null : jhsbh.trim();
    }

    public String getGjbz() {
    	/*List gjbzss = new ArrayList<String>();
        String[] gjbzs = gjbz.split(",");
        if(null != gjbzs && gjbzs.length > 0){
        	for (String string : gjbzs) {
        		gjbzss.add(string);
        	}
        }
    	return gjbzss;*/
    	return gjbz;
    }

    public void setGjbz(String gjbz) {
        this.gjbz = gjbz == null ? null : gjbz.trim();
    }

    public String getHybz() {
        return hybz;
    }

    public void setHybz(String hybz) {
        this.hybz = hybz == null ? null : hybz.trim();
    }

    public String getQybz() {
        return qybz;
    }

    public void setQybz(String qybz) {
        this.qybz = qybz == null ? null : qybz.trim();
    }

    public String getFdjwjh() {
        return fdjwjh;
    }

    public void setFdjwjh(String fdjwjh) {
        this.fdjwjh = fdjwjh == null ? null : fdjwjh.trim();
    }

    public String getFdjtzh() {
        return fdjtzh;
    }

    public void setFdjtzh(String fdjtzh) {
        this.fdjtzh = fdjtzh == null ? null : fdjtzh.trim();
    }

    public String getEcuwjh() {
        return ecuwjh;
    }

    public void setEcuwjh(String ecuwjh) {
        this.ecuwjh = ecuwjh == null ? null : ecuwjh.trim();
    }

    public String getEcutzh() {
        return ecutzh;
    }

    public void setEcutzh(String ecutzh) {
        this.ecutzh = ecutzh == null ? null : ecutzh.trim();
    }

    public String getCgqwjh() {
        return cgqwjh;
    }

    public void setCgqwjh(String cgqwjh) {
        this.cgqwjh = cgqwjh == null ? null : cgqwjh.trim();
    }

    public String getCgqtzh() {
        return cgqtzh;
    }

    public void setCgqtzh(String cgqtzh) {
        this.cgqtzh = cgqtzh == null ? null : cgqtzh.trim();
    }

    public String getPcvwjh() {
        return pcvwjh;
    }

    public void setPcvwjh(String pcvwjh) {
        this.pcvwjh = pcvwjh == null ? null : pcvwjh.trim();
    }

    public String getPcvtzh() {
        return pcvtzh;
    }

    public void setPcvtzh(String pcvtzh) {
        this.pcvtzh = pcvtzh == null ? null : pcvtzh.trim();
    }

    public String getHyqwjh() {
        return hyqwjh;
    }

    public void setHyqwjh(String hyqwjh) {
        this.hyqwjh = hyqwjh == null ? null : hyqwjh.trim();
    }

    public String getHyqtzh() {
        return hyqtzh;
    }

    public void setHyqtzh(String hyqtzh) {
        this.hyqtzh = hyqtzh == null ? null : hyqtzh.trim();
    }

    public String getPybwjh() {
        return pybwjh;
    }

    public void setPybwjh(String pybwjh) {
        this.pybwjh = pybwjh == null ? null : pybwjh.trim();
    }

    public String getPybtzh() {
        return pybtzh;
    }

    public void setPybtzh(String pybtzh) {
        this.pybtzh = pybtzh == null ? null : pybtzh.trim();
    }

    public String getRqhhqwjh() {
        return rqhhqwjh;
    }

    public void setRqhhqwjh(String rqhhqwjh) {
        this.rqhhqwjh = rqhhqwjh == null ? null : rqhhqwjh.trim();
    }

    public String getRqhhqtzh() {
        return rqhhqtzh;
    }

    public void setRqhhqtzh(String rqhhqtzh) {
        this.rqhhqtzh = rqhhqtzh == null ? null : rqhhqtzh.trim();
    }

    public String getRqpsqwjh() {
        return rqpsqwjh;
    }

    public void setRqpsqwjh(String rqpsqwjh) {
        this.rqpsqwjh = rqpsqwjh == null ? null : rqpsqwjh.trim();
    }

    public String getRqpsqtzh() {
        return rqpsqtzh;
    }

    public void setRqpsqtzh(String rqpsqtzh) {
        this.rqpsqtzh = rqpsqtzh == null ? null : rqpsqtzh.trim();
    }

    public String getYltjqwjh() {
        return yltjqwjh;
    }

    public void setYltjqwjh(String yltjqwjh) {
        this.yltjqwjh = yltjqwjh == null ? null : yltjqwjh.trim();
    }

    public String getYltjqtzh() {
        return yltjqtzh;
    }

    public void setYltjqtzh(String yltjqtzh) {
        this.yltjqtzh = yltjqtzh == null ? null : yltjqtzh.trim();
    }

    public String getKqlqqwjh() {
        return kqlqqwjh;
    }

    public void setKqlqqwjh(String kqlqqwjh) {
        this.kqlqqwjh = kqlqqwjh == null ? null : kqlqqwjh.trim();
    }

    public String getKqlqqtzh() {
        return kqlqqtzh;
    }

    public void setKqlqqtzh(String kqlqqtzh) {
        this.kqlqqtzh = kqlqqtzh == null ? null : kqlqqtzh.trim();
    }

    public String getPyqwjh() {
        return pyqwjh;
    }

    public void setPyqwjh(String pyqwjh) {
        this.pyqwjh = pyqwjh == null ? null : pyqwjh.trim();
    }

    public String getPyqtzh() {
        return pyqtzh;
    }

    public void setPyqtzh(String pyqtzh) {
        this.pyqtzh = pyqtzh == null ? null : pyqtzh.trim();
    }

    public String getTgwjh() {
        return tgwjh;
    }

    public void setTgwjh(String tgwjh) {
        this.tgwjh = tgwjh == null ? null : tgwjh.trim();
    }

    public String getTgtzh() {
        return tgtzh;
    }

    public void setTgtzh(String tgtzh) {
        this.tgtzh = tgtzh == null ? null : tgtzh.trim();
    }

    public String getZyqwjh() {
        return zyqwjh;
    }

    public void setZyqwjh(String zyqwjh) {
        this.zyqwjh = zyqwjh == null ? null : zyqwjh.trim();
    }

    public String getZyqtzh() {
        return zyqtzh;
    }

    public void setZyqtzh(String zyqtzh) {
        this.zyqtzh = zyqtzh == null ? null : zyqtzh.trim();
    }

    public String getZlqwjh() {
        return zlqwjh;
    }

    public void setZlqwjh(String zlqwjh) {
        this.zlqwjh = zlqwjh == null ? null : zlqwjh.trim();
    }

    public String getZlqtzh() {
        return zlqtzh;
    }

    public void setZlqtzh(String zlqtzh) {
        this.zlqtzh = zlqtzh == null ? null : zlqtzh.trim();
    }

    public String getEgrwjh() {
        return egrwjh;
    }

    public void setEgrwjh(String egrwjh) {
        this.egrwjh = egrwjh == null ? null : egrwjh.trim();
    }

    public String getEgrtzh() {
        return egrtzh;
    }

    public void setEgrtzh(String egrtzh) {
        this.egrtzh = egrtzh == null ? null : egrtzh.trim();
    }

    public String getZhqwjh() {
        return zhqwjh;
    }

    public void setZhqwjh(String zhqwjh) {
        this.zhqwjh = zhqwjh == null ? null : zhqwjh.trim();
    }

    public String getZhqtzh() {
        return zhqtzh;
    }

    public void setZhqtzh(String zhqtzh) {
        this.zhqtzh = zhqtzh == null ? null : zhqtzh.trim();
    }

    public String getKlbzqwjh() {
        return klbzqwjh;
    }

    public void setKlbzqwjh(String klbzqwjh) {
        this.klbzqwjh = klbzqwjh == null ? null : klbzqwjh.trim();
    }

    public String getKlbzqtzh() {
        return klbzqtzh;
    }

    public void setKlbzqtzh(String klbzqtzh) {
        this.klbzqtzh = klbzqtzh == null ? null : klbzqtzh.trim();
    }

    public String getObdwjh() {
        return obdwjh;
    }

    public void setObdwjh(String obdwjh) {
        this.obdwjh = obdwjh == null ? null : obdwjh.trim();
    }

    public String getObdtzh() {
        return obdtzh;
    }

    public void setObdtzh(String obdtzh) {
        this.obdtzh = obdtzh == null ? null : obdtzh.trim();
    }

    public String getJqxsqwjh() {
        return jqxsqwjh;
    }

    public void setJqxsqwjh(String jqxsqwjh) {
        this.jqxsqwjh = jqxsqwjh == null ? null : jqxsqwjh.trim();
    }

    public String getJqxsqtzh() {
        return jqxsqtzh;
    }

    public void setJqxsqtzh(String jqxsqtzh) {
        this.jqxsqtzh = jqxsqtzh == null ? null : jqxsqtzh.trim();
    }

    public String getPqxsqwjh() {
        return pqxsqwjh;
    }

    public void setPqxsqwjh(String pqxsqwjh) {
        this.pqxsqwjh = pqxsqwjh == null ? null : pqxsqwjh.trim();
    }

    public String getPqxsqtzh() {
        return pqxsqtzh;
    }

    public void setPqxsqtzh(String pqxsqtzh) {
        this.pqxsqtzh = pqxsqtzh == null ? null : pqxsqtzh.trim();
    }

    public String getGyswjh() {
        return gyswjh;
    }

    public void setGyswjh(String gyswjh) {
        this.gyswjh = gyswjh == null ? null : gyswjh.trim();
    }

    public String getRcjdwjh() {
        return rcjdwjh;
    }

    public void setRcjdwjh(String rcjdwjh) {
        this.rcjdwjh = rcjdwjh == null ? null : rcjdwjh.trim();
    }

    public String getCgcpwjh() {
        return cgcpwjh;
    }

    public void setCgcpwjh(String cgcpwjh) {
        this.cgcpwjh = cgcpwjh == null ? null : cgcpwjh.trim();
    }

    public String getGxwjh() {
        return gxwjh;
    }

    public void setGxwjh(String gxwjh) {
        this.gxwjh = gxwjh == null ? null : gxwjh.trim();
    }

    public String getKzffwjh() {
        return kzffwjh;
    }

    public void setKzffwjh(String kzffwjh) {
        this.kzffwjh = kzffwjh == null ? null : kzffwjh.trim();
    }

    public String getZxjywjh() {
        return zxjywjh;
    }

    public void setZxjywjh(String zxjywjh) {
        this.zxjywjh = zxjywjh == null ? null : zxjywjh.trim();
    }

    public String getDqcjpcwjh() {
        return dqcjpcwjh;
    }

    public void setDqcjpcwjh(String dqcjpcwjh) {
        this.dqcjpcwjh = dqcjpcwjh == null ? null : dqcjpcwjh.trim();
    }

    public String getBhgpwjh() {
        return bhgpwjh;
    }

    public void setBhgpwjh(String bhgpwjh) {
        this.bhgpwjh = bhgpwjh == null ? null : bhgpwjh.trim();
    }

    public String getRyglwjh() {
        return ryglwjh;
    }

    public void setRyglwjh(String ryglwjh) {
        this.ryglwjh = ryglwjh == null ? null : ryglwjh.trim();
    }

    public String getZpyqwjh() {
        return zpyqwjh;
    }

    public void setZpyqwjh(String zpyqwjh) {
        this.zpyqwjh = zpyqwjh == null ? null : zpyqwjh.trim();
    }

    public String getZpkzwjh() {
        return zpkzwjh;
    }

    public void setZpkzwjh(String zpkzwjh) {
        this.zpkzwjh = zpkzwjh == null ? null : zpkzwjh.trim();
    }

    public String getZpdqcjpcwjh() {
        return zpdqcjpcwjh;
    }

    public void setZpdqcjpcwjh(String zpdqcjpcwjh) {
        this.zpdqcjpcwjh = zpdqcjpcwjh == null ? null : zpdqcjpcwjh.trim();
    }

    public String getZpzxjywjh() {
        return zpzxjywjh;
    }

    public void setZpzxjywjh(String zpzxjywjh) {
        this.zpzxjywjh = zpzxjywjh == null ? null : zpzxjywjh.trim();
    }

    public String getZpbhgpwjh() {
        return zpbhgpwjh;
    }

    public void setZpbhgpwjh(String zpbhgpwjh) {
        this.zpbhgpwjh = zpbhgpwjh == null ? null : zpbhgpwjh.trim();
    }

    public String getZpryglwjh() {
        return zpryglwjh;
    }

    public void setZpryglwjh(String zpryglwjh) {
        this.zpryglwjh = zpryglwjh == null ? null : zpryglwjh.trim();
    }

    public String getSbtzwjh() {
        return sbtzwjh;
    }

    public void setSbtzwjh(String sbtzwjh) {
        this.sbtzwjh = sbtzwjh == null ? null : sbtzwjh.trim();
    }

    public String getSbglzdwjh() {
        return sbglzdwjh;
    }

    public void setSbglzdwjh(String sbglzdwjh) {
        this.sbglzdwjh = sbglzdwjh == null ? null : sbglzdwjh.trim();
    }

    public String getLxjywjh() {
        return lxjywjh;
    }

    public void setLxjywjh(String lxjywjh) {
        this.lxjywjh = lxjywjh == null ? null : lxjywjh.trim();
    }

    public String getDqjywjh() {
        return dqjywjh;
    }

    public void setDqjywjh(String dqjywjh) {
        this.dqjywjh = dqjywjh == null ? null : dqjywjh.trim();
    }

    public String getJzcswjh() {
        return jzcswjh;
    }

    public void setJzcswjh(String jzcswjh) {
        this.jzcswjh = jzcswjh == null ? null : jzcswjh.trim();
    }

    public String getGybwjh() {
        return gybwjh;
    }

    public void setGybwjh(String gybwjh) {
        this.gybwjh = gybwjh == null ? null : gybwjh.trim();
    }

    public String getGybtzh() {
        return gybtzh;
    }

    public void setGybtzh(String gybtzh) {
        this.gybtzh = gybtzh == null ? null : gybtzh.trim();
    }

    public String getRhywjh() {
        return rhywjh;
    }

    public void setRhywjh(String rhywjh) {
        this.rhywjh = rhywjh == null ? null : rhywjh.trim();
    }

    public String getRhytzh() {
        return rhytzh;
    }

    public void setRhytzh(String rhytzh) {
        this.rhytzh = rhytzh == null ? null : rhytzh.trim();
    }

    public String getKqpswjh() {
        return kqpswjh;
    }

    public void setKqpswjh(String kqpswjh) {
        this.kqpswjh = kqpswjh == null ? null : kqpswjh.trim();
    }

    public String getKqpstzh() {
        return kqpstzh;
    }

    public void setKqpstzh(String kqpstzh) {
        this.kqpstzh = kqpstzh == null ? null : kqpstzh.trim();
    }

    public String getGyxtwjh() {
        return gyxtwjh;
    }

    public void setGyxtwjh(String gyxtwjh) {
        this.gyxtwjh = gyxtwjh == null ? null : gyxtwjh.trim();
    }

    public String getGyxttzh() {
        return gyxttzh;
    }

    public void setGyxttzh(String gyxttzh) {
        this.gyxttzh = gyxttzh == null ? null : gyxttzh.trim();
    }

    public String getScrwjh() {
        return scrwjh;
    }

    public void setScrwjh(String scrwjh) {
        this.scrwjh = scrwjh == null ? null : scrwjh.trim();
    }

    public String getScrtzh() {
        return scrtzh;
    }

    public void setScrtzh(String scrtzh) {
        this.scrtzh = scrtzh == null ? null : scrtzh.trim();
    }

    public String getNoxcgqwjh() {
        return noxcgqwjh;
    }

    public void setNoxcgqwjh(String noxcgqwjh) {
        this.noxcgqwjh = noxcgqwjh == null ? null : noxcgqwjh.trim();
    }

    public String getNoxcgqtzh() {
        return noxcgqtzh;
    }

    public void setNoxcgqtzh(String noxcgqtzh) {
        this.noxcgqtzh = noxcgqtzh == null ? null : noxcgqtzh.trim();
    }

    public String getZfqwjh() {
        return zfqwjh;
    }

    public void setZfqwjh(String zfqwjh) {
        this.zfqwjh = zfqwjh == null ? null : zfqwjh.trim();
    }

    public String getZfqtzh() {
        return zfqtzh;
    }

    public void setZfqtzh(String zfqtzh) {
        this.zfqtzh = zfqtzh == null ? null : zfqtzh.trim();
    }

    public String getHhzzwjh() {
        return hhzzwjh;
    }

    public void setHhzzwjh(String hhzzwjh) {
        this.hhzzwjh = hhzzwjh == null ? null : hhzzwjh.trim();
    }

    public String getHhzztzh() {
        return hhzztzh;
    }

    public void setHhzztzh(String hhzztzh) {
        this.hhzztzh = hhzztzh == null ? null : hhzztzh.trim();
    }

    public String getPszzwjh() {
        return pszzwjh;
    }

    public void setPszzwjh(String pszzwjh) {
        this.pszzwjh = pszzwjh == null ? null : pszzwjh.trim();
    }

    public String getPszztzh() {
        return pszztzh;
    }

    public void setPszztzh(String pszztzh) {
        this.pszztzh = pszztzh == null ? null : pszztzh.trim();
    }

    public String getPsqwjh() {
        return psqwjh;
    }

    public void setPsqwjh(String psqwjh) {
        this.psqwjh = psqwjh == null ? null : psqwjh.trim();
    }

    public String getPsqtzh() {
        return psqtzh;
    }

    public void setPsqtzh(String psqtzh) {
        this.psqtzh = psqtzh == null ? null : psqtzh.trim();
    }

    public String getDpxtwjh() {
        return dpxtwjh;
    }

    public void setDpxtwjh(String dpxtwjh) {
        this.dpxtwjh = dpxtwjh == null ? null : dpxtwjh.trim();
    }

    public String getDpxttzh() {
        return dpxttzh;
    }

    public void setDpxttzh(String dpxttzh) {
        this.dpxttzh = dpxttzh == null ? null : dpxttzh.trim();
    }

    public String getEecuwjh() {
        return eecuwjh;
    }

    public void setEecuwjh(String eecuwjh) {
        this.eecuwjh = eecuwjh == null ? null : eecuwjh.trim();
    }

    public String getEecutzh() {
        return eecutzh;
    }

    public void setEecutzh(String eecutzh) {
        this.eecutzh = eecutzh == null ? null : eecutzh.trim();
    }

    public String getRlgjxtwjh() {
        return rlgjxtwjh;
    }

    public void setRlgjxtwjh(String rlgjxtwjh) {
        this.rlgjxtwjh = rlgjxtwjh == null ? null : rlgjxtwjh.trim();
    }

    public String getRlgjxttzh() {
        return rlgjxttzh;
    }

    public void setRlgjxttzh(String rlgjxttzh) {
        this.rlgjxttzh = rlgjxttzh == null ? null : rlgjxttzh.trim();
    }

    public String getPqhclxtwjh() {
        return pqhclxtwjh;
    }

    public void setPqhclxtwjh(String pqhclxtwjh) {
        this.pqhclxtwjh = pqhclxtwjh == null ? null : pqhclxtwjh.trim();
    }

    public String getPqhclxttzh() {
        return pqhclxttzh;
    }

    public void setPqhclxttzh(String pqhclxttzh) {
        this.pqhclxttzh = pqhclxttzh == null ? null : pqhclxttzh.trim();
    }

    public String getQzxwjh() {
        return qzxwjh;
    }

    public void setQzxwjh(String qzxwjh) {
        this.qzxwjh = qzxwjh == null ? null : qzxwjh.trim();
    }

    public String getQzxtzh() {
        return qzxtzh;
    }

    public void setQzxtzh(String qzxtzh) {
        this.qzxtzh = qzxtzh == null ? null : qzxtzh.trim();
    }

    public String getPsbwjh() {
        return psbwjh;
    }

    public void setPsbwjh(String psbwjh) {
        this.psbwjh = psbwjh == null ? null : psbwjh.trim();
    }

    public String getPsbtzh() {
        return psbtzh;
    }

    public void setPsbtzh(String psbtzh) {
        this.psbtzh = psbtzh == null ? null : psbtzh.trim();
    }

    public String getDoczhqwjh() {
        return doczhqwjh;
    }

    public void setDoczhqwjh(String doczhqwjh) {
        this.doczhqwjh = doczhqwjh == null ? null : doczhqwjh.trim();
    }

    public String getDoczhqtzh() {
        return doczhqtzh;
    }

    public void setDoczhqtzh(String doczhqtzh) {
        this.doczhqtzh = doczhqtzh == null ? null : doczhqtzh.trim();
    }

    public String getPoczhqwjh() {
        return poczhqwjh;
    }

    public void setPoczhqwjh(String poczhqwjh) {
        this.poczhqwjh = poczhqwjh == null ? null : poczhqwjh.trim();
    }

    public String getPoczhqtzh() {
        return poczhqtzh;
    }

    public void setPoczhqtzh(String poczhqtzh) {
        this.poczhqtzh = poczhqtzh == null ? null : poczhqtzh.trim();
    }

    public String getYxpc() {
        return yxpc;
    }

    public void setYxpc(String yxpc) {
        this.yxpc = yxpc == null ? null : yxpc.trim();
    }

    public String getRypc() {
        return rypc;
    }

    public void setRypc(String rypc) {
        this.rypc = rypc == null ? null : rypc.trim();
    }

    public String getZspc() {
        return zspc;
    }

    public void setZspc(String zspc) {
        this.zspc = zspc == null ? null : zspc.trim();
    }

    public String getSdpc() {
        return sdpc;
    }

    public void setSdpc(String sdpc) {
        this.sdpc = sdpc == null ? null : sdpc.trim();
    }

    public String getQzpc() {
        return qzpc;
    }

    public void setQzpc(String qzpc) {
        this.qzpc = qzpc == null ? null : qzpc.trim();
    }

    public String getJqgwjh() {
        return jqgwjh;
    }

    public void setJqgwjh(String jqgwjh) {
        this.jqgwjh = jqgwjh == null ? null : jqgwjh.trim();
    }

    public String getJqgtzh() {
        return jqgtzh;
    }

    public void setJqgtzh(String jqgtzh) {
        this.jqgtzh = jqgtzh == null ? null : jqgtzh.trim();
    }

    
}
