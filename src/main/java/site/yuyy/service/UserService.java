package site.yuyy.service;

import java.util.Map;

public interface UserService {

	Map<String, Object> queryUserById(Integer userId);
	
	int addUserColumns();
}
