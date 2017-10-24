/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix.qqc;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainCdxDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainCtDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainLtDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.QqcMainXgxDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjBsDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjCgqDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjCnzzDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjConfigDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDczhqDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDhzzDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjDjDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjFlDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjGybDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjJqxtDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjLqdxDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjPqxtDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjPqzsDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjPybDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjRhxDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjRlpsDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjWdDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjYlDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZfxtDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZhqDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZhqDyDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj.QqcFdjZhqsDao;
import com.aiidc.env.ergs.service.yzx.appendix.DeleteService;

/**
 * @author jiabin fan
 * 轻型汽油车删除
 */
@Service("qqcDeleteService")
public class QqcDeleteServiceImpl implements DeleteService {

	@Resource
	private QqcFdjBsDao qqcFdjBsDao;
	@Resource
	private QqcFdjCgqDao qqcFdjCgqDao;
	@Resource
	private QqcFdjCnzzDao qqcFdjCnzzDao;
	@Resource
	private QqcFdjDao qqcFdjDao;
	@Resource
	private QqcFdjConfigDao qqcFdjConfigDao;
	@Resource
	private QqcFdjDczhqDao qqcFdjDczhqDao;
	@Resource
	private QqcFdjDhzzDao qqcFdjDhzzDao;
	@Resource
	private QqcFdjDjDao qqcFdjDjDao;
	@Resource
	private QqcFdjFlDao qqcFdjFlDao;
	@Resource
	private QqcFdjGybDao qqcFdjGybDao;
	@Resource
	private QqcFdjJqxtDao qqcFdjJqxtDao;
	@Resource
	private QqcFdjLqdxDao qqcFdjLqdxDao;
	@Resource
	private QqcFdjPqxtDao qqcFdjPqxtDao;
	@Resource
	private QqcFdjPqzsDao qqcFdjPqzsDao;
	@Resource
	private QqcFdjPybDao qqcFdjPybDao;
	@Resource
	private QqcFdjRhxDao qqcFdjRhxDao;
	@Resource
	private QqcFdjRlpsDao qqcFdjRlpsDao;
	@Resource
	private QqcFdjWdDao qqcFdjWdDao;
	@Resource
	private QqcFdjYlDao qqcFdjYlDao;
	@Resource
	private QqcFdjZfxtDao qqcFdjZfxtDao;
	@Resource
	private QqcFdjZhqDao qqcFdjZhqDao;
	@Resource
	private QqcFdjZhqDyDao qqcFdjZhqDyDao;
	@Resource
	private QqcFdjZhqsDao qqcFdjZhqsDao;
	@Resource
	private QqcMainCdxDao qqcMainCdxDao;
	@Resource
	private QqcMainCtDao qqcMainCtDao;
	@Resource
	private QqcMainDao qqcMainDao;
	@Resource
	private QqcMainLtDao qqcMainLtDao;
	@Resource
	private QqcMainXgxDao qqcMainXgxDao;
	@Override
	public void delete(String flbh) {
		qqcFdjBsDao.deleteByFlbhLike(flbh);
		qqcFdjCgqDao.deleteByFlbhLike(flbh);
		qqcFdjCnzzDao.deleteByFlbhLike(flbh);
		qqcFdjDao.deleteByFlbhLike(flbh);
		qqcFdjConfigDao.deleteByFlbhLike(flbh);
		qqcFdjDczhqDao.deleteByFlbhLike(flbh);
		qqcFdjDhzzDao.deleteByFlbhLike(flbh);
		qqcFdjDjDao.deleteByFlbhLike(flbh);
		qqcFdjFlDao.deleteByFlbhLike(flbh);
		qqcFdjGybDao.deleteByFlbhLike(flbh);
		qqcFdjJqxtDao.deleteByFlbhLike(flbh);
		qqcFdjLqdxDao.deleteByFlbhLike(flbh);
		qqcFdjPqxtDao.deleteByFlbhLike(flbh);
		qqcFdjPqzsDao.deleteByFlbhLike(flbh);
		qqcFdjPybDao.deleteByFlbhLike(flbh);
		qqcFdjRhxDao.deleteByFlbhLike(flbh);
		qqcFdjRlpsDao.deleteByFlbhLike(flbh);
		qqcFdjWdDao.deleteByFlbhLike(flbh);
		qqcFdjYlDao.deleteByFlbhLike(flbh);
		qqcFdjZfxtDao.deleteByFlbhLike(flbh);
		qqcFdjZhqDao.deleteByFlbhLike(flbh);
		qqcFdjZhqDyDao.deleteByFlbhLike(flbh);
		qqcFdjZhqsDao.deleteByFlbhLike(flbh);
		qqcMainCdxDao.deleteByFlbhLike(flbh);
		qqcMainCtDao.deleteByFlbhLike(flbh);
		qqcMainDao.deleteByFlbhLike(flbh);
		qqcMainLtDao.deleteByFlbhLike(flbh);
		qqcMainXgxDao.deleteByFlbhLike(flbh);
	}

}
