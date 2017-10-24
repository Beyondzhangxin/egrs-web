/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;
import com.aiidc.env.ergs.jpa.repo.o3.E3TmnDao;
import com.aiidc.env.ergs.service.o3.TmnService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author wuwenjun
 *
 */
@Service
public class TmnServiceImpl implements TmnService {

	@Resource
	private E3TmnDao dao;

	@Override
	public void save(E3Tmn item) {
		dao.save(item);
	}

	@Override
	public E3Tmn get(BigDecimal id) {
		return dao.findOne(id);
	}

	@Override
	public void delete(BigDecimal... id) {
		for (BigDecimal iid : id) {
			dao.delete(iid);
		}
	}

	@Override
	public Page<E3Tmn> find(QryPageVo qryVo, E3Tmn item) {
		Specification<E3Tmn> spec = new Specification<E3Tmn>() {
			@Override
			public Predicate toPredicate(Root<E3Tmn> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				list.add(cb.equal(root.get("manufid"), LoginUserUtil.getLoginManufid()));
				if (StringUtils.hasText(item.getTme())) {
					list.add(cb.like(root.get("tme"), "%" + item.getTme() + "%"));
				}
				if (StringUtils.hasText(item.getTmc())) {
					list.add(cb.like(root.get("tmc"), "%" + item.getTmc() + "%"));
				}
				return cb.and(list.toArray(new Predicate[list.size()]));
			}
		};
		return dao.findAll(spec, qryVo.pageRequest());
	}

	/* 
	 * 根据manufid查询所有的商标
	 */
	@Override
	public List<E3Tmn> findByManufid(String manufid) {
	
		return dao.findByManufid(manufid);
	}

}
