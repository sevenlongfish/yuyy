package site.yuyy.service;

import java.util.Map;

import site.yuyy.model.TUser;

public interface UserService {

	TUser getUserById(Integer userId);
	
	int addUserColumns(Map<String, String> columns);
}
