package cn.tedu.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private Integer id;
	private String name;
	
	//重新定义日期格式，否则restful没法处理日期格式，报400，格式转换错误
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
