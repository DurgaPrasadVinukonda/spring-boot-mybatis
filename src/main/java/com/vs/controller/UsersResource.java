package com.vs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.mapper.UserMapper;
import com.vs.model.Users;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	@Autowired
	private UserMapper userMapper;
	@GetMapping("/all")
	public List<Users> getAll(){
		
		return userMapper.findAll();
		
		
	}
	
	@GetMapping("/update")
	public List<Users> update(){
		Users users = new Users();
		users.setName("Youtube");
		users.setSalary(89078L);
		users.setId(7);
		userMapper.insert(users);
		return userMapper.findAll();
	}
	
	
	
	@GetMapping("/updateUsers")
	private List<Users> updateUsers(){
		Users users = new Users();
		users.setName("Youtube");
		users.setSalary(555L);
		userMapper.update(users);
		
		return userMapper.findAll();
	}
	
	@GetMapping("/delete")
	private List<Users> delete(){
		Users users = new Users();
		users.setName("Youtube");
		
		userMapper.delete(users);
		
		return userMapper.findAll();
	}
	
	

}
