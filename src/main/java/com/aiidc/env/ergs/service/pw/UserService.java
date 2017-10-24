/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.service.pw.vo.UserUpdateVo;

/**
 * @author wuwenjun
 *
 */
public interface UserService {
	/**
	 * 保存
	 */
	public void save(User vo);

	/**
	 * 获取用户
	 * 
	 * @param id
	 * @return
	 */
	public User get(Long id);

	/**
	 * 更新个人信息
	 * 
	 * @param vo
	 */
	public void update(UserUpdateVo vo);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void delete(Long id);

	/**
	 * 更改密码
	 * 
	 * @param oldPwd
	 * @param newPwd
	 * @return 0-成功，1-原密码错误
	 */
	public int changePassword(String oldPwd, String newPwd);

	/**
	 * 查询当前企业的用户
	 * 
	 * @param qryVo
	 * @param user
	 * @return
	 */
	public Page<User> find(QryPageVo qryVo, User user);

	/**
	 * 授权更改
	 * 
	 * @param id
	 *            用户id
	 * @param permids
	 */
	public void changAuth(Long id, Long[] permids);
}
