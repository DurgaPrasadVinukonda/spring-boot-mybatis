package com.vs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.vs.model.Users;

@Mapper
public interface UserMapper {
	
	@Select("select * from users")
	List<Users>findAll();
	
	
	@Insert("insert into users(id,name,salary) values (#{id},#{name},#{salary})")
//	@SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
	void insert(Users users);
	
	
	@Update("update users set salary=#{salary} where name=#{name}")
	void update(Users users);
	
	@Delete("delete from users where name =#{name}")
	void delete(Users users);

}
