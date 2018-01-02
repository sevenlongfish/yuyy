package site.yuyy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringBootStarter {
	
	@RequestMapping("/index")
	@ResponseBody
	public String sayHello(){
		return "Hello World!";
	}
	
	public static void main(String[] args){
		SpringApplication.run(SpringBootStarter.class, args);
	}
}
