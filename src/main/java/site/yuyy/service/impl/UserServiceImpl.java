package site.yuyy.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.yuyy.dao.UserDao;
import site.yuyy.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	/**
	 * 根据id查询某条用户信息
	 */
	public Map<String, Object> queryUserById(Integer userId) {

		return userDao.selUserById(userId);
	}

	/**
	 * 为用户表添加列
	 */
	public int addUserColumns() {

		return userDao.addUserColumns();
	}
}
