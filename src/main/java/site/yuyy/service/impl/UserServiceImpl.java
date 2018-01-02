package site.yuyy.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.yuyy.dao.TUserMapper;
import site.yuyy.model.TUser;
import site.yuyy.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TUserMapper userMapper;

	/**
	 * 根据id查询某条用户信息
	 */
	@Override
	public TUser getUserById(Integer id) {

		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 为用户表添加列
	 */
	@Override
	public int addUserColumns(Map<String, String> columns) {

		return 0;
	}

}
