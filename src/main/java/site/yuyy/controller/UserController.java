package site.yuyy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import site.yuyy.model.TUser;
import site.yuyy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 根据id获取用户
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/getUser", method={RequestMethod.GET})
	public ModelAndView queryUserById(Integer id){
		TUser user = userService.getUserById(id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("USER_NAME", user.getUserName());
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/addUserColumns")
	@ResponseBody
	public Integer addUserColumns(){
		Map<String, String> columns = new HashMap<String, String>();
		int result = userService.addUserColumns(columns);
		
		return Integer.valueOf(result);
	}
}
