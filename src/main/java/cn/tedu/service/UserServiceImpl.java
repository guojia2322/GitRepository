package cn.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;

@Service	//标识是一个业务类，利用包扫描机制创建实例
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	//查询所有
	public List<User> find(){
		return userMapper.find();
	}
	
	//查询某个用户
	public User get(Integer id){
		return userMapper.get(id);
	}
	
	//新增用户
	public void insert(User user){
		userMapper.insert(user);
	}
	
	//修改用户
	public void update(User user){
		userMapper.update(user);
	}
	
	//删除某个用户
	public void delete(Integer id){
		userMapper.delete(id);
	}
}
