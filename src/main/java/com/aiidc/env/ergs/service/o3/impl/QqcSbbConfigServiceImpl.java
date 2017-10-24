/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.constant.InforPub;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbConfigQqc;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;
import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainCw;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcCw;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcDw;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcGjs;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcNj;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcObd;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcPower;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcQzx;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcRyzf;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcSbc;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcSd;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcYh;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcZs;
import com.aiidc.env.ergs.jpa.repo.o3.E3SbbConfigQqcDao;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainCwDao;
import com.aiidc.env.ergs.service.o3.SbbConfigService;

/**
 * @author wuwenjun
 *
 */
@Service("qqcSbbConfigService")
public class QqcSbbConfigServiceImpl implements SbbConfigService {
	
	@Resource
	private E3SbbConfigQqcDao sbbConfigQqcDao;
	@Resource
	private QqcMainCwDao qqcMainCwDao;
	/* 
	 * 
	 */
	@Override
	public void save(InforPub inforPub,E3Vehicles vehicle,Map map) {
		E3SbbConfigQqc e3SbbConfigQqc = new E3SbbConfigQqc();
		String pf = inforPub.getPf();
		if(pf.equals("5")){
			//QqcRyzf qqcRyzf = (QqcRyzf) map.get("2");
			e3SbbConfigQqc.setSbbh(vehicle.getNewsbbh());
			e3SbbConfigQqc.setBh(((QqcCw)map.get("14")).getPzbh());
			e3SbbConfigQqc.setZhqxh(((QqcCw)map.get("14")).getZhqxh());
			e3SbbConfigQqc.setZhqscc(((QqcCw)map.get("14")).getZhqscc());
			e3SbbConfigQqc.setCgqxh(((QqcCw)map.get("14")).getCgqxh());
			e3SbbConfigQqc.setCgqscc(((QqcCw)map.get("14")).getCgqscc());
			e3SbbConfigQqc.setEgrxh(((QqcCw)map.get("14")).getEgrxh());
			e3SbbConfigQqc.setEgrscc(((QqcCw)map.get("14")).getEgrscc());
			e3SbbConfigQqc.setEcuxh(((QqcCw)map.get("14")).getEcuxh());
			e3SbbConfigQqc.setEcuscc(((QqcCw)map.get("14")).getEcuscc());
			e3SbbConfigQqc.setCwjybgbh(((QqcCw)map.get("14")).getJybgbh());
			e3SbbConfigQqc.setCwpzid(((QqcCw)map.get("14")).getPzbh());
			e3SbbConfigQqc.setZyqxh(((QqcCw)map.get("14")).getJybgbh());
			e3SbbConfigQqc.setZyqscc(((QqcCw)map.get("14")).getZhqscc());
			e3SbbConfigQqc.setZlqxs(((QqcCw)map.get("14")).getZlqxh());
			e3SbbConfigQqc.setZtscc(((QqcCw)map.get("14")).getZtscc());
			e3SbbConfigQqc.setFzscc(((QqcCw)map.get("14")).getFzscc());
			e3SbbConfigQqc.setTcscc(((QqcCw)map.get("14")).getTcscc());
			//从E3_qqc_config_cw查出变速箱型式和档位数
			String jybgbh = ((QqcCw)map.get("14")).getJybgbh();
			QqcMainCw qqcMainCw = qqcMainCwDao.findByJybgbh(jybgbh);
			e3SbbConfigQqc.setBsqxs(qqcMainCw.getBsxxs());
			e3SbbConfigQqc.setDws(qqcMainCw.getBsxdws());
			
			e3SbbConfigQqc.setTgxh(((QqcRyzf)map.get("2")).getTgxh());
			e3SbbConfigQqc.setTgscc(((QqcRyzf)map.get("2")).getTgscc());
			e3SbbConfigQqc.setRyjybgbh(((QqcRyzf)map.get("2")).getJybgbh());
			e3SbbConfigQqc.setRypzid(((QqcRyzf)map.get("2")).getPzbh());
			
			
			e3SbbConfigQqc.setQzxxh(((QqcQzx)map.get("5")).getPcvxh());
			e3SbbConfigQqc.setQzxscc(((QqcQzx)map.get("5")).getPcvscc());
			e3SbbConfigQqc.setQzxjybgbh(((QqcQzx)map.get("5")).getJybgbh());
			e3SbbConfigQqc.setQzxpzid(((QqcQzx)map.get("5")).getPzbh());
			
			e3SbbConfigQqc.setObdxh(((QqcObd)map.get("0")).getMixh());
			e3SbbConfigQqc.setObdscc(((QqcObd)map.get("0")).getMiscc());
			e3SbbConfigQqc.setIupr(((QqcObd)map.get("0")).getIupr());
			e3SbbConfigQqc.setNoxjc(((QqcObd)map.get("0")).getNoxjc());
			e3SbbConfigQqc.setObdjybgbh(((QqcObd)map.get("0")).getJybgbh());
			e3SbbConfigQqc.setObdpzid(((QqcObd)map.get("0")).getPzbh());
			
			e3SbbConfigQqc.setXsqxh(((QqcZs)map.get("1")).getXsqxh());
			e3SbbConfigQqc.setXsqscc(((QqcZs)map.get("1")).getXsqscc());
			e3SbbConfigQqc.setZsjybgbh(((QqcZs)map.get("1")).getJybgbh());
			e3SbbConfigQqc.setZspzid(((QqcZs)map.get("1")).getPzbh());
			
			e3SbbConfigQqc.setPqjybgbh(((QqcPower)map.get("4")).getJybgbh());
			e3SbbConfigQqc.setPqpzid(((QqcPower)map.get("4")).getPzbh());
			
			e3SbbConfigQqc.setNjjybgbh(((QqcNj)map.get("6")).getJybgbh());
			e3SbbConfigQqc.setNjpzid(((QqcNj)map.get("6")).getPzbh());
			e3SbbConfigQqc.setCnzzxh(((QqcNj)map.get("6")).getCnzzxh());
			e3SbbConfigQqc.setCnzzscc(((QqcNj)map.get("6")).getCnzzscc());
			e3SbbConfigQqc.setDcrl(((QqcNj)map.get("6")).getDcrl());
			e3SbbConfigQqc.setDjxh(((QqcNj)map.get("6")).getDjxh());
			e3SbbConfigQqc.setDjzyyt(((QqcNj)map.get("6")).getDjzyyt());
			e3SbbConfigQqc.setDjazsl(((QqcNj)map.get("6")).getDjazsl());
			
			e3SbbConfigQqc.setSdsjybgbh(((QqcSd)map.get("10")).getJybgbh());
			e3SbbConfigQqc.setSdspzid(((QqcSd)map.get("10")).getPzbh());
			
			e3SbbConfigQqc.setYhjybgbh(((QqcYh)map.get("11")).getJybgbh());
			e3SbbConfigQqc.setYhpzid(((QqcYh)map.get("11")).getPzbh());
			
			e3SbbConfigQqc.setDwjybgbh(((QqcDw)map.get("15")).getJybgbh());
			e3SbbConfigQqc.setDwpzid(((QqcDw)map.get("15")).getPzbh());
			
			e3SbbConfigQqc.setSbcjybgbh(((QqcSbc)map.get("16")).getJybgbh());
			e3SbbConfigQqc.setSbcpzid(((QqcSbc)map.get("16")).getPzbh());
			
			e3SbbConfigQqc.setGjsjybgbh(((QqcGjs)map.get("17")).getJybgbh());
			e3SbbConfigQqc.setGjspzid(((QqcGjs)map.get("17")).getPzbh());
		}else{
			
		}
		sbbConfigQqcDao.save(e3SbbConfigQqc);
	}

	

}
