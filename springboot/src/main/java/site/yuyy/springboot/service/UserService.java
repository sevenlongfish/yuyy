package site.yuyy.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.yuyy.springboot.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	/**
	 * 根据id查询用户
	 * @param userId
	 * @return
	 */
	public Map<String, Object> getUserById(Integer userId) {
		
		return userDao.selUserById(userId);
	}
	
	/**
	 * 查询用户列表
	 * @return
	 */
	public List<Map<String, Object>> getUserList() {
		
		return userDao.selUserList();
	}
}
