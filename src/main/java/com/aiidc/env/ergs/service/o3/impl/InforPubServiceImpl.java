/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.constant.InforPub;
import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.jpa.po.o3.E3Sbb;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbMx;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbXzmx;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;
import com.aiidc.env.ergs.jpa.po.o3.Pk;
import com.aiidc.env.ergs.jpa.po.pw.SJDW;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.repo.o3.E3SbbDao;
import com.aiidc.env.ergs.jpa.repo.o3.E3SbbMxDao;
import com.aiidc.env.ergs.jpa.repo.o3.E3SbbXzmxDao;
import com.aiidc.env.ergs.jpa.repo.o3.E3VehicleDao;
import com.aiidc.env.ergs.service.o3.InforPubService;
import com.aiidc.env.ergs.service.pw.SJDWService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author jiabin fan
 * 信息公开查询
 */
@Service
public class InforPubServiceImpl implements InforPubService {
	@Resource
	private E3VehicleDao e3VehicleDao;
	@Resource
	private E3SbbDao e3SbbDao;
	@Resource 
	private SJDWService sjdwService;
	@Resource
	private E3SbbXzmxDao e3SbbXzmxDao;
	@Resource
	private E3SbbMxDao e3SbbMxDao;
	/* 
	 * 信息公开查询
	 */
	@Override
	public Page<E3Vehicles> findInfor(String manufid, String clxh, String fdjxh, String xzmc, Pageable pageable) {
		//查询sbb的所有申报编号；
		List<String> list1 = e3SbbDao.findSbb();
		//Page<InforPub> page = e3VehicleDao.findByManufidAndClxhAndFdjxhAndXzmc(manufid, clxh, fdjxh, xzmc, pageable);
		Page<E3Vehicles> page = e3VehicleDao.findAll(new Specification<E3Vehicles>() {
			@Override
			public Predicate toPredicate(Root<E3Vehicles> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(clxh)) {
					list.add(cb.like(root.get("clxh").as(String.class), "%" + clxh + "%"));
				}

				if (StringUtils.isNotBlank(fdjxh)) {
					list.add(cb.like(root.get("fdjxh").as(String.class), "%" + fdjxh + "%"));
				}

				if (StringUtils.isNotBlank(xzmc)) {
					list.add(cb.like(root.get("xzmc").as(String.class), "%" + xzmc + "%"));
				}
				// sbbh in ();
				Predicate in = root.get("newsbbh").as(String.class).in(list1);
				list.add(in);
				//manufid = 
				list.add(cb.equal(root.get("manufid").as(String.class), manufid));
				Predicate[] p = new Predicate[list.size()];
				return cb.and(list.toArray(p));
			}

		}, pageable);
		return page;
	}
	/* 
	 * 根据cxid查询
	 */
	@Override
	public E3Vehicles findByCxid(Long cxid) {
		
		return e3VehicleDao.findByCxid(cxid);
	}
	/* 
	 * 
	 */
	@Override
	public void saveSbb(E3Sbb e3Sbb, InforPub inforPub, E3Vehicles vehicle) {
		e3Sbb.setCllb(inforPub.getCllb());
		e3Sbb.setSbbh(vehicle.getNewsbbh());
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		String manufid = user.getManufid();
		//根据maufid查groupid
		SJDW sjdw = sjdwService.findByManufid(new Long(manufid));
		e3Sbb.setManufid(manufid);
		e3Sbb.setGroupid(sjdw.getGroupid());
		e3Sbb.setClxh(vehicle.getClxh());
		e3Sbb.setFdjxh(vehicle.getFdjxh());
		//发动机生产厂 名字要查更改后的新名字；
		e3Sbb.setFdjscc(vehicle.getFdjscc());
		e3Sbb.setSbrq(new Date());
		e3Sbb.setStatus("2");
		e3Sbb.setUserid(user.getUserid()+"");
		e3Sbb.setSbr(user.getUsername());
		e3Sbb.setPf(inforPub.getPf());
		e3Sbb.setType(Type.strToint(inforPub.getCllb())+"");
		e3Sbb.setJkc(inforPub.getJkc());
		e3Sbb.setFlag("XXGK");
		e3SbbDao.save(e3Sbb);
	}
	/* 
	 * 
	 */
	@Override
	public void saveSbbXzmx(E3SbbXzmx e3SbbXzmx, InforPub inforPub, E3Vehicles vehicle) {
		e3SbbXzmx.setSbbh(vehicle.getNewsbbh());
		e3SbbXzmx.setCxid(new Integer(inforPub.getCxid()+""));
		e3SbbXzmx.setClxh(vehicle.getClxh());
		e3SbbXzmx.setClmc(vehicle.getClmc());
		e3SbbXzmx.setFdjxh(vehicle.getFdjxh());
		e3SbbXzmx.setFdjscc(vehicle.getFdjscc());
		e3SbbXzmxDao.save(e3SbbXzmx);
	}
	/* 
	 * 
	 */
	@Override
	public void saveSbbMx(E3SbbMx e3SbbMx, InforPub inforPub, E3Vehicles vehicle,Map<String,Object> reportMap) {
		String newSbbh = vehicle.getNewsbbh();
		// 检验报告编号
		String mainjybgbh = null;
		String mainpzbh = null;
		if (!newSbbh.substring(7, 8).equals("P")
				&& !newSbbh.substring(7, 8).equals("N")
				&& !newSbbh.substring(7, 8).equals("I")) {
			// P N 就一个PW报告 不用反找 轻两用由于报告的特殊性无法反找 直接存选择的报告配置
			String[] type = { "ZS", "PQ", "FL", "YH", "RY", "QZ", "SD",
					"NJ", "OB", "PD", "FA",    "CW", "DW", "JS", "BC" }; 
			Map<String, String> jybgbhs = new HashMap<String, String>();
			//这里需要一些校验；
			
		}
		for (String key : reportMap.keySet()) {
			Pk pk = new Pk();
			BeanUtils.copyProperties(reportMap.get(key), pk);
			e3SbbMx.setSbbh(vehicle.getNewsbbh());
			e3SbbMx.setFlbh("flbh");
			
			e3SbbMx.setJybgbh(pk.getJybgbh());
			e3SbbMx.setPzbh(pk.getPzbh()+"");;
			e3SbbMxDao.save(e3SbbMx);
		}
	}
	/* 
	 * 
	 */
	@Override
	public void saveSbbConfig(InforPub inforPub, Map map) {
		
	}
	/* 
	 * 
	 */
	@Override
	public void savewz(String wz, String sbbh) {
		//根据sbbh查e3_sbb
		E3Sbb e3Sbb = e3SbbDao.findBySbbh(sbbh);
		e3Sbb.setWz(wz);
		e3SbbDao.save(e3Sbb);
	}
	
}
