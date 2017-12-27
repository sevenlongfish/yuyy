package site.yuyy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import site.yuyy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/queryUserById")
	public ModelAndView queryUserById(Integer userId){
		Map<String, Object> userMap = userService.queryUserById(1);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("USER_NAME", userMap.get("USER_NAME"));
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(Integer userId, String userName, String user_email){
		Map<String, Object> userMap = userService.queryUserById(1);
		return userMap.toString();
	}
	
	@RequestMapping("/addUserColumns")
	@ResponseBody
	public Integer addUserColumns(){
		
		int result = userService.addUserColumns();
		
		return Integer.valueOf(result);
	}
}
