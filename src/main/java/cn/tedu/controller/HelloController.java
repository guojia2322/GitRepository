package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	//打印hello，返回json格式
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}
}
