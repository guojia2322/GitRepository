package cn.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.pojo.User;
import cn.tedu.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/find")
	public List<User> find(){
		return userService.find();
	}
	
	@RequestMapping("/get/{id}")
	public User get(@PathVariable Integer id){
		return userService.get(id);
	}
	
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user){
		System.out.println(user.getName());
		System.out.println(user.getBirthday());
		System.out.println(user.getAddress());
		try{
			userService.insert(user);
			return "insert success."; 
		}catch(Exception e){
			return "insert error.";
		}
	}
	
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user){
		try{
			userService.update(user);
			return "update success";
		}catch(Exception e){
			return "update error";
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		try{
			userService.delete(id);
			return "delete success";
		}catch(Exception e){
			return "delete error";
		}
	}
}




