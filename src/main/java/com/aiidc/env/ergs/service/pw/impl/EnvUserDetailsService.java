package com.aiidc.env.ergs.service.pw.impl;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.repo.pw.UserDao;
import com.aiidc.env.ergs.service.pw.vo.EnvUserDetails;

/**
 * 登录
 * 
 * @author jiabin fan
 *
 */
@Service
public class EnvUserDetailsService implements UserDetailsService {
	// 注入mapper
	@Resource
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 返回user集合
		if (username != null && username.contains("-")) {
			String[] usernames = username.split("-");
			User user = userDao.findByManufidAndUsername(usernames[0], usernames[1]);
			if (user == null) {
				throw new UsernameNotFoundException("用户" + username + "不存在");
			}
			// 返回信息进行认证;
			return new EnvUserDetails(username, user.getPassword(), user, user.authorities());
		} else {
			throw new UsernameNotFoundException("用户" + username + "不存在");
		}
	}

}
