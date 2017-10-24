/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc;

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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainDao;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainService;
import com.aiidc.env.ergs.service.yzx.appendix.vo.AppendixQryVo;

/**
 * @author jiabin fan
 *
 */
@Service
public class QqcMainServiceImpl implements QqcMainService {
	@Resource
	private QqcMainDao qqcMainDao;

	/*
	 * 增加附录
	 */
	@Override
	public int addQqcMain(QqcMain qqcMain) {
		qqcMainDao.save(qqcMain);
		return 1;
	}

	/*
	 * 修改附录
	 */
	@Override
	public void updateQqcMain(QqcMain qqcMain) {
		qqcMainDao.save(qqcMain);
	}

	/*
	 * 查询附录
	 */
	@Override
	public QqcMain findQqcMain(String flbh) {

		return qqcMainDao.findOne(flbh);
	}

	/*
	 * 删除附录
	 */
	@Override
	public void delQqcMain(String flbh) {
		qqcMainDao.delete(flbh);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainService#find(com.aiidc
	 * .env.ergs.service.yzx.appendix.vo.AppendixQryVo,
	 * com.aiidc.env.ergs.common.manager.QryPageVo)
	 */
	@Override
	public Page<QqcMain> find(AppendixQryVo vo, QryPageVo qryVo) {
		Specification<QqcMain> spec = new Specification<QqcMain>() {
			@Override
			public Predicate toPredicate(Root<QqcMain> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if (StringUtils.hasText(vo.getXh())) {
					list.add(cb.like(root.get("zclxh"), "%" + vo.getXh() + "%"));
				}
				if (StringUtils.hasText(vo.getFlbh())) {
					list.add(cb.like(root.get("flbh"), "%" + vo.getFlbh() + "%"));
				}
				return cb.and(list.toArray(new Predicate[list.size()]));
			}
		};
		return qqcMainDao.findAll(spec, qryVo.pageRequest());
	}

}
