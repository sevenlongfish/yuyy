package site.yuyy.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import site.yuyy.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	/**
	 * 测试
	 * @return
	 */
	@RequestMapping(value = "/sayHello", method = {RequestMethod.GET})
	public String sayHello(){
		
		return "Hello World!";
	}
	
	/**
	 * 根据id查询用户
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/getUser", method = {RequestMethod.GET})
	public String getUser(Integer userId) {
		if(null == userId) {
			return "参数错误";
		}
		Map<String, Object> userMap = userService.getUserById(userId);
		
		ObjectMapper om = new ObjectMapper();
		String user = "";
		try {
			user = om.writeValueAsString(userMap);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		return user;
	}
	
	/**
	 * 查询用户列表
	 * @return
	 */
	@RequestMapping(value = "/getUserList", method = {RequestMethod.GET})
	public String getUserList() {
		List<Map<String, Object>> userList = userService.getUserList();
		
		ObjectMapper om = new ObjectMapper();
		String result = "";
		try {
			result = om.writeValueAsString(userList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
}
