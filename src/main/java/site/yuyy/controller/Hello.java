package site.yuyy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/aa")
	public String aa(){
		return "I am aaa!";
	}
	
	@RequestMapping("/bb")
	public String sayHello(){
		return "I am bbb!";
	}
}
