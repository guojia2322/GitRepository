package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;

/*
 * spring框架和mybatis框架整合，spring启动时
 * 去mybatis，根据配置mapper的目录，进行包扫描，扫描到所有mapper的接口，创建它的实例
 */
public interface UserMapper {
	//<select id="find" resultType="User">
	public List<User> find();
	
	//注解方式SQL，查询某个用户，@Parma映射参数
	@Select("select id,name,birthday,address from user where id=#{id}")
	public User get(@Param("id") Integer id);
	
	@Insert("INSERT  INTO USER(ID,NAME,BIRTHDAY,ADDRESS)"
			+ " VALUES(null,#{name},#{birthday},#{address})")
	public void insert(User user);
	
	@Update("update user"
		+ " set name=#{name},birthday=#{birthday},address=#{address} "
		+ " where id=#{id}")
	public void update(User user);
	
	@Delete("delete from user where id = #{id}")
	public void delete(@Param("id") Integer id);
}
