/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.OriginalCar;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.view.QccSourceVehicleType;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.AppendixDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.TeAppendixDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QccSourceVehicleTypeDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainDao;
import com.aiidc.env.ergs.service.yzx.appendix.SearchService;

/**
 * @author jiabin fan
 *
 */
@Service("qqcSearchService")
public class QqcSearchServiceImpl implements SearchService {
	@Resource
	private QqcMainDao qqcMainDao;
	@Resource
	private AppendixDao appendixDao;
	@Resource
	private TeAppendixDao teAppendixDao;

	@Resource
	private QccSourceVehicleTypeDao qccSourceVehicleTypeDao;

	/*
	 * 所有qqcMain和appendix
	 */
	@Override
	public Page<QqcMain> search(OriginalCar originalCar, QryPageVo qryVo) {
		// 获取车辆附录编号；
		// String flbh = originalCar.getFlbh();
		// 查询附录中附录编号是否存在；
		List<String> list1 = appendixDao.findFlbh();
		//
		Page<QqcMain> page = qqcMainDao.findAll(new Specification<QqcMain>() {
			@Override
			public Predicate toPredicate(Root<QqcMain> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(originalCar.getClxh())) {
					list.add(cb.like(root.get("zclxh").as(String.class), "%" + originalCar.getClxh() + "%"));
				}

				if (StringUtils.isNotBlank(originalCar.getClmc())) {
					list.add(cb.like(root.get("zclmc").as(String.class), "%" + originalCar.getClmc() + "%"));
				}

				if (StringUtils.isNotBlank(originalCar.getClscc())) {
					list.add(cb.like(root.get("sccmc").as(String.class), "%" + originalCar.getClscc() + "%"));
				}
				// flbh in ();
				Predicate in = root.get("flbh").as(String.class).in(list1);
				list.add(in);
				Predicate[] p = new Predicate[list.size()];
				return cb.and(list.toArray(p));
			}

		}, qryVo.pageRequest());

		return page;
	}

	/*
	 * 搜索qqcMain，appendix和vehicle_Te
	 */
	@Override
	public Page<TeAppendix> searchTe(OriginalCar originalCar, QryPageVo qryVo) {
		// 查询appendix的所有附录编号
		List<String> list1 = appendixDao.findFlbh();
		// 查询APPENDIX_VEHICLE_TE所有的附录编号
		List<String> list2 = qqcMainDao.findFlbh();
		// 所有的附录编号集合；
		Set<String> set = new HashSet<String>();
		set.addAll(list1);
		set.addAll(list2);

		Page<TeAppendix> page = teAppendixDao.findAll(new Specification<TeAppendix>() {
			@Override
			public Predicate toPredicate(Root<TeAppendix> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(originalCar.getClxh())) {
					list.add(cb.like(root.get("clxh").as(String.class), "%" + originalCar.getClxh() + "%"));
				}

				if (StringUtils.isNotBlank(originalCar.getClmc())) {
					list.add(cb.like(root.get("clmc").as(String.class), "%" + originalCar.getClmc() + "%"));
				}

				/*
				 * if (StringUtils.isNotBlank(originalCar.getClscc())) {
				 * list.add(cb.like(root.get("sccmc").as(String.class), "%" +
				 * originalCar.getClscc() + "%")); }
				 */
				// flbh in ();
				Predicate in = root.get("flbh").as(String.class).in(set);
				list.add(in);

				Predicate[] p = new Predicate[list.size()];
				return cb.and(list.toArray(p));
			}

		}, qryVo.pageRequest());

		return page;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.yzx.appendix.SearchService#searchAll(com.aiidc
	 * .env.ergs.jpa.po.OriginalCar,
	 * com.aiidc.env.ergs.common.manager.QryPageVo)
	 */
	@Override
	public Page<QccSourceVehicleType> searchAll(OriginalCar originalCar, QryPageVo qryVo) {
		return qccSourceVehicleTypeDao.findAll(new Specification<QccSourceVehicleType>() {
			@Override
			public Predicate toPredicate(Root<QccSourceVehicleType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(originalCar.getClxh())) {
					list.add(cb.like(root.get("key").get("clxh"), "%" + originalCar.getClxh() + "%"));
				}

				if (StringUtils.isNotBlank(originalCar.getClmc())) {
					list.add(cb.like(root.get("clmc").as(String.class), "%" + originalCar.getClmc() + "%"));
				}

				if (StringUtils.isNotBlank(originalCar.getClscc())) {
					list.add(cb.like(root.get("clscc").as(String.class), "%" + originalCar.getClscc() + "%"));
				}

				Predicate[] p = new Predicate[list.size()];
				return cb.and(list.toArray(p));
			}

		}, qryVo.pageRequest());
	}

}
